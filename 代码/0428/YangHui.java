
public class YangHui{
	// 编写一个main方法
	public static void main(String[] args){
		/* 打印
		1
		1 1
		1 2 1
		1 3 3 1
		1 4 6 4 1
		*/

		int[][] arr = new int[10][];

		// 遍历arr并赋值
		for(int i = 0; i < arr.length; i++){
			arr[i] = new int[i+1]; // 给每个一维数组开辟空间
			// if (i == 0 || i == 1){
			// 	arr[i][0] = 1;
			// 	arr[i][arr[i].length-1] = 1;
			// 	continue;
			// }
			// arr[i][0] = 1;
			// arr[i][arr[i].length-1] = 1;
			// for(int j = 1; j < arr[i].length - 1; j++){
			// 	arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
			// }
			for(int j = 0; j < arr[i].length; j++){
				if(j == 0 || j == arr[i].length - 1){
					arr[i][j] = 1;
				}else{
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
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