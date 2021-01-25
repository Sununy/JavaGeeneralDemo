package com.tiger.genericlib.Gclass;

/**
 * 未指定泛型类型时 那么new的时候需要给定
 * @param <T>
 */
public class ImplGeneric<T> implements Genrator<T> {
    @Override
    public T next() {
        return null;
    }
}
