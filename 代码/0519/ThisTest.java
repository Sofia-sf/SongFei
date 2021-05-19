/*
比较两个person对象是否属性一样
*/


public class ThisTest{
	// 编写一个main方法
	public static void main(String[] args){
		Person p1 = new Person("小明", 15);
		Person p2 = new Person("小红", 15);
		Person p3 = new Person("小红", 15);

		System.out.println("p1与p2比较" + p1.compareTo(p2));
		System.out.println("p2与p3比较" + p2.compareTo(p3));
	}
}

class Person{
	String name;
	int age;

	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean compareTo(Person p){
		// if(this.name.equals(p.name) && this.age. == p.age){
		// 	return true;
		// }else{
		// 	return false;
		// }

		return this.name.equals(p.name) && this.age == p.age;
	}
}