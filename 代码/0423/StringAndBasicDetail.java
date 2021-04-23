// 字符串和基本类型转换细节
public class StringAndBasicDetail{
	// 编写一个main方法
	public static void main(String[] args){
		String s1 = "hello";

		int f = Integer.parseInt(s1);
		short g = Short.parseShort(s1);
		float h = Float.parseFloat(s1);
		double i = Double.parseDouble(s1);
		long j = Long.parseLong(s1);
		byte k = Byte.parseByte(s1);

		System.out.println(f + "\n" + g + "\n" + h + "\n" + i + "\n" + j + "\n" + k);
	}
}