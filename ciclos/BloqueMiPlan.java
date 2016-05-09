package com.mcp.mycareerplan.api.ciclos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by LuisMartinez on 05/09/16.
 */
public class BloqueMiPlan {

    private Integer bloque;
    private String bloqueNombre;
    private List<Asignatura> asignaturas = new ArrayList<Asignatura>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The bloque
     */
    public Integer getBloque() {
        return bloque;
    }

    /**
     *
     * @param bloque
     *     The bloque
     */
    public void setBloque(Integer bloque) {
        this.bloque = bloque;
    }

    /**
     *
     * @return
     *     The bloqueNombre
     */
    public String getBloqueNombre() {
        return bloqueNombre;
    }

    /**
     *
     * @param bloqueNombre
     *     The bloqueNombre
     */
    public void setBloqueNombre(String bloqueNombre) {
        this.bloqueNombre = bloqueNombre;
    }

    /**
     *
     * @return
     *     The asignaturas
     */
    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    /**
     *
     * @param asignaturas
     *     The asignaturas
     */
    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

