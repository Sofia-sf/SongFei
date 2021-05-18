
public class Method02{
	// 编写一个main方法
	public static void main(String[] args){
		MyTools tools = new MyTools();
		int[][] arr = new int[6][5];
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = i + j;
			}
		}
		tools.printArr(arr);

		Person p = new Person();
		p.name = "milan";
		p.age = 12;
		Person p2 = tools.copyPerson(p);
		// 打印两个person的属性值
		System.out.println("p的属性：name = " + p.name + ", age = " + p.age);
		System.out.println("p2的属性：name = " + p2.name + ", age = " + p2.age);
		// 判断是否为两个对象
		System.out.println(p == p2);
		// 也可以通过查看对象的hashcode()方法查看是否为同一对象
		System.out.println(p.hashCode() + "\t" + p2.hashCode());
	}
}

// 定义一个人类
class Person{
	String name;
	int age;
}

class MyTools{
	// 属性
	
	// 成员方法 循环打印二维数组
	public void printArr(int[][] map){
		System.out.println("==================");
		// 对传入的map数组进行遍历输出
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++){
				System.out.print(map[i][j] + "_");
			}
			System.out.println();
		}
	}

	public Person copyPerson(Person p){
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}