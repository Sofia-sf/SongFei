// 字符串和基本类型转换
public class StringAndBasic{
	// 编写一个main方法
	public static void main(String[] args){
		// 基本类型 -> String
		int a = 100;
		short b = 100;
		float c = 1.1F;
		double d = 4.5;
		boolean e = true;

		String s1 = a + "";
		String s2 = b + "";
		String s3 = c + "";
		String s4 = d + "";
		String s5 = e + "";
		System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" +s5);
		System.out.println("-------------");

		// String -> 基本类型
		// 使用基本类型对应的包装类的相应方法，得到基本数据类型
		String s6 = "123";

		int f = Integer.parseInt(s6);
		short g = Short.parseShort(s6);
		float h = Float.parseFloat(s6);
		double i = Double.parseDouble(s6);
		long j = Long.parseLong(s6);
		byte k = Byte.parseByte(s6);
		boolean l = Boolean.parseBoolean("false");

		System.out.println(f + "\n" + g + "\n" + h + "\n" + i + "\n" + j + "\n" + k + "\n" + l);
		System.out.println("-------------");

		// 把字符串转换成字符char -> 含义：把字符串分装成字符
		// 得到s6字符串的第一个字符（第0号索引）'a'
		System.out.println(s6.charAt(0));
	}
}