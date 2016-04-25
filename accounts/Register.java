package com.mcp.mycareerplan.api.accounts;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mcp.mycareerplan.App;
import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.SignUpActivity;
import com.mcp.mycareerplan.api.Request;
import com.mcp.mycareerplan.api.WS;

public class Register extends AsyncTask<Void, Void, HttpResponse<String>> {
    private static final String LOG_TAG = Register.class.getSimpleName();
    private User user;
    private ProgressDialog dialog;
    private SignUpActivity activity;

    public Register(User user, SignUpActivity activity) {
        this.user = user;
        dialog = new ProgressDialog(activity);
        dialog.setCanceledOnTouchOutside(false);
        this.activity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        dialog.setMessage(activity.getResources().getString(R.string.loading));
        dialog.show();
    }

    protected HttpResponse<String> doInBackground(Void... v) {
        Log.d(LOG_TAG, "registerUser()");
        HttpResponse<String> res = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
             res = Unirest.post(WS.buildUrl("/Logon/RegistroUsuarios"))
                    .header("content-type", "application/json")
                    .body(mapper.writeValueAsString(user))
                    .asString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return res;
    }

    @Override
    protected void onPostExecute(HttpResponse<String> resultResponse) {
        Request req = App.convertToObject(resultResponse.getBody());
        if (req.getResponds().getCodigo()==200) {
            activity.onSignupSuccess();
            dialog.dismiss();
            activity.finish();
        } else {
            if ((dialog != null) && dialog.isShowing()) {
                dialog.dismiss();
                dialog = null;
            }
            activity.onSignupFailed();
        }
    }


}
