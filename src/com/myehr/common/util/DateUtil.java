package com.myehr.common.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

   
public class DateUtil {
	private static Logger logger = LoggerFactory.getLogger(DateUtil.class);

    public static final String PATTERN_STANDARD08W = "yyyyMMdd";
    public static final String PATTERN_STANDARD12W = "yyyyMMddHHmm";
    public static final String PATTERN_STANDARD14W = "yyyyMMddHHmmss";
    public static final String PATTERN_STANDARD17W = "yyyyMMddHHmmssSSS";
     
    public static final String PATTERN_STANDARD10H = "yyyy-MM-dd";
    public static final String PATTERN_STANDARD16H = "yyyy-MM-dd HH:mm";
    public static final String PATTERN_STANDARD19H = "yyyy-MM-dd HH:mm:ss";
     
    public static final String PATTERN_STANDARD10X = "yyyy/MM/dd";
    public static final String PATTERN_STANDARD16X = "yyyy/MM/dd HH:mm";
    public static final String PATTERN_STANDARD19X = "yyyy/MM/dd HH:mm:ss";
 
    
    /* 
     * 将时间转换为时间戳
     */    
    public static String dateToStamp(String s) throws ParseException{
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }
    /* 
     * 将时间戳转换为时间
     */
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }
    
    /**
     * @Title: date2String
     * @Description: 日期格式的时间转化成字符串格式的时间
     * @author YFB
     * @param date
     * @param pattern
     * @return
     */ 
    public static String date2String(Date date, String pattern) {
        if (date == null) {
            throw new java.lang.IllegalArgumentException("timestamp null illegal");
        }
        pattern = (pattern == null || pattern.equals(""))?PATTERN_STANDARD19H:pattern;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }
     
    /**
     * @Title: string2Date
     * @Description: 字符串格式的时间转化成日期格式的时间
     * @author YFB
     * @param strDate
     * @param pattern
     * @return
     */ 
    public static Date string2Date(String strDate, String pattern) {
        if (strDate == null || strDate.equals("")) {
            throw new RuntimeException("strDate is null");
        }
        pattern = (pattern == null || pattern.equals(""))?PATTERN_STANDARD19H:pattern;
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = sdf.parse(strDate);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return date;
    }
     
    /**
     * @Title: getCurrentTime
     * @Description: 取得当前系统时间
     * @author YFB
     * @param format 格式 17位(yyyyMMddHHmmssSSS) (14位:yyyyMMddHHmmss) (12位:yyyyMMddHHmm) (8位:yyyyMMdd)
     * @return
     */ 
    public static String getCurrentTime(String format) {
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        String date = formatDate.format(new Date());
        return date;
    }
     
    /**
     * @Title: getWantDate
     * @Description: 获取想要的时间格式
     * @author YFB
     * @param dateStr
     * @param wantFormat
     * @return
     */ 
    public static String getWantDate(String dateStr,String wantFormat){
        if(!"".equals(dateStr)&&dateStr!=null){
            String pattern = PATTERN_STANDARD14W;
            int len = dateStr.length();
            switch(len){
                case 8:pattern = PATTERN_STANDARD08W;break;
                case 12:pattern = PATTERN_STANDARD12W;break;
                case 14:pattern = PATTERN_STANDARD14W;break;
                case 17:pattern = PATTERN_STANDARD17W;break;
                case 10:pattern = (dateStr.contains("-"))?PATTERN_STANDARD10H:PATTERN_STANDARD10X;break;
                case 16:pattern = (dateStr.contains("-"))?PATTERN_STANDARD16H:PATTERN_STANDARD16X;break;
                case 19:pattern = (dateStr.contains("-"))?PATTERN_STANDARD19H:PATTERN_STANDARD19X;break;
                default:pattern = PATTERN_STANDARD14W;break;
            }
            SimpleDateFormat sdf = new SimpleDateFormat(wantFormat);
            try {
                SimpleDateFormat sdfStr = new SimpleDateFormat(pattern);
                Date date = sdfStr.parse(dateStr);
                dateStr = sdf.format(date);
            } catch (Exception e) {
                e.printStackTrace();logger.error(e.getMessage(),e);
            }
        }
        return dateStr;
    }
     
    /**
     * @Title: getAfterTime
     * @Description: 获取该时间的几分钟之后的时间
     * @author YFB
     * @param dateStr
     * @param minute
     * @return
     */ 
    public static String getAfterTime(String dateStr,int minute){
        String returnStr = "";
        try {
            String pattern = PATTERN_STANDARD14W;
            int len = dateStr.length();
            switch(len){
                case 8:pattern = PATTERN_STANDARD08W;break;
                case 10:pattern = PATTERN_STANDARD10H;break;
                case 12:pattern = PATTERN_STANDARD12W;break;
                case 14:pattern = PATTERN_STANDARD14W;break;
                case 16:pattern = PATTERN_STANDARD16H;break;
                case 17:pattern = PATTERN_STANDARD17W;break;
                case 19:pattern = PATTERN_STANDARD19H;break;
                default:pattern = PATTERN_STANDARD14W;break;
            }
            SimpleDateFormat formatDate = new SimpleDateFormat(pattern);
            Date date = null;
            date = formatDate.parse(dateStr);
            Date afterDate = new Date(date.getTime()+(60000*minute));
            returnStr = formatDate.format(afterDate);
        } catch (Exception e) {
            returnStr = dateStr;
            e.printStackTrace();logger.error(e.getMessage(),e);
        }
        return returnStr;
    }
     
    /**
     * @Title: getBeforeTime
     * @Description: 获取该时间的几分钟之前的时间
     * @author YFB
     * @param dateStr
     * @param minute
     * @return
     */ 
    public static String getBeforeTime(String dateStr,int minute){
        String returnStr = "";
        try {
            String pattern = PATTERN_STANDARD14W;
            int len = dateStr.length();
            switch(len){
                case 8:pattern = PATTERN_STANDARD08W;break;
                case 10:pattern = PATTERN_STANDARD10H;break;
                case 12:pattern = PATTERN_STANDARD12W;break;
                case 14:pattern = PATTERN_STANDARD14W;break;
                case 16:pattern = PATTERN_STANDARD16H;break;
                case 17:pattern = PATTERN_STANDARD17W;break;
                case 19:pattern = PATTERN_STANDARD19H;break;
                default:pattern = PATTERN_STANDARD14W;break;
            }
            SimpleDateFormat formatDate = new SimpleDateFormat(pattern);
            Date date = null;
            date = formatDate.parse(dateStr);
            Date afterDate = new Date(date.getTime()-(60000*minute));
            returnStr = formatDate.format(afterDate);
        } catch (Exception e) {
            returnStr = dateStr;
            e.printStackTrace();logger.error(e.getMessage(),e);
        }
        return returnStr;
    }
    
    /**
     * 获取当前日期是星期几<br>
     * 
     * @param dt
     * @return 当前日期是星期几
     */
    public static String getWeekOfDate(Date dt) {
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
     
    public static void main(String[] args){
        logger.info(DateUtil.date2String(new Date(), "yyyy-MM-dd"));
    }
}