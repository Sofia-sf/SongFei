/*
设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息
并创建对象，进行测试【this属性】
*/
import java.util.Scanner;

public class Homework07{
	// 编写一个main方法
	public static void main(String[] args){
		Dog dog = new Dog("lili", 2, "white");
		dog.show();
	}
}

class Dog{
	String name;
	int age;
	String color;

	public Dog(String name, int age, String color){
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public void show(){
		System.out.println("这只小狗的属性如下：name = " + this.name
		 + " age = " + this.age + " color = " + this.color);
	}
}