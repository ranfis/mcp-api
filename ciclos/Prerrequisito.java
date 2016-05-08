package com.mcp.mycareerplan.api.ciclos;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by LuisMartinez on 05/07/16.
 */
public class Prerrequisito {

    private Integer IdPredecesora;
    private String codigoAsignaturaPredecesora;
    private String NombrePredecesoraPr;

    /**
     *
     * @return
     * The IdPredecesora
     */
    public Integer getIdPredecesora() {
        return IdPredecesora;
    }

    /**
     *
     * @param IdPredecesora
     * The IdPredecesora
     */
    @JsonProperty("IdPredecesora")
    public void setIdPredecesora(Integer IdPredecesora) {
        this.IdPredecesora = IdPredecesora;
    }

    /**
     *
     * @return
     * The codigoAsignaturaPredecesora
     */
    public String getCodigoAsignaturaPredecesora() {
        return codigoAsignaturaPredecesora;
    }

    /**
     *
     * @param codigoAsignaturaPredecesora
     * The codigoAsignaturaPredecesora
     */
    @JsonProperty("codigoAsignaturaPredecesora")
    public void setCodigoAsignaturaPredecesora(String codigoAsignaturaPredecesora) {
        this.codigoAsignaturaPredecesora = codigoAsignaturaPredecesora;
    }

    /**
     *
     * @return
     * The NombrePredecesoraPr
     */
    public String getNombrePredecesoraPr() {
        return NombrePredecesoraPr;
    }

    /**
     *
     * @param NombrePredecesoraPr
     * The NombrePredecesoraPr
     */
    @JsonProperty("NombrePredecesoraPr")
    public void setNombrePredecesoraPr(String NombrePredecesoraPr) {
        this.NombrePredecesoraPr = NombrePredecesoraPr;
    }

}
