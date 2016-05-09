package com.mcp.mycareerplan.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestMiPlan {

    private RespondsMiPlan responds;

    /**
     *
     * @return
     * The responds
     */
    public RespondsMiPlan getResponds() {
        return responds;
    }

    /**
     *
     * @param responds
     * The responds
     */
    public void setResponds(RespondsMiPlan responds) {
        this.responds = responds;
    }

}