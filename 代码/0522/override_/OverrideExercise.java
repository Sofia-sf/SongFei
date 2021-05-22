package com.sfedu.override_;

/*
 * @ Date: 21:52 2021/5/22
 * @ Description:
 * 编写一个Person类，包括属性/private(name\age)，构造器、方法say(返回自我介绍的字符串)
 * 编写一个Student类，继承Person类，增加id、score属性/private，以及构造器，定义say方法(返回自我介绍的信息)
 * 在main中，分别创建Person和Student对象，调用say方法输出自我介绍
 *
 */
public class OverrideExercise {
    public static void main(String[] args) {
        Student student = new Student("smith", 21, "201702943", 98);
        System.out.println(student.say());

        Person person = new Person("sally", 22);
        System.out.println(person.say());
    }
}