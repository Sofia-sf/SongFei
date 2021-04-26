// for循环练习
import java.util.Scanner;

public class ForExercise01{
	// 编写一个main方法
	public static void main(String[] args){
		// 循环打印0-99能被9整除的数并输出个数
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入起始值和结束值：");
		int start = myScanner.nextInt();
		int end = myScanner.nextInt();
		int count = 0;
		int sum = 0;
		for(int i = start; i <= end; i++){
			if(i % 9 == 0){
				System.out.print(i + " ");
				count++;
				sum += i;
			}
		}
		System.out.println("\n" + start + "-" + end + "中能被9整除的数共有" + count + "个，总和为" + sum);
	}
}