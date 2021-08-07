package com.sjtu.alumnimanagement.utils;

public class ResultResponse {
    private int code;
    public static final int SUCCESS = 200;
    public static final int FAIL = 400;

    public ResultResponse(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

