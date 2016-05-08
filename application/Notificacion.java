
package com.mcp.mycareerplan.api.application;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Notificacion {

    private String email;
    @JsonProperty("email")
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }
    private String token = "unifacilapptoken";
    @JsonProperty("token")
    public String getToken(){
        return token;
    }

    public void setToken(String token){
        this.token = token;
    }
    private String msg;
    @JsonProperty("msg")
    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
    private String nextActivity = "com.mcp.mycareerplan.SubjectApplication";
    @JsonProperty("nextActivity")
    public String getNextActivity(){
        return nextActivity;
    }

    public void setNextActivity(String nextActivity){
        this.nextActivity = nextActivity;
    }
    private String params1;
    @JsonProperty("params1")
    public String getParams1(){
        return params1;
    }

    public void setParams1(String params1){
        this.params1 = params1;
    }
    private String params2;
    @JsonProperty("params2")
    public String getParams2(){
        return params2;
    }

    public void setParams2(String params2){
        this.params2 = params2;
    }
    private String params3;
    @JsonProperty("params3")
    public String getParams3(){
        return params3;
    }

    public void setParams3(String params3){
        this.params3 = params3;
    }

}
