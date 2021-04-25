// 嵌套if-else语句
import java.util.Scanner;

public class Switch01{
	// 编写一个main方法
	public static void main(String[] args){
		// 程序接收一个字符，abcdefg，a表示星期一，b表示星期二...
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个字符(a-g):");
		char day = myScanner.next().charAt(0);
		switch(day){
			case 'a':
			System.out.println("星期一");
			break;
			case 'b':
			System.out.println("星期二");
			break;
			case 'c':
			System.out.println("星期三");
			break;
			case 'd':
			System.out.println("星期四");
			break;
			case 'e':
			System.out.println("星期五");
			break;
			case 'f':
			System.out.println("星期六");
			break;
			case 'g':
			System.out.println("星期日");
			break;
			default:
			System.out.println("输入有误");
		}

		System.out.println("退出了switch，但程序仍在运行");
	}
}