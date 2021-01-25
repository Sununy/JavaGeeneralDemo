package com.tiger.genericlib.Ggerenal;

public class GnericFruit<T> {
    private T fruit;

    public GnericFruit() {
    }

    public T getFruit() {
        return fruit;
    }

    public void setFruit(T fruit) {
        this.fruit = fruit;
    }

    @Override
    public String toString() {
        return "GnericFruit{" +
                "fruit=" + fruit +
                '}';
    }
}
