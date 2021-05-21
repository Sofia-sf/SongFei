package com.sfedu.encap;

import com.sfedu.modifier.A;

/*
 * @ Date: 21:10 2021/5/21
 * @ Description:
 * Account类具有属性：姓名(长度为2、3、4位)、余额(必须大于20)、
 * 密码(必须是6位)，如果不满足，则给出提示信息，并给默认值
 *
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account("小明", 300, "267383");
        System.out.println(a.info());
    }
}

class Account{
    public String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("你输入的姓名不正确，默认姓名为无名氏");
            this.name = "无名氏";
        }

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20){
            this.balance = balance;
        }else {
            System.out.println("你输入的余额不正确，默认余额为20");
            this.balance = 20;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6){
            this.password = password;
        }else {
            System.out.println("你输入的密码位数不正确，默认密码000000");
            this.password = "000000";
        }
    }

    public String info(){
        return "信息为 name=" + name + " balance=" + balance + " password=" + password;
    }
}
