// Switch语句

public class SwitchDetail{
	// 编写一个main方法
	public static void main(String[] args){
		char b = 'b';
		char c = 'b';
		switch(c){
			case 'a':
			System.out.println("ok1");
			break;
			case 98: // 细节1：表达式数据类型，要和case后的数据类型一致，或者可以自动转成可以比较的类型
			System.out.println("ok2");
			break;
			case b:
			System.out.println("ok3");
			break;
			default:
			System.out.println("ok4");
		}
	}
}