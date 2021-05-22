package com.sfedu.extend_;

/*
 * @ Date: 21:29 2021/5/21
 * @ Description:
 *
 */
public class Graduate {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void testing(){
        System.out.println("大学生" + name + "正在考试");
    }

    public void showInfo(){
        System.out.println("大学生名为" + name + "，今年" + age + "岁，成绩为" + score);
    }
}
