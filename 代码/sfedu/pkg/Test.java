package com.sfedu.pkg;

import com.sfedu.modifier.A;

/*
 * @ Date: 17:01 2021/5/21
 * @ Description:
 *
 */
public class Test {
    public static void main(String[] args) {

        A a = new A();
        // 不同包下只能访问public修饰的方法和属性
        System.out.println(a.n1);

        // 在不同包中，只能访问public修饰的方法和属性
        a.m1();
//        a.m2();
    }
}
