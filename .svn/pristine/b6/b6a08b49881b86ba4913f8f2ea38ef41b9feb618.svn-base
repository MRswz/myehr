package com.myehr.controller.sysCvr;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import com.myehr.mapper.sysCvr.SysCvrExpandMapper;
import com.myehr.mapper.sysCvr.SysCvrMapper;
import com.myehr.pojo.sysCvr.SysCvr;
import com.myehr.pojo.sysCvr.SysCvrExample;

@Controller
@RequestMapping("/sqlserverSysCvr")
public class SqlserverController {
	private static Logger logger = LoggerFactory.getLogger(SqlserverController.class);
	@Autowired
	private SysCvrMapper mapper;
	@Autowired
	private SysCvrExpandMapper emapper;
	
	
	//根据身份证号查询
	@RequestMapping("/search")
	public @ResponseBody int search(HttpServletRequest request,SysCvr cvr,String Birthday) {
		try {
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			cvr.setPeopleBirthday(sdf.parse(Birthday));
			SysCvrExample example= new SysCvrExample();
			com.myehr.pojo.sysCvr.SysCvrExample.Criteria criteria = example.createCriteria();
			criteria.andPeopleIdCodeEqualTo(cvr.getPeopleIdCode());
			List<SysCvr> list= mapper.selectByExample(example);
			if(list.size()>0){
				return 1;   //已经保存过
			}else{
				return 0;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();logger.error(e.getMessage(),e);
		}
		return 0;
	}
	
	//图片上传
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody int addPost(final ModelMap map, @RequestParam("file") final MultipartFile file, final HttpServletRequest request,
			final HttpServletResponse response) {
		 SysCvr ens = new SysCvr();
		 if(file.getSize()>0){
				String contentType = file.getContentType();
//				if(!"image/gif".equals(contentType)){
//					return "格式不对";
//				}
//				long size = file.getSize();
//				if(size> 25*1024){
//					return "文件最大是25kb";
//				}
				//文件名
				String filename = file.getOriginalFilename();
				//绝对路径
				String path = "c:\\"+filename;
				byte data[]=null;
				//以流的形式存进数据库
				try {
					FileInputStream is = new FileInputStream(path);  
					   int i = is.available(); // 得到文件大小  
					   data = new byte[i];  
					   is.read(data); //读数据  
					   is.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();logger.error(e.getMessage(),e);
				}  
	           String idcode= filename.substring(0, 18);
	           Map<String,Object> maps  =new  HashMap<String,Object>();
	           maps.put("peopleIdCode", idcode);
	           maps.put("peoplePicture", data);
	           int i = emapper.update(maps);
	          /* File file =new File(path);  
	           file.delete();//删除上传至服务器的文件  */
				/*//上传图片到制定路径    抛异常，可以执行，放方法的最后
				 * 
				try {
					file.transferTo(new File(path,filename));
				} catch (IllegalStateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
	           logger.info("i="+i);
	           if(i>0){
	        	   return i;
	           }
	          
	           
	           
			}
		 return 0;
		}
	 
		//保存
		@RequestMapping("/sqlServerSave")
		public @ResponseBody int sqlServerSave(HttpServletRequest request,SysCvr cvr,String Birthday) throws Exception{
			SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
			cvr.setPeopleBirthday(sdf.parse(Birthday));
			return  emapper.insert(cvr);
		}
	 
	 
		//根据身份证号查询
		@RequestMapping("/update")
		public @ResponseBody int search(HttpServletRequest request,SysCvr cvr) {
			String peopleName =cvr.getPeopleName();
			String peopleSex =cvr.getPeopleSex();
			String peopleNation =cvr.getPeopleNation();
			String peopleAddress =cvr.getPeopleAddress();
			String department =cvr.getDepartment();
			String startDate =cvr.getStartDate();
			String endDate =cvr.getEndDate();
			String peopleIdCode =cvr.getPeopleIdCode();
			
			Map<String,Object> maps  =new  HashMap<String,Object>();
			maps.put("peopleName", peopleName);
			maps.put("peopleSex", peopleSex);
			maps.put("peopleNation", peopleNation);
			maps.put("peopleAddress", peopleAddress);
			maps.put("startDate", startDate);
			maps.put("department", department);
			maps.put("endDate", endDate);
			maps.put("peopleIdCode", peopleIdCode);
			
			return emapper.updateMessage(maps);
		}
	 
}
