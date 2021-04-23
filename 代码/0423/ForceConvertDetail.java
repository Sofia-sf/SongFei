// 强制类型转换
public class ForceConvertDetail{
	// 编写一个main方法
	public static void main(String[] args){
		// int n1 = (int)10*3.5 + 6*1.5; // 编译错误，将double赋值给int
		int n1 = (int)(10*3.5 + 6*1.5);
		System.out.println("n1 = " + n1);


		char c1 = 100;
		int m = 100;
		// char c2 = m; // 报错：此处先判断等号两侧类型是否一致
		char c3 = (char)m;
		System.out.println(c3);

		char c4 = 'a';
		int n2 = 10;
		float f1 = .412F;
		float f2 = c4 + n2 + f1;
		System.out.println(f2);
	}
}