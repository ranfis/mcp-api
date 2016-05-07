package com.mcp.mycareerplan.api.accounts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;


import java.util.HashMap;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Userx {

    private String nombre;
    private String matricula;
    private String apellidos;
    private String correo;
    private String fechanacimiento;
    private Integer idEstatus;
    private String usuario;
    private String token;
    private Object sexo;
    private Integer pais;
    private String url;
    private Object imagen;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return The matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula The matricula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return The apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos The apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return The correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo The correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return The fechanacimiento
     */
    public String getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     * @param fechanacimiento The fechanacimiento
     */
    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    /**
     * @return The idEstatus
     */
    public Integer getIdEstatus() {
        return idEstatus;
    }

    /**
     * @param idEstatus The idEstatus
     */
    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    /**
     * @return The usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario The usuario
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return The token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token The token
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return The sexo
     */
    public Object getSexo() {
        return sexo;
    }

    /**
     * @param sexo The sexo
     */
    public void setSexo(Object sexo) {
        this.sexo = sexo;
    }

    /**
     * @return The pais
     */
    public Integer getPais() {
        return pais;
    }

    /**
     * @param pais The pais
     */
    public void setPais(Integer pais) {
        this.pais = pais;
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
     * @return The nombre
     */
    public String getNombreCompleto() {
        return nombre +" "+ apellidos;
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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}