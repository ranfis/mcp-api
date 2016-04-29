package com.mcp.mycareerplan.api.semesters;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LuisMartinez on 04/29/16.
 */
public class Bloque {

    private String nombre;
    private String descripcion;
    private int image;
    private List<Semester> semester = new ArrayList<Semester>();

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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    /**
     *
     * @return
     * The descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     *
     * @param descripcion
     * The descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     *
     * @return
     * The semester
     */
    public List<Semester> getSemester() {
        return semester;
    }

    /**
     *
     * @param semester
     * The semester
     */
    public void setSemester(List<Semester> semester) {
        this.semester = semester;
    }

}