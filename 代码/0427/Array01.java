
import java.util.Scanner;

public class Array01{
	// 编写一个main方法
	public static void main(String[] args){
		/* 演示 数据类型 数组名[] = new 数据类型[大小]
			循环输入五个成绩，保存到double数组，并输出
		*/

		// 步骤1. 创建一个double数组，大小5
		double scores[]; // 声明数组，这时scores是null
		scores = new double[5]; // 分配内存空间，可以存放数据
		// 如果不定义new，会报错空指针异常
		// 步骤2. 循环输入
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			System.out.println("请输入第" + (i+1) + "个元素的值：");
			scores[i] = myScanner.nextDouble();
		}

		// 步骤3. 循环打印
		System.out.println("====数组的元素值的情况如下====");
		for(int i = 0; i < scores.length; i++){
			System.out.println("第" + (i+1) + "个元素的值=" + scores[i]);
		}
	}
}