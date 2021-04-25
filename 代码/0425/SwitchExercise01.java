// Switch语句
import java.util.Scanner;

public class SwitchExercise01{
	// 编写一个main方法
	public static void main(String[] args){
		// 使用switch语句将输入的小写字符转换为大写输出，只abcde，其他为other
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入字母：");
		char c = myScanner.next().charAt(0);
		switch(c){
			case 'a':
				System.out.println("A");
				break;
			case 'b': 
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			default:
				System.out.println("other");
		}
	}
}