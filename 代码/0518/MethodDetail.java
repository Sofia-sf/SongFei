
public class MethodDetail{
	// 编写一个main方法
	public static void main(String[] args){
		A aa = new A();
		aa.sayOk();
		aa.m1();
		
	}
}

class A{
	// 同一个类中的方法调用：直接调用即可
	
	public void print(int n){
		System.out.println("print方法被调用 n = " + n);
	}

	public void sayOk(){//sayOk调用print(直接调用即可)
		print(10);
	}

	// 跨类中的A类调用B类方法：需要通过对象名调用
	public void m1(){
		// 创建B对象，然后调用
		B b = new B();
		b.hi();
	}
}

class B {
	public void hi(){
		System.out.println("B类中的hi()被执行");
	}
}