package com.mcp.mycareerplan.api;

public class Result {
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    private int codigo;
    private String resultado;
    private String mensaje;

    public String getRespuesta() {
        return Respuesta;
    }

    public void setRespuesta(String respuesta) {
        Respuesta = respuesta;
    }

    private String Respuesta;
    public Result() {}

    @Override
    public String toString() {
        String r ="{\ncodigo: '"+getCodigo()+"',\nresultado: '"+getResultado()+"',\nmensaje:'"+getMensaje()+"'\n}";
        return r;
    }
}