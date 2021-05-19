/*
有个人Tom设计他的成员变量，成员方法，可以电脑猜拳
电脑每次都会随机生成0石头，1剪刀，2布
并要可以显示Tom的输赢次数(清单)
ming computer
0 	-   1 = true
1   -   2 = true
2 	- 	0 = true
*/
import java.util.Random;
import java.util.Scanner;

public class Homework14{
	// 编写一个main方法
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		People p = new People("小红");
		while(1 > 0){
			System.out.println("请输入0石头，1剪刀，2布：");
			int pq = s.nextInt();
			if(pq >= 0 && pq <=2){
				if(p.caiQuan(pq) == 1){
					System.out.println(p.name + "赢了");
				}else if(p.caiQuan(pq) == -1){
					System.out.println(p.name + "输了");
				}else{
					System.out.println(p.name + "与电脑平局");
				}
			}else{
				System.out.println("请输入0、1、2三个整数");
			}
		}
	}
}

class People{
	String name;

	public People(String name){
		this.name = name;
	}

	public int caiQuan(int pq){ // pq代表人出的数
		// 输出1为小明赢，-1为小明输，0为小明与电脑平局
		Random r = new Random();
		int computer = r.nextInt(2);
		if(pq - computer == -1 || pq - computer == 2){
			return 1;
		}else if(pq - computer == 1 || pq - computer == -2){
			return -1;
		}else{
			return 0;
		}
	}
}