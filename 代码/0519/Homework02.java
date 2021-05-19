/*
编写类A02，定义方法find，实现查找某个字符串数组中的元素查找，并返回索引，
如果找不到，返回-1

老师思路：
在字符串数组中找目标，不是字符串中找字符！注意审题!!!!!!!!!!!!
*/
public class Homework02{
	// 编写一个main方法
	public static void main(String[] args){
		A02 a2 = new A02();
		String s = "114328hsafhkajdfhefnd";
		char c = 's';
		System.out.println(a2.find(s, c));
	}
}

class A02{
	public int find(String s, char flag){
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) == flag){
				return i;
			}
		}
		return -1;
	}
}