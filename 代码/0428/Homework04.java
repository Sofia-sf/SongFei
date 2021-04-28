import java.util.Scanner;

public class Homework04{
	// 编写一个main方法
	public static void main(String[] args){
		/* 数组扩容+定位
		要求给顺序数组插入一个数并保持从小到大
		*/
		int a[] = {14, 21, 32, 46, 51, 67, 79, 81, 90};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int b = myScanner.nextInt();
		int temp[] = new int[a.length+1];
		int flag = 0;
		for(int i=0; i < a.length-1; i++){
			if(b > a[i] && b < a[i+1]){
				flag = i + 1;
				break;
			}
		}

		for(int i=0; i <= a.length; i++){
			if(i < flag){
				temp[i] = a[i];
			}else if (i == flag){
				temp[i] = b;
			}else{
				temp[i] = a[i-1];
			}
		}

		a = temp;
		for(int i=0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}