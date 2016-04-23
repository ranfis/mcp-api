package com.mcp.mycareerplan.api.accounts;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mcp.mycareerplan.App;
import com.mcp.mycareerplan.LoginActivity;
import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.api.Request;
import com.mcp.mycareerplan.api.WS;

import java.io.IOException;


public class Login extends AsyncTask<Void, Void, HttpResponse<String>> {
    private static final String LOG_TAG = Login.class.getSimpleName();
    private Credentials credentials;
    private String apiToken;
    private ProgressDialog dialog;
    private LoginActivity activity;


    public Login(String user, String password, LoginActivity activity) {
        Log.d(LOG_TAG, "Login()");
        credentials = new Credentials(user, password);
        dialog = new ProgressDialog(activity);
        this.activity = activity;
    }


    public Login(String token, LoginActivity activity) {
        Log.d(LOG_TAG, "Login()");
        dialog = new ProgressDialog(activity);
        credentials = new Credentials(token);
        this.activity = activity;
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
        //TODO: check for errors
        try {
            Request req = App.convertToObject(resultResponse.getBody());
            if (req.getResponds().getCodigo() == 200) {
                Log.d(LOG_TAG, req.getResponds().getDatos().replace("[", "").replace("]", ""));
                App.currentUser = convertUserToObject(req.getResponds().getDatos().replace("[", "").replace("]", ""));
                App.currentUser.setFechanacimiento(App.currentUser.getFechanacimiento().substring(0, 10));
                App.currentUser.setNombre(App.capitalize(App.currentUser.getNombre()));
                App.currentUser.setApellidos(App.capitalize(App.currentUser.getApellidos()));
                activity.onLoginSuccess();
                dialog.dismiss();
                activity.finish();
            } else {
                if ((dialog != null) && dialog.isShowing()) {
                    dialog.dismiss();
                    dialog = null;
                }
                activity.onLoginFailed();
            }
        } catch (Exception ex) {
            Log.e(LOG_TAG, "Algo paso :s");
        }
    }


    public static Userx convertUserToObject(String content) {
        Log.d(LOG_TAG, "convertUserToObject():"+content);
        ObjectMapper mapper = new ObjectMapper();
        Userx response = null;
        try {
            response = mapper.readValue(content, Userx.class);
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
            response = Unirest.post(WS.buildUrl("/Logon/Login"))
                    .header("content-type", "application/json")
                    .body(mapper.writeValueAsString(credentials))
                    .asString();
            Log.d(LOG_TAG, "doInBackground()/response/"+response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
