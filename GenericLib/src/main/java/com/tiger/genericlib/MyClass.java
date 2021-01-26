package com.tiger.genericlib;

import com.tiger.genericlib.Gclass.ImplGeneric;
import com.tiger.genericlib.Gclass.ImplGeneric2;
import com.tiger.genericlib.Gclass.NormalGeneric;
import com.tiger.genericlib.Gclass.NormalGeneric2;
import com.tiger.genericlib.Ggerenal.Apple;
import com.tiger.genericlib.Ggerenal.Fruits;
import com.tiger.genericlib.Ggerenal.GnericFruit;
import com.tiger.genericlib.Ggerenal.HongFuShi;
import com.tiger.genericlib.Ggerenal.Orange;
import com.tiger.genericlib.Glimit.RestrictClass;
import com.tiger.genericlib.Gmethod.GenericMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Java语言中的泛型则不一样，它只在程序源码中存在，
 * 在编译后的字节码文件中，就已经替换为原来的原生类型（Raw Type，也称为裸类型）了，
 * 并且在相应的地方插入了强制转型代码，因此，对于运行期的Java语言来说，
 * ArrayList＜int＞与ArrayList＜String＞就是同一个类，所以泛型技术实际上是Java语言的一颗语法糖，
 * Java语言中的泛型实现方法称为类型擦除，基于这种方法实现的泛型称为伪泛型。
 */
public class MyClass {
    private static final String TAG = "Tiger--";
    public static void main(String[] args) {
        NormalGeneric<String> normalGeneric = new NormalGeneric<>();
        normalGeneric.setData("OK");
//        System.out.println(TAG+normalGeneric.getData());
        NormalGeneric normalGeneric1 = new NormalGeneric(1);
        normalGeneric1.setData("dsf");
//        System.out.println(TAG+normalGeneric1.getData());

        NormalGeneric2<String,Integer> normalGeneric2 = new NormalGeneric2<>();
        normalGeneric2.setData("good");
        normalGeneric2.setResult(201);
//        System.out.println(TAG+normalGeneric2);

        ImplGeneric<String> objectImplGeneric = new ImplGeneric<>();
        ImplGeneric2 implGeneric2 = new ImplGeneric2();

        GenericMethod genericMethod = new GenericMethod();
        Object dao = genericMethod.getDao("LON", "kiN");
        System.out.println(TAG+dao+"---"+ (dao instanceof  String));

        GnericFruit<Fruits> fruitGnericFruit = new GnericFruit<>();
        GnericFruit<Apple> appleGnericFruit = new GnericFruit<>();

        print(fruitGnericFruit);
        //这样会报错
       // print(appleGnericFruit);

        print2(fruitGnericFruit);
        print2(appleGnericFruit);
        appleGnericFruit.setFruit(new Apple());

        GnericFruit<? extends Fruits> c = new GnericFruit<>();
        //未指定泛型的真是类型 set方法会报错
       // c.setFruit(new Apple());
        Fruits fruit = c.getFruit();

        GnericFruit<? super Apple> cc = new GnericFruit<>();

        // super 调用get方法 返回的必然是object
        Object fruit1 = cc.getFruit();
        cc.setFruit(new Apple());
        cc.setFruit(new HongFuShi());
        //报错
//        cc.setFruit(new Fruits());

//        List<?> mylist = new ArrayList<>();
//        List<String> list = new ArrayList<>();
//        List<Object> objectList = new ArrayList<>();
//
//        objectList = list;
//        mylist = list;
//        Object o = mylist.get(0);
//        String s = list.get(0);


    }
    public static void print(GnericFruit<Fruits> p){
        System.out.println(TAG+p.toString());
    }

    /**
     * 通配符 ? extends X 表示传入的类型必须是Fruits的子类
     * 用于安全的读取get数据 获取的数据必然是X
     * @param p
     */
    public static void print2(GnericFruit<? extends Fruits> p){
        System.out.println(TAG+p.toString());
    }

    /**
     * 通配符 ? super X 表示传入的类型必须是Fruits的父类
     * 用于安全的写数据数据 写入的数据必须是X或者X的子类
     * @param p
     */
    public static void print3(GnericFruit<? super Apple> p){
        System.out.println(TAG+p.toString());
    }
}
