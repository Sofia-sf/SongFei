
public class Homework_fibonacci {
    // 编写一个main方法
    public static void main(String[] args){
        // 创建Homework对象
        Homework f = new Homework();
        // 创建存储斐波那契数列的数组
        int n = 10;
        int[] fi = new int[n];
        // 打印斐波那契数列
        f.fibonacci(n, fi);
        for(int i = 0;i < fi.length;i++){
            System.out.print(fi[i] + " ");
        }
        System.out.println();
    }
}

class Homework{
    // 定义计算斐波那契数列方法
    public int fibonacci(int n,int[] fi){
    	// n为打印元素的个数
        int i = n-1;
        if(n==1 || n==2){
            fi[i] = 1;
            return fi[i];
        }else{
            fi[i] = fibonacci(n-1,fi) + fibonacci(n-2,fi);
            return fi[i];
        }
    }
}
