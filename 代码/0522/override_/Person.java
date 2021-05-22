package com.sfedu.override_;

/*
 * @ Date: 21:56 2021/5/22
 * @ Description:
 *
 */
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say(){
        return "我叫" + name + "，今年" + age + "岁";
    }
}
