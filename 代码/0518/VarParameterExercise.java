/*
有三个方法，分别实现返回姓名和两门成绩(总分)，返回姓名和三门成绩(总分)
封装成一个可变参数的方法
*/


public class VarParameterExercise{
	// 编写一个main方法
	public static void main(String[] args){
		SfMethods mm = new SfMethods();
		mm.showScore("mike", 97.4, 98.3);
	}
}

class SfMethods{
	public void showScore(String name, double... score){
		double sum = 0;
		for(int i = 0; i < score.length; i++){
			sum += score[i];
		}
		System.out.println(name + "的" + score.length + "门成绩总和为" + sum);
	}
}