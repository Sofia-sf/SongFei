// if-else语句
import java.util.Scanner;

public class If02{
	// 编写一个main方法
	public static void main(String[] args){
		// 输入人的年龄，若大与18岁，输出“你年龄大于18，已成年，要对自己的行为负责“
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();
		if(age > 18){
			System.out.println("你年龄大于18，已成年，要对自己的行为负责");
		}
		else{
			System.out.println("你年龄小于18，未成年，放过你了");
		}
	}
}