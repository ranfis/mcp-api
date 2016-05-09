package com.mcp.mycareerplan.api.accounts;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

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
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
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
                Datos temp = req.getResponds().getDatos().get(0);
                App.currentUser = convertDatosToUser(temp);
                App.currentUser.setFechanacimiento(App.currentUser.getFechanacimiento().substring(0, 10));
                App.currentUser.setNombre(App.capitalize(App.currentUser.getNombre()));
                App.currentUser.setApellidos(App.capitalize(App.currentUser.getApellidos()));
                activity.onLoginSuccess();
                dialog.dismiss();
                activity.finish();
            } else {
                activity.onLoginFailed();
            }
        } catch (Exception ex) {
            Log.e(LOG_TAG, "Algo paso :s");
            Toast.makeText(activity, "Hemos encontrado un error, favor intentar de nuevo.", Toast.LENGTH_SHORT).show();
        }

        if ((dialog != null) && dialog.isShowing()) {
            dialog.dismiss();
            dialog = null;
        }
    }


    public static Userx convertDatosToUser(Datos content) {
        Log.d(LOG_TAG, "convertUserToObject():" + content);
        Userx response = new Userx();
        response.setNombre(content.getNombre());
//        response.setPais(content.getPais());
        response.setFechanacimiento(content.getFechanacimiento());
        response.setApellidos(content.getApellidos());
        response.setCorreo(content.getCorreo());
        response.setIdEstatus(content.getIdEstatus());
        response.setToken(content.getToken());
        response.setImagen(content.getImagen());
        response.setSexo(content.getSexo());
        response.setUsuario(content.getUsuario());
        response.setIdEstudiante(content.getIdEstudiante());
        response.setIdPensum(content.getIdPensum());
        response.setUrl((String) content.getUrl());
        response.setIdUniversidad(content.getIdUniversidad());
        response.setAsignaturasestudiante(content.getAsignaturasestudiante());

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
            Log.d(LOG_TAG, "doInBackground()/response/" + response.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response;
    }
}
