
package com.mcp.mycareerplan.api.selection;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeleccionAsignatura {

    private String Usuario;
    private Integer IdUniversidad;
    private Integer IdCarrera;
    private Integer IdPensum;
    private Integer IdRegistroEstudiante;
    private List<AsignaturasEstudiante> AsignaturasEstudiantes = new ArrayList<AsignaturasEstudiante>();

    /**
     * 
     * @return
     *     The Usuario
     */
    @JsonProperty("Usuario")
    public String getUsuario() {
        return Usuario;
    }

    /**
     * 
     * @param Usuario
     *     The Usuario
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * 
     * @return
     *     The IdUniversidad
     */
    @JsonProperty("IdUniversidad")
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
     *     The IdCarrera
     */
    @JsonProperty("IdCarrera")
    public Integer getIdCarrera() {
        return IdCarrera;
    }

    /**
     * 
     * @param IdCarrera
     *     The IdCarrera
     */
    public void setIdCarrera(Integer IdCarrera) {
        this.IdCarrera = IdCarrera;
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
     *     The IdRegistroEstudiante
     */
    @JsonProperty("IdRegistroEstudiante")
    public Integer getIdRegistroEstudiante() {
        return IdRegistroEstudiante;
    }

    /**
     * 
     * @param IdRegistroEstudiante
     *     The IdRegistroEstudiante
     */
    public void setIdRegistroEstudiante(Integer IdRegistroEstudiante) {
        this.IdRegistroEstudiante = IdRegistroEstudiante;
    }

    /**
     * 
     * @return
     *     The AsignaturasEstudiantes
     */
    @JsonProperty("AsignaturasEstudiantes")
    public List<AsignaturasEstudiante> getAsignaturasEstudiantes() {
        return AsignaturasEstudiantes;
    }

    /**
     * 
     * @param AsignaturasEstudiantes
     *     The AsignaturasEstudiantes
     */
    public void setAsignaturasEstudiantes(List<AsignaturasEstudiante> AsignaturasEstudiantes) {
        this.AsignaturasEstudiantes = AsignaturasEstudiantes;
    }

}
