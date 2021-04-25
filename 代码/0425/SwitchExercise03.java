// Switch语句-穿透
import java.util.Scanner;

public class SwitchExercise03{
	// 编写一个main方法
	public static void main(String[] args){
		// 根据月份打印所属季节，345春，678夏，9AB秋，C12冬
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = myScanner.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6: 
			case 7: 
			case 8: 
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("输入有误");
		}
	}
}