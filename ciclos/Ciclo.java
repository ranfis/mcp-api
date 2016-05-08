
package com.mcp.mycareerplan.api.ciclos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ciclo {

    private Integer Bloque;
    private String BloqueNombre;
    private Integer costo;
    private Integer totalCreditosBloque;
    private List<Asignatura> Asignaturas = new ArrayList<Asignatura>();

    /**
     * 
     * @return
     *     The Bloque
     */
    public Integer getBloque() {
        return Bloque;
    }

    public Integer getTotalCreditosBloque() {
        return totalCreditosBloque;
    }

    @JsonProperty("totalCreditosBloque")
    public void setTotalCreditosBloque(Integer totalCreditosBloque) {
        this.totalCreditosBloque = totalCreditosBloque;
    }

    public Integer getCosto() {
        return costo;
    }

    @JsonProperty("costo")
    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    /**
     * 
     * @param Bloque
     *     The Bloque
     */
    @JsonProperty("bloque")
    public void setBloque(Integer Bloque) {
        this.Bloque = Bloque;
    }

    /**
     * 
     * @return
     *     The BloqueNombre
     */
    public String getBloqueNombre() {
        return BloqueNombre;
    }

    /**
     * 
     * @param BloqueNombre
     *     The BloqueNombre
     */
    @JsonProperty("bloqueNombre")
    public void setBloqueNombre(String BloqueNombre) {
        this.BloqueNombre = BloqueNombre;
    }

    /**
     * 
     * @return
     *     The Asignaturas
     */
    public List<Asignatura> getAsignaturas() {
        return Asignaturas;
    }

    /**
     * 
     * @param Asignaturas
     *     The Asignaturas
     */
    @JsonProperty("asignaturas")
    public void setAsignaturas(List<Asignatura> Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

}
