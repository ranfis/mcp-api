
package com.mcp.mycareerplan.api.university;

import java.util.ArrayList;
import java.util.List;

public class Carrera {

    private Integer idCarrera;
    private String nombreCarrera;
    private String descripcionCarrera;
    private Integer idEstatus;
    private List<Pensum> pensums = new ArrayList<Pensum>();

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
     *     The pensums
     */
    public List<Pensum> getPensums() {
        return pensums;
    }

    /**
     * 
     * @param pensums
     *     The pensums
     */
    public void setPensums(List<Pensum> pensums) {
        this.pensums = pensums;
    }

}
