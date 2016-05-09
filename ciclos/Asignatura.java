
package com.mcp.mycareerplan.api.ciclos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Asignatura {


    private String nombreasignatura;
    private Integer idAsignatura;
    private Object descripcion;
    private String codigo;
    private Integer creditos;
    private Integer horasTeoricas;
    private Integer horasPracticas;
    private String area;
    private String estatusAsignatura;
    private Integer pensum;
    private String nombrePensum;
    private Integer versionPensum;
    private Boolean esCritica;
    private String estadoAsignatura;
    private String literalNumAsignatura;
    private Integer calificacionAsignatura;
    private List<Prerrequisito> prerrequisitos = new ArrayList<Prerrequisito>();



    public Integer getCreditos() {
        return creditos;
    }

    public Integer getPensum() {
        return pensum;
    }

    public void setPensum(Integer pensum) {
        this.pensum = pensum;
    }

    public String getNombrePensum() {
        return nombrePensum;
    }

    public void setNombrePensum(String nombrePensum) {
        this.nombrePensum = nombrePensum;
    }

    public Integer getVersionPensum() {
        return versionPensum;
    }

    public void setVersionPensum(Integer versionPensum) {
        this.versionPensum = versionPensum;
    }

    public String getEstadoAsignatura() {
        return estadoAsignatura;
    }

    public void setEstadoAsignatura(String estadoAsignatura) {
        this.estadoAsignatura = estadoAsignatura;
    }

    public String getLiteralNumAsignatura() {
        return literalNumAsignatura;
    }

    public void setLiteralNumAsignatura(String literalNumAsignatura) {
        this.literalNumAsignatura = literalNumAsignatura;
    }

    public Integer getCalificacionAsignatura() {
        return calificacionAsignatura;
    }

    public void setCalificacionAsignatura(Integer calificacionAsignatura) {
        this.calificacionAsignatura = calificacionAsignatura;
    }


    @JsonProperty("creditos")
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public List<Prerrequisito> getPrerrequisitos() {
        return prerrequisitos;
    }

    @JsonProperty("prerrequisitos")
    public void setPrerrequisitos(List<Prerrequisito> prerrequisitos) {
        this.prerrequisitos = prerrequisitos;
    }

    public Boolean getEsCritica() {
        return esCritica;
    }

    @JsonProperty("esCritica")
    public void setEsCritica(Boolean esCritica) {
        this.esCritica = esCritica;
    }


    public String getEstatusAsignatura() {
        return estatusAsignatura;
    }

    @JsonProperty("estatusAsignatura")
    public void setEstatusAsignatura(String estatusAsignatura) {
        this.estatusAsignatura = estatusAsignatura;
    }

    public Integer getHorasTeoricas() {
        return horasTeoricas;
    }

    @JsonProperty("horasTeoricas")
    public void setHorasTeoricas(Integer horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    public Integer getHorasPracticas() {
        return horasPracticas;
    }

    @JsonProperty("horasPracticas")
    public void setHorasPracticas(Integer horasPracticas) {
        this.horasPracticas = horasPracticas;
    }

    public String getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 
     * @return
     *     The nombreasignatura
     */
    public String getNombreasignatura() {
        return nombreasignatura;
    }

    /**
     * 
     * @param nombreasignatura
     *     The nombreasignatura
     */
    @JsonProperty("nombreasignatura")
    public void setNombreasignatura(String nombreasignatura) {
        this.nombreasignatura = nombreasignatura;
    }

    /**
     * 
     * @return
     *     The idAsignatura
     */
    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    /**
     * 
     * @param idAsignatura
     *     The idAsignatura
     */
    @JsonProperty("idAsignatura")
    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    /**
     * 
     * @return
     *     The descripcion
     */
    public Object getDescripcion() {
        return descripcion;
    }

    /**
     * 
     * @param descripcion
     *     The descripcion
     */
    @JsonProperty("descripcion")
    public void setDescripcion(Object descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * 
     * @return
     *     The codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * 
     * @param codigo
     *     The codigo
     */
    @JsonProperty("codigo")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
