package com.mcp.mycareerplan.api.ciclos;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.api.WS;
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
        this.activity = activity;
    }

    public List<Ciclo> getCiclos() {
        return this.listaCiclos;
    }


    @Override
    protected void onPreExecute() {
        Log.d(LOG_TAG, "onPreExecute()");
        super.onPreExecute();
        dialog.setMessage(activity.getResources().getString(R.string.loading));
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
            listaCiclos = convertIntoClass(resultResponse.getBody());
            FragmentTransaction frgTransaction = activity.getFragmentManager().beginTransaction();
            fmgMisMateriasHome = FgmMisMateriasHome.newInstance(listaCiclos);
            frgTransaction.addToBackStack("Mis Materias - Ciclos");
            frgTransaction.replace(R.id.homeContent, fmgMisMateriasHome);
            frgTransaction.commit();
            if ((dialog != null) && dialog.isShowing()) {
                dialog.dismiss();
                dialog = null;
            }
        } catch (Exception ex) {
            Log.e(LOG_TAG, "Algo malo paso");
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
        try {
            response = Unirest.get(WS.buildUrl("/Ciclos"))
                    .asString();
            Log.d(LOG_TAG, "doInBackground()/response/"+response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
