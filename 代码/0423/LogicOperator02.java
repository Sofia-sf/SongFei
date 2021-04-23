
public class LogicOperator02{
	// 编写一个main方法
	public static void main(String[] args){
		// || 和 | 的运用
		// 短路||使用
		int age = 50;
		if(age > 20 || age < 90){
			System.out.println("ok1");
		}

		// 逻辑|使用
		int age1 = 50;
		if(age1 > 20 | age1 < 90){
			System.out.println("ok2");
		}

		System.out.println("-------------");

		// 区别
		int a = 4;
		int b = 9;
		if(a > 1 || ++b > 4){
			System.out.println("ok3");
		}
		System.out.println(b);

		int c = 4;
		int d = 9;
		if(c > 1 | ++d > 4){
			System.out.println("ok4");
		}
		System.out.println(d);


	}
}