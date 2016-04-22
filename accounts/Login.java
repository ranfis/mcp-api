package com.mcp.mycareerplan.api.accounts;

import android.app.ProgressDialog;
import android.os.AsyncTask;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mcp.mycareerplan.App;
import com.mcp.mycareerplan.LoginActivity;
import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.api.Log;
import com.mcp.mycareerplan.api.Request;

import java.io.IOException;

public class Login extends AsyncTask<Void, Void, HttpResponse<String>> {
    private static final String LOG_TAG = Login.class.getSimpleName();
    private Credentials credentials;
    private ProgressDialog dialog;
    private LoginActivity activity;

    public Login(String user, String password, LoginActivity activity) {
        Log.d(LOG_TAG,"Login()");
        credentials = new Credentials(user,password);
        dialog = new ProgressDialog(activity);
        this.activity = activity;
    }



    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dialog.setMessage(activity.getResources().getString(R.string.loading));
        dialog.show();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
        Log.d(LOG_TAG, "onProgressUpdate:" + values);
    }

    @Override
    protected void onPostExecute(HttpResponse<String> resultResponse) {
        Request req = App.convertToObject(resultResponse.getBody());
        if (req.getResponds().getCodigo()==200) {
            Log.d("LOG _ TAG", req.getResponds().getDatos().replace("[", "").replace("]", ""));

            App.currentUser = convertUserToObject(req.getResponds().getDatos().replace("[","").replace("]","").toLowerCase());
            App.currentUser.setFechanacimiento(App.currentUser.getFechanacimiento().substring(0,10));
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
    }


    public static User convertUserToObject(String content) {
        ObjectMapper mapper = new ObjectMapper();
        User response = null;
        try{
            response = mapper.readValue(content, User.class);
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
        Log.d(LOG_TAG,"authenticate()");
        HttpResponse<String> response = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            response = Unirest.post("http://apiunifacil.azurewebsites.net/api/Logon/Login")
                    .header("content-type", "application/json")
                    .body(mapper.writeValueAsString(credentials))
                    .asString();
            Log.d(LOG_TAG, response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
