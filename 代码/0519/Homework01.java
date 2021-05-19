/*
编写类A01，定义方法max，实现求某个double数组的最大值并返回
*/
import java.util.Random;

public class Homework01{
	// 编写一个main方法
	public static void main(String[] args){
		A01 a = new A01();

		// int n = 0;
		// double[] arr = new double[n];
		// Random r = new Random();
		// if(n == 0){
		// 	System.out.println("n=0不符合要求");
		// }else{
		// 	for(int i = 0; i < n; i++){
		// 		arr[i] = r.nextDouble() * 10; //生成1-10的随机数
		// 	}
		// 	System.out.println("arr最大值为" + a.max(arr));
		// }

		// 老师讲解：使用Double包装类区别null与最大值
		double[] arr = {};
		Double res = a.max(arr);
		if(res != null){
			System.out.println("arr的最大值=" + a.max(arr));
		}else{
			System.out.println("arr的输入有误");
		}
	}
}

class A01{ // 考虑代码健壮性使用Double包装类
	public Double max(double[] arr){
		// 判断arr是否为空再判断其长度
		if(arr != null && arr.length > 0){
			double maxValue = arr[0];
			int maxIndex = 0;
			for(int i = 1; i < arr.length; i++){
				if(arr[i] > maxValue){
					maxValue = arr[i];
					maxIndex = i;
				}
			}
			System.out.println("最大值的下标为" + maxIndex);
			return maxValue;
		}else{
			return null; // 如不符合要求返回空
		}
		
		
	}
}