package domain;

import java.util.Arrays;

/*
 * @ Date: 09:16 2021/6/23
 * @ Description:
 *
 */
public class Order {
    private Dish[] dishes; // 菜品详情
    private String orderTime; // 订单生成时间
    private String orderID; // 订单编号
    private String state; // 订单状态
    private String orderCompleteTime; // 订单完成时间
    private double money = 0; // 订单总金额
    private String vipId;
    private double discount;
    private double pay;


    public Order(Dish[] dishes) {
        this.dishes = dishes;
        for (int i = 0; i < dishes.length; i++) {
            money += dishes[i].getPrice() * dishes[i].getNum();
        }
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOrderCompleteTime() {
        return orderCompleteTime;
    }

    public void setOrderCompleteTime(String orderCompleteTime) {
        this.orderCompleteTime = orderCompleteTime;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return Arrays.toString(dishes);
    }

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
