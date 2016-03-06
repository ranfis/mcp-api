package com.mcp.mycareerplan.api.accounts;

import com.mcp.mycareerplan.api.Result;
import retrofit2.Call;
import retrofit2.http.*;

public interface ILogin {
    @Headers({
            "Content-type: application/json"
    })
    @POST("Logon/Login")
    Call<Result> authenticate(@Body Credentials credentials);
}