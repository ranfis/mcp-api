package com.mcp.mycareerplan.api.accounts;

import android.os.AsyncTask;

import com.mcp.mycareerplan.api.Log;
import com.mcp.mycareerplan.api.MCPWebService;
import com.mcp.mycareerplan.api.Result;

import retrofit2.Response;

import java.io.IOException;
import java.net.URL;

public class Register extends AsyncTask<Void, Void, Response<Result>> {
    private static final String LOG_TAG = Register.class.getSimpleName();
    private User user;

    public Register(User user) {
        this.user = user;
    }

    protected Response<Result> doInBackground(Void... v) {
        Log.d(LOG_TAG, "registerUser()");
        IRegister register = MCPWebService.getApi().create(IRegister.class);
        Response<Result> res = null;
        try {
            res = register.register(user).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d(LOG_TAG, res.toString());
        return res;
    }

    @Override
    protected void onPostExecute(Response<Result>  res) {
        super.onPostExecute(res);
        Log.d(LOG_TAG,res.message());
    }
}
