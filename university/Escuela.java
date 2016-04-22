
package com.mcp.mycareerplan.api.university;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

    private Integer IdEscuela;
    private String NombreEscuela;
    private String Director;
    private String Telefono;
    private List<Object> Carreras = new ArrayList<Object>();

    /**
     * 
     * @return
     *     The IdEscuela
     */
    public Integer getIdEscuela() {
        return IdEscuela;
    }

    /**
     * 
     * @param IdEscuela
     *     The IdEscuela
     */
    public void setIdEscuela(Integer IdEscuela) {
        this.IdEscuela = IdEscuela;
    }

    /**
     * 
     * @return
     *     The NombreEscuela
     */
    public String getNombreEscuela() {
        return NombreEscuela;
    }

    /**
     * 
     * @param NombreEscuela
     *     The NombreEscuela
     */
    public void setNombreEscuela(String NombreEscuela) {
        this.NombreEscuela = NombreEscuela;
    }

    /**
     * 
     * @return
     *     The Director
     */
    public String getDirector() {
        return Director;
    }

    /**
     * 
     * @param Director
     *     The Director
     */
    public void setDirector(String Director) {
        this.Director = Director;
    }

    /**
     * 
     * @return
     *     The Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * 
     * @param Telefono
     *     The Telefono
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * 
     * @return
     *     The Carreras
     */
    public List<Object> getCarreras() {
        return Carreras;
    }

    /**
     * 
     * @param Carreras
     *     The Carreras
     */
    public void setCarreras(List<Object> Carreras) {
        this.Carreras = Carreras;
    }

}
