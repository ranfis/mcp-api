package com.mcp.mycareerplan.api;

public class WS {
    private static String apiUrl = "http://apiunifacil.azurewebsites.net/api";
    private static String apiUrlSimple = "http://apiunifacil.azurewebsites.net";
    private static String auxApiUrl = "http://auxserver_unifacil.netau.net";


    public static String getUrl(){
        return apiUrl;
    }

    public static String buildUrl(String endpoint){
        return apiUrl+endpoint;
    }

    public static String buildAuxUrl(String endpoint){
        return auxApiUrl+endpoint;
    }

    public static String buildSimpleUrl(String endpoint){
        return apiUrlSimple+endpoint;
    }


}
