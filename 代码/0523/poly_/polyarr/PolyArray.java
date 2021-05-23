package com.sfedu.poly_.polyarr;

import java.time.chrono.ThaiBuddhistEra;

/*
 * @ Date: 19:02 2021/5/23
 * @ Description:
 *
 */
public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Student("maru", 14, 56.8);
        persons[1] = new Student("jack", 18, 72.1);
        persons[2] = new Teacher("smith", 31, 20000);
        persons[3] = new Teacher("jone", 29, 15890);
        persons[4] = new Person("harry", 14);

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].say()); // 动态绑定机制
            if(persons[i] instanceof Student){
                ((Student)persons[i]).study();
            }else if(persons[i] instanceof Teacher){
                ((Teacher)persons[i]).teach();
            }else if(persons[i] instanceof Person){
                System.out.println("Person类型没有特殊方法");
            }else {
                System.out.println("你输入的类型有误，请重新检查");
            }
        }


    }
}
