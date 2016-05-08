package com.mcp.mycareerplan.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestCiclos {

    private Responds responds;

    /**
     *
     * @return
     * The responds
     */
    public Responds getResponds() {
        return responds;
    }

    /**
     *
     * @param responds
     * The responds
     */
    public void setResponds(Responds responds) {
        this.responds = responds;
    }

}