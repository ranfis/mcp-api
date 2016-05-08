package com.mcp.mycareerplan.api.accounts;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LuisMartinez on 05/07/16.
 */
public class Asignaturasestudiante {

    private Integer idAsignatura;
    private String codigoAsignatura;
    private String nombreAsignatura;
    private String estadoAsignatura;
    private Integer calificacion;
    private String calificacionLiteralNum;
    private Integer idSeleccion;
    private Object condicionAsignatura;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The idAsignatura
     */
    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    /**
     *
     * @param idAsignatura
     * The idAsignatura
     */
    @JsonProperty("idAsignatura")
    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    /**
     *
     * @return
     * The codigoAsignatura
     */
    public String getCodigoAsignatura() {
        return codigoAsignatura;
    }

    /**
     *
     * @param codigoAsignatura
     * The codigoAsignatura
     */
    @JsonProperty("codigoAsignatura")
    public void setCodigoAsignatura(String codigoAsignatura) {
        this.codigoAsignatura = codigoAsignatura;
    }

    /**
     *
     * @return
     * The nombreAsignatura
     */
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    /**
     *
     * @param nombreAsignatura
     * The nombreAsignatura
     */
    @JsonProperty("nombreAsignatura")
    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    /**
     *
     * @return
     * The estadoAsignatura
     */
    public String getEstadoAsignatura() {
        return estadoAsignatura;
    }

    /**
     *
     * @param estadoAsignatura
     * The estadoAsignatura
     */
    @JsonProperty("estadoAsignatura")
    public void setEstadoAsignatura(String estadoAsignatura) {
        this.estadoAsignatura = estadoAsignatura;
    }

    /**
     *
     * @return
     * The calificacion
     */
    public Integer getCalificacion() {
        return calificacion;
    }

    /**
     *
     * @param calificacion
     * The calificacion
     */
    @JsonProperty("calificacion")
    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    /**
     *
     * @return
     * The calificacionLiteralNum
     */
    public String getCalificacionLiteralNum() {
        return calificacionLiteralNum;
    }

    /**
     *
     * @param calificacionLiteralNum
     * The calificacionLiteralNum
     */
    @JsonProperty("calificacionLiteralNum")
    public void setCalificacionLiteralNum(String calificacionLiteralNum) {
        this.calificacionLiteralNum = calificacionLiteralNum;
    }

    /**
     *
     * @return
     * The idSeleccion
     */
    public Integer getIdSeleccion() {
        return idSeleccion;
    }

    /**
     *
     * @param idSeleccion
     * The idSeleccion
     */
    @JsonProperty("idSeleccion")
    public void setIdSeleccion(Integer idSeleccion) {
        this.idSeleccion = idSeleccion;
    }

    /**
     *
     * @return
     * The condicionAsignatura
     */
    public Object getCondicionAsignatura() {
        return condicionAsignatura;
    }

    /**
     *
     * @param condicionAsignatura
     * The condicionAsignatura
     */
    @JsonProperty("condicionAsignatura")
    public void setCondicionAsignatura(Object condicionAsignatura) {
        this.condicionAsignatura = condicionAsignatura;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
