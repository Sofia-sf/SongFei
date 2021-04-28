
public class ArrayReverse{
	// 编写一个main方法
	public static void main(String[] args){
		/* 数组对调
		*/
		int arr[] = {11, 22, 33, 44, 55, 66};
		System.out.print("翻转前arr的值为：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		int temp;
		for(int i = 0; i < arr.length/2; i++){
			temp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i];
			arr[i] = temp;
		}
		System.out.print("\n翻转后arr的值为：");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}
}