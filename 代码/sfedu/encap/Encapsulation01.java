package com.sfedu.encap;

/*
 * @ Date: 20:40 2021/5/21
 * @ Description:
 * 不能随便查看人的年龄、工资等隐私，并对设置的年龄进行合理的验证。
 * 年龄合理就设置，否则给默认年龄，必须在1-120，年龄、工资不能随便查看。
 * name长度在2-6自符之间
 *
 */
public class Encapsulation01 {
    public static void main(String[] args) {
//        Person p = new Person();
//        p.setName("jack");
//        p.setAge(300);
//        p.setSalary(7800);
        Person p = new Person("smith", 3000, 90000);
        System.out.println(p.info());
    }
}

class Person {
    public String name; // 名字公开
    private int age; // age私有化
    private double salary; // salary私有化

    // 构造器


    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        // 将构造器内的赋值封装在内部仍然可以实现验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name){
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else{
            System.out.println("你输入的姓名有误，默认名字为无");
            this.name = "无";
        }

    }
    public String getName(){
        return name;
    }

    public void setAge(int age) {
        // 判断age
        if(age > 0 && age <=120){
            this.age = age;
        }else {
            System.out.println("年龄需要在1-120之间，给默认年龄18");
            this.age =18;
        }
    }
    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }

    public String info(){
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
    }
}
