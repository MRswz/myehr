package com.myehr.common.util;

public class ChangeSqlColumn {
	public static StringBuffer getSqlColumn(String str) {
		StringBuffer sb = new StringBuffer();
	    if(str!=null){
	        for(int i=0;i<str.length();i++){
	            char c = str.charAt(i);
	            if(Character.isUpperCase(c)){
	                sb.append("_"+Character.toLowerCase(c));
	            }else if(Character.isLowerCase(c)){
	                sb.append(c); 
	            }
	        }
	    }else {
	    	sb.append("xxx");
		}
		return sb;
	}
	
	public static StringBuffer getColumn(String str) {
		StringBuffer sb = new StringBuffer();
		String[] aa = str.split("_");
		sb.append(aa[0].toLowerCase());
	    for (int i = 1; i < aa.length; i++) {
	    	 String str1  = aa[i].substring(0,1).toUpperCase()+aa[i].substring(1).toLowerCase();
	    	 sb.append(str1);
	    	
		}
		return sb;
	}
	public static void main(String[] args) {
		ChangeSqlColumn csc = new ChangeSqlColumn();
		System.out.println(csc.getColumn("USER_name_name"));
	}

}
