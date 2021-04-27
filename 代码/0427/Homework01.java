
public class Homework01{
	// 编写一个main方法
	public static void main(String[] args){
		/* 某人有100,000元，每经过一次路口，需要缴费，规则如下
			现金>=50,000时，每次交5%
			现金<50,000时，每次交1,000
			编程计算该人可以经过多少次路口，用while break完成
		*/
		double money = 100000.0;
		int count = 0;
		while(true){
			if(money >= 50000.0){
				money *= 0.95;
				count++;
			}else if (money >= 1000){
				money -= 1000;
				count++;
			}else{
				break;
			}
		}
		System.out.println("该人共同过路口" + count + "次，剩余现金" + money);
	}
}