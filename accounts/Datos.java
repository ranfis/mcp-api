package com.mcp.mycareerplan.api.accounts;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LuisMartinez on 05/07/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Datos {

    private String nombre;
    private String apellidos;
    private String correo;
    private String fechanacimiento;
    private Integer idEstatus;
    private Integer idPensum;
    private String usuario;
    private String token;
    private Object sexo;
    private Integer idUsuario;
    private Integer idEstudiante;
    private Object pais;
    private Object url;
    private Object imagen;
    private Integer idUniversidad;
    private List<Asignaturasestudiante> asignaturasestudiante = new ArrayList<Asignaturasestudiante>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();


    public Integer getIdPensum() {
        return idPensum;
    }
    @JsonProperty("idPensum")
    public void setIdPensum(Integer idPensum) {
        this.idPensum = idPensum;
    }

    /**
     *
     * @return
     * The nombre
     */
    public String getNombre() {
        return nombre;
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

    /**
     *
     * @param nombre
     * The nombre
     */
    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     * The apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     *
     * @param apellidos
     * The apellidos
     */
    @JsonProperty("apellidos")
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     *
     * @return
     * The correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     *
     * @param correo
     * The correo
     */
    @JsonProperty("correo")
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     *
     * @return
     * The fechanacimiento
     */
    public String getFechanacimiento() {
        return fechanacimiento;
    }

    /**
     *
     * @param fechanacimiento
     * The fechanacimiento
     */
    @JsonProperty("fechanacimiento")
    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    /**
     *
     * @return
     * The idEstatus
     */
    public Integer getIdEstatus() {
        return idEstatus;
    }

    /**
     *
     * @param idEstatus
     * The idEstatus
     */
    @JsonProperty("idEstatus")
    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    /**
     *
     * @return
     * The usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     *
     * @param usuario
     * The usuario
     */
    @JsonProperty("usuario")
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     *
     * @return
     * The token
     */
    public String getToken() {
        return token;
    }

    /**
     *
     * @param token
     * The token
     */
    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

    /**
     *
     * @return
     * The sexo
     */
    public Object getSexo() {
        return sexo;
    }

    /**
     *
     * @param sexo
     * The sexo
     */
    @JsonProperty("sexo")
    public void setSexo(Object sexo) {
        this.sexo = sexo;
    }

    /**
     *
     * @return
     * The pais
     */
    public Object getPais() {
        return pais;
    }

    /**
     *
     * @param pais
     * The pais
     */
    @JsonProperty("pais")
    public void setPais(Object pais) {
        this.pais = pais;
    }

    /**
     *
     * @return
     * The url
     */
    public Object getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The imagen
     */
    public Object getImagen() {
        return imagen;
    }

    /**
     *
     * @param imagen
     * The imagen
     */
    @JsonProperty("imagen")
    public void setImagen(Object imagen) {
        this.imagen = imagen;
    }

    /**
     *
     * @return
     * The idUniversidad
     */
    public Integer getIdUniversidad() {
        return idUniversidad;
    }

    /**
     *
     * @param idUniversidad
     * The idUniversidad
     */
    @JsonProperty("idUniversidad")
    public void setIdUniversidad(Integer idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    /**
     *
     * @return
     * The asignaturasestudiante
     */
    public List<Asignaturasestudiante> getAsignaturasestudiante() {
        return asignaturasestudiante;
    }

    /**
     *
     * @param asignaturasestudiante
     * The asignaturasestudiante
     */
    @JsonProperty("asignaturasestudiante")
    public void setAsignaturasestudiante(List<Asignaturasestudiante> asignaturasestudiante) {
        this.asignaturasestudiante = asignaturasestudiante;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
