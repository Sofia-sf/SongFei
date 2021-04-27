
public class ArrayExercise01{
	// 编写一个main方法
	public static void main(String[] args){
		/* 创建一个char类型的26数组，分别放置'A'-'Z'，并使用for循环打印
		*/

		// 步骤1. 创建一个char数组，大小26
		char array[]; 
		array = new char[26]; 
		// 步骤2. 循环赋值
		for(char i = 0; i < array.length; i++){
			array[i] = (char)('A' + i);
		}

		// 步骤3. 循环打印
		System.out.println("====数组的元素值的情况如下====");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}