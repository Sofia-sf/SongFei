package com.sfedu.pkg;

import java.util.Arrays;

/*
 * @ Date: 22:53 2021/5/20
 * @ Description:
 *
 */
public class Import01 {
    public static void main(String[] args) {

        //使用系统提供Arrays完成数组排序
        int[] arr = {1, 2, 7, -3, 4, -18};
        Arrays.sort(arr);
        // 输出排序结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
