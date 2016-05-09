package com.mcp.mycareerplan.api.application;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mcp.mycareerplan.App;
import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.api.Request;
import com.mcp.mycareerplan.api.WS;

public class PostSubjectApplication extends AsyncTask<Void, Void, HttpResponse<String>> {
    private static final String LOG_TAG = PostSubjectApplication.class.getSimpleName();
    private Notificacion notificacion;
    private ProgressDialog dialog;
    private Activity activity;

    public PostSubjectApplication(Notificacion notificacion, Activity activity) {
        this.notificacion = notificacion;
        dialog = new ProgressDialog(activity);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);
        this.activity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dialog.setMessage(activity.getResources().getString(R.string.loading));
        dialog.show();
    }

    protected HttpResponse<String> doInBackground(Void... v) {
        Log.d(LOG_TAG, "subjectApplication()");
        HttpResponse<String> res = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            res = Unirest.post(WS.buildAuxUrl("/notification_handler.php"))
                    .header("content-type", "application/json")
                    .body(mapper.writeValueAsString(notificacion))
                    .asString();


            Log.d("REQUEST: ", mapper.writeValueAsString(notificacion));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    protected void onPostExecute(HttpResponse<String> resultResponse) {

        if ((dialog != null) && dialog.isShowing()) {
            dialog.dismiss();
            dialog = null;
        }

        Toast.makeText(activity, "¡Notificación enviada!", Toast.LENGTH_SHORT).show();
    }


}
