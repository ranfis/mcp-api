package com.mcp.mycareerplan.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Respuesta {

    private String Respuesta;

    /**
     *
     * @return
     * The Respuesta
     */
    public String getRespuesta() {
        return Respuesta;
    }

    /**
     *
     * @param Respuesta
     * The Respuesta
     */
    public void setRespuesta(String Respuesta) {
        this.Respuesta = Respuesta;
    }

}