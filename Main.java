package com.mcp.mycareerplan.api;
import com.mcp.mycareerplan.api.accounts.Account;

import java.io.IOException;

public final class Main {

    private static final String LOG_TAG = Main.class.getSimpleName();

    public static void main(String... args) throws IOException {
        MCPWebService.config(MCPWebService.getApiUrl());

//        User ranfis = new User();
//        ranfis.setUsuario("usuario");
//        ranfis.setIdTipoUsuario(1);
//        ranfis.setClave("clave");
//        ranfis.setNombres("nombres");
//        ranfis.setApellidos("apellidos");
//        ranfis.setCorreo("correo");
//        ranfis.setFechaNacimiento(null);
//        ranfis.setIdEstatus(1);
//        Boolean res = new Register(ranfis).registerUser();

        Boolean res = Account.getUserList();
        Log.d(LOG_TAG,res.toString());
    }
}
