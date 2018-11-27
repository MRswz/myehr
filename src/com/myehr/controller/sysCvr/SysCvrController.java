package com.myehr.controller.sysCvr;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import com.myehr.mapper.sysCvr.SysCvrExpandMapper;
import com.myehr.mapper.sysCvr.SysCvrMapper;
import com.myehr.pojo.sysCvr.SysCvr;
import com.myehr.pojo.sysCvr.SysCvrExample;
import com.myehr.service.impl.primaryKey.PrimaryKeyServiceImpl;
import com.myehr.service.primaryKey.PrimaryKeyService;

@Controller
@RequestMapping("/sysCvr")
public class SysCvrController {
	private static Logger logger = LoggerFactory.getLogger(SysCvrController.class);
	@Autowired
	private SysCvrMapper mapper;
	@Autowired
	private SysCvrExpandMapper emapper;
//	@Autowired
	@Resource(name = "PrimaryKeyService")
	private PrimaryKeyService keyserviceImpl;
	//保存
	@RequestMapping("/save")
	public @ResponseBody int save(HttpServletRequest request,SysCvr cvr,String Birthday) throws Exception{
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		cvr.setPeopleBirthday(sdf.parse(Birthday));
		//logger.info(peoplePicture);
		String code=cvr.getPeopleIdCode();
		cvr.setReadDate(new Date());
		mapper.insert(cvr);
		return 0;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/updateModel")
	public @ResponseBody Object updateModel(HttpServletRequest request, @RequestBody SysCvr sCvr) throws Exception{
		Map<String,Object> maps  =new  HashMap<String,Object>();
        maps.put("readDate", sCvr.getReadDate());
        maps.put("peopleIdCode", sCvr.getPeopleIdCode());
        int i = emapper.updateReadDate(maps);
        return i;
	}
	 	
	//根据身份证号查询
	@RequestMapping("/checkSave")
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
	
	//图片复制
	@RequestMapping("/copy")
	public @ResponseBody void fopy(HttpServletRequest request,String oldPath,String newPath) throws Exception{
			/**
			* 字节输出流
			*/
			FileOutputStream fos = null;
			/**
			* 字节输入流
			*/
			FileInputStream fis = null;
			try {
				fos = new FileOutputStream(newPath);//复制文件
				fis = new FileInputStream(oldPath);//源文件
				byte[] buf = new byte[1024];//缓冲区
				int len = 0;
				while ((len = fis.read(buf)) != -1) {
					fos.write(buf, 0, len);//复制
				}
			} catch (IOException e) {
				e.printStackTrace();logger.error(e.getMessage(),e);
			} finally {
				try {
					if (fis != null)
						fis.close();
				} catch (IOException e) {
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
				try {
					if (fos != null)
						fos.close();
				} catch (IOException e) {
					e.printStackTrace();logger.error(e.getMessage(),e);
				}
			}
	}
	
	
	//图片上传
	 @ResponseBody
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void addPost(final ModelMap map, @RequestParam("file") final MultipartFile file, final HttpServletRequest request,
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
				String path = request.getSession().getServletContext().getRealPath("/upload");
				//上传图片
				try {
					file.transferTo(new File(path,filename));
				} catch (IllegalStateException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				/*
				 * 文件上传  多个   貌似不好使
				 * 
				 *  DiskFileItemFactory factory = new DiskFileItemFactory();
					ServletFileUpload upload = new ServletFileUpload(factory);
					List<FileItem> list =  upload.parseRequest(request);
					for (FileItem item : list) {
							item.write(new File(path + "/" + file.getOriginalFilename()));
						}
				*/
			}
		
		}
	 
		//更新数据
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
