// 打印空心金字塔
import java.util.Scanner;

public class Stars{
	// 编写一个main方法
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入金字塔层数：");
		// totalLevel接收金字塔总层数
		int totalLevel = myScanner.nextInt();
		for(int i = 1; i <= totalLevel; i++){ // i代表当前层数
			// 打印最后一行全部
			// if(i == totalLevel){
			// 	for(int l = 1; l <= 2*i-1; l++){ //
			// 		System.out.print("*");
			// 	}
			// 	System.out.println();
			// 	break;
			// }
			for(int j = 1; j <= totalLevel - i; j++){ // j循环打印空格
				System.out.print(" ");
			}
			for(int k = 1; k <= 2*i-1; k++){ // k循环打印*中间行的*
				if(k == 1 || k == 2*i-1 || i == totalLevel) { // 最后一层全部输出重点！！！！！！！
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			// 打印完一行要换行输出
			System.out.print("\n");
		}
	}
}