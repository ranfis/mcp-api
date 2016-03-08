package com.mcp.mycareerplan.api.accounts;

import android.os.AsyncTask;

import com.mcp.mycareerplan.api.Log;
import com.mcp.mycareerplan.api.MCPWebService;
import retrofit2.Response;

import java.io.IOException;
import java.net.URL;

public class Register extends AsyncTask<URL, Void, Boolean> {
    private static final String LOG_TAG = Register.class.getSimpleName();
    private User user;

    public Register(User user) {
        this.user = user;
    }

    protected Boolean doInBackground(URL... urls) {
        Log.d(LOG_TAG, "registerUser()");
        IRegister register = MCPWebService.getApi().create(IRegister.class);
        Response<Object> res = null;
        try {
            res = register.register(user).execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d(LOG_TAG, res.toString());
        return false;
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);

    }
}
