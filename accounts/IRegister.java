package com.mcp.mycareerplan.api.accounts;

import com.mcp.mycareerplan.api.Result;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IRegister {
    @Headers({
            "Content-type: application/json"
    })
    @POST("Logon/RegistroUsuarios")
    Call<Result> register(@Body User user);
}