package com.sfedu.override_;

/*
 * @ Date: 21:56 2021/5/22
 * @ Description:
 *
 */
public class Student extends Person{
    private String id;
    private int score;

    public Student(String name, int age, String id, int score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say(){
        return "我叫" + getName() + "，今年" + getAge() + "岁。我的学号为" + id + "，本学期成绩为" + score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
