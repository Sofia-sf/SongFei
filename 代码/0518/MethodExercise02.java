
public class MethodExercise02{
	// 编写一个main方法
	public static void main(String[] args){
		Arr1 aa = new Arr1();
		aa.printFig(4, 6, '+');
		
	}
}

class Arr1{
	// 编写类Arr1，
	
	public void printFig(int row, int col, char c){
		//根据行、列、字符打印 对应行数和列数的字符。比如：行4列4字符#，则打印相应的效果
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(c + " ");
			}
			System.out.println();
		}
	}
}