package com.mcp.mycareerplan.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mcp.mycareerplan.api.accounts.Datos;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RespondsCiclos {

    private Integer codigo;
    private String resultado;
    private String mensaje;
    private List<Datos> datos = new ArrayList<Datos>();

    /**
     *
     * @return
     * The codigo
     */
    public Integer getCodigo() {
        return codigo;
    }

    /**
     *
     * @param codigo
     * The codigo
     */
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    /**
     *
     * @return
     * The resultado
     */
    public String getResultado() {
        return resultado;
    }

    /**
     *
     * @param resultado
     * The resultado
     */
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    /**
     *
     * @return
     * The mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     *
     * @param mensaje
     * The mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     *
     * @return
     * The datos
     */
    public List<Datos> getDatos() {
        return datos;
    }

    /**
     *
     * @param datos
     * The datos
     */
    public void setDatos(List<Datos> datos) {
        this.datos = datos;
    }


}