package com.myehr.pojo.formmanage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 生成JSP文件
 * @author Administrator
 *
 */
public class JspUtil {
	private static Logger logger = LoggerFactory.getLogger(JspUtil.class);
	public static void main(String[] args)  {
		StringBuffer sb = new StringBuffer();
		try {
			buidJspFile(sb);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
	}

	public static void buidJspFile(StringBuffer sb) throws Exception{
		String jspStr = "";
		jspStr += FormConstant.JSP_START;
		
		//生成其他代码
		
		jspStr+=FormConstant.JSP_END;
		
		writeJspFile(jspStr,"formtest.jsp");
	}
	
	/**
	 * 写入jsp文件到知道目录
	 * @throws Exception 
	 */
	public  static  void writeJspFile(String jspStr,String fileNameAndPath) throws Exception{
		String allFileName = FormConstant.ecpliseJspRootPath+fileNameAndPath;
		 File file =new File(allFileName);
	      //if file doesnt exists, then create it
	     if(!file.exists()){
	       file.createNewFile();
	     }
	     FileOutputStream fop = null;
		try {
			fop = new FileOutputStream(file);
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
		    byte[] contentInBytes = jspStr.getBytes();
		    fop.write(contentInBytes);
		    fop.flush();
		    logger.info("jsp生成成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
			throw e;
		}finally{
			if(fop!=null){
				 fop.close();
			}
		}
	}
}
