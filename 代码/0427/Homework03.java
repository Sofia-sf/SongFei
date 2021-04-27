
public class Homework03{
	// 编写一个main方法
	public static void main(String[] args){
		/* 输出1-100中不能被5整除的数，每五个一行
		*/
		int num = 0;
		for(int i = 1; i <= 100; i++){
			if(i%5 == 0){
				continue;
			}
			System.out.print(i + "\t");
			num++;
			if(num%5 == 0){
				System.out.print("\n");
			}
		}
	}
}