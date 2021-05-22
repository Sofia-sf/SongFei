package com.sfedu.extend_.exercise;

/*
 * @ Date: 20:38 2021/5/22
 * @ Description:
 *
 */
public class PC extends Computer{
    private String brand;

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("PC信息：");
        // 使用父类的get方法
        System.out.println(getDetails() + " 品牌为" + brand);
    }

}
