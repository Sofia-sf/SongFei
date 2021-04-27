
public class Homework02{
	// 编写一个main方法
	public static void main(String[] args){
		/* 判断数字是否为水仙花数 输出100-999内所有的水仙花数
		水仙花数即三位数，其各个位上数字立方和与本身相等
		*/
		int a;
		int b;
		int c;
		for(int i = 100; i <= 999; i++){
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			// System.out.println(i + " = " + a + " " + b + " " + c);
			if(a*a*a + b*b*b + c*c*c == i){
				System.out.print(i + " ");
			}
		}
		System.out.print("\n");
	}
}