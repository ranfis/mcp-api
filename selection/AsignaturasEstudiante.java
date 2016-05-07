
package com.mcp.mycareerplan.api.selection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AsignaturasEstudiante {

    private Integer IdAsignaturaEstudiante;
    private Integer IdPensum;
    private Integer IdAsignatura;
    private Integer Calificacion;
    private Integer IdEstadoMateria;

    /**
     * 
     * @return
     *     The IdAsignaturaEstudiante
     */
    @JsonProperty("IdAsignaturaEstudiante")
    public Integer getIdAsignaturaEstudiante() {
        return IdAsignaturaEstudiante;
    }

    /**
     * 
     * @param IdAsignaturaEstudiante
     *     The IdAsignaturaEstudiante
     */
    public void setIdAsignaturaEstudiante(Integer IdAsignaturaEstudiante) {
        this.IdAsignaturaEstudiante = IdAsignaturaEstudiante;
    }

    /**
     * 
     * @return
     *     The IdPensum
     */
    @JsonProperty("IdPensum")
    public Integer getIdPensum() {
        return IdPensum;
    }

    /**
     * 
     * @param IdPensum
     *     The IdPensum
     */
    public void setIdPensum(Integer IdPensum) {
        this.IdPensum = IdPensum;
    }

    /**
     * 
     * @return
     *     The IdAsignatura
     */
    @JsonProperty("IdAsignatura")
    public Integer getIdAsignatura() {
        return IdAsignatura;
    }

    /**
     * 
     * @param IdAsignatura
     *     The IdAsignatura
     */
    public void setIdAsignatura(Integer IdAsignatura) {
        this.IdAsignatura = IdAsignatura;
    }

    /**
     * 
     * @return
     *     The Calificacion
     */
    @JsonProperty("Calificacion")
    public Integer getCalificacion() {
        return Calificacion;
    }

    /**
     * 
     * @param Calificacion
     *     The Calificacion
     */
    public void setCalificacion(Integer Calificacion) {
        this.Calificacion = Calificacion;
    }

    /**
     * 
     * @return
     *     The IdEstadoMateria
     */
    @JsonProperty("IdEstadoMateria")
    public Integer getIdEstadoMateria() {
        return IdEstadoMateria;
    }

    /**
     * 
     * @param IdEstadoMateria
     *     The IdEstadoMateria
     */
    public void setIdEstadoMateria(Integer IdEstadoMateria) {
        this.IdEstadoMateria = IdEstadoMateria;
    }

}
