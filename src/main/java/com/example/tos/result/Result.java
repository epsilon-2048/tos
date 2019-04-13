package com.example.tos.result;


/**
 * 统一结果类
 */

import java.io.Serializable;

public class Result<T> implements Serializable {

    private static final long serializableUID;

    static {
        serializableUID = 8960474786737581150L;
    }

    private Integer code;

    private String msg;

    private T data;

    public Result() {
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
