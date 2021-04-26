// do while循环练习
import java.util.Scanner;

public class DoWhileExercise02{
	// 编写一个main方法
	public static void main(String[] args){
		// 讨债，还钱则终止，不还钱则五连鞭
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("小孟被打了五连鞭");
			System.out.println("小宋问：还钱吗？y/n");
			answer = myScanner.next().charAt(0);
		}while(answer != 'y');
		System.out.println("小孟终于还钱了");
	}
}