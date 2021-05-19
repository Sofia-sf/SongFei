/*
编写类Book，定义方法updataPrice，实现更改某本书的价格，具体：
如果价格>150，则更改为150；如果价格>100，更改为100，否则不变
*/

public class Homework03{
	// 编写一个main方法
	public static void main(String[] args){
		Book b1 = new Book("卖火柴的小女孩", 34.5);
		Book b2 = new Book("追风筝的人", 58.9);
		Book b3 = new Book("血疫", 111.2);
		Book b4 = new Book("亚特兰蒂斯系列", 178.8);

		b1.updatePrice();
		b1.info();

		b2.updatePrice();
		b2.info();

		b3.updatePrice();
		b3.info();

		b4.updatePrice();
		b4.info();
	}
}

class Book{
	String name;
	double price;
	public Book(String name, double price){
		this.name = name;
		this.price = price;
	}
	public void updatePrice(){
		if(this.price > 150){
			this.price = 150;
		}else if(this.price > 100){
			this.price = 100;
		}
	}

	// 显示书籍信息
	public void info(){
		System.out.println("书名=《" + this.name + "》 书价格 = ¥" + this.price);
	}
}