package com.use;

import com.xiaoming.Dog;

/*
 * @ Date: 22:27 2021/5/20
 * @ Description:
 *
 */
public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        System.out.println(dog1); // com.xiaoming.Dog@56cbfb61

        com.xiaoqiang.Dog dog2 = new com.xiaoqiang.Dog();
        System.out.println(dog2); // com.xiaoqiang.Dog@d041cf
    }

}
