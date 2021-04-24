
public class TernaryOperatorExercise{
	// 编写一个main方法
	public static void main(String[] args){
		// 案例：实现三个数的最大值
		int a = 155;
		int b = 46;
		int c = 78;
		int result = (a > b ? a : b) > c ? (a > b ? a : b) : c;
		System.out.println("the maximum = " + result);
	}
}