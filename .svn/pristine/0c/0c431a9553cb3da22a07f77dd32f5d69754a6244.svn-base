package com.myehr.common.util;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import com.myehr.pojo.sysParam.SysSource;

public class XmlUtil {
	/** 
     * 插入对象到xml中 
     * @param form 
     */  
    public static void addSysSource(SysSource sysSource) {  
    	/* 
         * 1. 得到Document 
         * 2. 得到root元素 
         * 3. 要把User对象转换成Element元素 
         * 4. 把user元素插入到root元素中 
         * 5. 回写document 
         */  
        try {  
            /* 
             * 1. 得到Docuembnt 
             */  
            // 创建解析器  
            SAXReader reader = new SAXReader();  
            // 调用读方法，得到Document  
            String path =  System.getProperty("user.dir").replace("\\", "/").replace("bin", "");
    		path = path+"webapps/myehr/WEB-INF/classes/spring/applicationContext.xml";
            Document doc = reader.read(path); 
              
            /* 
             * 2. 得到根元素 
             */  
            Element root = doc.getRootElement(); 
            
            Iterator iter = root.elementIterator("bean");
            while(iter.hasNext()){
            	Element deElement= (Element) iter.next();
            	List<Attribute> list = deElement.attributes();
            	for (int i = 0; i < list.size(); i++) {
            		if (list.get(i).getText().equals(sysSource.getSysSourceCode())) {
            			root.remove(deElement);
					}
            		if (list.get(i).getText().equals("dataSource")) {
            			Element property = deElement.element("property");
            			Element map = property.element("map");
            			Iterator entrys = map.elementIterator("entry");
            			int mark = 0;
            			while(entrys.hasNext()){
            				Element entryElement= (Element) entrys.next();
            				List<Attribute> list1 = entryElement.attributes();
            				
            				for (int j = 0; j < list.size(); j++) {
                        		if (list1.get(j).getText().equals(sysSource.getSysSourceCode())) {
                        			mark =1;
            					}
            				}
            			}
            			if (mark==0) {
            				map.addElement("entry").addAttribute("value-ref", sysSource.getSysSourceCode()).addAttribute("key", sysSource.getSysSourceCode());
						}
					}
            	}
            }
           
			/* 
             * 3. 完成添加元素，并返回添加的元素！ 
             * 向root中添加一个名为user的元素！并返回这个元素 
             */  
			Element beanElement = root.addElement("bean"); 
            // 设置userElement的属性！  
            beanElement.addAttribute("id", sysSource.getSysSourceCode());
            beanElement.addAttribute("class", "com.alibaba.druid.pool.DruidDataSource");
            beanElement.addAttribute("init-method", "init");
            beanElement.addAttribute("destroy-method", "close");
            
            Element propertyDriverElement = beanElement.addElement("property");
            Element propertyUrlElement = beanElement.addElement("property");
            Element propertyUserNameElement = beanElement.addElement("property");
            Element propertyPasswordElement = beanElement.addElement("property");
            propertyDriverElement.addAttribute("name", "driverClassName");  
            propertyDriverElement.addAttribute("value", "${"+sysSource.getSysSoruceDriver()+"}");
            propertyUrlElement.addAttribute("name", "url");  
            propertyUrlElement.addAttribute("value", "${"+sysSource.getSysSoruceUrl()+"}");  
            propertyUserNameElement.addAttribute("name", "username"); 
            propertyUserNameElement.addAttribute("value", "${"+sysSource.getSysSoruceUsername()+"}");  
            propertyPasswordElement.addAttribute("name", "password");
            propertyPasswordElement.addAttribute("value", "${"+sysSource.getSysSorucePassword()+"}");
              
            /* 
             * 回写 
             * 注意：创建的users.xml需要使用工具修改成UTF-8编码！ 
             * Editplus：标记列--> 重新载入为 --> UTF-8 
             */  
              
            // 创建目标输出流，它需要与xml文件绑定  
            Writer out = new PrintWriter(path, "UTF-8");  
            // 创建格式化器  
            OutputFormat format = new OutputFormat("\t", true);  
            format.setTrimText(true);//先干掉原来的空白(\t和换行和空格)！  
              
            // 创建XMLWrtier  
            XMLWriter writer = new XMLWriter(out, format);  
              
            // 调用它的写方法，把document对象写到out流中。  
            writer.write(doc);  
              
            // 关闭流  
            out.close();  
            writer.close();  
              
        } catch(Exception e) {  
            // 把编译异常转换成运行异常！  
            throw new RuntimeException(e);  
        }  
    }  
      
    /** 
     * 按用户名进行查询 
     * @param username 
     * @return 
     */  
    public static SysSource findByUsername(String username) {  
        /* 
         * 1. 得到Docuemnt 
         * 2. 给出xpath表达式 
         * 3. 调用docuemnt的方法进行xpath查询，得到Element 
         * 4. 把Element转换成User对象，返回！ 
         */  
        try {  
            /* 
             * 1. 得到Docuembnt 
             */  
            // 创建解析器  
            SAXReader reader = new SAXReader();  
            // 调用读方法，得到Document 
            String path =  System.getProperty("user.dir").replace("\\", "/").replace("bin", "");
    		path = path+"webapps/myehr/WEB-INF/classes/spring/applicationContext.xml";
            Document doc = reader.read(path);  
              
            /* 
             * 2. 准备xpath 
             *  //开头表示没有深的限制，可以在文档查询子元素、子元素的子元素！ 
             *  []中放的叫谓语，其实就是查询条件 
             *  @username表示username属性，限定其必须等于方法参数username 
             */  
            String xpath = "//user[@username='" + username + "']";  
            /* 
             * 3. 调用document方法完成查询 
             */  
            Element userEle = (Element)doc.selectSingleNode(xpath);  
            if(userEle == null) {  
                return null;  
            }  
            /* 
             * 4. 把元素转换成User类的对象，然后返回 
             */  
            SysSource sysSource = new SysSource();  
            // 获取元素的username属性值，赋给对象的username属性  
           /* user.setUsername(userEle.attributeValue("username"));  
            user.setPassword(userEle.attributeValue("password"));  
            user.setAge(Integer.parseInt(userEle.attributeValue("age")));  
            user.setGender(userEle.attributeValue("gender")); */ 
              
            return sysSource;  
        } catch(Exception e) {  
            throw new RuntimeException(e);  
        }  
    }  
}
