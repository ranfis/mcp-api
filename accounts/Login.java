package com.mcp.mycareerplan.api.accounts;

import android.app.ProgressDialog;
import android.os.AsyncTask;

import com.mcp.mycareerplan.LoginActivity;
import com.mcp.mycareerplan.R;
import com.mcp.mycareerplan.api.Log;
import com.mcp.mycareerplan.api.MCPWebService;
import com.mcp.mycareerplan.api.Result;
import retrofit2.Response;

import java.io.IOException;
import java.net.URL;

public class Login extends AsyncTask<Void, Void, Response<Result>> {
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
        Log.d(LOG_TAG,"onProgressUpdate:" + values);
    }

    @Override
    protected void onPostExecute(Response<Result> resultResponse) {
        // TODO: Make it work for correct API
        if (resultResponse.body().getCodigo()==400) {
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

    protected Response<Result> doInBackground(Void... v) {
        Log.d(LOG_TAG,"authenticate()");
        ILogin login = MCPWebService.getApi().create(ILogin.class);
        Response<Result> res = null;
        try {
            res = login.authenticate(credentials).execute();
            Log.d(LOG_TAG, res.body().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
