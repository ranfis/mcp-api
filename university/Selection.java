package com.mcp.mycareerplan.api.university;

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
import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.api.Request;
import com.mcp.mycareerplan.api.WS;
import com.mcp.mycareerplan.api.accounts.Userx;
import com.mcp.mycareerplan.fragments.FgmSelectionHome;

import java.io.IOException;
import java.util.List;


public class Selection extends AsyncTask<Void, Void, HttpResponse<String>> {
    private static final String LOG_TAG = Selection.class.getSimpleName();
    private ProgressDialog dialog;
    private Activity activity;
    private List<Universidad> listaUniversidades;
    FgmSelectionHome fmgSelectionHome;


    public Selection(Activity activity) {
        Log.d(LOG_TAG, "Selection");
        dialog = new ProgressDialog(activity);
        dialog.setCanceledOnTouchOutside(false);
        this.activity = activity;
    }

    public List<Universidad> getUniversidades() {
        return this.listaUniversidades;
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
            listaUniversidades = convertIntoClass(resultResponse.getBody());
            FragmentTransaction frgTransaction = activity.getFragmentManager().beginTransaction();
            fmgSelectionHome = FgmSelectionHome.newInstance(listaUniversidades);
            frgTransaction.addToBackStack("Selection University");
            frgTransaction.add(R.id.selectionHome, fmgSelectionHome);
            frgTransaction.commit();
            if ((dialog != null) && dialog.isShowing()) {
                dialog.dismiss();
                dialog = null;
            }
        } catch (Exception ex) {
            Log.e(LOG_TAG, "Algo malo paso");
        }
    }

    public static List<Universidad> convertIntoClass(String content) {
        Log.d(LOG_TAG, "convertUserToObject():"+content);
        ObjectMapper mapper = new ObjectMapper();
        List<Universidad> response = null;
        try {
            response = mapper.readValue(content, new TypeReference<List<Universidad>>() {});
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
            response = Unirest.get(WS.buildUrl("/Universidades"))
                    .asString();
            Log.d(LOG_TAG, "doInBackground()/response/"+response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
