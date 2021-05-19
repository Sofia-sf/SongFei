/*
将对象作为参数传递给方法
题目要求：
(1)定义一个Circle类，包含一个double型的radius属性代表圆的半径，——fundArea()方法返回圆的面积
(2)定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
public void printAreas(Circle c, int times)
(3)在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积。
例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
(4)在main方法中调用printAreas()方法，调用完毕后输出当前半径值。程序运行结果如图所示
Radius		Area
1.0			3.14----
2.0			12.566
3.0			28.2743
4.0			50.2654
5.0			78.5389
*/
public class Homework13{
	// 编写一个main方法
	public static void main(String[] args){
		Circle1 cc = new Circle1();
		PassObject pp = new PassObject();
		pp.printAreas(cc, 5);
	}
}

class Circle1{
	double radius;

	public double calArea(){
		return Math.PI * radius * radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}
}

class PassObject{
	public void printAreas(Circle1 c, int times){
		System.out.println("Radius\t\tArea");
		for(int i = 1; i <= times; i++){
			c.setRadius(i);
			System.out.println(i + "\t\t" + c.calArea());
		}
	}
}