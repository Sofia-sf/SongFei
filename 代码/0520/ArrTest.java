/*
 * @ Date: 21:36 2021/5/20
 * @ Description:
 * 创建一个类MyTools，编写一个方法，可以完成对int数组冒泡排序的功能
 *
 */
public class ArrTest {
    public static void main(String[] args) {
        MyTools mt = new MyTools();
        int[] arr = {10, -1, 4, 6, 11};

        System.out.println("======排序前========");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        mt.bubble(arr);

        System.out.println("======排序后========");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

class MyTools {

    public void bubble(int[] arr) {
        // 冒泡排序
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
