package domain;

import utils.DateUtility;

/*
 * @ Date: 09:22 2021/6/23
 * @ Description:
 *
 */
public class Vip {
    private String name; // 会员姓名
    private double recharge; // 充值金额
    private String vipID; // 会员ID
    private String vipClass;  // 会员级别
    private double balance;  // 余额
    private double discount; // 折扣

    public Vip(String name, double recharge) {
        this.name = name;
        this.recharge = recharge;
        this.balance = recharge;
        if(recharge > 300){
            this.vipClass = "金卡会员";
            this.discount = 0.7;
        }else if(recharge > 200){
            this.vipClass = "银卡会员";
            this.discount = 0.8;
        }else {
            this.vipClass = "普通会员";
            this.discount = 0.9;
        }
    }

    public String getName() {
        return name;
    }

    public double getRecharge() {
        return recharge;
    }

    public void setRecharge(double recharge) {
        this.recharge = recharge;
    }

    public String getVipID() {
        return vipID;
    }

    public void setVipID(String vipID) {
        this.vipID = vipID;
    }

    public String getVipClass() {
        return vipClass;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDiscount() {
        return discount;
    }
}
