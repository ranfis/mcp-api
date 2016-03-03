package com.mcp.mycareerplan.api;

import retrofit2.Response;

import java.io.IOException;

public class Login {
    private static final String LOG_TAG = Login.class.getSimpleName();
    private Credentials credentials;

    public Login(String user, String password) {
        Log.d(LOG_TAG,"Login()");
        credentials = new Credentials(user,password);
    }

    public Result authenticate() throws IOException {
        Log.d(LOG_TAG,"authenticate()");
        ILogin login = MCPWebService.getApi().create(ILogin.class);
//        try {
            Response<Result> res = login.authenticate(credentials).execute();
            Log.d(LOG_TAG, String.valueOf(res.code()) );
            if (res.code() == 200){
                return res.body();
            }
            else{
                return new Result(res.code());
            }
//        } catch (IOException e) {
//            Log.e(LOG_TAG, e.getMessage());
//
//            e.getStackTrace()
//            return new Result(1);
//        }
    }
}
