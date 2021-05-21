package com.sfedu.modifier;

/*
 * @ Date: 16:57 2021/5/21
 * @ Description:
 *
 */
public class B {
    public void say() {
        A a = new A();
        // 在同一个包下，可以访问public，protected和默认，不能访问private
        System.out.println("n1 = " + a.n1 + ";n2 = " + a.n2 + ";n3 = " + a.n3);

        // 在同一个包下不同类中，只能访问默认及以上
        a.m1();
        a.m2();
        a.m3();
    }


}
