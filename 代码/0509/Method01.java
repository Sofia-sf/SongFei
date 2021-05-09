
public class Method01{
	// 编写一个main方法
	public static void main(String[] args){
		/*定义一个人类(Person)，包括年龄和名字
		完善人类：
		添加成员方法
		*/

		Person p1 = new Person();
		p1.age = 10;
		p1.name = "小明";
		Person p2 = p1; // p2的地址也指向p1的对象
		System.out.println(p2.age);


		// 方法使用
		p1.speak(); // 调用对象的方法，才会触发方法
		p1.cal01(1000);
		p1.cal01(100);

		Person p1 = new Person();
		int returnRes = p1.getSum(10, 20);
		System.out.println("getSum的值为" + returnRes);
	}
}

// 使用面向对象的方式来解决养猫问题
// 定义一个猫类
class Person{
	// 属性
	String name; 
	int age;

	// 成员方法:public表示方法公开，void表示返回值为空，speak表示方法名，()是形参列表，{}是方法体
	public void speak(){
		System.out.println("我是一个人类");
	}

	// 添加cal01方法，可以计算从1+...+1000的结果
	public void cal01(int n){
		// n代表加到几
		int sum = 0;
		for(int i = 1; i <= n; i++){
			sum += i;
		}
		System.out.println("计算从1+2+...+" + n + "的结果为：" + sum);
	}

	public int cal01(int num1, int num2){
		return num1 + num2;
	}

}