package com.myehr.common.util;

import java.util.regex.Pattern;

public class SqlJection {
   public static String reg = "(?:')|(?:--)|(/\\*(?:.|[\\n\\r])*?\\*/)|"
            + "(\\b(select|update|union|and|or|delete|insert|trancate|char|into|substr|ascii|declare|exec|count|master|into|drop|execute)\\b)";

// 表示 限定单词边界  比如  select 不通过   1select则是可以的
   public static Pattern sqlPattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);

    public boolean isValid(String str){
      if (sqlPattern.matcher(str).find()){
    	  System.out.println("含有非法词汇，请重新提交");
        return false;
         
        }
	  return true;
      
}  
}
