package com.tiger.genericlib.Glimit;


public class Restrict {

    public static void main(String[] args) {
        //不能用基本数据类型来实例化泛型
        RestrictClass<Double> doubleRestrict = new RestrictClass<>();
        RestrictClass<String> stringRestrict = new RestrictClass<>();
        //运行时的数据类型查询 只适用于原始类型
        System.out.println(doubleRestrict.getClass() == stringRestrict.getClass());//true

    }
}
