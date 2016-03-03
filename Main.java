package com.mcp.mycareerplan.api;
import java.io.IOException;

public final class Main {

    private static final String LOG_TAG = Main.class.getSimpleName();

    public static void main(String... args) throws IOException {
        MCPWebService.config(MCPWebService.MOCK_API_URL);
        Result r = new Login("ranfis2","sanchez").authenticate();

       Log.d(LOG_TAG, r.msg);
    }
}
