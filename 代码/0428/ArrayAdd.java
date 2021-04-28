/* 与键盘交互实现数组添加*/
import java.util.Scanner;

public class ArrayAdd{
	// 编写一个main方法
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		char answer; //接收用户输入的y/n
		int add; // 接收用户输入添加的元素
		int arr[] = {11, 22, 33};
		// 打印当前arr内的值
		System.out.print("目前arr的值为：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		// 询问用户是否添加并接收
		System.out.println("\n是否要添加新的值？y/n");
		answer = myScanner.next().charAt(0);
		// 如果为y则执行添加操作
		while(answer == 'y'){
			// 定义新的临时数组空间长度比目前arr多1（要实现添加操作）
			int tempArr[] = new int[arr.length+1];
			// 循环遍历将目前arr的值赋给tempArr
			for(int i = 0; i < arr.length; i++){
				tempArr[i] = arr[i];
			}
			// 提示用户做输入操作
			System.out.println("请输入新的值：");
			// 接收用户的输入值
			add = myScanner.nextInt();
			// 将用户输入的值赋给tempArr的最后一个空间
			tempArr[arr.length] = add;
			// 更新arr数组指向tempArr空间，原来的arr数组空间被当作垃圾销毁
			arr = tempArr;
			// 循环遍历打印添加后的arr的值
			System.out.print("更新后arr的值为：");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
			// 更新进行下一次的用户操作询问
			System.out.println("\n是否要添加新的值？y/n");
			answer = myScanner.next().charAt(0);
		}
		// 最后打印更新后的arr的值
		System.out.print("添加后arr的值为：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}