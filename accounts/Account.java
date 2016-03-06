package com.mcp.mycareerplan.api.accounts;


import com.mcp.mycareerplan.api.Log;
import com.mcp.mycareerplan.api.MCPWebService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private static final String LOG_TAG = Account.class.getSimpleName();
    private int IdTipoUsuario;
    private int IdUsuario;
    private int TiposUsuario;
    private String Usuarios;
    private String token;

    public int getIdTipoUsuario() {
        return IdTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        IdTipoUsuario = idTipoUsuario;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        IdUsuario = idUsuario;
    }

    public int getTiposUsuario() {
        return TiposUsuario;
    }

    public void setTiposUsuario(int tiposUsuario) {
        TiposUsuario = tiposUsuario;
    }

    public String getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(String usuarios) {
        Usuarios = usuarios;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static List<Account> getUserList() throws IOException {
        Log.d(LOG_TAG, "getUserList()");
//        try{
        IAccount mIAccount = MCPWebService.getApi().create(IAccount.class);
        List<Account> accounts = mIAccount.getList().execute().body();

        for (Account a : accounts) {
            System.out.println(a.getUsuarios());
        }

        return accounts;
//        }
//        catch (IOException e){
//            Log.e(LOG_TAG, e.getMessage());
//            return new ArrayList<>();
//        }
    }
}
