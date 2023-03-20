package com.example.demo.domain;

public class Result<T> {
    String message;
    Integer Code;
    T Data;

    public Result(String message, Integer code, T data) {
        this.message = message;
        Code = code;
        Data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return Code;
    }

    public void setCode(Integer code) {
        Code = code;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public static Result okResult(Object data) {
        Result result = new Result("success", 0, data);
        return result;
    }
}
