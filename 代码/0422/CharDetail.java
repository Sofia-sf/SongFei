// 浮点型使用细节
public class CharDetail{
	public static void main(String[] args){
		// 在java中，char的本质是一个整数，在输出时，是unicode码对应的字符
		char c1 = 97;
		System.out.println(c1);

		// 输出a对应的数字
		char c2 = 'a';
		System.out.println((int)c2); 

		// 输出宋对应的数字
		char c3 = '宋';
		System.out.println((int)c3); 

		char c4 = 38889;
		System.out.println(c4); 

		// char类型可以进行计算，因为本质是一个数，都有对应的unicode码
		System.out.println('a' + 10);
		char c6 = 'a' + 10;
		System.out.println(c6);

		// 课堂小测试
		char c5 = 'b' + 1;
		System.out.println((int)c5);
		System.out.println(c5);
	}
}










