package domain;

/*
 * @ Date: 19:57 2021/6/22
 * @ Description:
 *
 */
public class Dish {
    private String name; // 菜名
    private int num; // 份数
    private String detail; // 特殊要求
    private double price; // 单价

    public Dish(String name, int num, String detail) {
        this.name = name;
        this.num = num;
        this.detail = detail;
    }

    @Override
    public String toString() {
        return name + " " + num + "份，" + detail + "，单价" + price + "元";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
