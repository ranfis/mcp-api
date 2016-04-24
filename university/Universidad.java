
package com.mcp.mycareerplan.api.university;

import com.mcp.mycareerplan.models.Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Universidad extends Model {

    private Integer idUniversidad;
    private String descripcion;
    private String telefono;
    private String email;
    private String direccion;
    private Integer cantidadCarreras;
    private Integer idEstatus;
    private String nombre;
    private List<Escuela> escuelas = new ArrayList<Escuela>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The idUniversidad
     */
    public Integer getIdUniversidad() {
        return idUniversidad;
    }

    /**
     * 
     * @param idUniversidad
     *     The idUniversidad
     */
    public void setIdUniversidad(Integer idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    /**
     * 
     * @return
     *     The descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * 
     * @param descripcion
     *     The descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * 
     * @return
     *     The telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * 
     * @param telefono
     *     The telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @return
     *     The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 
     * @return
     *     The direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * 
     * @param direccion
     *     The direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * 
     * @return
     *     The cantidadCarreras
     */
    public Integer getCantidadCarreras() {
        return cantidadCarreras;
    }

    /**
     * 
     * @param cantidadCarreras
     *     The cantidadCarreras
     */
    public void setCantidadCarreras(Integer cantidadCarreras) {
        this.cantidadCarreras = cantidadCarreras;
    }

    /**
     * 
     * @return
     *     The idEstatus
     */
    public Integer getIdEstatus() {
        return idEstatus;
    }

    /**
     * 
     * @param idEstatus
     *     The idEstatus
     */
    public void setIdEstatus(Integer idEstatus) {
        this.idEstatus = idEstatus;
    }

    /**
     * 
     * @return
     *     The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * 
     * @param nombre
     *     The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * 
     * @return
     *     The escuelas
     */
    public List<Escuela> getEscuelas() {
        return escuelas;
    }

    /**
     * 
     * @param escuelas
     *     The escuelas
     */
    public void setEscuelas(List<Escuela> escuelas) {
        this.escuelas = escuelas;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
