/*
编写程序，类Methods中定义三个重载方法并调用：
方法名为m，三个方法分别接收一个int参数，两个int参数，一个字符串参数。
分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
在主类main()方法中分别用参数区别调用三个方法。OverLoadExercise01.java


在Methods类，定义三个重载方法max()，第一个方法，返回两个int值中的最大值；
第二个方法，返回两个double中的最大值；
第三个方法，返回三个double中的最大值，并分别调用三个方法。
*/


public class OverLoadExercise01{
	// 编写一个main方法
	public static void main(String[] args){
		Methods mm = new Methods();
		mm.m(10);
		mm.m(10,12);
		mm.m('o');

		System.out.println(mm.max(10,12));
		System.out.println(mm.max(10.12,12.23));
		System.out.println(mm.max(10,12.23, 19.23));

	}
}

class Methods{
	public void m(int n){
		System.out.println("平方=" + (n * n));
	}
	
	public void m(int a, int b){
		System.out.println("相加=" + (a + b));
	}

	public void m(char a){
		System.out.println("字符为" + a);
	}

	public int max(int a, int b){
		return (a > b) ? a : b;
	}
	public double max(double a, double b){
		return (a > b) ? a : b;
	}
	public double max(double a, double b, double c){
		return (((a > b) ? a : b) > c) ? (a > b ? a : b) : c;
	}
}