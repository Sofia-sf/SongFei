
public class Homework05{
	// 编写一个main方法
	public static void main(String[] args){
		/* 求解1-1/2+1/3-1/4+...+1/100
		*/
		int flag = 1;
		double sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += flag * (1.0 / i);
			flag = -flag;
		}
		System.out.println("1-1/2+1/3-1/4+...+1/100求和结果为" + sum);
	}
}