package com.sfedu.extend_.improved;

/*
 * @ Date: 21:37 2021/5/21
 * @ Description:
 *
 */
public class Student {
//    父类，是Pupil 和 Graduate的父类
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("大学生名为" + name + "，今年" + age + "岁，成绩为" + score);
    }
}
