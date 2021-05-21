package com.sfedu.extend_;

/*
 * @ Date: 21:37 2021/5/21
 * @ Description:
 *
 */
public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 12;
        pupil.setScore(35.6);
        pupil.showInfo();

        Graduate graduate = new Graduate();
        graduate.name = "王红";
        graduate.age = 21;
        graduate.setScore(78.1);
        graduate.showInfo();


    }
}
