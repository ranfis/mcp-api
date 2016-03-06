package com.mcp.mycareerplan.api.accounts;

import com.mcp.mycareerplan.api.Log;
import com.mcp.mycareerplan.api.MCPWebService;
import com.mcp.mycareerplan.api.Result;
import retrofit2.Response;

import java.io.IOException;

public class Login {
    private static final String LOG_TAG = Login.class.getSimpleName();
    private Credentials credentials;

    public Login(String user, String password) {
        Log.d(LOG_TAG,"Login()");
        credentials = new Credentials(user,password);
    }

    public boolean authenticate() throws IOException {
        Log.d(LOG_TAG,"authenticate()");
        ILogin login = MCPWebService.getApi().create(ILogin.class);
//        try {
            Response<Result> res = login.authenticate(credentials).execute();
            Log.d(LOG_TAG, String.valueOf(res.code()) );
            return (res.code() == 200);
//        } catch (IOException e) {
//            Log.e(LOG_TAG, e.getMessage());
//            return false;
//        }
    }
}
