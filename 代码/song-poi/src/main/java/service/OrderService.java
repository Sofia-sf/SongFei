package service;

import domain.Dish;
import domain.Order;
import domain.Vip;
import utils.DateUtility;
import utils.ExcelOperator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import utils.Utility;

public class OrderService {
    private int vipNum = 0;
    private int orderNum = 0;

    public boolean addOrder(Order order) throws Exception {

        order.setOrderTime(DateUtility.getNow());
        order.setOrderID("Ord" + DateUtility.getMd() +  String.format("%03d",(++orderNum)));
        order.setState("待完成");

        ExcelOperator.setOrderInfo(order);
        return true;
    }

    public boolean addVip(Vip vip) throws Exception {
        if(vip.getName() == ""){
            return false;
        }
        if(vip.getRecharge() <= 0){
            System.out.println("输入的充值数目有误");
            return false;
        }
        vip.setVipID("Vip" + DateUtility.getMd() + String.format("%03d",(++vipNum)));
        ExcelOperator.setVipInfo(vip);
        return true;
    }
}
