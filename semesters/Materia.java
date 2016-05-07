package com.mcp.mycareerplan.api.semesters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by LuisMartinez on 04/29/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Materia {


    private String nombre;
    private String codigo;

    public Materia(String codigo,String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    /**
     * @return The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return The codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo The codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreLargo() {
        return codigo + " " + nombre;
    }

}