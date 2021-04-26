// for循环练习
public class WhileExercise01{
	// 编写一个main方法
	public static void main(String[] args){
		// 打印1-100中能被3整除的数
		System.out.print("打印1-100中能被3整除的数:");
		int i = 1;
		while(i <= 100){
			if(i%3 == 0){
				System.out.print(i + " ");
			}
			i++;
		}

		System.out.print("\n");

		// 打印40-200之间所有的偶数
		System.out.print("打印40-200之间所有的偶数:");
		int j = 40;
		while(j <= 200){
			if(j%2 == 0){
				System.out.print(j + " ");
			}
			j++;
		}
		System.out.print("\n");
	}
}