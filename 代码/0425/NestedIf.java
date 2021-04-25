// 嵌套if-else语句
import java.util.Scanner;

public class NestedIf{
	// 编写一个main方法
	public static void main(String[] args){
		// 参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则显示淘汰
		// 并根据提示进入男子组、女子组
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入成绩和性别：");
		double score = myScanner.nextDouble();
		// 接收字符方法：获得字符串的第一个字符
		char gender = myScanner.next().charAt(0);
		if(score >= 8.0 && score <= 10.0){
			if (gender == '男'){
				System.out.println("请进入男子组决赛");
			}
			else if(gender == '女'){
				System.out.println("请进入女子组决赛");
			}
			else{
				System.out.println("性别输入有误");
			}
		}
		else if(score >= 0 && score < 8.0){
			System.out.println("很遗憾，未进入决赛");
		}
		else{
			System.out.println("成绩输入有误");
		}
	}
}