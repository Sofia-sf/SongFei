package com.sfedu.poly_.polyarr;

/*
 * @ Date: 19:19 2021/5/23
 * @ Description:
 *
 */
public class Teacher extends Person{
    private double salary;

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String say() {
        return "老师" + super.say();
    }

    public void teach(){
        System.out.println("老师" + getName() + "正在教java...");
    }
}
