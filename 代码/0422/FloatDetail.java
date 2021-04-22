// 浮点型使用细节
public class FloatDetail{
	public static void main(String[] args){
		// float n1 = 1.1;
		float n2 = 1.1F;
		double n3 = 1.1;
		double n4 = 1.1F;

		// 十进制数形式的浮点型表示方法
		double n5 = .123; // 等价0.123
		System.out.println(n5);

		// 科学计数法的表现形式
		System.out.println(5.12e2);
		System.out.println(5.12E-2);

		// 通常情况下使用double类型，以下举例说明
		double n6 = 2.1234567891;
		float n7 = 2.1234567891F;
		System.out.println(n6);
		System.out.println(n7);

		// 浮点型使用陷阱：2.7和8.1 / 3比较
		double n8 = 2.7;
		double n9 = 8.1 / 3;
		System.out.println(n8);
		System.out.println(n9); // 输出是一个接近2.7的小数但不是2.7
	}
}