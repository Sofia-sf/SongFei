
public class ArithmeticOperatorExercise02{
	// 编写一个main方法
	public static void main(String[] args){
		// 还有59天放假，计算多少星期多少天
		int days = 590;
		int week = days / 7;
		int day = days % 7;
		System.out.println("还有" + days + "天放假，即" + week + "周" + day + "天");
	}
}