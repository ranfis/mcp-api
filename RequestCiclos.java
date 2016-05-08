package com.mcp.mycareerplan.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestCiclos {

    private RespondsCiclos responds;

    /**
     *
     * @return
     * The responds
     */
    public RespondsCiclos getResponds() {
        return responds;
    }

    /**
     *
     * @param responds
     * The responds
     */
    public void setResponds(RespondsCiclos responds) {
        this.responds = responds;
    }

}