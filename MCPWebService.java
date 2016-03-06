package com.mcp.mycareerplan.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MCPWebService {
    private static final String LOG_TAG = MCPWebService.class.getSimpleName();
//    public static String API_URL = "http://apimcp.azurewebsites.net/api/";
    public static String API_URL = "http://mcpapi.azurewebsites.net/api/";
//    public static String API_URL = "http://demo3446965.mockable.io/";
//    public static String API_URL = "https://j6i8kyxsxjaczcqxi.stoplight-proxy.io";

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
