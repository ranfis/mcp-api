package com.mcp.mycareerplan.api.accounts;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

import java.util.HashMap;
import java.util.Map;
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

    private Integer IdTipoUsuario;
    private String Usuario;
    private String Clave;
    private String url;
    private Object imagen;
    private Integer idPensum;
    private String Nombres;
    private String Apellidos;
    private String Correo;
    private String FechaNacimiento;
    private Integer IdEstatus;
    private Integer IdPais;
    private Integer idUsuario;
    private Integer idEstudiante;
    private String Sexo;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The IdTipoUsuario
     */
    public Integer getIdTipoUsuario() {
        return IdTipoUsuario;
    }

    public Integer getIdPensum() {
        return idPensum;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }
    @JsonProperty("idUsuario")
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdEstudiante() {
        return idEstudiante;
    }
    @JsonProperty("idEstudiante")
    public void setIdEstudiante(Integer idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public void setIdPensum(Integer idPensum) {
        this.idPensum = idPensum;
    }

    /**
     * @param IdTipoUsuario The IdTipoUsuario
     */
    public void setIdTipoUsuario(Integer IdTipoUsuario) {
        this.IdTipoUsuario = IdTipoUsuario;
    }

    /**
     * @return The Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario The Usuario
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return The Clave
     */
    public String getClave() {
        return Clave;
    }

    /**
     * @param Clave The Clave
     */
    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The imagen
     */
    public Object getImagen() {
        return imagen;
    }

    /**
     * @param imagen The imagen
     */
    public void setImagen(Object imagen) {
        this.imagen = imagen;
    }

    /**
     * @return The Nombres
     */
    public String getNombres() {
        return Nombres;
    }

    /**
     * @param Nombres The Nombres
     */
    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    /**
     * @return The Apellidos
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * @param Apellidos The Apellidos
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * @return The Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * @param Correo The Correo
     */
    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    /**
     * @return The FechaNacimiento
     */
    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    /**
     * @param FechaNacimiento The FechaNacimiento
     */
    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    /**
     * @return The IdEstatus
     */
    public Integer getIdEstatus() {
        return IdEstatus;
    }

    /**
     * @param IdEstatus The IdEstatus
     */
    public void setIdEstatus(Integer IdEstatus) {
        this.IdEstatus = IdEstatus;
    }

    /**
     * @return The IdPais
     */
    public Integer getIdPais() {
        return IdPais;
    }

    /**
     * @param IdPais The IdPais
     */
    public void setIdPais(Integer IdPais) {
        this.IdPais = IdPais;
    }

    /**
     * @return The Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo The Sexo
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}