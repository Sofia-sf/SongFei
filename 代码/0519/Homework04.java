/*
编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
*/
import java.util.Random;

public class Homework04{
	// 编写一个main方法
	public static void main(String[] args){
		// 创建A03类对象
		A03 c = new A03();
		// 实现随机生成数
		Random r = new Random();
		// 创建需要复制的数组并随即赋值
		double[] arr = new double[10];
		for(int i = 0; i < arr.length; i++){
			arr[i] = r.nextDouble() * 100;
		}
		
		// 创建新的空间储存复制后的数组
		double[] copyarr = c.copyArr(arr);

		// 输出原始arr的数组
		System.out.println("arr数组为");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 输出复制arr的数组
		System.out.println("copyarr数组为");
		for(int i = 0; i < copyarr.length; i++){
			System.out.print(copyarr[i] + " ");
		}
		System.out.println();

		// 查看两个数组对象的hashCode值
		System.out.println("arr数组hashCode为" + arr.hashCode());
		System.out.println("copyarr数组hashCode为" + copyarr.hashCode());
	}
}

class A03{
	public double[] copyArr(double[] arr){
		// 在堆中创建长度和arr一样的数组
		double[] copy = new double[arr.length];
		// 遍历拷贝值
		for(int i = 0; i < arr.length; i++){
			copy[i] = arr[i];
		}
		return copy;
	}
}