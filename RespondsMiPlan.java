package com.mcp.mycareerplan.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mcp.mycareerplan.api.ciclos.CicloMiPlan;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RespondsMiPlan {

    private Integer codigo;
    private String resultado;
    private String mensaje;
    private List<CicloMiPlan> ciclos = new ArrayList<CicloMiPlan>();

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
    @JsonProperty("datos")
    public List<CicloMiPlan> getCicloMiPlans() {
        return ciclos;
    }

    /**
     *
     * @param ciclos
     * The datos
     */
    @JsonProperty("datos")
    public void setDatos(List<CicloMiPlan> ciclos) {
        this.ciclos = ciclos;
    }


}