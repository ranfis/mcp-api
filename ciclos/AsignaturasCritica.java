package com.mcp.mycareerplan.api.ciclos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsignaturasCritica {

    private Integer idAsigantuasCriticas;
    private Integer idAsignaturas;
    private String nombreAsignatura;
    private String codigoAsignatura;

    /**
     *
     * @return
     * The idAsigantuasCriticas
     */
    public Integer getIdAsigantuasCriticas() {
        return idAsigantuasCriticas;
    }

    /**
     *
     * @param idAsigantuasCriticas
     * The idAsigantuasCriticas
     */
    @JsonProperty("idAsigantuasCriticas")
    public void setIdAsigantuasCriticas(Integer idAsigantuasCriticas) {
        this.idAsigantuasCriticas = idAsigantuasCriticas;
    }

    /**
     *
     * @return
     * The idAsignaturas
     */
    public Integer getIdAsignaturas() {
        return idAsignaturas;
    }

    /**
     *
     * @param idAsignaturas
     * The idAsignaturas
     */
    @JsonProperty("idAsignaturas")
    public void setIdAsignaturas(Integer idAsignaturas) {
        this.idAsignaturas = idAsignaturas;
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

}