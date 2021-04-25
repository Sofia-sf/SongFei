// Switch语句
import java.util.Scanner;

public class SwitchExercise02{
	// 编写一个main方法
	public static void main(String[] args){
		// 输入成绩判断是否及格
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = myScanner.nextDouble();
		if(score >= 0 && score <= 100){
			switch((int)(score/60)){
				case 1:
					System.out.println("及格");
					break;
				case 0: 
					System.out.println("不及格");
					break;
			}
		} else{
			System.out.println("输入成绩范围有误");
		}
	}
}