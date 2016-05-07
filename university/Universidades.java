
package com.mcp.mycareerplan.api.university;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Universidades {

    private List<Universidad> listUniversidades;

    public List<Universidad> getListUniversidades() {
        return listUniversidades;
    }

    public void setListUniversidades(List<Universidad> listUniversidades) {
        this.listUniversidades = listUniversidades;
    }
}
