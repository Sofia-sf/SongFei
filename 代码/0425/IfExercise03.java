// if-else语句练习
import java.util.Scanner;

public class IfExercise03{
	// 编写一个main方法
	public static void main(String[] args){
		// 判断一个年份是否是闰年
		// 年份能被4整除但不是100的倍数；能被400整除
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = myScanner.nextInt();
		if(year % 400 == 0){
			System.out.println(year + "年是闰年");
		}
		else{
			if(year % 100 == 0){
				System.out.println(year + "年不是闰年");
			}
			else{
				System.out.println(year + "年是闰年");
			}
		}
	}
}