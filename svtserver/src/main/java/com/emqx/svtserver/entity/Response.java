package com.emqx.svtserver.entity;

public class Response {
    int code;

    public Response() {
    }

    public Response(int code) {

        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
