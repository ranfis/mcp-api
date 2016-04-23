package com.mcp.mycareerplan.api.accounts;

public class Credentials{
    public String Usuario;
    public String clave;
    public String token;

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public Credentials(String Usuario, String clave) {
        this.Usuario = Usuario;
        this.clave = clave;
    }
    public Credentials(String token) {
        this.token = token;
    }
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
}