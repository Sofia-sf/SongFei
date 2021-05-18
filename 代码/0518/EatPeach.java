
public class EatPeach{
	// 编写一个main方法
	public static void main(String[] args){
		Monkey monkey = new Monkey();
		System.out.println(monkey.eatPeach(1));
	}
}

class Monkey{
	
	public int eatPeach(int day){
		/*猴子吃桃问题，有一堆桃子，猴子第一天吃了其中的一半，并再吃了一个；
		以后的每一天猴子都吃其中的一半再多吃一个。当第10天时，想再吃时(还没吃)
		发现只有1个桃子了。问：最初共多少个桃子？

		思路分析：逆推
		1. day = 10 时 有一个桃子
		2. day = 9 时 有(day10 + 1) * 2 = 4
		3. day = 8 时 有(day9 + 1) * 2 = 10
		*/
		if(day == 10){
			return 1;
		}else if(day >= 1 && day <=9){
			return (eatPeach(day + 1) + 1) * 2;
		}else{
			System.out.println("day必须在1-10范围内");
			return -1;
		}
	}
}