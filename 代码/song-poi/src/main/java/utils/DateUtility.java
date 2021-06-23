package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
    private static SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间



    public static String getMd() {
        sdf.applyPattern("MMdd");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        return sdf.format(date); // 输出已经格式化的现在时间（24小时制）
    }

    public static String getNow(){
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date date = new Date();// 获取当前时间
        return sdf.format(date); // 输出已经格式化的现在时间（24小时制）
    }
}
