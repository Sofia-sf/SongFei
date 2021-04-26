// for循环练习
public class ForExercise02{
	// 编写一个main方法
	public static void main(String[] args){
		// 循环打印99乘法口诀表
		for (int i = 1 ; i <= 9 ; i++){
			for(int j = 1 ; j <= i ; j++){
				System.out.print(i + "x" + j + "=" + (i*j) + " ");
			}
			System.out.println("\n");
		}
	}
}