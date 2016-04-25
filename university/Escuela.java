
package com.mcp.mycareerplan.api.university;


import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private Integer idEscuela;
    private String nombreEscuela;
    private String director;
    private String telefono;
    private List<Carrera> carreras = new ArrayList<Carrera>();

    /**
     * 
     * @return
     *     The idEscuela
     */
    public Integer getIdEscuela() {
        return idEscuela;
    }

    /**
     * 
     * @param idEscuela
     *     The idEscuela
     */
    public void setIdEscuela(Integer idEscuela) {
        this.idEscuela = idEscuela;
    }

    /**
     * 
     * @return
     *     The nombreEscuela
     */
    public String getNombreEscuela() {
        return nombreEscuela;
    }

    /**
     * 
     * @param nombreEscuela
     *     The nombreEscuela
     */
    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }

    /**
     * 
     * @return
     *     The director
     */
    public String getDirector() {
        return director;
    }

    /**
     * 
     * @param director
     *     The director
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * 
     * @return
     *     The telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * 
     * @param telefono
     *     The telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * 
     * @return
     *     The carreras
     */
    public List<Carrera> getCarreras() {
        return carreras;
    }

    /**
     * 
     * @param carreras
     *     The carreras
     */
    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

}
