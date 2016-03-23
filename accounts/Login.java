package com.mcp.mycareerplan.api.accounts;

import android.os.AsyncTask;

import com.mcp.mycareerplan.api.Log;
import com.mcp.mycareerplan.api.MCPWebService;
import com.mcp.mycareerplan.api.Result;
import retrofit2.Response;

import java.io.IOException;
import java.net.URL;

public class Login extends AsyncTask<Void, Void, Response<Result>> {
    private static final String LOG_TAG = Login.class.getSimpleName();
    private Credentials credentials;

    public Login(String user, String password) {
        Log.d(LOG_TAG,"Login()");
        credentials = new Credentials(user,password);
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
        Log.d(LOG_TAG,"klk");
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
