package com.myehr.controller.webservice.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.myehr.controller.webservice.service.FormDataWebservice;

public class TestWebserviceClient {
	public static void main(String[] args) throws NumberFormatException, Exception {  
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/spring-client.xml");  
        FormDataWebservice client = (FormDataWebservice) ctx.getBean("formClient");  
        String result = client.getInterfaceSchemeDatas("1","7330","CONTRACT");  
        System.out.println(result);
    } 
}
