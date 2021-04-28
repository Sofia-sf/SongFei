
public class TwoDimentionalArray03{
	// 编写一个main方法
	public static void main(String[] args){
		/* 列数不等
		*/

		int[][] arr = new int[3][];

		// 遍历arr并赋值
		for(int i = 0; i < arr.length; i++){
			arr[i] = new int[i+1]; // 给每个一维数组开辟空间
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = i + 1;
			}
		}
		
		// 输出图形
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}