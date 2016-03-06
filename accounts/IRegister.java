package com.mcp.mycareerplan.api.accounts;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IRegister {
    @Headers({
            "Content-type: application/json"
    })
    @POST("Logon/RegistroUsuarios")
    Call<Object> register(@Body User user);
}