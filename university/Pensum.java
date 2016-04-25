
package com.mcp.mycareerplan.api.university;

import java.util.ArrayList;
import java.util.List;

public class Pensum {

    private Integer idPemsun;
    private Integer versionPensum;
    private String nombrePensum;
    private List<PensumAsignatura> pensumAsignaturas = new ArrayList<PensumAsignatura>();

    /**
     * 
     * @return
     *     The idPemsun
     */
    public Integer getIdPemsun() {
        return idPemsun;
    }

    /**
     * 
     * @param idPemsun
     *     The idPemsun
     */
    public void setIdPemsun(Integer idPemsun) {
        this.idPemsun = idPemsun;
    }

    /**
     * 
     * @return
     *     The versionPensum
     */
    public Integer getVersionPensum() {
        return versionPensum;
    }

    /**
     * 
     * @param versionPensum
     *     The versionPensum
     */
    public void setVersionPensum(Integer versionPensum) {
        this.versionPensum = versionPensum;
    }

    /**
     * 
     * @return
     *     The nombrePensum
     */
    public String getNombrePensum() {
        return nombrePensum;
    }

    /**
     * 
     * @param nombrePensum
     *     The nombrePensum
     */
    public void setNombrePensum(String nombrePensum) {
        this.nombrePensum = nombrePensum;
    }

    /**
     * 
     * @return
     *     The pensumAsignaturas
     */
    public List<PensumAsignatura> getPensumAsignaturas() {
        return pensumAsignaturas;
    }

    /**
     * 
     * @param pensumAsignaturas
     *     The pensumAsignaturas
     */
    public void setPensumAsignaturas(List<PensumAsignatura> pensumAsignaturas) {
        this.pensumAsignaturas = pensumAsignaturas;
    }

}
