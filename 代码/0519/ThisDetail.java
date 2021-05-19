/*

*/


public class ThisDetail{
	// 编写一个main方法
	public static void main(String[] args){
		// T t1 = new T();
		// t1.f2();

		T t2 = new T("jack", 16);
		t2.f3();
	}
}

class T{
	String name;
	int age;

	public T(){
		// 访问T(String name, int age)
		this("jack", 16);
		System.out.println("T()构造器被调用...");
		
	}

	public T(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println("T(String name, int age)构造器被调用..." + name + "  " + age);
	}
	
	public void f1(){
		System.out.println("f1()方法...");
	}

	public void f2(){
		System.out.println("f2()方法...");
		// 调用本类f1
		// 方法1
		f1();
		// 方法2
		this.f1();
	}

	public void f3(){
		String name = "smith";
		// 传统方式:就近原则，取方法中的name变量
		System.out.println("name=" + name + "  age=" + age);
		// 使用this方式:取当前对象属性值
		System.out.println("name=" + this.name + "  age=" + this.age);
	}
	
}