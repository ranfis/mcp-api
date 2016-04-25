
package com.mcp.mycareerplan.api.university;

public class PensumAsignatura {

    private String nombreasignatura;
    private Integer idAsignatura;
    private Object descripcion;
    private String codigo;

    /**
     * 
     * @return
     *     The nombreasignatura
     */
    public String getNombreasignatura() {
        return nombreasignatura;
    }

    /**
     * 
     * @param nombreasignatura
     *     The nombreasignatura
     */
    public void setNombreasignatura(String nombreasignatura) {
        this.nombreasignatura = nombreasignatura;
    }

    /**
     * 
     * @return
     *     The idAsignatura
     */
    public Integer getIdAsignatura() {
        return idAsignatura;
    }

    /**
     * 
     * @param idAsignatura
     *     The idAsignatura
     */
    public void setIdAsignatura(Integer idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    /**
     * 
     * @return
     *     The descripcion
     */
    public Object getDescripcion() {
        return descripcion;
    }

    /**
     * 
     * @param descripcion
     *     The descripcion
     */
    public void setDescripcion(Object descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * 
     * @return
     *     The codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * 
     * @param codigo
     *     The codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

}
