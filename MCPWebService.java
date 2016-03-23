package com.mcp.mycareerplan.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MCPWebService {
    private static final String LOG_TAG = MCPWebService.class.getSimpleName();
//    public static String API_URL = "http://apimcp.azurewebsites.net/api/";
//    public static String API_URL = "http://mcpapi.azurewebsites.net/api/";
    public static String API_URL = "https://bfgf3peuk6by4zghi.stoplight-proxy.io/api/";

    private static Retrofit retrofit;

    public static void config(String baseUrl){
        Log.d(LOG_TAG,"config()/"+baseUrl);
        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static Retrofit getApi() {
        Log.d(LOG_TAG,"getApi()");
        return retrofit;
    }

    public static String getApiUrl(){
        return API_URL;
    }
}
