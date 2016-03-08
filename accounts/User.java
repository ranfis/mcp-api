package com.mcp.mycareerplan.api.accounts;


import java.util.Date;

public class User {
    private static final String LOG_TAG = User.class.getSimpleName();
    protected Integer IdTipoUsuario;
    protected String Usuario;
    protected String Clave;
    protected String Nombres;
    protected String Apellidos;
    protected String Correo;
    protected Date FechaNacimiento;
    protected Integer IdEstatus;

    public User(){

    }

    public User(String usuario, Integer idTipoUsuario, String clave, String nombres, String apellidos, String correo, Date fechaNacimiento, Integer idEstatus) {
        Usuario = usuario;
        IdTipoUsuario = idTipoUsuario;
        Clave = clave;
        Nombres = nombres;
        Apellidos = apellidos;
        Correo = correo;
        FechaNacimiento = fechaNacimiento;
        IdEstatus = idEstatus;
    }

    public Integer getIdTipoUsuario() {
        return IdTipoUsuario;
    }

    public void setIdTipoUsuario(Integer idTipoUsuario) {
        IdTipoUsuario = idTipoUsuario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        Clave = clave;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public Integer getIdEstatus() {
        return IdEstatus;
    }

    public void setIdEstatus(Integer idEstatus) {
        IdEstatus = idEstatus;
    }
}
