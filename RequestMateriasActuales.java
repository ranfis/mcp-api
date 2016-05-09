package com.mcp.mycareerplan.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestMateriasActuales {

    private RespondsMateriasActuales responds;

    /**
     *
     * @return
     * The responds
     */
    public RespondsMateriasActuales getResponds() {
        return responds;
    }

    /**
     *
     * @param responds
     * The responds
     */
    public void setResponds(RespondsMateriasActuales responds) {
        this.responds = responds;
    }

}