public class Object04{
	// 编写一个main方法
	public static void main(String[] args){
		/* 查看以下输出内容
		*/

		Person a = new Person();
		a.age = 10;
		a.name = "小明";
		Person b;
		b = a;
		System.out.println(b.name);
		b.age = 200;
		b = null; 
		// b的地址为null，即栈b中的地址与堆中的对象空间之间的联系断了，所以访问出现问题；
		// 但是这属于异常，编译仍会通过
		System.out.println(a.age);
		System.out.println(b.name);
	}
}
