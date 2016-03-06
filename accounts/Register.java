package com.mcp.mycareerplan.api.accounts;

import com.mcp.mycareerplan.api.Log;
import com.mcp.mycareerplan.api.MCPWebService;
import retrofit2.Response;

import java.io.IOException;

public class Register {
    private static final String LOG_TAG = Register.class.getSimpleName();
    private User user;

    public Register(User user) {
        this.user = user;
    }

    public boolean registerUser() throws IOException {
        Log.d(LOG_TAG, "registerUser()");
        IRegister register = MCPWebService.getApi().create(IRegister.class);
        Response<Object> res = register.register(user).execute();
        Log.d(LOG_TAG, String.valueOf(res.code()));
        return (res.code() == 200);
    }
}
