package com.sfedu.extend_;

import java.io.FileInputStream;

/*
 * @ Date: 22:39 2021/5/21
 * @ Description:
 * 讲解继承的本质
 */
public class ExtendTheory {
    public static void main(String[] args) {
        son son = new son();
        /* 访问son的属性：
        (1)先看自身有无该属性，若有且可以访问则直接访问输出
        (2)若子类没有该属性，则看直系父类有无该属性，若有且可以访问则直接访问输出
        (3)若父类没有该属性，则继续向上找父类的父类关于该属性的定义，直到Object
         */
        System.out.println(son.name); // 返回大头儿子
        System.out.println(son.age); // 返回39；若int age；则返回默认值0
        System.out.println(son.hobby); // 返回旅游
    }
}
class Grandpa {
    String name = "大头爷爷";
    String hobby = "旅游";
}
class Father extends Grandpa {
    String name = "大头爸爸";
    int age = 39;
}
class son extends Father {
    String name = "大头儿子";
}
