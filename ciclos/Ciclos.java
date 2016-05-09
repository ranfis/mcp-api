package com.mcp.mycareerplan.api.ciclos;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mcp.mycareerplan.App;
import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.api.Request;
import com.mcp.mycareerplan.api.RequestCiclos;
import com.mcp.mycareerplan.api.WS;
import com.mcp.mycareerplan.api.accounts.Datos;
import com.mcp.mycareerplan.api.university.Universidad;
import com.mcp.mycareerplan.fragments.FgmMisMateriasHome;
import com.mcp.mycareerplan.fragments.FgmSelectionHome;

import java.io.IOException;
import java.util.List;



public class Ciclos extends AsyncTask<Void, Void, HttpResponse<String>> {
    private static final String LOG_TAG = Ciclos.class.getSimpleName();
    private ProgressDialog dialog;
    private Activity activity;
    private List<Ciclo> listaCiclos;
    FgmMisMateriasHome fmgMisMateriasHome;


    public Ciclos(Activity activity) {
        Log.d(LOG_TAG, "Selection");
        dialog = new ProgressDialog(activity);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        this.activity = activity;
    }

    public List<Ciclo> getCiclos() {
        return this.listaCiclos;
    }


    @Override
    protected void onPreExecute() {
        Log.d(LOG_TAG, "onPreExecute()");
        super.onPreExecute();
        dialog.setMessage(activity.getResources().getString(R.string.loading_mismaterias));
        dialog.show();
    }


    @Override
    protected void onProgressUpdate(Void... values) {
        Log.v(LOG_TAG, "onProgressUpdate()");
        super.onProgressUpdate(values);
        Log.d(LOG_TAG, "onProgressUpdate():" + values);
    }


    @Override
    protected void onPostExecute(HttpResponse<String> resultResponse) {
        Log.d(LOG_TAG, "onPostExecute()");
        try {
            RequestCiclos req = convertToObject(resultResponse.getBody());
            if (req.getResponds().getCodigo() == 200) {
                listaCiclos = req.getResponds().getCiclos();
                FragmentTransaction frgTransaction = activity.getFragmentManager().beginTransaction();
                fmgMisMateriasHome = FgmMisMateriasHome.newInstance(listaCiclos);
                frgTransaction.addToBackStack("Mis Materias - Ciclos");
                frgTransaction.replace(R.id.homeContent, fmgMisMateriasHome);
                frgTransaction.commit();
            }
        } catch (Exception ex) {
            Log.e(LOG_TAG, "Algo malo paso");
            Toast.makeText(activity, "Hemos encontrado un error, favor intentar de nuevo.", Toast.LENGTH_SHORT).show();
            ex.printStackTrace();
        }


        if ((dialog != null) && dialog.isShowing()) {
            dialog.dismiss();
            dialog = null;
        }
    }

    public List<Ciclo> convertIntoClass(String content) {
        Log.d(LOG_TAG, "convertUserToObject():"+content);
        ObjectMapper mapper = new ObjectMapper();
        List<Ciclo> response = null;
        try {
            response = mapper.readValue(content, new TypeReference<List<Ciclo>>() {});
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }


    protected HttpResponse<String> doInBackground(Void... v) {
        Log.d(LOG_TAG, "doInBackground()");
        HttpResponse<String> response = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            response = Unirest.post(WS.buildSimpleUrl("/AsignaturasPorBloquesPorIdPensum"))
                    .header("content-type", "application/json")
                    .body(mapper.writeValueAsString(App.currentUser))
                    .asString();
            Log.d(LOG_TAG, "doInBackground()/response/"+response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }


    public static RequestCiclos convertToObject(String content) {
        ObjectMapper mapper = new ObjectMapper();
        RequestCiclos response = null;
        try{
            response = mapper.readValue(content, RequestCiclos.class);
        } catch (JsonParseException e) {
            Log.e("JSONPARSE", e.getMessage());
        } catch (JsonMappingException e) {
            Log.e("JSONMAP", e.getMessage());
        } catch (IOException e) {
            Log.e("IOEX", e.getMessage());
        }
        return response;
    }
}
