package com.mcp.mycareerplan.api;

public class WS {
    private static String apiUrl = "http://apiunifacil.azurewebsites.net/api";

    public static String getUrl(){
        return apiUrl;
    }

    public static String buildUrl(String endpoint){
        return apiUrl+endpoint;
    }
}
