
public class Homework04{
	// 编写一个main方法
	public static void main(String[] args){
		/* 输出a-z和Z-A
		*/
		for(char i = 97; i <= 122; i++){
			System.out.print(i + " ");
		}
		System.out.println();
		for(char i = 'Z'; i >= 'A' ; i--){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}