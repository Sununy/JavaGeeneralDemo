package com.tiger.genericlib.Gclass;

public class NormalGeneric2<T, K> {
    private T data;
    private K result;

    public NormalGeneric2(T data) {
        this();
        this.data = data;
    }

    public NormalGeneric2(T data, K result) {
        this.data = data;
        this.result = result;
    }

    public NormalGeneric2() {

    }

    public K getResult() {
        return result;
    }

    public void setResult(K result) {
        this.result = result;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "NormalGeneric2{" +
                "data=" + data +
                ", result=" + result +
                '}';
    }
}
