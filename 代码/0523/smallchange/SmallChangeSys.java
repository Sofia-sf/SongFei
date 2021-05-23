package com.sfedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * @ Date: 22:22 2021/5/23
 * @ Description:
 * 创建零钱通项目，实现相同功能
 * 化繁为简
 * 1. 先完成显示菜单，并可以显示菜单，给出对应提示
 * 2.
 *
 */
public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //2. 完成零钱通明细
        String details = "----------------零钱通明细----------------";

        //3. 完成收益入账
        double money = 0;
        double balance = 0;
        Date date = null;
        // 日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");

        //4. 消费
        String note = "";
        // 菜单至少显示一次用do while语句
        do{
            System.out.println("\n==================零钱通菜单==================");
            System.out.println("\t\t1. 零钱通明细");
            System.out.println("\t\t2. 收益入账");
            System.out.println("\t\t3. 消费");
            System.out.println("\t\t4. 退出");

            System.out.println("请选择（1-4）：");
            key = scanner.next();

            // 使用switch分支
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额：");
                    money = scanner.nextDouble();
                    // 校验money
                    if(money <= 0) {
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();// 获取当前日期
                    // 拼接收益入账信息
                    details += "\n收益入账\t+¥" + money + "\t" + sdf.format(date) + "\t余额：¥" + balance;
                    break;
                case "3":
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();
                    // 范围校验
                    if(money <= 0 || money > balance) {
                        System.out.println("消费金额需要在0-" + balance);
                        break;
                    }
                    System.out.print("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    details += "\n" + note + "\t-¥" + money + "\t" + sdf.format(date) + "\t余额：¥" + balance;
                    break;
                case "4":
                    String choice = "";
                    while (true){
                        System.out.println("你确定要退出吗？y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice))
                            break;
                    }

                    if("y".equals(choice)){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，重新输入");
            }
        }while (loop);

        System.out.println("退出了零钱通项目");
    }
}
