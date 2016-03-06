package com.mcp.mycareerplan.api.accounts;

public class Credentials{
    public String Usuario;
    public String clave;
    public Credentials(String Usuario, String clave) {
        this.Usuario = Usuario;
        this.clave = clave;
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