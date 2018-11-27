<%@page import="java.io.*"%>
<%	
    String filename = request.getParameter("filename");
    String contentType = request.getParameter("contentType");
    String filePath = request.getParameter("filePath");
    
    ServletOutputStream os = null;
	FileInputStream in = null;
    try {
		response.reset();
		response.setCharacterEncoding("GBK");
		response.setContentType(contentType);
		response.setHeader("Content-disposition", "attachment; filename="+ new String(filename.getBytes("GBK"),"ISO_8859_1"));
		
		byte[] buffer = new byte[512]; 
		int size = 0; 
	
		 os = response.getOutputStream();
	     File downloadFile= new File(filePath);
	     if(downloadFile!=null&&downloadFile.exists()){
		     in = new FileInputStream(downloadFile);
		     while ((size = in.read(buffer)) != -1) { 
		       os.write(buffer, 0, size); 
		     }
	     }else{
	     		System.out.println("File Not Exist!");
	     }
	} catch (final IOException e) {
		System.out.println("IOException." + e);
	} finally{
		 if(in!=null)in.close();
		 if(os!=null)os.close();
	}
	response.flushBuffer();
	out.clear();
	out = pageContext.pushBody();
%>