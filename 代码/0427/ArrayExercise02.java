
public class ArrayExercise02{
	// 编写一个main方法
	public static void main(String[] args){
		/* 求出数组的最大值和对应的下标
		*/

		// 步骤1. 创建一个char数组，大小26
		double array[] = {102.2, -310.3, -239.4, 237, -282.3}; 
		// 步骤2. 定义index和max
		double max = array[0];
		int flag = 0;
		// 步骤3. 比较最大值
		for(int i = 1; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
				flag = i;
			}
		}
		System.out.println("数组最大值为" + max + "，对应下标为" + (flag+1));
	}
}