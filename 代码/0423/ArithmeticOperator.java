// 演示算术运算符的使用
public class ArithmeticOperator{
	// 编写一个main方法
	public static void main(String[] args){
		//  /使用
		System.out.println(10 / 4);  // 输出2，因为 / 号左右都为int，则结果保留int精度
		System.out.println(10.0 / 4);  // 输出2.5，因为 / 号左右最大容量为double，结果为double精度
		double d = 10 / 4;
		System.out.println(d);  // 输出2.0，因为10 / 4为int精度2，赋值给double类型为2.0

		// %使用：取余
		// %的本质：看公式 a % b = a - a / b * b
		System.out.println(10 % 3); // 输出1
		System.out.println(-10 % 3); // 输出-1，-10 - (-10) / 3 * 3 = -10 + 9 = -1
		System.out.println(10 % -3); // 输出1，10 - 10 / (-3) * (-3) = 10 - 9 = 1
		System.out.println(-10 % -3); //输出-1，-10 - (-10) / (-3) * (-3) = -10 + 9 = -1

		// ++使用
		// 作为独立的使用i++和++i都等价于i = i + 1
 		int i = 10;
		i++;
		System.out.println("i=" + i);
		++i;
		System.out.println("i=" + i);

		// 作为表达式使用：i++ 是先赋值后自增， ++i 是先自增后赋值
		int j = 8;
		int k = j++;
		System.out.println("k=" + k);
		j = 8;
		k = ++j;
		System.out.println("k=" + k);
	}
}