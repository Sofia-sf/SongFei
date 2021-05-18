
public class MethodExercise{
	// 编写一个main方法
	public static void main(String[] args){
		AA aa = new AA();
		System.out.println(aa.isOdd(100));
		System.out.println(aa.isOdd(-16));
		System.out.println(aa.isOdd(13));
		
	}
}

class AA{
	// 编写类AA，又一个方法：判断一个数是奇数odd还是偶数
	
	public boolean isOdd(int num){
		// if(num % 2 == 0){
		// 	return false;
		// }else{
		// 	return true;
		// }

		// return num % 2 != 0 ? true; false;

		return num % 2 != 0;

	}
}