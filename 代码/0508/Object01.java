
public class Object01{
	// 编写一个main方法
	public static void main(String[] args){
		/*
		张老太养了两只猫猫：一只名字叫小白，今年三岁，白色；
		另一只叫小花，今年100岁，花色；
		编写程序：
		当用户输入小猫的名字时，显示该猫的名字、年龄和颜色；
		若输入错误，则显示张老太没有这只小猫
		*/
		// 单独变量解决 -> 不利于数据管理(一只猫的数据被拆解)
		String cat1Name = "小白";
		int cat1Age = 3;
		String cat1Color = "白色";

		String cat2Name = "小花";
		int cat2Age = 100;
		String cat2Color = "花色";

		// 数组变量解决 -> 数据类型无法体现；
		// 				 只能通过下标获取信息，cat1[0] 名字内容与内容对应不明确；
		// 				 不能体现猫的行为
		// String[] cat1 = {"小白", "3", "白色"};
		// String[] cat2 = {"小花", "100", "花色"};

		// 使用oop解决
		// 实例化一个cat对象
		Cat cat1 = new Cat(); // 把new cat()对象赋给cat1
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";

		Cat cat2 = new Cat(); // 把new cat()对象赋给cat1
		cat2.name = "小花";
		cat2.age = 100;
		cat2.color = "花色";

		// 访问对象属性
		System.out.println("第1只猫的信息：" + cat1.name + " " + cat1.age + " " + cat1.color);
		System.out.println("第2只猫的信息：" + cat2.name + " " + cat2.age + " " + cat2.color);
	}
}

// 使用面向对象的方式来解决养猫问题
// 定义一个猫类
class Cat{
	// 属性
	String name;
	int age;
	String color;

	// 添加行为

}