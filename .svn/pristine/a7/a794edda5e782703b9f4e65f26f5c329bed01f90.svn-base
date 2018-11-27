package com.myehr.common.util;

import static java.lang.Character.UnicodeBlock.*; 
import com.google.common.base.Strings;

/**
 * 字符工具类
 * @author Administrator
 *
 */
public class StringUtils {
	
	public static boolean isNotNullAndBlank(String srcstr){
		if(srcstr!=null&&!"".equals(srcstr)&&!"null".equals(srcstr)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkStringContainChinese(String checkStr){  
        if(!Strings.isNullOrEmpty(checkStr)){  
            char[] checkChars = checkStr.toCharArray();  
            for(int i = 0; i < checkChars.length; i++){  
                char checkChar = checkChars[i];  
                if(checkCharContainChinese(checkChar)){  
                    return true;  
                }  
            }  
        }  
        return false;  
    }  
	
	
	public static boolean checkCharContainChinese(char checkChar){  
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(checkChar);  
        if(CJK_UNIFIED_IDEOGRAPHS == ub || CJK_COMPATIBILITY_IDEOGRAPHS == ub || CJK_COMPATIBILITY_FORMS == ub ||  
                CJK_RADICALS_SUPPLEMENT == ub || CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A == ub || CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B == ub){  
            return true;  
        }  
        return false;  
    }  
	
}
