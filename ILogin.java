package com.mcp.mycareerplan.api;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ILogin {
    @POST("/logon/login") Call<Result> authenticate(@Body Credentials body);
}