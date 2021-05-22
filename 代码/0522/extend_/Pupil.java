package com.sfedu.extend_;

/*
 * @ Date: 21:25 2021/5/21
 * @ Description:
 * 小学生->模拟考试
 */
public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing(){
        System.out.println("小学生" + name + "正在考试");
    }

    public void showInfo(){
        System.out.println("小学生名为" + name + "，今年" + age + "岁，成绩为" + score);
    }
}
