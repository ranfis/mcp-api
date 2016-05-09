package com.mcp.mycareerplan.api.ciclos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mcp.mycareerplan.api.semesters.Bloque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LuisMartinez on 05/09/16.
 */
public class CicloMiPlan {

    private Integer mesInicio;
    private String mesInicioMMMFormat;
    private String mesInicioMMMMFormat;
    private Integer anioInicio;
    private Integer mesFin;
    private String mesFinMMMFormat;
    private String mesFinMMMMFormat;
    private Integer anioFin;
    private List<BloqueMiPlan> bloques = new ArrayList<BloqueMiPlan>();
    private Integer costo;
    private Integer creditos;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The mesInicio
     */
    public Integer getMesInicio() {
        return mesInicio;
    }

    /**
     *
     * @param mesInicio
     *     The mesInicio
     */
    public void setMesInicio(Integer mesInicio) {
        this.mesInicio = mesInicio;
    }

    /**
     *
     * @return
     *     The mesInicioMMMFormat
     */
    public String getMesInicioMMMFormat() {
        return mesInicioMMMFormat;
    }

    /**
     *
     * @param mesInicioMMMFormat
     *     The mesInicioMMMFormat
     */
    public void setMesInicioMMMFormat(String mesInicioMMMFormat) {
        this.mesInicioMMMFormat = mesInicioMMMFormat;
    }

    /**
     *
     * @return
     *     The mesInicioMMMMFormat
     */
    public String getMesInicioMMMMFormat() {
        return mesInicioMMMMFormat;
    }

    /**
     *
     * @param mesInicioMMMMFormat
     *     The mesInicioMMMMFormat
     */
    public void setMesInicioMMMMFormat(String mesInicioMMMMFormat) {
        this.mesInicioMMMMFormat = mesInicioMMMMFormat;
    }

    /**
     *
     * @return
     *     The anioInicio
     */
    public Integer getAnioInicio() {
        return anioInicio;
    }

    /**
     *
     * @param anioInicio
     *     The anioInicio
     */
    public void setAnioInicio(Integer anioInicio) {
        this.anioInicio = anioInicio;
    }

    /**
     *
     * @return
     *     The mesFin
     */
    public Integer getMesFin() {
        return mesFin;
    }

    /**
     *
     * @param mesFin
     *     The mesFin
     */
    public void setMesFin(Integer mesFin) {
        this.mesFin = mesFin;
    }

    /**
     *
     * @return
     *     The mesFinMMMFormat
     */
    public String getMesFinMMMFormat() {
        return mesFinMMMFormat;
    }

    /**
     *
     * @param mesFinMMMFormat
     *     The mesFinMMMFormat
     */
    public void setMesFinMMMFormat(String mesFinMMMFormat) {
        this.mesFinMMMFormat = mesFinMMMFormat;
    }

    /**
     *
     * @return
     *     The mesFinMMMMFormat
     */
    public String getMesFinMMMMFormat() {
        return mesFinMMMMFormat;
    }

    /**
     *
     * @param mesFinMMMMFormat
     *     The mesFinMMMMFormat
     */
    public void setMesFinMMMMFormat(String mesFinMMMMFormat) {
        this.mesFinMMMMFormat = mesFinMMMMFormat;
    }

    /**
     *
     * @return
     *     The anioFin
     */
    public Integer getAnioFin() {
        return anioFin;
    }

    /**
     *
     * @param anioFin
     *     The anioFin
     */
    public void setAnioFin(Integer anioFin) {
        this.anioFin = anioFin;
    }

    /**
     *
     * @return
     *     The bloques
     */
    @JsonProperty("bloques")
    public List<BloqueMiPlan> getBloques() {
        return bloques;
    }

    /**
     *
     * @param bloques
     *     The bloques
     */
    @JsonProperty("bloques")
    public void setBloques(List<BloqueMiPlan> bloques) {
        this.bloques = bloques;
    }

    /**
     *
     * @return
     *     The costo
     */
    public Integer getCosto() {
        return costo;
    }

    /**
     *
     * @param costo
     *     The costo
     */
    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    /**
     *
     * @return
     *     The creditos
     */
    public Integer getCreditos() {
        return creditos;
    }

    /**
     *
     * @param creditos
     *     The creditos
     */
    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
