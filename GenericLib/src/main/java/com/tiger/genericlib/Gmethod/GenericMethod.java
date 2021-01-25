package com.tiger.genericlib.Gmethod;

public class GenericMethod<T> {
    private T mData;

    /**
     * 这只是一个普通方法
     *
     * @return
     */
    public T getData() {
        return mData;
    }

    /**
     * 这才是真正的泛型方法
     * 修饰符和返回值之间必须加上<T>
     *
     * @param dao
     * @param <T>
     * @return
     */
    public <T> T getDao(T... dao) {
        if (dao.length > 0) {
            return dao[0];
        }
        return null;
    }

    /**
     * 泛型方法 并限定变量的类型
     * @param a
     * @param b
     * @param <T>
     * @return
     */
    public static <T extends Comparable> T getMin(T a, T b) {
        return a.compareTo(b) > 0 ? b : a;
    }
}
