package com.mcp.mycareerplan.api.ciclos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

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
    @JsonSetter("IdPredecesora")
    public void setIdPredecesora(Integer IdPredecesora) {
        this.IdPredecesora = IdPredecesora;
    }

    @JsonSetter("idPredecesora")
    public void setIdPredecesoraV2(Integer IdPredecesora) {
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
    @JsonSetter("NombrePredecesoraPr")
    public void setNombrePredecesoraPr(String NombrePredecesoraPr) {
        this.NombrePredecesoraPr = NombrePredecesoraPr;
    }

    @JsonSetter("nombrePredecesoraPr")
    public void setNombrePredecesoraPrV2(String NombrePredecesoraPr) {
        this.NombrePredecesoraPr = NombrePredecesoraPr;
    }

}
