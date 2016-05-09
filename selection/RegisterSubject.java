package com.mcp.mycareerplan.api.selection;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mcp.mycareerplan.App;
import com.mcp.mycareerplan.DashboardActivity;
import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.SelectionActivity;
import com.mcp.mycareerplan.api.Request;
import com.mcp.mycareerplan.api.WS;
import com.mcp.mycareerplan.api.accounts.User;

public class RegisterSubject extends AsyncTask<Void, Void, HttpResponse<String>> {
    private static final String LOG_TAG = RegisterSubject.class.getSimpleName();
    private SeleccionAsignatura seleccionAsignatura;
    private ProgressDialog dialog;
    private SelectionActivity activity;

    public RegisterSubject(SeleccionAsignatura seleccionAsignatura, SelectionActivity activity) {
        this.seleccionAsignatura = seleccionAsignatura;
        dialog = new ProgressDialog(activity);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        this.activity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dialog.setMessage(activity.getResources().getString(R.string.loading_register_subject));
        dialog.show();
    }

    protected HttpResponse<String> doInBackground(Void... v) {
        Log.d(LOG_TAG, "registerSubject()");
        HttpResponse<String> res = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            res = Unirest.post(WS.buildSimpleUrl("/Registrouniversidad"))
                    .header("content-type", "application/json")
                    .body(mapper.writeValueAsString(seleccionAsignatura))
                    .asString();


            Log.d("REQUEST: ", mapper.writeValueAsString(seleccionAsignatura));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    protected void onPostExecute(HttpResponse<String> resultResponse) {
        Request req = App.convertToObject(resultResponse.getBody());
        if (req.getResponds().getCodigo() == 200) {
            App.currentUser.setIdPensum(seleccionAsignatura.getIdPensum());
            App.currentUser.setIdUniversidad(seleccionAsignatura.getIdUniversidad());
            App.updateSession(App.currentUser);
            dialog.dismiss();
            activity.finish();
            //SUCCESS
            activity.onSuccess();
        } else {

            Toast.makeText(activity, "Hemos encontrado un error, intentar más tarde", Toast.LENGTH_SHORT).show();
            //FAILED
        }
        if ((dialog != null) && dialog.isShowing()) {
            dialog.dismiss();
            dialog = null;
        }
    }


}
