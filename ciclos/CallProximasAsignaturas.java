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
import com.mcp.mycareerplan.App;
import com.mcp.mycareerplan.BuildConfig;
import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.api.RequestMiPlan;
import com.mcp.mycareerplan.api.WS;
import com.mcp.mycareerplan.fragments.FgmMiPlanHome;
import com.mcp.mycareerplan.fragments.Fgm_materias_proximas;

import java.io.IOException;
import java.util.List;


public class CallProximasAsignaturas extends AsyncTask<Void, Void, HttpResponse<String>> {
    private static final String LOG_TAG = CallProximasAsignaturas.class.getSimpleName();
    private ProgressDialog dialog;
    private Activity activity;
    private List<CicloMiPlan> listaCiclos;
    Fgm_materias_proximas fgmMateriasProximas;



    public CallProximasAsignaturas(Activity activity) {
        Log.d(LOG_TAG, "Selection");
        dialog = new ProgressDialog(activity);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        this.activity = activity;
    }

    public List<CicloMiPlan> getCiclos() {
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
                RequestMiPlan req = convertToObject(resultResponse.getBody());
                if (req.getResponds().getCodigo() == 200) {
                    listaCiclos = req.getResponds().getCicloMiPlans();
                    FragmentTransaction frgTransaction = activity.getFragmentManager().beginTransaction();
                    fgmMateriasProximas  = Fgm_materias_proximas.newInstance(listaCiclos);
                    frgTransaction.addToBackStack("Proximas Asignaturas");
                    frgTransaction.replace(R.id.homeContent, fgmMateriasProximas);
                    frgTransaction.commit();

                }

            } catch (Exception ex) {
                Log.e(LOG_TAG, "Algo malo paso");
                ex.printStackTrace();
            }

        if ((dialog != null) && dialog.isShowing()) {
            dialog.dismiss();
            dialog = null;
        }

    }

    public List<CicloMiPlan> convertIntoClass(String content) {
        Log.d(LOG_TAG, "convertUserToObject():" + content);
        ObjectMapper mapper = new ObjectMapper();
        List<CicloMiPlan> response = null;
        try {
            response = mapper.readValue(content, new TypeReference<List<CicloMiPlan>>() {});
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

        if (BuildConfig.DEBUG) {
            App.currentUser.setIdEstudiante(9);
        }
        try {
            response = Unirest.post(WS.buildSimpleUrl("/ProximasAsignaturas"))
                    .header("content-type", "application/json")
                    .body(mapper.writeValueAsString(App.currentUser))
                    .asString();
            Log.d(LOG_TAG, "doInBackground()/response/"+response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return response;
    }


    public static RequestMiPlan convertToObject(String content) {
        ObjectMapper mapper = new ObjectMapper();
        RequestMiPlan response = null;
        try{
            response = mapper.readValue(content, RequestMiPlan.class);
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