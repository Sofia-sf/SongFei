/*
创建一个Employeee类，属性有(名字，性别，年龄，职位，薪水)；
提供3个构造方法：
可以初始化(1)(名字，性别，年龄，职位，薪水)
(2)(名字，性别，年龄)
(3)(职位，薪水)
要求充分复用构造器
*/
public class Homework12{
	// 编写一个main方法
	public static void main(String[] args){
		Employee e1 = new Employee("mike", "male", 23, "teacher", 7854.34);
		System.out.println("e1对象的信息为：name=" + e1.name + " gender=" + e1.gender
		 + " age=" + e1.age + " job=" + e1.job + " salary=" + e1.salary);

		Employee e2 = new Employee("harry", "female", 11);
		System.out.println("e2对象的信息为：name=" + e2.name + " gender=" + e2.gender
		 + " age=" + e2.age);

		Employee e3 = new Employee("cleaner", 4824.34);
		System.out.println("e3对象的信息为：" + "job=" + e3.job + " salary=" + e3.salary);
	}
}

class Employee{
	String name;
	String gender;
	int age;
	String job;
	double salary;

	public Employee(String name, String gender, int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String job, double salary){
		this.job = job;
		this.salary = salary;
	}

	public Employee(String name, String gender,
		 int age, String job, double salary){
		this(name, gender, age); // 只能使用一个，因为this要放在第一位
		this.job = job;
		this.salary = salary;
	}
	
}