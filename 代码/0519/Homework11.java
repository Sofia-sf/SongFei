/*
在测试方法中，调用method方法，代码如下，编译正确，试写出method方法的定义形式，
调用语句为：System.out.println(method(method(10.0,20.0),100));
*/
public class Homework11{
	// 编写一个main方法
	public static void main(String[] args){
		A04 aa = new A04();
		System.out.println(aa.method(aa.method(10.0,20.0),100));
	}
}

class A04{
	
	public double method(double a, double b){
		return a + b;
	}
}