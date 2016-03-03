package com.mcp.mycareerplan.api;

public class Result {
    public String msg = "";

    public Result(String msg) {
        this.msg = msg;
    }

    public Result(int msg) {
        this.msg = String.valueOf(msg);
    }
}