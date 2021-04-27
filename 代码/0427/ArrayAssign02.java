
public class ArrayAssign02{
	// 编写一个main方法
	public static void main(String[] args){
		/* 关注基本类型和数组类型的拷贝规则
		*/

		// 实现arr2对arr1的值拷贝
		int arr1[] = {1, 2, 3};
		int arr2[] = new int[3];

		for(int i = 0; i < arr2.length; i++){
			arr2[i] = arr1[i];
		}
		arr2[0] = 10;
		System.out.print("arr1的值为：");
		for(int i = 0; i < arr1.length; i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.print("\narr2的值为：");
		for(int i = 0; i < arr2.length; i++){
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}