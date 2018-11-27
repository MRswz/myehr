package Test.Example.src.com.yy.test;

import java.io.IOException;
import java.net.URLEncoder;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

public class Http1 {
	
	public static void main(String[] args) throws HttpException, IOException {
				
		String Text="�����֤�룺8859�����š�";
		
		String Url="http://sh2.cshxsp.com/sms.aspx?action=send";
		
		HttpClient client=new HttpClient();
				
		PostMethod post=new PostMethod(Url);
		post.setRequestHeader("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
		NameValuePair userid=new NameValuePair("userid","");
		NameValuePair account=new NameValuePair("account","qq");
		NameValuePair password=new NameValuePair("password","123456");
		NameValuePair mobile=new NameValuePair("mobile","18910815601");
		NameValuePair content=new NameValuePair("content",Text);
		NameValuePair sendTime=new NameValuePair("sendTime","");
		NameValuePair extno=new NameValuePair("extno","");
		post.setRequestBody(new NameValuePair[]{userid,account,password,mobile,content,sendTime,extno});
		int statu=client.executeMethod(post);
		System.out.println("statu="+statu);
		String str=post.getResponseBodyAsString();
		
		System.out.println(str);
		
//		HttpMethod method=new PostMethod(Url);//������Url
//		method.setRequestHeader("Content-type", "text/xml; charset=utf-8");
//		client.executeMethod(method);
//		String str = method.getResponseBodyAsString();
//		System.out.println("result="+str);
		
		try {
			//���ַ�ת��ΪXML
			Document doc=DocumentHelper.parseText(str);
			//��ȡ��ڵ�
			Element rootElt=doc.getRootElement();
			//��ȡ��ڵ��µ��ӽڵ��ֵ
			String returnstatus=rootElt.elementText("returnstatus").trim();
			String message=rootElt.elementText("message").trim();
			String remainpoint=rootElt.elementText("remainpoint").trim();
			String taskID=rootElt.elementText("taskID").trim();
			String successCounts=rootElt.elementText("successCounts").trim();
			
			System.out.println("����״̬Ϊ��"+returnstatus);
			System.out.println("������Ϣ��ʾ��"+message);
			System.out.println("������"+remainpoint);
			System.out.println("����������Σ�"+taskID);
			System.out.println("���سɹ�����"+successCounts);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}

}
