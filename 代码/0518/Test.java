
public class Test{
	// 编写一个main方法
	public static void main(String[] args){
		// 创建AAA对象
		AAA f = new AAA();
		// 打印斐波那契数列
		for(int i = 1;i < 15; i++){
			System.out.print(f.fibonacci(i) + " ");
		}
		System.out.println();

		// 计算阶乘
		System.out.println(f.factorial(5));

		// 实现汉诺塔
		f.moveTower(10, 'A', 'B', 'C');
	}
}

class AAA{
	// 定义计算斐波那契数列方法
	public int fibonacci(int n){
		/*斐波那契数列
		*/
		if(n >= 1){
			if(n < 3){
				return 1;
			}else{
				return fibonacci(n-1) + fibonacci(n-2);
			}
		}else{
			System.out.println("n是大于1的整数");
			return -1;
		}
	}
	// 定义计算阶乘方法
	public int factorial(int n){
		if(n == 1){
			return 1;
		}
		return factorial(n-1) * n;
	}

	// 定义计算汉诺塔问题方法
	// num表示盘子个数，abc表示ABC塔
	public void moveTower(int num, char a, char b, char c){
		if(num == 1) {
			System.out.println(a + " -> " + c);
		}else{
			// 如果有多个盘，可以看成两个，最下面的一个盘和上面的所有盘
			// 先将上面的盘移动到b，借助c
			moveTower(num - 1, a, c, b);
			// 再将最下面的盘移动到c
			System.out.println(a + " -> " + c);
			// 再把b上的盘移动到c，借助a
			moveTower(num - 1, b, a, c);
		}

	}
}