package com.tiger.genericlib.Gclass;

public class NormalGeneric<T> {
    private T data;

    public NormalGeneric(T data) {
        this.data = data;
    }

    public NormalGeneric() {

    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
