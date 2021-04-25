// if-else语句
import java.util.Scanner;

public class If03{
	// 编写一个main方法
	public static void main(String[] args){
		// 输入我国用户的芝麻信用分100为信用极好，80～99信用优秀，60～79信用一般，其他情况信用不及格
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入整数芝麻信用分：");
		int score = myScanner.nextInt();
		if(score >= 0 && score <= 100){
			if (score == 100){
				System.out.println("用户信用极好");
			}
			else if(score >= 80){
				System.out.println("用户信用优秀");
			}
			else if(score >= 60){
				System.out.println("用户信用及格");
			}
			else{
				System.out.println("用户信用不及格");
			}
		}
		else{
			System.out.println("输入有误");
		}
	}
}