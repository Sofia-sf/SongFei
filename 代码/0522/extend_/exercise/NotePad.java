package com.sfedu.extend_.exercise;

/*
 * @ Date: 20:44 2021/5/22
 * @ Description:
 *
 */
public class NotePad extends Computer{
    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public void printInfo(){
        System.out.println("NotePad信息：");
        // 使用父类的get方法
        System.out.println(getDetails() + " 颜色为" + color);
    }
}
