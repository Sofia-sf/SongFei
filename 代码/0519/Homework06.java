/*
编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实现求和、
差、乘、商(要求除数为0的话，要提示)并创建两个对象，分别测试
*/
import java.util.Scanner;

public class Homework06{
	// 编写一个main方法
	public static void main(String[] args){
		Cale c = new Cale(12.4, 25.3);
		System.out.println("和 = " + c.sum());
		System.out.println("差 = " + c.minus());
		System.out.println("乘 = " + c.mul());
		System.out.println("积 = " + c.divide());
	}
}

class Cale{
	double a;
	double b;
	public Cale(double a, double b){
		this.a = a;
		this.b = b;
	}

	public double sum(){
		return a + b;
	}

	public double minus(){
		return a - b;
	}

	public double mul(){
		return a * b;
	}

	public double divide(){
		if(b == 0){
			System.out.println("除数不能为0，请重新输入除数：");
			Scanner s = new Scanner(System.in);
			this.b = s.nextDouble();
			return this.divide();
		}
		return a / b;
	}
}