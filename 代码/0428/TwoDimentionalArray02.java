
public class TwoDimentionalArray02{
	// 编写一个main方法
	public static void main(String[] args){
		/* 
		*/

		int[][] arr = new int[2][3];

		arr[1][1] = 8;

		// 遍历a
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // 换行
		}
	}
}