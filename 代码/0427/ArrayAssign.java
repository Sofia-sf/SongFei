
public class ArrayAssign{
	// 编写一个main方法
	public static void main(String[] args){
		/* 关注基本类型和数组类型的拷贝规则
		*/

		// 基本数据类型类型赋值，赋值方式为值拷贝
		// n2值的变化不会影响n1
		int n1 = 10;
		int n2 = n1;

		n2 = 80;
		System.out.println("n1 = " + n1);
		System.out.println("n2 = " + n2);

		// 数组在默认情况下为引用传递，赋的值是地址，赋值方式为引用传达
		// arr2中存储的arr1值的地址，因此arr2的改变会影响arr1的值
		int arr1[] = {1, 2, 3};
		int arr2[] = arr1;

		arr2[0] = 4;
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