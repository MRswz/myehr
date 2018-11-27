package Test.Example.src.com.yy.test;

import java.io.IOException;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


public class DesHelper {
	
	private final static String DES="DES";
	
//	public static void main(String[] args) throws Exception {
//		String data = "1";
//        String key = "11111111";
//        System.err.println(encrypt(data, key));
//        System.err.println(decrypt(encrypt(data, key), key));
//        
//    }
	

	/**
     * Description ��ݼ�ֵ���м���
     * @param data 
     * @param key  ���ܼ�byte����
     * @return
     * @throws Exception
     */
    public static String encrypt(String data, String key) throws Exception {
        byte[] bt = encrypt(data.getBytes(), key.getBytes());
        /*String strs = new BASE64Encoder().encode(bt);
        return strs;*/
        return null;
    }
 
    /**
     * Description ��ݼ�ֵ���н���
     * @param data
     * @param key  ���ܼ�byte����
     * @return
     * @throws IOException
     * @throws Exception
     */
    public static String decrypt(String data, String key) throws IOException,
            Exception {
        if (data == null)
            return null;
        /*BASE64Decoder decoder = new BASE64Decoder();
        byte[] buf = decoder.decodeBuffer(data);
        byte[] bt = decrypt(buf,key.getBytes());
        return new String(bt);*/
        return null;
    }
 
    /**
     * Description ��ݼ�ֵ���м���
     * @param data
     * @param key  ���ܼ�byte����
     * @return
     * @throws Exception
     */
    public static byte[] encrypt(byte[] data, byte[] key) throws Exception {
        //// ���һ�������ε������Դ
        //SecureRandom sr = new SecureRandom();
 
        // ��ԭʼ��Կ��ݴ���DESKeySpec����
        DESKeySpec dks = new DESKeySpec(key);
 
        // ����һ����Կ������Ȼ�������DESKeySpecת����SecretKey����
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);
 
        // Cipher����ʵ����ɼ��ܲ���
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
 
        IvParameterSpec iv = new IvParameterSpec(key);  
        
        // ����Կ��ʼ��Cipher����
        cipher.init(Cipher.ENCRYPT_MODE, securekey, iv);
 
        return cipher.doFinal(data);
    }
     
     
    /**
     * Description ��ݼ�ֵ���н���
     * @param data
     * @param key  ���ܼ�byte����
     * @return
     * @throws Exception
     */
    public static byte[] decrypt(byte[] data, byte[] key) throws Exception {
        //// ���һ�������ε������Դ
        //SecureRandom sr = new SecureRandom();
 
        // ��ԭʼ��Կ��ݴ���DESKeySpec����
        DESKeySpec dks = new DESKeySpec(key);
 
        // ����һ����Կ������Ȼ�������DESKeySpecת����SecretKey����
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(DES);
        SecretKey securekey = keyFactory.generateSecret(dks);
 
        // Cipher����ʵ����ɽ��ܲ���
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
 
        IvParameterSpec iv = new IvParameterSpec(key);  
        
        // ����Կ��ʼ��Cipher����
        cipher.init(Cipher.DECRYPT_MODE, securekey, iv);
 
        return cipher.doFinal(data);
    }

}
