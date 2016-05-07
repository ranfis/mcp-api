
package com.mcp.mycareerplan.api.ciclos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Asignatura {

    private String nombreasignatura;
    private Integer idAsignatura;
    private Object descripcion;
    private String codigo;
    private Integer creditosTotales;
    private Integer horasTeoricas;
    private Integer horasPracticas;
    private String area;
    private String EstatusAsignatura;
    private Boolean esCritica = false;


    public Boolean getEsCritica() {
        return esCritica;
    }

    public void setEsCritica(Boolean esCritica) {
        this.esCritica = esCritica;
    }


    public String getEstatusAsignatura() {
        return EstatusAsignatura;
    }

    @JsonProperty("EstatusAsignatura")
    public void setEstatusAsignatura(String estatusAsignatura) {
        EstatusAsignatura = estatusAsignatura;
    }

    public Integer getCreditosTotales() {
        return creditosTotales;
    }

    @JsonProperty("creditosTotales")
    public void setCreditosTotales(Integer creditosTotales) {
        this.creditosTotales = creditosTotales;
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
