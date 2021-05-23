package com.sfedu.object_;

/*
 * @ Date: 21:30 2021/5/23
 * @ Description:
 *
 */
public class Finalize_ {
    public static void main(String[] args) {
        Car car = new Car("宝马");
        car = null;
        System.gc();

        System.out.println("程序退出了...");

    }
}

class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁了 汽车" + getName());
        System.out.println("释放了一些资源......");

    }
}
