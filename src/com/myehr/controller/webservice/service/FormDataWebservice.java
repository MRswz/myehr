package com.myehr.controller.webservice.service;

import javax.jws.WebService;

@WebService
public interface FormDataWebservice { 
    public String getInterfaceSchemeDatas(String interfaceSchemeId,String contractid,String contractType) throws NumberFormatException, Exception; 
    
    public String getInterfaceDatasByScheme(String interfaceSchemeId,String pageNo,String pagesize);  
}
