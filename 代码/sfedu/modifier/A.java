package com.sfedu.modifier;

/*
 * @ Date: 16:53 2021/5/21
 * @ Description:
 *
 */
public class A {
    // 四个属性，分别使用不同修饰符修饰
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public void m1(){
        //方法访问四个属性
        System.out.println("n1 = " + n1 + ";n2 = " + n2 + ";n3 = " + n3 + ";n4 = " + n4);
    }

    protected void m2(){}
    void m3(){}
    private void m4(){}

    public void hi(){
        //在同一个类中，可以访问四种修饰符修饰的属性和方法
        m1();
        m2();
        m3();
        m4();
    }
}
