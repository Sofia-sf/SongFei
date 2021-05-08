
public class Homework05{
	// 编写一个main方法
	public static void main(String[] args){
		/* 随机生成10个整数(0-100范围)保存到数组，
		并倒序打印以及求平均值、求最大值和最大值的下标，
		并查找里面是否有8
		*/

		// 随机生成10个整数保存到数组
		int a[] = new int[10];
		for(int i = 0; i < 10; i++){
			a[i] = (int)(Math.random() * 100) + 1; // 随机赋值
		}
		
		// 倒序打印求平均值最大值和最大值下标
		int sum = 0;
		int maxIndex = a.length-1;
		int flag = 0;// 定位是否有8
		for(int i = a.length-1; i >= 0; i--){
			System.out.print(a[i] + " ");
			sum += a[i];
			if(a[maxIndex] < a[i]){
				maxIndex = i;
			}
			if(a[i] == 8){
				flag = 1;
			}
		}
		System.out.println();
		System.out.println("平均值：" + (float)sum/10.0 + 
			", 最大值：" + a[maxIndex] + ", 最大值下标为" + maxIndex);
		if(flag == 1){
			System.out.println("数组中有8");
		}else{
			System.out.println("数组中有无8");
		}

	}
}