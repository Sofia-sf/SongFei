package com.sfedu.poly_.polyarr;

/*
 * @ Date: 19:17 2021/5/23
 * @ Description:
 *
 */
public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String say() {
        return "学生" + super.say();
    }

    public void study(){
        System.out.println("学生" + getName() + "正在学习java...");
    }
}
