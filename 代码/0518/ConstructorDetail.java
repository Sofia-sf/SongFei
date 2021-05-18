/*
在前面定义的Person类中添加两个构造器：
第一个无参构造器：利用构造器设置所有人的age属性初始值都为18
第二个带pName和pAge两个参数的构造器：使得每次创建Person对象的同时初始化对象的age属性值和name属性值。
分别使用不同的构造器，创建对象
*/


public class ConstructorDetail{
	// 编写一个main方法
	public static void main(String[] args){
		People p1 = new People("Smith", 37);
		People p2 = new People("Mike");

		System.out.println("p1的属性值为：" + p1.name + " " + p1.age );
		System.out.println("p2的属性值为：" + p2.name + " " + p2.age );

		
	}
}

class People{
	String name;
	int age;

	public People(String pName, int pAge){
		name = pName;
		age = pAge;
	}
	public People(String pName){
		name = pName;
	}
}