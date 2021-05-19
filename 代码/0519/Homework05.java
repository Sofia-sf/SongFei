/*
编写类Circle，定义属性：半径；提供显示圆周长和圆面积功能的方法
*/
public class Homework05{
	// 编写一个main方法
	public static void main(String[] args){
		Circle c = new Circle(1);

		System.out.println("周长为" + c.calC());
		System.out.println("面积为" + c.calS());
	}
}

class Circle{
	double r;
	public Circle(double r){
		this.r = r;
	}

	public double calC(){
		return 2 * Math.PI * this.r;
	}
	public double calS(){
		return Math.PI * this.r * this.r;
	}
}