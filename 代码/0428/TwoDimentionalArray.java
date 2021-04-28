
public class TwoDimentionalArray{
	// 编写一个main方法
	public static void main(String[] args){
		/* 用二维数组打印以下图形
		0 0 0 0 0 0
		0 0 1 0 0 0
		0 2 0 3 0 0
		0 0 0 0 0 0
		*/

		int[][] arr = {{0, 0, 0, 0, 0, 0},
					   {0, 0, 1, 0, 0, 0},
					   {0, 2, 0, 3, 0, 0},
					   {0, 0, 0, 0, 0, 0}};

		// 输出二维数组图形
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 换行
		}
	}
}