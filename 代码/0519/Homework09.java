/*
定义Music类梦里面有音乐名name、音乐时长times属性，
并有播放play功能和返回本书属性信息的功能方法getInfo
*/
public class Homework09{
	// 编写一个main方法
	public static void main(String[] args){
		Music m = new Music("tomorrow", 560);
		m.play();
		m.getInfo();
	}
}

class Music{
	String name;
	int times;

	public Music(String name, int times){
		this.name = name;
		this.times = times;
	}

	public void play(){
		System.out.println(this.name + "音乐已被播放...");
	}

	public void getInfo(){
		System.out.println(this.name + "一首歌的时长为" + this.times + "秒");
	}
}