package view;

import domain.Dish;
import domain.Order;
import domain.Vip;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.DateUtility;
import utils.ExcelOperator;
import service.OrderService;
import utils.Utility;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OrderView {
    private boolean loop1 = true;
    private boolean loop2 = true;
    private String passwordCheck = "diancanxitong";
    OrderService orderService = new OrderService();
    private Dish[] dishes = new Dish[0];
    private final static String PATH = "/Users/songfei/Documents/code/交大Java培训/idea_java_projects/OrderProject/";
    private static String fileName = "菜单.xlsx";

    //    key接收用户输入
    private char key = ' ';


    // 点餐
    public void orderDishes() throws Exception {
        // 1. 获取文件流
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(PATH + fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 2. 创建一个工作簿
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        // 3. 得到一个sheet表
        Sheet sheet = workbook.getSheetAt(0);

        while(true){
            System.out.println("-------------------点菜-------------------");
            System.out.print("请选择菜品(-1结束)：");
            int chooseID = Utility.readInt();
            if(chooseID == -1){
                System.out.println("-----------------退出点菜-----------------\n");
                break;
            }else if(chooseID < 1 && chooseID > sheet.getLastRowNum()){
                System.out.print("选择序号错误，请重新输入：");
                continue;
            }
            String name = ExcelOperator.getStringCellValue(0, chooseID, "选择");
            System.out.print("您已选择" + name + "，输入份数(回车默认为1)：");
            int chooseNum = Utility.readInt(1);
            System.out.print("您已选择" + name + ", " + chooseNum +"份, 要求(加辣/去麻/去辣等,回车默认为无)：");
            String detail = Utility.readString(10, "无特殊要求");
            Dish newDish = new Dish(name, chooseNum, detail);
            newDish.setPrice(ExcelOperator.getDoubleCellValue(0, chooseID, "价格"));

            // 实现扩容
            Dish[] temp = new Dish[dishes.length+1];
            for (int i = 0; i < dishes.length; i++) {
                temp[i] = dishes[i];
            }
            temp[dishes.length] = newDish;
            dishes = temp;
        }

        Order order = new Order(dishes);

        System.out.println("是否为店铺会员？");
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            System.out.print("请输入会员ID：");
            String vipID = Utility.readString(7);
            vipID = "Vip" + vipID;
            int index = ExcelOperator.getInfoIndex(2, "会员ID", vipID);
            if(index == -1){
                System.out.println("未找到该会员，请确认ID是否正确");
            }
            order.setVipId(vipID);
            order.setDiscount(ExcelOperator.getDoubleCellValue(2, index, "折扣"));
            order.setPay(order.getMoney() * order.getDiscount());
        }else if(c == 'N'){
            System.out.println("请问是否充值办理店铺会员？");
            char d = Utility.readConfirmSelection();
            if(d == 'Y'){
                Vip vip = creatVip();
                joinVip(vip);
                order.setVipId(vip.getVipID());
                order.setDiscount(vip.getDiscount());
                order.setPay(order.getMoney() * order.getDiscount());
            }else {
                order.setPay(order.getMoney());
            }
        }
        if(orderService.addOrder(order)){
            System.out.println("您已下单成功");
        }else {
            System.out.println("下单失败");
        }

    }

    // 显示vip用户信息（服务后台）
    public void showVipInfo() throws Exception {
        System.out.println("-------------Vip用户信息-------------");
        ExcelOperator.excelRead07(2);
        System.out.println("-------------信息 Over-------------");
    }

    // 显示订单信息（服务后台）
    public void showOrderInfo() throws Exception {
        System.out.println("-------------订单信息-------------");
        ExcelOperator.excelRead07(1);
        System.out.println("-------------信息 Over-------------");
    }

    // 核验服务员身份并进入后台系统
    public void checkIdentity() throws Exception {
        System.out.println("请输入密码：");
        String password = Utility.readString(16);
        if(passwordCheck.equals(password)){
            do{
                System.out.println("===================点餐后台===================");
                System.out.println("\t\t1 查看订单");
                System.out.println("\t\t2 查看Vip信息");
                System.out.println("\t\t3 退出后台");
                System.out.print("请输入你的选择(1-3):");
                key = Utility.readChar();

                switch (key){
                    case '1':
                        showOrderInfo();
                        break;
                    case '2':
                        showVipInfo();
                        break;
                    case '3':
                        loop2 = exit(loop2);
                        break;
                    default:
                        System.out.println("请输入(1-3)的整数：");
                }
            }while (loop2);
        }else {
            System.out.println("密码错误");
        }
    }

    // 会员信息
    public Vip creatVip(){
        System.out.println("------------加入会员--------------");
        System.out.print("请输入姓名：");
        String name = Utility.readString(6);
        System.out.print("请输入充值金额：");
        double recharge = Utility.readDouble();
        return new Vip(name, recharge);
    }

    // 加入会员
    public void joinVip(Vip vip) throws Exception {
        if(orderService.addVip(vip)){
            System.out.println("成功加入会员");
        }else {
            System.out.println("会员加入失败...");
        }
    }

    // 显示菜单
    public void listMenu() throws Exception {
        System.out.println("===================菜单Menu===================");
        ExcelOperator.excelRead07(0);
        System.out.println("================Menu Over================\n");
    }

    // 确认退出
    public boolean exit(boolean loops){
        char c = Utility.readConfirmSelection();
        if(c == 'Y'){
            loops = false;
        }else {
            System.out.println();
        }
        return loops;
    }

    // 用户查看订单状态
    public void showOrderState() throws IOException {
        System.out.print("请输入订单编号：");
        String orderId = Utility.readString(7);
        orderId = "Ord" + orderId;
        int index = -1;

        // 1. 获取文件流
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(PATH + fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 2. 创建一个工作簿
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        // 3. 得到一个sheet表
        Sheet sheet = workbook.getSheetAt(1);

        // 查找信息行
        for (int i = 1; i < sheet.getLastRowNum() + 1; i++) {
            Row row = sheet.getRow(i);
            if(row.getCell(0).getStringCellValue().equals(orderId)){
                index = i;
                break;
            }
        }

        // 获取表头行
        Row header = sheet.getRow(0);
        // 获取信息行
        Row row = sheet.getRow(index);

        // 打印订单信息
        for (int i = 0; i < header.getLastCellNum(); i++) {
            // 空单元格处理
            if(row.getCell(i) == null){
                System.out.println(header.getCell(i).getStringCellValue() + ": ");
                continue;
            }
            if(row.getCell(i).getCellType() == CellType.NUMERIC){
                System.out.println(header.getCell(i).getStringCellValue() + ": " + row.getCell(i).getNumericCellValue());
            }else if(row.getCell(i).getCellType() == CellType.STRING){
                System.out.println(header.getCell(i).getStringCellValue() + ": " + row.getCell(i).getStringCellValue());
            }

        }

    }

    public void mainMenu() throws Exception {
        do{
            System.out.println("===================点餐系统===================");
            System.out.println("\t\t1 查看菜单");
            System.out.println("\t\t2 点 餐");
            System.out.println("\t\t3 查看订单状态");
            System.out.println("\t\t4 加入会员");
            System.out.println("\t\t5 退出系统");
            System.out.println("\t\t6 我是服务员");

            System.out.print("请输入你的选择(1-6):");
            key = Utility.readChar();

            switch (key){
                case '1':
                    listMenu();
                    break;
                case '2':
                    orderDishes();
                    break;
                case '3':
                    showOrderState();
                    break;
                case '4':
                    joinVip(creatVip());
                    break;
                case '5':
                    loop1 = exit(loop1);
                    break;
                case '6':
                    checkIdentity();
                    break;
                default:
                    System.out.println("请输入(1-6)的整数：");
            }
        }while (loop1);
    }
}
