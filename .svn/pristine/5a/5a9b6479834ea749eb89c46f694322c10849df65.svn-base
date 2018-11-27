package com.myehr.pojo.email;

import java.io.FileOutputStream;
import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

import com.sun.mail.util.MailSSLSocketFactory;

public class SendHTMLEmail {
	
	public static void sendEmailBy163(String fromCode,String fromPassword,String toCode,String content,String smtpHost) throws Exception {
		Properties prop = new Properties();
		
		// 开启debug调试，以便在控制台查看
		prop.setProperty("mail.debug", "true");
		// 设置邮件服务器主机名
		prop.setProperty("mail.host", smtpHost);
		// 发送服务器需要身份验证
		prop.setProperty("mail.smtp.auth", "true");
		// 发送邮件协议名称
		prop.setProperty("mail.transport.protocol", "smtp");
		prop.setProperty("mail.smtp.port", "587");
		prop.put("mail.smtp.starttls.enable", "true");
		
//        prop.setProperty("mail.host", "smtp.163.com");
        //使用JavaMail发送邮件的5个步骤
        // SSL加密 
        MailSSLSocketFactory sf = null; 
        sf = new MailSSLSocketFactory(); 
        // 设置信任所有的主机 
        sf.setTrustAllHosts(true); 
        prop.put("mail.smtp.ssl.enable", "true"); 
        Session session = Session.getInstance(prop);
        session.setDebug(true);
        Message message = createMixedMail(session,fromCode,toCode,content);
        Transport transport = session.getTransport();
        transport.connect(smtpHost, fromCode,fromPassword);
        transport.sendMessage(message, new Address[] { new InternetAddress(toCode)});
        transport.close();
	}
	
	public static void main(String [] args) throws Exception {
				 
		//		          transport.connect("smtp.163.com", "wz971254207@163.com", "wzz13093376302");
		//		          transport.sendMessage(message, new Address[] { new InternetAddress("947989560@qq.com") });
		//Cnit.servicedesk@cn.issworld.com|Iss180212
		sendEmailBy163("wz971254207@163.com","wzdsb111","947989560@qq.com","系统管理员 你好啊啊啊啊1112222姓名：王A议工号：E08layer是一款近年来备受青睐的web弹层组件，官网地址是：http://layer.layui.com/可以从官网上下载最新版本。当layer以iframe层的方式弹出新的窗口（子页面），如何在子页面中访问父页面的元素和函数。","smtp.163.com");
	}
	
	/**
	 52     * @Method: createMixedMail
	 53     * @Description: 生成一封带附件和带图片的邮件
	 54     * @Anthor:WT
	 56     * @param session
	 57     * @return
	 58     * @throws Exception
	 59     
	 * @param content 
	 * @param toCode 
	 * @param fromCode */ 
	      public static MimeMessage createMixedMail(Session session, String fromCode, String toCode, String content) throws Exception {
	          //创建邮件
	          MimeMessage message = new MimeMessage(session);
	          
	          //设置邮件的基本信息
	          message.setFrom(new InternetAddress(fromCode));
	          message.setRecipient(Message.RecipientType.TO, new InternetAddress(toCode));
	          message.setSubject("带附件和带图片的的邮件");
	          message.setContent(content,"text/html;charset=gbk");
	         
	         //返回创建好的的邮件
	         return message;
	     }
}
