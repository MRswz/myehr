package com.myehr.pojo.email;
import java.security.GeneralSecurityException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.mail.util.MailSSLSocketFactory;

public class SendQQEmail {
	public static void main(String [] args) throws GeneralSecurityException 
	   {
	      // 收件人电子邮箱
	      String to = "947989560@qq.com";
	 
	      // 发件人电子邮箱
	      String from = "382214359@qq.com";
	 
	      // 指定发送邮件的主机为 smtp.qq.com
	      String host = "smtp.qq.com";  //QQ 邮件服务器
	 
	      // 获取系统属性
	      Properties properties = System.getProperties();
	 
	      // 设置邮件服务器
	      properties.setProperty("mail.smtp.host", host);
	 
	      properties.put("mail.smtp.auth", "true");
	      MailSSLSocketFactory sf = new MailSSLSocketFactory();
	        sf.setTrustAllHosts(true);
	        properties.put("mail.smtp.ssl.enable", "true");
	        properties.put("mail.smtp.ssl.socketFactory", sf);
	      // 获取默认session对象
	      Session session = Session.getDefaultInstance(properties,new Authenticator(){
	        public PasswordAuthentication getPasswordAuthentication()
	        {
	         return new PasswordAuthentication("382214359@qq.com", "bsxyblcgqbudbicc"); //发件人邮件用户名、密码aini100nian
	        }
	       });
	 
	      try{
	         // 创建默认的 MimeMessage 对象
	         MimeMessage message = new MimeMessage(session);
	 
	         // Set From: 头部头字段
	         message.setFrom(new InternetAddress(from));
	 
	         // Set To: 头部头字段
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	 
	      // Set Subject: 头字段
	         message.setSubject("This is the Subject Line!");
	 
	         // 发送 HTML 消息, 可以插入html标签
	         message.setContent("<h1 style='color:red'>哈哈哈哈</h1>","text/html;charset=utf-8");
	 
	         // 发送消息
	         Transport.send(message);
	         System.out.println("Sent message successfully....from runoob.com");
	      }catch (MessagingException mex) {
	         mex.printStackTrace();
	      }
	   }
}

