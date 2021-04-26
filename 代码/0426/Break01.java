// Break的使用
import java.util.Scanner;

public class Break01{
	// 编写一个main方法
	public static void main(String[] args){
		// 用户输入问题
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int chance = 3;
		for(int i = 1; i <= 3; i++){
			System.out.println("请输入名字：");
			name = myScanner.next();
			System.out.println("请输入密码：");
			password = myScanner.next();
			// 使用"丁真".equals(name)而不是name.equals("丁真")可以避免空指针问题
			if("丁真".equals(name) && "666".equals(password)){ // String比较是否一样用equals
				System.out.println("恭喜，登录成功！");
				break;
			}
			chance--;
			System.out.println("输入错误，你还有" + chance + "次机会");
		}
	}
}