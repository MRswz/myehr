package com.myehr.controller.form;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.mapper.formmanage.drag.SysFormDragconfigColumnMapper;
import com.myehr.mapper.formmanage.drag.SysFormDragconfigMapper;
import com.myehr.pojo.act.Act;
import com.myehr.pojo.formmanage.drag.DragconfigAndDragconfigColumns;
import com.myehr.pojo.formmanage.drag.SysFormDragconfig;
import com.myehr.pojo.formmanage.drag.SysFormDragconfigColumn;
import com.myehr.pojo.formmanage.drag.SysFormDragconfigColumnExample;
import com.myehr.pojo.formmanage.drag.SysFormDragconfigExample;
import com.myehr.pojo.formmanage.drag.SysFormDragconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.service.AnnouncementService;
import com.myehr.service.calendar.CalendarService;
import com.myehr.service.flow.ActTaskService;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.menu.SysMenuService;

@Controller
@RequestMapping("/dragconfig")
public class formDragconfigController {
	
	@Autowired
	SysFormDragconfigColumnMapper sDragconfigColumnMapper;
	@Autowired
	SysFormDragconfigMapper sDragconfigMapper;
	@Autowired
	private ActTaskService actTaskService;
	@Autowired 
	private SysMenuService sMService;
	@Autowired
	private ISysformconfigService sysformconfigService;
	@Autowired
	private AnnouncementService announcementService;

	@Autowired
	private CalendarService calendarService;
	
	//保存数据
	@RequestMapping("/saveDragconfig")
	public @ResponseBody Object saveDragconfig(HttpServletRequest request,@RequestBody DragconfigAndDragconfigColumns DDC) throws Exception{
		//DragconfigAndDragconfigColumns DDC
		String reCode = "";
		SysFormDragconfigExample example = new SysFormDragconfigExample();
		example.or().andDragconfigCodeEqualTo(DDC.getDragconfig().getDragconfigCode());
		if (sDragconfigMapper.selectByExample(example).size()>0&&DDC.getDragconfig().getDragconfigId()==null) {
			reCode = "false1";//布局编码重复
		} else {
			try {
				DDC.getDragconfig().setDeleteMark("N");
				sDragconfigMapper.insert(DDC.getDragconfig());
				reCode = "true";//保存成功
			} catch (Exception e) {
				return "false";//保存异常
			}
		}
		return reCode;
	}
	
	//保存数据
	@RequestMapping("/saveDragSimple")
	public @ResponseBody Object saveDragSimple(HttpServletRequest request,@RequestBody SysFormDragconfigWithBLOBs sDragconfig) throws Exception{
		//DragconfigAndDragconfigColumns DDC
		String reCode = "";
		Date d = new Date();  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String dateNowStr = sdf.format(d); 
		SysFormDragconfigExample example = new SysFormDragconfigExample();
		if (sDragconfig.getDragconfigPid().intValue()==0) {
			example.or().andDragconfigCodeEqualTo(sDragconfig.getDragconfigCode());
			if (sDragconfigMapper.selectByExample(example).size()>0) {
				reCode = "0";//布局编码重复
			} else {
				try {
					sDragconfig.setDragconfigCname(sDragconfig.getDragconfigCname().split("_")[0]+"_"+dateNowStr);
					sDragconfig.setDragconfigCode(sDragconfig.getDragconfigCode().split("_")[0]+"_"+dateNowStr);
					sDragconfig.setDeleteMark("N");
					sDragconfigMapper.insert(sDragconfig);
				} catch (Exception e) {
					return "2";//保存异常
				}
			}
		} else {
			
			SysFormDragconfigWithBLOBs drag = sDragconfigMapper.selectByPrimaryKey(sDragconfig.getDragconfigPid());
			sDragconfig.setDragconfigCname(drag.getDragconfigCname().split("_")[0]+"_"+dateNowStr);
			sDragconfig.setDragconfigCode(drag.getDragconfigCode().split("_")[0]+"_"+dateNowStr);
			sDragconfig.setDragconfigHtml(drag.getDragconfigHtml());
			sDragconfig.setDragconfigHtmlAll(drag.getDragconfigHtmlAll());
			sDragconfig.setDeleteMark("N");
			if(!drag.getDragconfigPid().toString().equals("0")){
				sDragconfig.setDragconfigPid(drag.getDragconfigPid());
			}
			example.or().andDragconfigCodeEqualTo(sDragconfig.getDragconfigCode());
			if (sDragconfigMapper.selectByExample(example).size()>0) {
				reCode = "0";//布局编码重复
			}else {
				try {
					sDragconfigMapper.insert(sDragconfig);
				} catch (Exception e) {
					return "2";//保存异常
				}
			}
		}
		
		return sDragconfig;
	}
	
	//保存数据
	@RequestMapping("/updateDragconfig")
	public @ResponseBody Object updateDragconfig(HttpServletRequest request,@RequestBody DragconfigAndDragconfigColumns DDC) throws Exception{
		String reCode = "";
		SysFormDragconfigWithBLOBs dragconfig = sDragconfigMapper.selectByPrimaryKey(DDC.getDragconfig().getDragconfigId());
		dragconfig.setDragconfigHtml(DDC.getDragconfig().getDragconfigHtml());
		dragconfig.setDragconfigHtmlAll(DDC.getDragconfig().getDragconfigHtmlAll());
		try {
			sDragconfigMapper.updateByPrimaryKeyWithBLOBs(dragconfig);
			SysFormDragconfigColumnExample example2 = new SysFormDragconfigColumnExample();
			example2.or().andDragconfigIdEqualTo(dragconfig.getDragconfigId());
			sDragconfigColumnMapper.deleteByExample(example2);
			for (SysFormDragconfigColumn dColumn : DDC.getDragconfigColumns()) {
				dColumn.setDragconfigId(dragconfig.getDragconfigId());
				sDragconfigColumnMapper.insert(dColumn);
			}
			reCode = "true";//保存成功
		} catch (Exception e) {
			// TODO: handle exception
			return "false";//保存异常
		}
		return reCode;
	}
	
	//保存数据
	@RequestMapping("/getDragconfig")
	public @ResponseBody SysFormDragconfigWithBLOBs getDragconfig(HttpServletRequest request) throws Exception{
		String dragconfigId = request.getParameter("dragconfigId");
		SysFormDragconfigWithBLOBs config = sDragconfigMapper.selectByPrimaryKey(new BigDecimal(dragconfigId));
		return config;
	}
			
	//批量删除数据updateFormFolderid
	@RequestMapping("/deleteDrags")
	public @ResponseBody String deleteDrags(HttpServletRequest request) throws Exception{
		String reCode = "false";
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysFormDragconfigWithBLOBs> drags = JSONArray.toList(jArray,new SysFormDragconfigWithBLOBs(), new JsonConfig()); 
		try {
			for (SysFormDragconfigWithBLOBs dragconfig : drags) {
				if(dragconfig.getDeleteMark().equals("N")){
					dragconfig.setDeleteMark("Y");
					sDragconfigMapper.updateByPrimaryKey(dragconfig);
				}else {
					sDragconfigMapper.deleteByPrimaryKey(dragconfig.getDragconfigId());
					SysFormDragconfigColumnExample example = new SysFormDragconfigColumnExample();
					example.or().andDragconfigIdEqualTo(dragconfig.getDragconfigId());
					sDragconfigColumnMapper.deleteByExample(example);
				}
			}
			reCode = "true";
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
	}
	
	@RequestMapping("/recoverDrags")
	public @ResponseBody String recoverDrags(HttpServletRequest request) throws Exception{
		String reCode = "false";
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysFormDragconfigWithBLOBs> drags = JSONArray.toList(jArray,new SysFormDragconfigWithBLOBs(), new JsonConfig()); 
		try {
			for (SysFormDragconfigWithBLOBs dragconfig : drags) {
				dragconfig.setDeleteMark("N");
				sDragconfigMapper.updateByPrimaryKey(dragconfig);
			}
			reCode = "true";
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
	}
	
	//保存数据
	@RequestMapping("/getDragAllDatas")
	public @ResponseBody Object getDragAllDatas(HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		String userId = session.getAttribute("userid")+"";
		Map map = new HashMap();
		Act act = new Act();
		String loadThings = request.getParameter("duty");
		if (loadThings.indexOf("personInfo")>-1) {
			map.put("personInfo",sysformconfigService.getPersonInfoByuserId(userId));
		}
		if (loadThings.indexOf("waitDatas")>-1) {
			map.put("waitDatas",actTaskService.todoList_New(act,userId,null,null,null));
		}
		if (loadThings.indexOf("dragMenus")>-1) {
			map.put("dragMenus",sMService.getMenuWithSchemeAllx(userId));
		}
		if (loadThings.indexOf("taskDatas")>-1) {
			map.put("taskDatas",sysformconfigService.getTaskDatasByUserId(userId));
		}
		if (loadThings.indexOf("newsDatas")>-1) {
			map.put("newsDatas",announcementService.queryAnnouncement("", null, null, null, null));
		}
		if (loadThings.indexOf("workDatas")>-1) {
			map.put("workDatas",calendarService.queryWorkDatas(userId,0));
		}
		return map;
	}
	
	//保存数据
	@RequestMapping("/refreshDragAllDatas")
	public @ResponseBody Object refreshDragAllDatas(HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		String userId = session.getAttribute("userid")+"";
		Map map = new HashMap();
		Act act = new Act();
		String loadThings = request.getParameter("duty");
		String[] reCode = {"0"};
		if (loadThings.indexOf("personInfo")>-1) {
			sysformconfigService.setPersonInfoByuserId(userId);
		}
		if (loadThings.indexOf("waitDatas")>-1) {
			//map.put("waitDatas",actTaskService.todoList_New(act,userId,null,null,null));
		}
		if (loadThings.indexOf("dragMenus")>-1) {
			sMService.setMenuWithSchemeAllx(userId);
		}
		if (loadThings.indexOf("taskDatas")>-1) {
			//map.put("taskDatas",sysformconfigService.getTaskDatasByUserId(userId));
		}
		if (loadThings.indexOf("newsDatas")>-1) {
			//map.put("newsDatas",announcementService.queryAnnouncement("", null, null, null, null));
		}
		if (loadThings.indexOf("workDatas")>-1) {
			//map.put("workDatas",calendarService.queryWorkDatas(userId,0));
		}
		return reCode;
	}
}