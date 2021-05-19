/*
运行以下代码查看输出
*/
public class Homework08{
	// 编写一个main方法
	public static void main(String[] args){
		new Test().count1();
		Test t = new Test();
		t.count2();
		t.count2();
	}
}

class Test{

	int count = 9;

	public void count1(){
		count = 10;
		System.out.println("count1 = " + count);
	}

	public void count2(){
		System.out.println("count2 = " + count++);
	}
}