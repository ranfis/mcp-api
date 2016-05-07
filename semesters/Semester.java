package com.mcp.mycareerplan.api.semesters;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuisMartinez on 04/29/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Semester {

    private String nombre;
    private List<Materia> materias = new ArrayList<Materia>();

    /**
     *
     * @return
     * The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     * The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     * The materias
     */
    public List<Materia> getMaterias() {
        return materias;
    }

    /**
     *
     * @param materias
     * The materias
     */
    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

}