package com.myehr.controller.task;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.mybatis.Pager;
import com.myehr.common.util.ThreadUtil;
import com.myehr.common.util.TimerUtil;
import com.myehr.controller.dict.param.ResultMapNew;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.controller.form.parambean.SaveButtonParams;
import com.myehr.mapper.formmanage.form.SysFormWhereMapper;
import com.myehr.mapper.gantt.PmPlanMapper;
import com.myehr.mapper.sysuser.SysUserMapper;
import com.myehr.mapper.task.SysMeetingTaskMapper;
import com.myehr.mapper.task.SysTaskMapper;
import com.myehr.mapper.task.SysTimerMapper;
import com.myehr.pojo.formmanage.form.SysFormWhere;
import com.myehr.pojo.formmanage.form.SysFormWhereExample;
import com.myehr.pojo.gantt.PmPlan;
import com.myehr.pojo.gantt.PmPlanExample;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserExample;
import com.myehr.pojo.task.SysMeetingTask;
import com.myehr.pojo.task.SysMeetingTaskExample;
import com.myehr.pojo.task.SysTask;
import com.myehr.pojo.task.SysTaskExample;
import com.myehr.pojo.task.SysTimer;
import com.myehr.pojo.task.SysTimerExample;

@Controller
@RequestMapping("/sysTask")
public class SysTaskController {
	@Autowired
	private SysTaskMapper sysTaskMapper;
	
	@Autowired
	private SysMeetingTaskMapper sysMeetingTaskMapper;
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Autowired
	private PmPlanMapper pmPlanMapper;
	
	@Autowired
	private SysFormWhereMapper sysFormWhereMapper;
	
	@Autowired
	private SysTimerMapper sysTimerMapper;
	
	@RequestMapping("/saveSysTask")
	public @ResponseBody String saveSysTask(HttpServletRequest request) throws Exception{
		String userId = request.getSession().getAttribute("userid")+"";
		String sysTaskContent=request.getParameter("value")+"";
		
		SysTask task = new SysTask();
		task.setSysTaskContent(sysTaskContent);
		task.setSysTaskStatus("0");
		task.setSysTaskIdentifier("unconnected");
		task.setSysTaskCreateUserid(userId);
		task.setSysTaskCreateTime(new Date());
		sysTaskMapper.insert(task);
		task.getSysTaskId();
		return task.getSysTaskId()+"";
	}
	
	@RequestMapping("/saveSysTaskInfo")
	public @ResponseBody String saveSysTaskInfo(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String userId = request.getSession().getAttribute("userid")+"";
		Map param = params.getParam();
		
		SysTask task = new SysTask();
		String sysTaskId = param.get("sysTaskId")+"";
		if (sysTaskId!=null && !sysTaskId.equals("")) {
			SysTaskExample example = new SysTaskExample();
			example.or().andSysTaskIdEqualTo(Long.parseLong(sysTaskId));
			task = sysTaskMapper.selectByExample(example).get(0);
			
			task.setSysTaskUrgency(param.get("sysTaskUrgency")+"");
			task.setSysTaskImportance(param.get("sysTaskImportance")+"");
			task.setSysTaskType(param.get("sysTaskType")+"");
			String sysTaskCalenderStart = param.get("sysTaskCalenderStart")+"";
			String sysTaskCalenderEnd = param.get("sysTaskCalenderEnd")+"";
			if (!sysTaskCalenderStart.equals("")) {
				SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd hh:mm");
				Date date = sdf.parse(sysTaskCalenderStart);
				task.setSysTaskCalenderStart(date);
			}
			if (!sysTaskCalenderEnd.equals("")) {
				SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd hh:mm");
				Date date = sdf.parse(sysTaskCalenderEnd);
				task.setSysTaskCalenderEnd(date);
			}
			sysTaskMapper.updateByPrimaryKey(task);
			task.getSysTaskId();
		}else {
			task.setSysTaskContent(param.get("sysTaskContent")+"");
			task.setSysTaskStatus("0");
			task.setSysTaskIdentifier("unconnected");
			task.setSysTaskCreateUserid(userId);
			task.setSysTaskUrgency(param.get("sysTaskUrgency")+"");
			task.setSysTaskImportance(param.get("sysTaskImportance")+"");
			task.setSysTaskType(param.get("sysTaskType")+"");
			String sysTaskCalenderStart = param.get("sysTaskCalenderStart")+"";
			String sysTaskCalenderEnd = param.get("sysTaskCalenderEnd")+"";
			if (!sysTaskCalenderStart.equals("")) {
				SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				Date date = sdf.parse(sysTaskCalenderStart);
				task.setSysTaskCalenderStart(date);
			}
			if (!sysTaskCalenderEnd.equals("")) {
				SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
				Date date = sdf.parse(sysTaskCalenderEnd);
				task.setSysTaskCalenderEnd(date);
			}
			task.setSysTaskCreateTime(new Date());
			sysTaskMapper.insert(task);
		}
		
		return task.getSysTaskId()+"";
	}
	
	@RequestMapping("/querySysTask")
	public @ResponseBody List<SysTask> querySysTask(HttpServletRequest request) throws Exception{
		//String userId = request.getSession().getAttribute("userid")+"";
		
		SysTaskExample example = new SysTaskExample();
//		example.setOrderByClause("sys_task_create_time ASC");
		List<SysTask> taskList = sysTaskMapper.selectByExample(example);
		return taskList;
	}
	/**
	 * 通过id查询任务
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySysTaskById")
	public @ResponseBody SysTask querySysTaskById(HttpServletRequest request) throws Exception{
		//String userId = request.getSession().getAttribute("userid")+"";
		String sysTaskId=request.getParameter("sysTaskId")+"";
		
		SysTaskExample example = new SysTaskExample();
		example.or().andSysTaskIdEqualTo(Long.parseLong(sysTaskId));
		SysTask task = sysTaskMapper.selectByExample(example).get(0);
		return task;
	}
	
	/**
	 * 查询新建任务
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySysTask1")
	public @ResponseBody List<SysTask> querySysTask1(HttpServletRequest request) throws Exception{
		//String userId = request.getSession().getAttribute("userid")+"";
		String types = request.getParameter("types");
		
		SysTaskExample example = new SysTaskExample();
		if (types.equals("all")) {
			example.or().andSysTaskStatusEqualTo("0").andSysTaskIdentifierEqualTo("unconnected");
		}else {
			List<String> values = new ArrayList<String>();
			String[] aa =  types.split(",");
			for (int i = 0; i < aa.length; i++) {
				values.add(aa[i]);
			}
			example.or().andSysTaskStatusEqualTo("0").andSysTaskIdentifierEqualTo("unconnected").andSysTaskTypeIn(values);
		}
		
		example.setOrderByClause("sys_task_create_time DESC");
		List<SysTask> taskList = sysTaskMapper.selectByExample(example);
		for (int i = 0; i < taskList.size(); i++) {
			SysTask sysTask = taskList.get(i);
			String formId = sysTask.getSysTaskFormid();
			if (formId!=null && !formId.equals("")) {
				SysFormWhereExample example1 = new SysFormWhereExample();
				example1.or().andFormWhereFormDefIdEqualTo(new BigDecimal(formId));
				List<SysFormWhere> wheres = sysFormWhereMapper.selectByExample(example1);
				if (wheres.size()>0) {
					sysTask.setSysTaskFormid(formId+":"+wheres.get(0).getFormWhereValue());
				}
			}	
		}
		return taskList;
	}
	
	/**
	 * 查询表单过滤
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryFormWhere")
	public @ResponseBody SysFormWhere queryFormWhere(HttpServletRequest request) throws Exception{
		//String userId = request.getSession().getAttribute("userid")+"";
		String formId = request.getParameter("formId")+"";
		SysFormWhereExample example = new SysFormWhereExample();
		example.or().andFormWhereFormDefIdEqualTo(new BigDecimal(formId));
		SysFormWhere sysFormWhere = sysFormWhereMapper.selectByExample(example).get(0);
		return sysFormWhere;
	}
	
	/**
	 * 查询未分配日历任务
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySysTaskWithoutCalender")
	public @ResponseBody List<SysTask> querySysTaskWithoutCalender(HttpServletRequest request) throws Exception{
		//String userId = request.getSession().getAttribute("userid")+"";
		
		SysTaskExample example = new SysTaskExample();
		example.or().andSysTaskStatusEqualTo("0").andSysTaskIdentifierEqualTo("unconnected").andSysTaskCalenderStartIsNull();
		example.setOrderByClause("sys_task_create_time DESC");
		List<SysTask> taskList = sysTaskMapper.selectByExample(example);
		return taskList;
	}
	
	/**
	 * 查询进行中的任务
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryToDoTask")
	public @ResponseBody List<SysTask> queryToDoTask(HttpServletRequest request) throws Exception{
		String userId = request.getSession().getAttribute("userid")+"";
		String types = request.getParameter("types");
		
		SysTaskExample example = new SysTaskExample();
		SysTaskExample.Criteria criteria = example.createCriteria();
		criteria.andSysTaskStatusEqualTo("0").andSysTaskIdentifierEqualTo("todo");
		if (!types.equals("all")) {
			List<String> values = new ArrayList<String>();
			String[] aa =  types.split(",");
			for (int i = 0; i < aa.length; i++) {
				values.add(aa[i]);
			}
			criteria.andSysTaskTypeIn(values);
		}
		if (!userId.equals("1")) {
			criteria.andSysTaskCompleteUseridEqualTo(Long.parseLong(userId));
		}
		example.setOrderByClause("sys_task_create_time DESC");
		List<SysTask> taskList = sysTaskMapper.selectByExample(example);
		return taskList;
	}
	
	/**
	 * 查询已完成的任务
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryFinishTask")
	public @ResponseBody List<SysTask> queryFinishTask(HttpServletRequest request) throws Exception{
		//String userId = request.getSession().getAttribute("userid")+"";
		String types = request.getParameter("types");
		SysTaskExample example = new SysTaskExample();
		
		if (types.endsWith("all")) {
			example.or().andSysTaskStatusEqualTo("0").andSysTaskIdentifierEqualTo("finish");
		}else {
			List<String> values = new ArrayList<String>();
			String[] aa =  types.split(",");
			for (int i = 0; i < aa.length; i++) {
				values.add(aa[i]);
			}
			example.or().andSysTaskStatusEqualTo("0").andSysTaskIdentifierEqualTo("finish").andSysTaskTypeIn(values);
		}
		
		example.setOrderByClause("sys_task_create_time DESC");
		List<SysTask> taskList = sysTaskMapper.selectByExample(example);
		return taskList;
	}
	
	@RequestMapping("/deleteSysTask")
	public @ResponseBody String deleteSysTask(HttpServletRequest request) throws Exception{
		//String userId = request.getSession().getAttribute("userid")+"";
		String sysTaskId=request.getParameter("sysTaskId")+"";
		
		SysTaskExample example = new SysTaskExample();
		example.or().andSysTaskIdEqualTo(Long.parseLong(sysTaskId));
		sysTaskMapper.deleteByExample(example);
		return "0";
	}
	
	/**
	 * 改变任务状态
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/checkSysTask")
	public @ResponseBody String checkSysTask(HttpServletRequest request) throws Exception{
		//String userId = request.getSession().getAttribute("userid")+"";
		String sysTaskId=request.getParameter("sysTaskId")+"";
		
		SysTaskExample example = new SysTaskExample();
		example.or().andSysTaskIdEqualTo(Long.parseLong(sysTaskId));
		SysTask task = sysTaskMapper.selectByExample(example).get(0);
		if (task.getSysTaskStatus().equals("0")) {
			task.setSysTaskStatus("1");
		}else {
			task.setSysTaskStatus("0");
		}
		
		sysTaskMapper.updateByPrimaryKey(task);
		return "0";
	}
	
	
	/**
	 * 移动任务
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/moveSysTask")
	public @ResponseBody String moveSysTask(HttpServletRequest request) throws Exception{
		//String userId = request.getSession().getAttribute("userid")+"";
		String sysTaskId=request.getParameter("sysTaskId")+"";
		String parentUlId=request.getParameter("parentUlId")+"";
		
		SysTaskExample example = new SysTaskExample();
		example.or().andSysTaskIdEqualTo(Long.parseLong(sysTaskId));
		SysTask task = sysTaskMapper.selectByExample(example).get(0);
		if (parentUlId.equals("toDoTaskList")) {
			task.setSysTaskIdentifier("todo");
		}else if (parentUlId.equals("finishTaskList")) {
			task.setSysTaskIdentifier("finish");
		}else if (parentUlId.equals("allTaskList")) {
			task.setSysTaskIdentifier("unconnected");
		}
		
		sysTaskMapper.updateByPrimaryKey(task);
		return "0";
	}
	
	/**
	 * 移动任务
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addSysTaskCalender")
	public @ResponseBody String addSysTaskCalender(HttpServletRequest request) throws Exception{
		//String userId = request.getSession().getAttribute("userid")+"";
		String sysTaskId=request.getParameter("sysTaskId")+"";
		String sysTaskCalenderDate=request.getParameter("sysTaskCalenderDate")+"";
		
		SysTaskExample example = new SysTaskExample();
		example.or().andSysTaskIdEqualTo(Long.parseLong(sysTaskId));
		SysTask task = sysTaskMapper.selectByExample(example).get(0);
		SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd");
		Date date = sdf.parse(sysTaskCalenderDate);
		task.setSysTaskCalenderStart(date);
		
		sysTaskMapper.updateByPrimaryKey(task);
		return "0";
	}
	/**
	 * 保存会议任务
	 * @param request
	 * @param params
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveSysMeetingTask")
	public @ResponseBody String saveSysMeetingTask(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		String userId = request.getSession().getAttribute("userid")+"";
		Map param = params.getParam();
		
		SysMeetingTask meetingtask = new SysMeetingTask();
		String sysTaskId = param.get("sysTaskId")+"";
		String sysMeetingTaskId = param.get("sysMeetingTaskId")+"";
		if (sysMeetingTaskId!=null && !sysMeetingTaskId.equals("")) {
			SysMeetingTaskExample example = new SysMeetingTaskExample();
			example.or().andSysMeetingTaskIdEqualTo(Long.parseLong(sysMeetingTaskId));
			meetingtask = sysMeetingTaskMapper.selectByExample(example).get(0);
			
			meetingtask.setSysTaskTitle(param.get("sysTaskTitle")+"");
			meetingtask.setSysMeetingTaskHostid(param.get("sysMeetingTaskHostid")+"");
			meetingtask.setSysMeetingTaskParticipants(param.get("sysMeetingTaskParticipants")+"");
			meetingtask.setSysMeetingTaskChildren(param.get("sysMeetingTaskChildren")+"");
			String sysMeetingTaskStart = param.get("sysMeetingTaskStart")+"";
			String sysMeetingTaskEnd = param.get("sysMeetingTaskEnd")+"";
			if (!sysMeetingTaskStart.equals("")) {
				SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd hh:mm");
				Date date = sdf.parse(sysMeetingTaskStart);
				meetingtask.setSysMeetingTaskStart(date);
			}
			if (!sysMeetingTaskEnd.equals("")) {
				SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd hh:mm");
				Date date = sdf.parse(sysMeetingTaskEnd);
				meetingtask.setSysMeetingTaskEnd(date);
			}
			sysMeetingTaskMapper.updateByPrimaryKey(meetingtask);
			meetingtask.getSysTaskId();
		}else {
			meetingtask.setSysTaskId(Long.parseLong(sysTaskId));
			meetingtask.setSysTaskTitle(param.get("sysTaskTitle")+"");
			meetingtask.setSysMeetingTaskHostid(param.get("sysMeetingTaskHostid")+"");
			meetingtask.setSysMeetingTaskParticipants(param.get("sysMeetingTaskParticipants")+"");
			meetingtask.setSysMeetingTaskChildren(param.get("sysMeetingTaskChildren")+"");
			String sysMeetingTaskStart = param.get("sysMeetingTaskStart")+"";
			String sysMeetingTaskEnd = param.get("sysMeetingTaskEnd")+"";
			if (!sysMeetingTaskStart.equals("")) {
				SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd hh:mm");
				Date date = sdf.parse(sysMeetingTaskStart);
				meetingtask.setSysMeetingTaskStart(date);
			}
			if (!sysMeetingTaskEnd.equals("")) {
				SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd hh:mm");
				Date date = sdf.parse(sysMeetingTaskEnd);
				meetingtask.setSysMeetingTaskEnd(date);
			}
			meetingtask.setSysTaskCreateUserid(Long.parseLong(userId));
			meetingtask.setSysTaskCreateTime(new Date());
			sysMeetingTaskMapper.insert(meetingtask);
		}
		
		return meetingtask.getSysTaskId()+"";
	}
	
	
	/**
	 * 通过任务id查询会议任务
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/querySysMeetingTaskByTaskId")
	public @ResponseBody SysMeetingTask querySysMeetingTaskByTaskId(HttpServletRequest request) throws Exception{
		String sysTaskId=request.getParameter("sysTaskId")+"";
		SysMeetingTaskExample example = new SysMeetingTaskExample();
		example.or().andSysTaskIdEqualTo(Long.parseLong(sysTaskId));
		SysMeetingTask task = sysMeetingTaskMapper.selectByExampleWithBLOBs(example).get(0);
		return task;
	}
	
	/**
	 * 通过任务id查询会议任务
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveUserIdsByTaskId")
	public @ResponseBody SysMeetingTask saveUserIdsByTaskId(HttpServletRequest request) throws Exception{
		String sysTaskId=request.getParameter("sysTaskId")+"";
		String type=request.getParameter("type")+"";
		String userIds=request.getParameter("userIds")+"";
		SysMeetingTaskExample example = new SysMeetingTaskExample();
		example.or().andSysTaskIdEqualTo(Long.parseLong(sysTaskId));
		SysMeetingTask task = sysMeetingTaskMapper.selectByExampleWithBLOBs(example).get(0);
		if (type.equals("host")) {
			String sysMeetingTaskParticipants = task.getSysMeetingTaskParticipants();
			if (sysMeetingTaskParticipants==null || sysMeetingTaskParticipants=="") {
				task.setSysMeetingTaskParticipants(userIds);
			}else{
				sysMeetingTaskParticipants = ","+sysMeetingTaskParticipants;
				String[] useridArr = userIds.split(",");
				for (int i = 0; i < useridArr.length; i++) {
					if (sysMeetingTaskParticipants.contains(","+useridArr[i]+",")) {
						continue;
					}else {
						sysMeetingTaskParticipants += useridArr[i]+",";
					}
				}
				task.setSysMeetingTaskParticipants(sysMeetingTaskParticipants.substring(1, sysMeetingTaskParticipants.length()));
			}
			String sysMeetingTaskHostid = task.getSysMeetingTaskHostid();
			if (sysMeetingTaskHostid==null || sysMeetingTaskHostid=="") {
				task.setSysMeetingTaskHostid(userIds);
			}else{
				sysMeetingTaskHostid = ","+task.getSysMeetingTaskHostid();
				String[] useridArr = userIds.split(",");
				for (int i = 0; i < useridArr.length; i++) {
					if (sysMeetingTaskHostid.contains(","+useridArr[i]+",")) {
						continue;
					}else {
						sysMeetingTaskHostid += useridArr[i]+",";
					}
				}
				task.setSysMeetingTaskHostid(sysMeetingTaskHostid.substring(1, sysMeetingTaskHostid.length()));
			}
		}else {
			String sysMeetingTaskParticipants = task.getSysMeetingTaskParticipants();
			if (sysMeetingTaskParticipants==null || sysMeetingTaskParticipants=="") {
				task.setSysMeetingTaskParticipants(userIds);
			}else{
				sysMeetingTaskParticipants = ","+sysMeetingTaskParticipants;
				String[] useridArr = userIds.split(",");
				for (int i = 0; i < useridArr.length; i++) {
					if (sysMeetingTaskParticipants.contains(","+useridArr[i]+",")) {
						continue;
					}else {
						sysMeetingTaskParticipants += useridArr[i]+",";
					}
				}
				task.setSysMeetingTaskParticipants(sysMeetingTaskParticipants.substring(1, sysMeetingTaskParticipants.length()));
			}
		}
		sysMeetingTaskMapper.updateByPrimaryKeyWithBLOBs(task);
		
		return task;
	}
	
	/**
	 * 通过用户id查询用户
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryUsersByUserIds")
	public @ResponseBody List<SysUser> queryUsersByUserIds(HttpServletRequest request) throws Exception{
		String userIds=request.getParameter("userIds")+"";
		List<Integer> values = new ArrayList<Integer>();
		String[] useridArr = userIds.split(",");
		for (int i = 0; i < useridArr.length; i++) {
			values.add(Integer.valueOf(useridArr[i]));
		}
		SysUserExample example = new SysUserExample();
		example.or().andUserIdIn(values);
		List<SysUser> users = sysUserMapper.selectByExample(example);
		return users;
	}
	
	/**
	 * 查询项目计划
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/queryPmPlans")
	public @ResponseBody List<Map> queryPmPlans(HttpServletRequest request) throws Exception{
		String userIds=request.getParameter("userIds")+"";
		
		PmPlanExample example = new PmPlanExample();
		List<PmPlan> palns = pmPlanMapper.selectByExample(example);
		
		PmPlanExample example1 = new PmPlanExample();
		example1.or().andPIdEqualTo(0);
		List<PmPlan> rootPalns = pmPlanMapper.selectByExample(example1);
		List<Map> datas = new ArrayList<Map>();
		
		List<PmPlan> palnDatas = new ArrayList<PmPlan>();
		for (int i = 0; i < rootPalns.size(); i++) {
			palnDatas.add(rootPalns.get(i));
			palnDatas = getRealPalns(rootPalns.get(i),palns,palnDatas);
		}
		
		for (int i = 0; i < palnDatas.size(); i++) {
			Map obj= new HashMap();
			String psProStage = palnDatas.get(i).getPsProStage();
			String[] aa=psProStage.split("\\.");
			obj.put("assigs", palnDatas.get(i).getPsResources());//参与者
			obj.put("code", "");
			obj.put("canWrite", "true");
			obj.put("name",  palnDatas.get(i).getPsJobcontent());
			obj.put("collapsed", "false");
			obj.put("duration", (palnDatas.get(i).getPsEnddate().getTime()-palnDatas.get(i).getPsStartdate().getTime())/86400000);
			obj.put("start", palnDatas.get(i).getPsStartdate().getTime());
			if (i==0) {
				obj.put("startIsMilestone","true");
			}else {
				obj.put("startIsMilestone","false");
			}
			obj.put("end", palnDatas.get(i).getPsEnddate().getTime());
			obj.put("endIsMilestone", "false");
			obj.put("hasChild", "true");
			obj.put("id", palnDatas.get(i).getProjectscheduleId());
			obj.put("psProId", palnDatas.get(i).getPsProId());
			obj.put("psProStage", palnDatas.get(i).getPsProStage());
			obj.put("pid", palnDatas.get(i).getpId());
			obj.put("psResources", palnDatas.get(i).getPsResources());
			obj.put("psImple", palnDatas.get(i).getPsImple());
			obj.put("psUser", palnDatas.get(i).getPsUser());
			obj.put("psWorktime", palnDatas.get(i).getPsWorktime());
			obj.put("level", aa.length-2);
			obj.put("status", "STATUS_ACTIVE");
			datas.add(obj);
		}
		return datas;
	}
	
	public List<PmPlan> getRealPalns(PmPlan root,List<PmPlan> palns,List<PmPlan> palnDatas) {	
		for (int i = 0; i < palns.size(); i++) {
			if (root.getProjectscheduleId()==palns.get(i).getpId()) {
				palnDatas.add(palns.get(i));
				getRealPalns(palns.get(i),palns,palnDatas);
			}
		}
		return palnDatas;
	}
	
	/**
	 * 保存项目计划
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/savePmPlans")
	public @ResponseBody List<SysUser> savePmPlans(HttpServletRequest request, @RequestBody List<Map> datas) throws Exception{
		for (int i = 0; i < datas.size(); i++) {
			PmPlan plan = new PmPlan();
			Map obj = datas.get(i);
			String id = obj.get("id")+"";
			String pid = obj.get("pid")+"";
			
			plan.setPsProId(Integer.parseInt(obj.get("psProId")+""));
			plan.setPsProStage(obj.get("psProStage")+"");
			if (pid.equals("")) {
				
			}else {
				plan.setpId(Integer.parseInt(obj.get("pid")+""));
			}
			plan.setPsResources(obj.get("psResources")+"");
			plan.setPsImple(obj.get("psImple")+"");
			plan.setPsWorktime(Integer.parseInt(obj.get("duration")+""));
			plan.setPsJobcontent(obj.get("name")+"");
			
			String start = obj.get("start")+"";
			String end = obj.get("end")+"";
			if (!start.equals("")) {
				long lt = new Long(start);
				Date psStartdate = new Date(lt);
				plan.setPsStartdate(psStartdate);
			}
			
			if (!end.equals("")) {
				long lt = new Long(end);
				Date psEnddate = new Date(lt);
				plan.setPsEnddate(psEnddate);
			}
	       
			if (id.contains("_")) {
				pmPlanMapper.insert(plan);
			}else {
				plan.setProjectscheduleId(Integer.parseInt(id));
				pmPlanMapper.updateByPrimaryKey(plan);
			}
		}
		return null;
	}
	
	
	@RequestMapping("/querySystemTimer")
	public @ResponseBody ResultMapNew querySystemSource(HttpServletRequest request, @RequestBody CardformInitDataParams params) throws Exception{
		Map filter = params.getFilter();
		String offset = params.getOffset();
		String limit = params.getLimit();
		//Map paramsMap = params.getParamsMap();
		Pager page = params.getPage();
		page = new Pager();
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		
		String sysParamType = (String) filter.get("sysParamType");
		String wheres="";
		if (sysParamType!=null && sysParamType!="") {
			wheres += " and o.SYS_PARAM_TYPE = '"+sysParamType+"' ";
		}
		String searchValue = (String) filter.get("searchValue");
		if (searchValue!=null && searchValue!="") {
			wheres += " and ( o.SYS_PARAM_ENTRY like "+" '%"+searchValue+"%' "+
					  "or o.SYS_PARAM_CODE like "+" '%"+searchValue+"%' )";
		}
		
		String sql = "select * from sys_timer where 1=1 ";
		List<Map> schemes = MybatisUtil.queryList("runtime.selectSql", sql);
		
		ResultMapNew resultMap=new ResultMapNew();
		
		List<Map> schemeList = new ArrayList<Map>();
		int end = 0;
		if (page.getStart()+page.getLimt()>schemes.size()) {
			end = schemes.size();
		}else {
			end = page.getStart()+page.getLimt();
		}
		
		for (int i = page.getStart(); i < end; i++) {
			schemeList.add(schemes.get(i));
		}

		resultMap.setTotal(schemes.size());
		resultMap.setRows(schemeList);
		return resultMap;
	}
	
	@RequestMapping("/execSystemTimer")
	public @ResponseBody String execSystemTimer(HttpServletRequest request) throws Exception{
		String sysTimerId = request.getParameter("sysTimerId");
		String recode = "0";
		SysTimer timer = sysTimerMapper.selectByPrimaryKey(Long.parseLong(sysTimerId));
		if (timer.getSysTimerStatus()==null||timer.getSysTimerStatus()==0||timer.getSysTimerStatus()==2) {
			recode = TimerUtil.startTimer(timer);
			timer.setSysTimerStatus(1);
			sysTimerMapper.updateByPrimaryKey(timer);
		}else {
			recode = "1";
		}
		return recode;
	}
	
	@RequestMapping("/saveSysTimer")
	public @ResponseBody String saveSysTimer(HttpServletRequest request, @RequestBody SaveButtonParams params) throws Exception{
		
		Map param = params.getParam();
		int reCode = 0;
		
		String sysTimerId = (String) param.get("sysTimerId");
		SysTimer timer = new SysTimer();
		if (sysTimerId==null || sysTimerId=="") {
			String sysTimerStartTime = (String) param.get("sysTimerStartTime");
			String sysTimerEndTime = (String) param.get("sysTimerEndTime");
			SimpleDateFormat sdf =  new SimpleDateFormat( "yyyy-MM-dd HH:mm");
     		Date date=sdf.parse(sysTimerStartTime);
     		Date date1=sdf.parse(sysTimerEndTime);
     		timer.setSysTimerStartTime(date);
     		timer.setSysTimerEndTime(date1);
			timer.setSysTimerName((String) param.get("sysTimerName"));
			timer.setSysTimerType((String) param.get("sysTimerType"));
			timer.setSysTimerExecType((String) param.get("sysTimerExecType"));
			timer.setSysTimerIsRepeat((String) param.get("sysTimerIsRepeat"));
			timer.setSysTimerRepeatType((String) param.get("sysTimerRepeatType"));
			timer.setSysTimerRepeatValue(Integer.parseInt((String) param.get("sysTimerRepeatValue")));
			timer.setSysTimerDelayedType((String) param.get("sysTimerDelayedType"));
			timer.setSysTimerDelayedValue((String) param.get("sysTimerDelayedValue"));
			//timer.setSysTimerExecSqlId(Integer.parseInt((String) param.get("sysTimerExecSqlId")));
			reCode = sysTimerMapper.insert(timer);
		}else {
			timer.setSysTimerId(Long.valueOf(sysTimerId));
			String sysTimerStartTime = (String) param.get("sysTimerStartTime");
			String sysTimerEndTime = (String) param.get("sysTimerEndTime");
			SimpleDateFormat sdf =  new SimpleDateFormat( "yyyy-MM-dd HH:mm");
     		Date date=sdf.parse(sysTimerStartTime);
     		Date date1=sdf.parse(sysTimerEndTime);
     		timer.setSysTimerStartTime(date);
     		timer.setSysTimerEndTime(date1);
			timer.setSysTimerName((String) param.get("sysTimerName"));
			timer.setSysTimerType((String) param.get("sysTimerType"));
			timer.setSysTimerExecType((String) param.get("sysTimerExecType"));
			timer.setSysTimerIsRepeat((String) param.get("sysTimerIsRepeat"));
			timer.setSysTimerRepeatType((String) param.get("sysTimerRepeatType"));
			timer.setSysTimerRepeatValue(Integer.parseInt((String) param.get("sysTimerRepeatValue")));
			timer.setSysTimerDelayedType((String) param.get("sysTimerDelayedType"));
			timer.setSysTimerDelayedValue((String) param.get("sysTimerDelayedValue"));
			timer.setSysTimerExecSqlId(Integer.parseInt((String) param.get("sysTimerExecSqlId")));
			reCode = sysTimerMapper.updateByPrimaryKey(timer);
		}
		
		return reCode+"";
	}
	
	@RequestMapping("/queryTimerById")
	public @ResponseBody SysTimer queryTimerById(HttpServletRequest request) throws Exception{
		
		String sysTimerId = request.getParameter("sysTimerId");
		SysTimerExample example = new SysTimerExample();
		example.or().andSysTimerIdEqualTo(Long.valueOf(sysTimerId));
		SysTimer timer = sysTimerMapper.selectByExample(example).get(0);
		return timer;
	}
	
	@RequestMapping("/stopTimerById")
	public @ResponseBody SysTimer stopTimerById(HttpServletRequest request) throws Exception{
		String sysTimerId = request.getParameter("sysTimerId");
		String timerType = request.getParameter("timerType");
		SysTimerExample example = new SysTimerExample();
		example.or().andSysTimerIdEqualTo(Long.valueOf(sysTimerId));
		SysTimer timer = sysTimerMapper.selectByExample(example).get(0);
		Thread thread = ThreadUtil.findThreadByName(timer.getSysTimerName());
		if (timerType.equals("stop")) {
			thread.stop();
			timer.setSysTimerStatus(2);
			sysTimerMapper.updateByPrimaryKey(timer);
		}else if (timerType.equals("sleep")) {
			//thread.sleep(10000);
			timer.setSysTimerStatus(3);
			sysTimerMapper.updateByPrimaryKey(timer);
		}else{
			thread.run();
			timer.setSysTimerStatus(1);
			sysTimerMapper.updateByPrimaryKey(timer);
		}
		return timer;
	}
	
}
