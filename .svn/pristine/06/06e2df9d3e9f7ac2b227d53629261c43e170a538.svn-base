package com.myehr.controller.announcement;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gwt.user.client.AsyncProxy.ConcreteType;
import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.util.ResultMap;

import com.myehr.mapper.formmanage.form.AnnouncementMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMapper;
import com.myehr.mapper.formmanage.formexpand.SysFormconfigMapperExpand;

import com.myehr.pojo.formmanage.form.Announcement;
import com.myehr.pojo.formmanage.form.SysFormWhere;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.sysParam.SysRequestParam;
import com.myehr.service.AnnouncementService;
 
@Controller
@RequestMapping("/announcement")
public class AnnouncementController {
	private static Logger logger = LoggerFactory.getLogger(AnnouncementController.class);
	@Autowired
	private AnnouncementService announcementService;
	@Autowired
	private AnnouncementMapper announcementMapper;
	
	@RequestMapping("/queryAnnouncement")
	@ResponseBody
	public List<Announcement> queryAnnouncement(HttpServletRequest request){
		String title = request.getParameter("ANNOUNCEMENT_TITLE");
		return announcementService.queryAnnouncement(title, null, null, null, null);
	}
	@RequestMapping("/getAnnouncementById")
	@ResponseBody
	public ResultMap getAnnouncementById(HttpServletRequest request) throws Throwable {
		String sql="select * from ANNOUNCEMENT";
			List<Map> a=MybatisUtil.queryList("runtime.selectSql", sql);
			ResultMap pageresponse = new ResultMap(); 
			Map<String, Object> maps=new HashMap<String, Object>();
			 maps.put("sql", sql);
			
			 String sqla="select COUNT(*) as total from ANNOUNCEMENT";
		        Map map=MybatisUtil.queryOne("runtime.selectSql",sqla);
				long total = Integer.valueOf(map.get("total")+"");
		        List<Object> list_obj=new ArrayList<Object>();
		        
		     List<Announcement> alists = new ArrayList<Announcement>();
		     
		   for (Map  mapx : a) {
			   Announcement a1 = new  Announcement();
			   a1.setId((Integer) mapx.get("ID"));
			   a1.setInfoDetail((String) mapx.get("INFO_DETAIL"));
			   a1.setTitle((String)mapx.get("TITLE"));
			   a1.setCreateTime((Date) mapx.get("CREATE_TIME"));
			   a1.setCreateUser((String) mapx.get("CREATE_USER"));
			   a1.setState((String) mapx.get("STATE"));
			   a1.setCreateUserName((String) mapx.get("CREATE_USER_NAME"));
		       a1.setMapAddress((String) mapx.get("MAP_ADDRESS"));
			   a1.setPubDepartment((String) mapx.get("PUBDEPARTMENT"));
			   a1.setUpdateTime((Date) mapx.get("updateTime"));
			   a1.setUpdateUser((String) mapx.get("UPDATE_USER"));
			   alists.add(a1);
		   }
		        
		   for (Announcement u : alists ) {
			list_obj.add(u);
		   }
		 pageresponse.setRows(list_obj);  
	     pageresponse.setTotal(total);  
	     return pageresponse;
		
		
	   
	//	return announcementService.ybvcgetAnnouncementById(Integer.valueOf(param));
	}
	@RequestMapping("/deleteAnnouncementById")
	 public int deleteAnnouncementById(HttpServletRequest request) throws Exception {
		  String[] id=(request.getParameter("id").split(","));
		  for(int i=0;i<id.length-1;i++){
			  logger.info(id[i]);
			  
		  }
		  int id1=Integer.parseInt(id[0]);
		try {
		//	announcementMapper.deleteByPrimaryKey(id);
			announcementService.deleteAnnouncementById(id1);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();logger.error(e.getMessage(),e);
			return 1;
		}
			return  0;
		
		
	}
	
	@RequestMapping("/addAnnouncement")
	 public   int addAnnouncement(HttpServletRequest request,@RequestBody Announcement announcement) throws Exception {
		
		
       
		announcementService.addAnnouncement(announcement);
		return 1;
	}
	
	@RequestMapping("/updateAnnouncement")
	 public   int updateAnnouncement(HttpServletRequest request,@RequestBody Announcement announcement) throws Exception {
		announcementService.updateAnnouncement(announcement);
		return 1;
	}
	@RequestMapping("/seeAnnouncement")
	public @ResponseBody  Announcement seeAnnouncementById(HttpServletRequest request) throws Exception {
			String id=request.getParameter("id");
			int id1=Integer.parseInt(id);
			Announcement a = announcementService.seeAnnouncementById(id1);
		return a;
	}
}
