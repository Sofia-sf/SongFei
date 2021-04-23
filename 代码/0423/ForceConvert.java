// 强制类型转换
public class ForceConvert{
	// 编写一个main方法
	public static void main(String[] args){
		int n1 = (int)1.9;
		System.out.println("n1 = " + n1); // 强制转换精度丢失

		int n2 = 2000;
		int b1 = (byte)n2;
		System.out.println("b1 = " + b1); // 强制转换数据溢出
	}
	
}