
package com.mcp.mycareerplan.api.university;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Carrera {

    private Integer idCarrera;
    private String nombreCarrera;
    private String descripcionCarrera;
    private Object idEstatus;
    private List<Object> pensums = new ArrayList<Object>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The idCarrera
     */
    public Integer getIdCarrera() {
        return idCarrera;
    }

    /**
     * 
     * @param idCarrera
     *     The idCarrera
     */
    public void setIdCarrera(Integer idCarrera) {
        this.idCarrera = idCarrera;
    }

    /**
     * 
     * @return
     *     The nombreCarrera
     */
    public String getNombreCarrera() {
        return nombreCarrera;
    }

    /**
     * 
     * @param nombreCarrera
     *     The nombreCarrera
     */
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    /**
     * 
     * @return
     *     The descripcionCarrera
     */
    public String getDescripcionCarrera() {
        return descripcionCarrera;
    }

    /**
     * 
     * @param descripcionCarrera
     *     The descripcionCarrera
     */
    public void setDescripcionCarrera(String descripcionCarrera) {
        this.descripcionCarrera = descripcionCarrera;
    }

    /**
     * 
     * @return
     *     The idEstatus
     */
    public Object getIdEstatus() {
        return idEstatus;
    }

    /**
     * 
     * @param idEstatus
     *     The idEstatus
     */
    public void setIdEstatus(Object idEstatus) {
        this.idEstatus = idEstatus;
    }

    /**
     * 
     * @return
     *     The pensums
     */
    public List<Object> getPensums() {
        return pensums;
    }

    /**
     * 
     * @param pensums
     *     The pensums
     */
    public void setPensums(List<Object> pensums) {
        this.pensums = pensums;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
