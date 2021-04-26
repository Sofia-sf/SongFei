// do while循环练习
public class DoWhileExercise01{
	// 编写一个main方法
	public static void main(String[] args){
		// 打印1-200中能被5整除但不能被3整除的数
		int i = 1;
		int count = 0;
		do{
			if (i%5 == 0 && i%3 != 0){
				System.out.print(i + " ");
				count++;
			}
			i++;
		}while(i <= 200);
		System.out.println("\n1-200能够被5整除但不能被3整除的数一共"+count);
	}
}