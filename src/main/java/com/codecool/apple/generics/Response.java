package com.codecool.apple.generics;

public class Response<T, R> {
    private String message;

    private boolean isSuccess;

    private T data;

    private R data2;

    public Response(String message, boolean isSuccess, T data, R data2) {
        this.message = message;
        this.isSuccess = isSuccess;
        this.data = data;
        this.data2 = data2;
    }


    public T getData() {
        return data;
    }

    public R getData2() {
        return data2;
    }
}
