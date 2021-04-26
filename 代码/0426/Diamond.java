// 打印空心菱形
import java.util.Scanner;

public class Diamond{
	// 编写一个main方法
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入菱形总层数：");
		// totalLevel接收菱形总层数
		int totalLevel = myScanner.nextInt();
		for(int i = 1; i <= 2*totalLevel-1; i++){ // i代表当前层数
			if(i <= totalLevel){
				// 打印正三角
				for(int j = 1; j <= totalLevel - i; j++){ // j循环打印空格
					System.out.print(" ");
				}
				for(int k = 1; k <= 2*i-1; k++){ // k循环打印*
					if(k == 1 || k == 2*i-1) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}else{
				// 打印倒三角
				for(int j = i - totalLevel; j >= 1; j--){ // j循环打印空格
					System.out.print(" ");
				}
				for(int k = 1; k <= 2*i-1; k++){ // k循环打印*
					if(k == 1 || k == 2*(2*totalLevel-i)-1) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			// 打印完一行要换行输出
			System.out.print("\n");
		}
	}
}