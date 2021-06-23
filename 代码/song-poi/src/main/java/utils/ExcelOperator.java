package utils;

import domain.Order;
import domain.Vip;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelOperator {
    private final static String PATH = "/Users/songfei/Documents/code/交大Java培训/idea_java_projects/OrderProject/";
    private static String fileName = "菜单.xlsx";

    public static Workbook getWorkbook() throws IOException {
        // 1. 获取文件流
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(PATH + fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 2. 创建一个工作簿
        Workbook workbook = new XSSFWorkbook(fileInputStream);
        return workbook;
    }

    public static Sheet getSheet(int num) throws IOException {
        Workbook workbook = getWorkbook();
        Sheet sheet = workbook.getSheet(String.valueOf(num));
        return sheet;
    }

    // 输出excel内容
    public static void excelRead07(int num) throws Exception{
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
        Sheet sheet = workbook.getSheetAt(num);

        // 4. 获取每行中的字段
        for (int j = 0; j <= sheet.getLastRowNum(); j++) {
            Row row = sheet.getRow(j); // 获取行
            if (row == null) {//略过空行
                continue;
            }else{
                // 获取单元格中的值
                for (int i = 0; i < row.getLastCellNum(); i++) {

                    Cell cell = row.getCell(i);
                    if (cell != null){
                        if (cell.getCellType() == CellType.NUMERIC) {
                            System.out.print(cell.getNumericCellValue() + "\t\t\t");
                        } else if (cell.getCellType() == CellType.STRING) {
                            System.out.print(cell.getStringCellValue() + "\t\t\t");
                        } else if (cell.getStringCellValue() == ""){
                            System.out.print("\t\t\t");
                        }
                    } else {
                        System.out.print("\t\t\t");
                    }

                }
                System.out.println();
            }
        }
    }

    // 将vip信息录入excel
    public static void setVipInfo(Vip vip) throws Exception {
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
        Sheet vipInfo = workbook.getSheetAt(2);

        Row row = vipInfo.createRow(vipInfo.getLastRowNum() + 1);
        row.createCell(0).setCellValue(vip.getVipID());
        row.createCell(1).setCellValue(vip.getName());
        row.createCell(2).setCellValue(vip.getVipClass());
        row.createCell(3).setCellValue(vip.getDiscount());
        row.createCell(4).setCellValue(vip.getBalance());
        try {
            FileOutputStream fos = new FileOutputStream(PATH + fileName);
            workbook.write(fos);
//            System.out.println("写入成功");
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 得到excel单元格信息, sheetN为获取表格序号，rowN为获取行号，col为获取内容
    public static String getStringCellValue(int sheetN, int rowN, String cols) throws IOException {
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
        Sheet sheet = workbook.getSheetAt(sheetN);

        Row header = sheet.getRow(0);
        Row row = sheet.getRow(rowN);
        int col = 0;
        for (int i = 0; i < header.getLastCellNum(); i++) {
            if(header.getCell(i).getStringCellValue().equals(cols)){
                col = i;
            }
        }
        Cell cell = row.getCell(col);
        return cell.getStringCellValue();
    }

    // 得到excel单元格信息, sheetN为获取表格序号，rowN为获取行号，col为获取内容
    public static double getDoubleCellValue(int sheetN, int rowN, String cols) throws IOException {
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
        Sheet sheet = workbook.getSheetAt(sheetN);
        Row header = sheet.getRow(0);
        Row row = sheet.getRow(rowN);
        int col = 0;
        for (int i = 0; i < header.getLastCellNum(); i++) {
            if(header.getCell(i).getStringCellValue().equals(cols)){
                col = i;
            }
        }
        Cell cell = row.getCell(col);
        return cell.getNumericCellValue();
    }

    // 将order信息录入excel
    public static void setOrderInfo(Order order) throws Exception {
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
        Sheet vipInfo = workbook.getSheetAt(1);

        Row row = vipInfo.createRow(vipInfo.getLastRowNum() + 1);
        row.createCell(0).setCellValue(order.getOrderID()); // 订单编号
//        row.createCell(1).setCellValue(order.); // 排队编号
        row.createCell(2).setCellValue(order.toString()); // 菜品详情
        row.createCell(3).setCellValue(order.getOrderTime()); // 订单生成时间
        row.createCell(4).setCellValue(order.getState()); // 订单状态
//        row.createCell(5).setCellValue(order.getState()); // 订单完成时间
        row.createCell(6).setCellValue(order.getMoney()); // 订单总金额
        row.createCell(7).setCellValue(order.getDiscount()); // 折扣信息
        row.createCell(8).setCellValue(order.getPay()); // 实付款
        row.createCell(9).setCellValue(order.getVipId()); // 会员编号
        try {
            FileOutputStream fos = new FileOutputStream(PATH + fileName);
            workbook.write(fos);
//            System.out.println("写入成功");
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 查找表格信息index
    public static int getInfoIndex(int sheetN, String colName, String name) throws IOException {
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
        Sheet sheet = workbook.getSheetAt(sheetN);

        Row header = sheet.getRow(0);
        int colNum = -1;

        for (int i = 0; i < header.getLastCellNum(); i++) {
            if (header.getCell(i).getStringCellValue().equals(colName)) {
                colNum = i;
                break;
            }
        }
        if (colNum == -1) return -1;

        for (int i = 0; i < sheet.getLastRowNum()+1; i++) {
            Row row = sheet.getRow(i);
            if (row.getCell(colNum).getStringCellValue().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}
