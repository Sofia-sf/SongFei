package com.sfedu.extend_.improved;

import com.sfedu.extend_.Graduate;
import com.sfedu.extend_.Pupil;

/*
 * @ Date: 21:44 2021/5/21
 * @ Description:
 *
 */
public class Extend01 {
    public static void main(String[] args) {
        com.sfedu.extend_.Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 11;
        pupil.setScore(65.6);
        pupil.showInfo();

        com.sfedu.extend_.Graduate graduate = new Graduate();
        graduate.name = "王红";
        graduate.age = 22;
        graduate.setScore(98.1);
        graduate.showInfo();
    }
}
