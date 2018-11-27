package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestCopy {
	private static Logger logger = LoggerFactory.getLogger(TestCopy.class);
	public static void  Copy(String  oldPath, String newPath)  {    
	          try {    
	                  int bytesum = 0;    
	                  int byteread  = 0;    
	                  File oldfile = new File(oldPath);    
	                  if(oldfile.exists()){      
                      InputStream  inStream = new FileInputStream(oldPath);     
                      FileOutputStream fs = new FileOutputStream(newPath);    
                      byte[] buffer = new byte[(int) oldfile.length()];    
                      int length;    
                      while((byteread  = inStream.read(buffer)) != -1){    
                          bytesum += byteread;        
                       //   logger.info(bytesum+"");    
                          fs.write(buffer, 0, byteread);    
                      }    
                      inStream.close();    
	                  }    
	          }    
	          catch(Exception e){    
	                  System.out.println( "error ");    
	                  e.printStackTrace();logger.error(e.getMessage(),e);    
	          }    
	    }     

}
