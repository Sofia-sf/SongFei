package com.sfedu.poly_.dynamic;

/*
 * @ Date: 00:18 2021/5/23
 * @ Description:
 *
 */
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum()); // 40 -> 30
        System.out.println(a.sum1()); // 30 -> 20
    }
}

class A{
    public int i = 10;

    public int sum(){
        return getI() + 10;
    }

    public int getI(){
        return i;
    }

    public int sum1(){
        return i + 10;
    }
}

class B extends A {
    public int i = 20;

//    public int sum(){
//        return getI() + 20;
//    }

    public int getI(){
        return i;
    }

//    public int sum1(){
//        return i + 10;
//    }
}
