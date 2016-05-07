
package com.mcp.mycareerplan.api.ciclos;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Ciclo {

    private Integer Bloque;
    private String BloqueNombre;
    private List<Asignatura> Asignaturas = new ArrayList<Asignatura>();

    /**
     * 
     * @return
     *     The Bloque
     */
    public Integer getBloque() {
        return Bloque;
    }

    /**
     * 
     * @param Bloque
     *     The Bloque
     */
    @JsonProperty("Bloque")
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
    @JsonProperty("BloqueNombre")
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
    @JsonProperty("Asignaturas")
    public void setAsignaturas(List<Asignatura> Asignaturas) {
        this.Asignaturas = Asignaturas;
    }

}
