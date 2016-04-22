
package com.mcp.mycareerplan.api.university;

import java.util.ArrayList;
import java.util.List;

public class Universidades {

    private Integer IdUniversidad;
    private String Descripcion;
    private String Telefono;
    private String Email;
    private String Direccion;
    private Integer CantidadCarreras;
    private Integer IdEstatus;
    private String Nombre;
    private List<Escuela> Escuelas = new ArrayList<>();

    /**
     * 
     * @return
     *     The IdUniversidad
     */
    public Integer getIdUniversidad() {
        return IdUniversidad;
    }

    /**
     * 
     * @param IdUniversidad
     *     The IdUniversidad
     */
    public void setIdUniversidad(Integer IdUniversidad) {
        this.IdUniversidad = IdUniversidad;
    }

    /**
     * 
     * @return
     *     The Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * 
     * @param Descripcion
     *     The Descripcion
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
     *     The Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * 
     * @param Email
     *     The Email
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * 
     * @return
     *     The Direccion
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * 
     * @param Direccion
     *     The Direccion
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * 
     * @return
     *     The CantidadCarreras
     */
    public Integer getCantidadCarreras() {
        return CantidadCarreras;
    }

    /**
     * 
     * @param CantidadCarreras
     *     The CantidadCarreras
     */
    public void setCantidadCarreras(Integer CantidadCarreras) {
        this.CantidadCarreras = CantidadCarreras;
    }

    /**
     * 
     * @return
     *     The IdEstatus
     */
    public Integer getIdEstatus() {
        return IdEstatus;
    }

    /**
     * 
     * @param IdEstatus
     *     The IdEstatus
     */
    public void setIdEstatus(Integer IdEstatus) {
        this.IdEstatus = IdEstatus;
    }

    /**
     * 
     * @return
     *     The Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * 
     * @param Nombre
     *     The Nombre
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * 
     * @return
     *     The Escuelas
     */
    public List<Escuela> getEscuelas() {
        return Escuelas;
    }

    /**
     * 
     * @param Escuelas
     *     The Escuelas
     */
    public void setEscuelas(List<Escuela> Escuelas) {
        this.Escuelas = Escuelas;
    }



}
