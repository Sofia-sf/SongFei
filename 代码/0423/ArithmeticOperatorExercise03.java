
public class ArithmeticOperatorExercise03{
	// 编写一个main方法
	public static void main(String[] args){
		// 华氏温度转对应的摄氏温度
		double huaShi = 234.6;
		double sheShi = 5.0 / 9.0 * (huaShi - 100.0);
		System.out.println("华氏温度：" + huaShi + "，即对应摄氏温度：" + sheShi);


		int i = 10;
		i = i++;
		System.out.println("*++赋值结果为" + i);
		int j = 10;
		j = ++j;
		System.out.println("++*赋值结果为" + j);
	}
}