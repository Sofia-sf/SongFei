
public class Object03{
	// 编写一个main方法
	public static void main(String[] args){
		/*定义一个人类(Person)，包括年龄和名字
		*/

		Person p1 = new Person();
		p1.age = 10;
		p1.name = "小明";
		Person p2 = p1; // p2的地址也指向p1的对象
		System.out.println(p2.age);
	}
}

// 使用面向对象的方式来解决养猫问题
// 定义一个猫类
class Person{
	// 属性
	String name; 
	int age;
}