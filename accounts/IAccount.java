package com.mcp.mycareerplan.api.accounts;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface IAccount {
    @GET("Accounts")
    Call<List<Account>> getList();
}