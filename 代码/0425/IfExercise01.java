// if-else语句练习
import java.util.Scanner;

public class IfExercise01{
	// 编写一个main方法
	public static void main(String[] args){
		// 声明两个double型变量并赋值，判断第一个数大于10.0，第二个数小于20.0，打印两个数之和
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入两个数字：");
		double a = myScanner.nextDouble();
		double b = myScanner.nextDouble();
		if(a > 10.0 && b < 20.0){
			System.out.println("两数之和为" + (a + b));
		}
		else{
			System.out.println("两数不同时满足计算条件");
		}
	}
}