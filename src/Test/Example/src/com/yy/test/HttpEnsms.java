package Test.Example.src.com.yy.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class HttpEnsms {
	private static Logger logger = LoggerFactory.getLogger(HttpEnsms.class);
	/**
	 * http����
	 * @param args
	 */
	public static void main(String[] args) {

		SimpleDateFormat df=new SimpleDateFormat("MMddHHmmss");		
		String Stamp = df.format(new Date());
		String password="a012365";
		String Secret=MD5.GetMD5Code(password+Stamp).toUpperCase();
		
		try {
			JSONObject j=new JSONObject();
			j.put("UserName", "gs33");
			j.put("Stamp", Stamp);
			j.put("Secret", Secret);
			j.put("Moblie", "13122792369");
			j.put("Text", "【合协软件】尊敬的李振会员：您正在合协用户中心修改密码，验证码为ＳＣ。如非本人操作。请尽快检测账户安全。");
			j.put("Ext", "");
			j.put("SendTime", "");
			//��ȡjson�ַ�
			String json=j.toString();
			byte[] data=json.getBytes("utf-8");
			byte[] key=password.getBytes();
			//��ȡ���ܵ�key
			byte[] nkey=new byte[8];
			System.arraycopy(key, 0, nkey, 0, key.length > 8 ? 8 : key.length);
			//Des���ܣ�base64ת��
			//String str=new BASE64Encoder().encode(DesHelper.encrypt(data, nkey)); 
			String str = null;
		//	logger.info(str);
			//url����
			//str=URLEncoder.encode(str, "utf-8");
			
			//����http����
			String Url="http://sh2.cshxsp.com/ensms.ashx";
			HttpClient client=new HttpClient();
			PostMethod post=new PostMethod(Url);
			post.setRequestHeader("Content-type", "application/x-www-form-urlencoded;charset=utf-8");
			NameValuePair UserId=new NameValuePair("UserId","4653");
			NameValuePair Text64=new NameValuePair("Text64",str);
			post.setRequestBody(new NameValuePair[]{UserId,Text64});
			int statu=client.executeMethod(post);
			logger.info("statu="+statu);
			//���ؽ��
			String result=post.getResponseBodyAsString();
			logger.info("result="+result);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		
	}

}
