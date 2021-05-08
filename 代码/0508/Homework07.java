
public class Homework07{
	// 编写一个main方法
	public static void main(String[] args){
		/* 冒泡排序：从小到大
		*/

		// 随机生成10个整数保存到数组
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++){
			arr[i] = (int)(Math.random() * 100) + 1; // 随机赋值
		}
		
		// 排序前数组为
		System.out.println("排序前数组为：");
		for(int i = 0; i < arr.length - 1; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		// 冒泡排序
		int temp = 0;
		for(int i = 0; i < arr.length - 1; i++){ // 外层循环(轮)
			for(int j = 0; j < arr.length - 1 - i; j++){ // 每层循环，每轮的比较次数
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		// 输出结果
		System.out.println("排序后结果为：");
		for(int i = 0; i < arr.length - 1; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}