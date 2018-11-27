package com.myehr.controller.question;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.ArrayList;
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

import com.myehr.common.mybatis.MybatisUtil;
import com.myehr.common.mybatis.Pager;
import com.myehr.common.util.FormConfigResultMap;
import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.common.util.MyEhrJDBCUtil;
import com.myehr.common.util.ResultMap;
import com.myehr.controller.form.parambean.CardformInitDataParams;
import com.myehr.controller.form.parambean.DictDataParams;
import com.myehr.mapper.act.checked.SysActCheckedPointMapper;
import com.myehr.mapper.activiti.ActReModelMapper;
import com.myehr.mapper.activiti.ActRuTaskMapper;
import com.myehr.mapper.activiti.expand.ActNodePropertiesExpandMapper;
import com.myehr.mapper.formmanage.question.SysExamAnswerMapper;
import com.myehr.mapper.formmanage.question.SysExamtemplateMapper;
import com.myehr.mapper.formmanage.question.SysExamtemplateQuestionMapper;
import com.myehr.mapper.formmanage.question.SysQuestionMapper;
import com.myehr.mapper.formmanage.question.SysQuestionOptionMapper;
import com.myehr.mapper.formmanage.question.TraAnswerMapper;
import com.myehr.mapper.sysuser.SysUserMapper;
import com.myehr.pojo.act.checked.SysActCheckedPoint;
import com.myehr.pojo.activiti.ActReModel;
import com.myehr.pojo.activiti.ActReModelExample;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpand;
import com.myehr.pojo.activiti.expand.ActNodePropertiesExpandExample;
import com.myehr.pojo.dict.SysDictType;
import com.myehr.pojo.formmanage.cache.UserObject;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigAndGrid;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.question.BatchObjids;
import com.myehr.pojo.formmanage.question.Examination_Answer;
import com.myehr.pojo.formmanage.question.QuestionColumnInfo;
import com.myehr.pojo.formmanage.question.SysExamAnswer;
import com.myehr.pojo.formmanage.question.SysExamAnswerExample;
import com.myehr.pojo.formmanage.question.SysExamtemplate;
import com.myehr.pojo.formmanage.question.SysExamtemplateExample;
import com.myehr.pojo.formmanage.question.SysExamtemplateQuestion;
import com.myehr.pojo.formmanage.question.SysExamtemplateQuestionExample;
import com.myehr.pojo.formmanage.question.SysPerScore;
import com.myehr.pojo.formmanage.question.SysQuestion;
import com.myehr.pojo.formmanage.question.SysQuestionExample;
import com.myehr.pojo.formmanage.question.SysQuestionExpand;
import com.myehr.pojo.formmanage.question.SysQuestionOption;
import com.myehr.pojo.formmanage.question.SysQuestionOptionExample;
import com.myehr.pojo.formmanage.question.TraAnswer;
import com.myehr.pojo.sysuser.SysUser;
import com.myehr.pojo.sysuser.SysUserExample;
import com.myehr.service.formmanage.form.ISysformconfigService;
import com.myehr.service.formmanage.runtime.IRuntimeCardFormService;

@Controller
@RequestMapping("/question")
public class questionController {
	
	@Autowired SysExamtemplateMapper sExamtemplateMapper;
	@Autowired SysExamtemplateQuestionMapper sExamtemplateQuestionMapper;
	@Autowired SysQuestionMapper sQuestionMapper;
	@Autowired private IRuntimeCardFormService runtimeService;
	@Autowired SysQuestionOptionMapper sQuestionOptionMapper;
	@Autowired SysExamAnswerMapper sAnswerMapper;
	@Autowired TraAnswerMapper tAnswerMapper;
	@Autowired SysUserMapper uMapper;
	@Autowired SysActCheckedPointMapper cPointMapper;
	@Autowired ActReModelMapper modelMapper;
	@Autowired ActNodePropertiesExpandMapper actNodePropertiesExpandMapper;
	@Autowired
	private ISysformconfigService sysformconfigService;
	@RequestMapping("/deleteTemplate")
	
	public @ResponseBody String deleteTemplate(HttpServletRequest request,@RequestBody List<SysExamtemplate> hrs) throws Exception {
		String reCode = "false";
		try {
			for (SysExamtemplate sysExampalte : hrs) {
				sExamtemplateMapper.deleteByPrimaryKey(sysExampalte.getId());
				
			}
			reCode="true";
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}

	}
	
	@RequestMapping("/loadQuestioninfoByID")
	public @ResponseBody SysExamtemplate loadQuestioninfoByID(HttpServletRequest request,@RequestBody SysExamtemplate exam) throws Exception{
		return sExamtemplateMapper.selectByPrimaryKey(exam.getId());
	}
	
	@RequestMapping("/updataQuestInfo")
	public @ResponseBody int updataQuestInfo(HttpServletRequest request,@RequestBody SysExamtemplate examtemplate) throws Exception{
		String userId = (String)request.getSession().getAttribute("userid").toString();
		if(checkQuestionCode(examtemplate.getCode(),new BigDecimal(examtemplate.getId()))==0){//编码不重复	
			examtemplate.setOperatorName(userId);
			examtemplate.setOperatorTime(new Date());
			sExamtemplateMapper.updateByPrimaryKey(examtemplate);
			return 1;
		}else if (checkQuestionCode(examtemplate.getCode(),new BigDecimal(examtemplate.getId()))==1) {
			return 0;
		} else {
			return 2;
		}
	}
	
	@RequestMapping("/findQuestionList")
	public @ResponseBody ResultMap findQuestionList(HttpServletRequest request) throws Exception{
		String templateId = request.getParameter("templateId");
		SysExamtemplateQuestionExample exam = new SysExamtemplateQuestionExample();
		exam.or().andTemplateidEqualTo(Integer.valueOf(templateId));
		List<SysExamtemplateQuestion> questions = sExamtemplateQuestionMapper.selectByExample(exam);
		ResultMap result = new ResultMap();
		List<Object> list_obj=new ArrayList<Object>();
		for (SysExamtemplateQuestion u : questions) {
			list_obj.add(u);
		}
		result.setRows(list_obj);  
		result.setTotal(questions.size());  
		return result;
	}
	
	@RequestMapping("/getQuestionName")
	public @ResponseBody String[] getQuestionName(HttpServletRequest request) throws Exception{
		String questionid = request.getParameter("questionid");
		SysQuestionExample example = new SysQuestionExample();
		example.or().andIdEqualTo(Integer.valueOf(questionid));
		//List<SysQuestion> questions = sQuestionMapper.selectByExample(example);
		String[] cname = {sQuestionMapper.selectByExample(example).get(0).getCname()};
		return  cname;
	}
	
	@RequestMapping("/saveChooseQuestions")
	public @ResponseBody String saveChooseQuestions(HttpServletRequest request) throws Exception{
		JSONArray jArray=GetRequestJsonUtils.getJsonArray(request);
		@SuppressWarnings("unchecked")
		List<SysQuestionExpand> questions = JSONArray.toList(jArray,new SysQuestionExpand(), new JsonConfig()); 		
		String templateId = request.getParameter("templateId");
		String userId = (String)request.getSession().getAttribute("userid").toString();
		SysExamtemplateQuestionExample example = new SysExamtemplateQuestionExample();
		example.or().andTemplateidEqualTo(Integer.valueOf(templateId));
		example.setOrderByClause("xorder");
		List<SysExamtemplateQuestion> oldList = sExamtemplateQuestionMapper.selectByExample(example);
		int num = 0;
		if (oldList.size()>0) {
			num = oldList.get(oldList.size()-1).getXorder();
		}
		try {
			for (SysQuestionExpand sysQuestion : questions) {
				num++;
				SysExamtemplateQuestion question = new SysExamtemplateQuestion();
				question.setTemplateid(Integer.valueOf(templateId));
				question.setQuestionid(sysQuestion.getSYSQUESTION_ID());
				question.setAmount(sysQuestion.getSYSQUESTION_AMOUNT());
				question.setXorder(num);
				question.setOperatorName(userId);
				question.setOperatorTime(new Date());
				sExamtemplateQuestionMapper.insert(question);
			}
			return "true";
		} catch (Exception e) {
			// TODO: handle exception
			return "flase";
		}
	}
	
	//checkQuestionCode检查试卷编码是否重复
	public int checkQuestionCode(String code,BigDecimal id) {
		SysExamtemplateExample example = new SysExamtemplateExample();
		example.or().andCodeEqualTo(code);
		List<SysExamtemplate> exams = sExamtemplateMapper.selectByExample(example);
		if (exams.size()==1) {
			if (id!=null&&exams.get(0).getId().intValue()==id.intValue()) {
				return 0;
			}else {
				return 1;
			}
		}else if (exams.size()>1) {
			return 2;
		}else {
			return 0;
		}
	}
	
	/**
	 * 查询数据
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("/cardformInitData")
	public @ResponseBody FormConfigResultMap  cardformInitData(HttpServletRequest request, @RequestBody CardformInitDataParams params ) throws Throwable {
		Map requestParam = params.getRequestParam();
		Map containerParam = params.getContainerParam();
		Map filter = params.getFilter();
		Map[] heightGrade = params.getHeightGrade();
		String pkId = params.getPkId();
		String formId = params.getFormId();
		String userIds = params.getUserIds();
		//String order = params.getOrder();
		String offset = params.getOffset();
		String limit = params.getLimit();
		Map paramsMap = params.getParamsMap();
		HttpSession session = request.getSession();
//		List<Map> heightGrade = null;
		UserObject user = new UserObject();
		String isView = "1";
		Pager page = params.getPage();
		page = new Pager();
		if(offset==null&&limit==null){
			
		}else {
			int start=Integer.parseInt(offset);
			page.setStart(start/Integer.parseInt(limit)+1); //不能设置为0
			page.setLimt(Integer.parseInt(limit));
		}
		String queryType = request.getParameter("queryType");
		System.out.println(session.getAttribute("userid"));
		String currentUserId = session.getAttribute("userid").toString();
		String userName = "";
		String templateId = request.getParameter("templateId");
		return runtimeService.cardFormInitData_Question(requestParam, filter, heightGrade, pkId, formId, currentUserId, page, user, isView, paramsMap, request,userIds,containerParam,queryType,templateId);
	}
	
	
	
	//searchOptionById
	@RequestMapping("/searchOptionById")
	public @ResponseBody List<Map<String,String>> searchOptionById(HttpServletRequest request) throws Exception{
		String questionId = request.getParameter("questionId");
		String userId = request.getParameter("userId");
		SysQuestionOptionExample example = new SysQuestionOptionExample();
		example.or().andQidEqualTo(Integer.valueOf(questionId));
		List<SysQuestionOption> options = sQuestionOptionMapper.selectByExample(example);
		List<Map<String,String>> rs = new ArrayList<Map<String,String>>();
		for (int i = 0; i < options.size(); i++) {
			int flag=0;
			Map<String,String> m1 = new HashMap<String,String>();
			if (flag == 0) {
				m1.put("text", options.get(i).getCname());
				m1.put("id", options.get(i).getId()+"");
				rs.add(m1);
			}	
		}
		return rs;
	}
	
	@RequestMapping("/saveAnswers")
	public @ResponseBody String[] saveAnswers(HttpServletRequest request,@RequestBody List<SysExamAnswer> answers) throws Exception{
		String userId = (String)request.getSession().getAttribute("userid").toString();
		String[] reCode = new String[2];
		if (answers!=null&&answers.size()>0) {
			SysExamAnswerExample examAnswerExample = new SysExamAnswerExample();
			examAnswerExample.or().andUserIdEqualTo(Integer.valueOf(userId)).andFormIdEqualTo(answers.get(0).getFormId());
			List<SysExamAnswer> examAnswers = sAnswerMapper.selectByExample(examAnswerExample);
			if (examAnswers.size()>0) {
				//该用户已提交过此问卷
				reCode[0]="error";
				reCode[1]="3";
				return reCode;
			} else {
				try {
					for (SysExamAnswer sysExamAnswer : answers) {
						sysExamAnswer.setUserId(Integer.valueOf(userId));
						sysExamAnswer.setDate(new Date());
						sAnswerMapper.insert(sysExamAnswer);
					}
					reCode[0]="success";
					reCode[1]="0";
					return reCode;
				} catch (Exception e) {
					// 答案提交异常
					reCode[0]="error";
					reCode[1]="1";
					return reCode;
				}
			}
		} else {
			//提交空卷
			reCode[0]="error";
			reCode[1]="2";
			return reCode;
		}
	}

	//searchOptionById
	@RequestMapping("/getAnswersByUserId")
	public @ResponseBody List<SysExamAnswer> getAnswersByUserId(HttpServletRequest request) throws Exception{
		String userId = request.getParameter("userId");
		String formId = request.getParameter("formId");
		SysExamAnswerExample example = new SysExamAnswerExample();
		example.or().andFormIdEqualTo(Integer.valueOf(formId)).andUserIdEqualTo(Integer.valueOf(userId));
		try {
			return sAnswerMapper.selectByExample(example);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	
	
	@RequestMapping("/saveData")
	public @ResponseBody Object saveData(HttpServletRequest request,@RequestBody SysPerScore score) throws Exception{
		String saveType = request.getParameter("saveType");
		Map map= new HashMap();
		String[] reCode = new String[2];
		String sql = "SELECT subiden FROM PER_PER360SCORER_REG where scoreman = "+score.getScoreManId();
		map = MybatisUtil.queryOne("runtime.selectSql", sql);
		String subiden = map.get("subiden")+"";
		if (subiden==""||subiden.equals("1")||subiden.equals("2")) {//后台控制,已提交问卷不能保存
			for (Map map1:score.getScoreList()) {
				String sql1 = "UPDATE PER_PER360SCORELIST_REG SET scoreReason= '"+map1.get("scoreReason")+"',score="+map1.get("score")+" WHERE id="+map1.get("id");
				map.put("updateSql", sql1);
				MybatisUtil.update("runtime.updateSql", map);
			}
			String sql2 = "UPDATE PER_PER360SCORER_REG SET score = "+score.getSum()+" where scoreman = "+score.getScoreManId()+" and objid="+score.getObjId();		
				map.put("updateSql", sql2);
				MybatisUtil.update("runtime.updateSql", map);
			String sql3 = "";
			if(saveType.equals("upup")){
				sql3 = "UPDATE PER_PER360SCORER_REG SET subiden = 3 where scoreman = "+score.getScoreManId()+" and objid="+score.getObjId();
			}else if(saveType.equals("quickSaveData")){
				sql3 = "UPDATE PER_PER360SCORER_REG SET subiden = 2 where scoreman = "+score.getScoreManId()+" and objid="+score.getObjId();
			}
				map.put("updateSql", sql3);
				MybatisUtil.update("runtime.updateSql", map);
			reCode[0]="success";
			reCode[1]="0";
			return reCode;
		}else{
			reCode[0]="fail";
			reCode[1]="1";
			return reCode;
		}
	}
	
	@RequestMapping("/saveBatchDatas")
	public @ResponseBody Object saveBatchDatas(HttpServletRequest request,@RequestBody List<SysPerScore> scores) throws Exception{
		String saveType = request.getParameter("saveType");
		Map map= new HashMap();
		String[] reCode = new String[2];
		for (SysPerScore score : scores) {
			String sql = "SELECT subiden FROM PER_PER360SCORER_REG where scoreman = "+score.getScoreManId();
			map = MybatisUtil.queryOne("runtime.selectSql", sql);
			String subiden = map.get("subiden")+"";
			if (subiden==""||subiden.equals("1")||subiden.equals("2")) {//后台控制,已提交问卷不能保存
				for (Map map1:score.getScoreList()) {
					String sql1 = "UPDATE PER_PER360SCORELIST_REG SET scoreReason= '"+map1.get("scoreReason")+"',score="+map1.get("score")+" WHERE id="+map1.get("id");
					map.put("updateSql", sql1);
					MybatisUtil.update("runtime.updateSql", map);
				}
				String sql2 = "UPDATE PER_PER360SCORER_REG SET score = "+score.getSum()+" where scoreman = "+score.getScoreManId()+" and objid="+score.getObjId();		
					map.put("updateSql", sql2);
					MybatisUtil.update("runtime.updateSql", map);
				String sql3 = "";
				if(saveType.equals("upup")){
					sql3 = "UPDATE PER_PER360SCORER_REG SET subiden = 3 where scoreman = "+score.getScoreManId()+" and objid="+score.getObjId();
				}else if(saveType.equals("quickSaveData")){
					sql3 = "UPDATE PER_PER360SCORER_REG SET subiden = 2 where scoreman = "+score.getScoreManId()+" and objid="+score.getObjId();
				}
					map.put("updateSql", sql3);
					MybatisUtil.update("runtime.updateSql", map);
			}
		}
		return null;
	}
	
	//searchOptionById
	@SuppressWarnings("unchecked")
	@RequestMapping("/getRegData")
	public @ResponseBody Object getRegData(HttpServletRequest request) throws Exception{
		//当评分人id为2
		String objid = request.getParameter("objid");
		String pid = request.getParameter("pid");
		String scoreMan = request.getParameter("scoreMan");
		String sql = "SELECT subiden FROM PER_PER360SCORER_REG where  scoreman = "+scoreMan+" and objid = "+objid+" and pid = "+pid;
		Map map1 = new HashMap();
		List<Map> maps = MybatisUtil.queryList("runtime.selectSql", sql);
		map1 = maps.get(0);
		String subiden = map1.get("subiden")+"";
		if (subiden.equals("null")||subiden.equals("1")) {//后台控制,已提交问卷不能保存
			String sql3 = "UPDATE PER_PER360SCORER_REG SET subiden = 2 where scoreman = "+scoreMan+" and objid = "+objid+" and pid = "+pid;	
			map1.put("updateSql", sql3);
			MybatisUtil.update("runtime.updateSql", map1);
		}
//			String sql1 = "SELECT B.COMPID,B.DEPID,B.EMPCODE,B.CNAME,A.pid,A.templateid,C.cname AS templateName,A.score,A.objid,A.objtype,D.subiden FROM PER_PER360OBJ_REG A LEFT JOIN EMP_EMPLOYEE B ON B.EMPID = A.objid LEFT JOIN PER_360TEMPLATE C ON A.templateid = C.id LEFT JOIN dbo.PER_PER360SCORER_REG D ON A.objid=D.scoreman WHERE A.objid = "+objid;
		String sql1 = "SELECT B.COMPID,B.DEPID,B.EMPCODE,B.CNAME,A.pid,A.templateid,C.cname AS templateName,A.score,A.objid,A.objtype,D.subiden,E.cname AS planName,E.term,E.cname +'-'+ CONVERT(varchar,E.term,101) AS CYCLE FROM PER_PER360OBJ_REG A LEFT JOIN EMP_EMPLOYEE B ON B.EMPID = A.objid LEFT JOIN PER_360TEMPLATE C ON A.templateid = C.id LEFT JOIN dbo.PER_PER360SCORER_REG D ON A.objid=D.scoreman LEFT JOIN PER_PER360_REG E ON E.id=a.pid WHERE A.objid = "+objid;
		Map map = new HashMap();
		try {
			List<Map> dataObject1 = MybatisUtil.queryList("runtime.selectSql", sql1);
			String sql2 = "SELECT C.cname,B.scorestander,B.targettype,B.weigth,D.subiden,A.* FROM PER_PER360SCORELIST_REG A LEFT JOIN PER_360TEMPLATE_TARGET B ON A.targetid = B.id LEFT JOIN PER_TARGET_360 C ON c.id=b.targetid LEFT JOIN dbo.PER_PER360SCORER_REG D ON A.scorer=D.scoreman  AND A.objid = D.objid  WHERE A.objid = "+objid+" AND A.scorer = "+scoreMan+" ORDER BY b.xorder;";

			List<Map> dataObject2 = MybatisUtil.queryList("runtime.selectSql", sql2);
			
			String sql3 = "SELECT B.COMPID,B.DEPID,B.EMPCODE,B.CNAME,A.subiden,C.cname AS relatName,O.cname AS compName,D.cname AS depName,A.* FROM PER_PER360SCORER_REG A LEFT JOIN EMP_EMPLOYEE B ON B.EMPID = A.scoreman LEFT JOIN PER_CONFIG_RELATION C ON C.id=A.relationid  LEFT JOIN ORG_COMPANY O ON O.compid=B.COMPID LEFT JOIN ORG_DEPARTMENT D ON d.depid=b.DEPID WHERE A.objid = "+objid+" AND A.scoreman ="+scoreMan;
			List<Map> dataObject3 = MybatisUtil.queryList("runtime.selectSql", sql3);
			map.put("data1", dataObject1.get(0));//被评人
			if (dataObject3!=null&&dataObject3.size()>0) {
				map.put("data2", dataObject3.get(0));//考评人
			} else {
				map.put("data2", null);//考评人
			}
			
			map.put("datas1", dataObject2);//考评内容
			return map;
		} catch (Exception e) {
			return null;
		}
	}
	
	
	//searchOptionById
	@SuppressWarnings("unchecked")
	@RequestMapping("/getExaminationDatas")
	public @ResponseBody Object getExaminationDatas(HttpServletRequest request) throws Exception{
		String userId = (String)request.getSession().getAttribute("userid").toString();
		//SysUser user = uMapper.selectByPrimaryKey(Integer.valueOf(userId));
		int empId = uMapper.selectByPrimaryKey(Integer.valueOf(userId)).getEmpId();
		String type =  request.getParameter("type");
		String scoreMan = request.getParameter("scoreMan");
		String planId = request.getParameter("planId");
		String sql = "SELECT QNTEMPLATEID FROM TRA_V_MYQUESTIONNAIRE where EMPID = "+empId+" AND PLANID = "+planId;
		Map map1 = new HashMap();
		map1 = MybatisUtil.queryOne("runtime.selectSql", sql);
		String templateId = (String) map1.get("QNTEMPLATEID");
		String sql0 = "SELECT * FROM SYS_EXAMTEMPLATE WHERE ID = "+templateId;
		String sql1 = "SELECT SYS_QUESTION.* from SYS_EXAMTEMPLATE_QUESTION LEFT JOIN SYS_QUESTION ON SYS_EXAMTEMPLATE_QUESTION.QUESTIONID = SYS_QUESTION.ID WHERE SYS_QUESTION.XTYPE = '1111' AND SYS_EXAMTEMPLATE_QUESTION.templateid = "+templateId+" ORDER BY SYS_EXAMTEMPLATE_QUESTION.XORDER";
		String sql2 = "SELECT SYS_QUESTION.* from SYS_EXAMTEMPLATE_QUESTION LEFT JOIN SYS_QUESTION ON SYS_EXAMTEMPLATE_QUESTION.QUESTIONID = SYS_QUESTION.ID WHERE SYS_QUESTION.XTYPE = '2222' AND SYS_EXAMTEMPLATE_QUESTION.templateid = "+templateId+" ORDER BY SYS_EXAMTEMPLATE_QUESTION.XORDER";
		String sql3 = "SELECT SYS_QUESTION.* from SYS_EXAMTEMPLATE_QUESTION LEFT JOIN SYS_QUESTION ON SYS_EXAMTEMPLATE_QUESTION.QUESTIONID = SYS_QUESTION.ID WHERE SYS_QUESTION.XTYPE = '3333' AND SYS_EXAMTEMPLATE_QUESTION.templateid = "+templateId+" ORDER BY SYS_EXAMTEMPLATE_QUESTION.XORDER";
		String sql4 = "SELECT SYS_QUESTION.* from SYS_EXAMTEMPLATE_QUESTION LEFT JOIN SYS_QUESTION ON SYS_EXAMTEMPLATE_QUESTION.QUESTIONID = SYS_QUESTION.ID WHERE SYS_QUESTION.XTYPE = '4444' AND SYS_EXAMTEMPLATE_QUESTION.templateid = "+templateId+" ORDER BY SYS_EXAMTEMPLATE_QUESTION.XORDER";
		Map map = new HashMap();
		try {
			Map examinationInfo = MybatisUtil.queryOne("runtime.selectSql", sql0);
			List<Map> dataObject1 = MybatisUtil.queryList("runtime.selectSql", sql1);
			List<Map> dataObject2 = MybatisUtil.queryList("runtime.selectSql", sql2);
			List<Map> dataObject3 = MybatisUtil.queryList("runtime.selectSql", sql3);
			List<Map> dataObject4 = MybatisUtil.queryList("runtime.selectSql", sql4);
			map.put("examinationInfo", examinationInfo);//试卷基础信息
			map.put("single_datas", dataObject1);//试卷内容_单选
			map.put("multiple_datas", dataObject2);//试卷内容_多选
			map.put("discuss_datas", dataObject3);//试卷内容_问答
			map.put("star_datas", dataObject4);//试卷内容_星条
			return map;
		} catch (Exception e) {
			return null;
		}
	}
	
	@RequestMapping("/saveExaminationAnswer")
	public @ResponseBody String[] saveExaminationAnswer(HttpServletRequest request,@RequestBody List<TraAnswer> answers) throws Exception{
		String userId = (String)request.getSession().getAttribute("userid").toString();
		String empId = uMapper.selectByPrimaryKey(Integer.valueOf(userId)).getEmpId()+"";
		String planId = request.getParameter("planId");
		String[] reCode = new String[2];
		if (answers!=null&&answers.size()>0) {
			String sql = "SELECT valid FROM TRA_V_MYQUESTIONNAIRE where EMPID = "+empId+" AND PLANID = "+planId ;
			String sql0 = "SELECT * FROM TRA_V_MYQUESTIONNAIRE where EMPID = "+empId+" AND PLANID = "+planId;
			String sql1 = "update TRA_QNPARTICIPANT set VALID=0 where empid="+empId+" and planid="+planId;
			Map map1 = new HashMap();
			map1 = MybatisUtil.queryOne("runtime.selectSql", sql);
			Map map2 = new HashMap();
			map2 = MybatisUtil.queryOne("runtime.selectSql", sql0);
			String num = (String) map1.get("valid");
			if (num!=null&&num.equals("0")) {
				//该用户已提交过此问卷
				reCode[0]="error";
				reCode[1]="3";
				return reCode;
			} else {
				try {
					String QNTEMPLATEID = (String)map2.get("QNTEMPLATEID");
					for(TraAnswer answer : answers) {
						answer.setEmpid(empId);
						answer.setRegby(userId);
						answer.setPlanid(Integer.valueOf(planId));
						answer.setQntemplateid(QNTEMPLATEID);
						answer.setRegtime(new Date());
						Examination_Answer isAnswer = isAnswer(answer);
						answer.setAmount(isAnswer.getQAmount());
						if((isAnswer.getQtype().equals("1111")||isAnswer.getQtype().equals("2222"))){
							if(isAnswer.getQscore().intValue()!=0){
								answer.setIsanswer("Y");
							}else {
								answer.setIsanswer("N");
							}
							answer.setScore(isAnswer.getQscore());
						}
						tAnswerMapper.insert(answer);
						
						Map map = new HashMap();
						map.put("updateSql", sql1);
						MybatisUtil.update("runtime.updateSql", map);
					}

					String[] tempSqls = new String[1];
					tempSqls[0] = "CALL TRA_SP_BEFORESCORE('"+planId+"','"+userId+"',?)";//CALL ORG_SP_COMPVALID([c:主键_20810],[s:userId],?)
					MyEhrJDBCUtil.execPrepare(MybatisUtil.getConnection(),tempSqls[0]);
					reCode[0]="success";
					reCode[1]="0";
					return reCode;
				} catch (Exception e) {
					// 答案提交异常
					reCode[0]="error";
					reCode[1]="1";
					return reCode;
				}
			}
		} else {
			//提交空卷
			reCode[0]="error";
			reCode[1]="2";
			return reCode;
		}
	}
	
	//判断答案是否正确,返回得分情况(单选和多选)
	private Examination_Answer isAnswer(TraAnswer answer) {
		// TODO Auto-generated method stub
		Examination_Answer eAnswer = new Examination_Answer();
		int qid = Integer.valueOf(answer.getQid());
		SysQuestion question = sQuestionMapper.selectByPrimaryKey(qid);
		eAnswer.setQAmount(question.getAmount());
		if (question.getXtype()==1111||question.getXtype()==2222) {
			String answerByEmp = answer.getAnswer();//提交的答案
			SysQuestionOptionExample example = new SysQuestionOptionExample();
			example.or().andQidEqualTo(qid).andIsanswerEqualTo(1);
			List<SysQuestionOption> qOptions = sQuestionOptionMapper.selectByExample(example);
			if (qOptions.size()>1) {//多选
				String answerByStand = "";
				for (int i = 0; i < qOptions.size(); i++) {
					if (i==0) {
						answerByStand = qOptions.get(i).getId()+"";
					}else {
						answerByStand += ","+qOptions.get(i).getId()+"";
					}
				}
				if (answerByStand.equals(answerByEmp)) {//正确
					eAnswer.setQtype("2222");
					eAnswer.setQscore(question.getAmount());
				} else {//错误
					eAnswer.setQtype("2222");
					eAnswer.setQscore(new BigDecimal(0));
				}
			} else {//单选
				if (qOptions.get(0).getId().toString().equals(answerByEmp)) {//正确
					eAnswer.setQtype("1111");
					eAnswer.setQscore(question.getAmount());
				} else {//错误
					eAnswer.setQtype("1111");
					eAnswer.setQscore(new BigDecimal(0));
				}
			}
		} else {
			eAnswer.setQtype(question.getXtype()+"");
		}
		return eAnswer;
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/getExaminationAnswers")
	public @ResponseBody Object getExaminationAnswers(HttpServletRequest request) throws Exception{
		String empId =  request.getParameter("empId");
		String planId = request.getParameter("planId");
		String sql = "SELECT QNTEMPLATEID FROM TRA_V_MYQUESTIONNAIRE where EMPID = "+empId+" AND PLANID = "+planId;
		Map map1 = new HashMap();
		map1 = MybatisUtil.queryOne("runtime.selectSql", sql);
		String templateId = (String) map1.get("QNTEMPLATEID");
		String sql0 = "SELECT TRA_ANSWER.* FROM TRA_ANSWER LEFT JOIN SYS_QUESTION ON TRA_ANSWER.QID=SYS_QUESTION.ID  WHERE TRA_ANSWER.EMPID = "+empId+" AND TRA_ANSWER.PLANID = "+planId+" AND SYS_QUESTION.XTYPE = 1111";//提交的单选
		String sql1 = "SELECT TRA_ANSWER.* FROM TRA_ANSWER LEFT JOIN SYS_QUESTION ON TRA_ANSWER.QID=SYS_QUESTION.ID  WHERE TRA_ANSWER.EMPID = "+empId+" AND TRA_ANSWER.PLANID = "+planId+" AND SYS_QUESTION.XTYPE = 2222";//提交的多选
		String sql2 = "SELECT TRA_ANSWER.* FROM TRA_ANSWER LEFT JOIN SYS_QUESTION ON TRA_ANSWER.QID=SYS_QUESTION.ID  WHERE TRA_ANSWER.EMPID = "+empId+" AND TRA_ANSWER.PLANID = "+planId+" AND SYS_QUESTION.XTYPE = 3333";//提交的问答
		String sql3 = "SELECT TRA_ANSWER.* FROM TRA_ANSWER LEFT JOIN SYS_QUESTION ON TRA_ANSWER.QID=SYS_QUESTION.ID  WHERE TRA_ANSWER.EMPID = "+empId+" AND TRA_ANSWER.PLANID = "+planId+" AND SYS_QUESTION.XTYPE = 4444";//提交的星条
		String sql4 = "SELECT SYS_QUESTION_OPTION.* FROM TRA_ANSWER LEFT JOIN SYS_QUESTION_OPTION ON SYS_QUESTION_OPTION.QID=TRA_ANSWER.QID LEFT JOIN SYS_QUESTION ON TRA_ANSWER.QID=SYS_QUESTION.ID WHERE TRA_ANSWER.EMPID = "+empId+" AND TRA_ANSWER.PLANID = "+planId+" AND SYS_QUESTION_OPTION.ISANSWER = 1 ";//单多选标准答案
		String sql5 = "SELECT SYS_QUESTION_OPTION.* FROM TRA_ANSWER LEFT JOIN SYS_QUESTION_OPTION ON SYS_QUESTION_OPTION.QID=TRA_ANSWER.QID LEFT JOIN SYS_QUESTION ON TRA_ANSWER.QID=SYS_QUESTION.ID WHERE TRA_ANSWER.EMPID = "+empId+" AND TRA_ANSWER.PLANID = "+planId+" AND SYS_QUESTION.XTYPE=3333 ";//问答标准答案
		Map map = new HashMap();
		try {
			List<Map> answerByEmp_sin = MybatisUtil.queryList("runtime.selectSql", sql0);
			List<Map> answerByEmp_mult = MybatisUtil.queryList("runtime.selectSql", sql1);
			List<Map> answerByEmp_dis = MybatisUtil.queryList("runtime.selectSql", sql2);
			List<Map> answerByEmp_star = MybatisUtil.queryList("runtime.selectSql", sql3);
			List<Map> answerByStand_choose = MybatisUtil.queryList("runtime.selectSql", sql4);
			List<Map> answerByStand_dis = MybatisUtil.queryList("runtime.selectSql", sql5);
			map.put("answerByEmp_sin", answerByEmp_sin);
			map.put("answerByEmp_mult", answerByEmp_mult);
			map.put("answerByEmp_dis", answerByEmp_dis);
			map.put("answerByEmp_star", answerByEmp_star);
			map.put("answerByStand_choose", answerByStand_choose);
			map.put("answerByStand_dis", answerByStand_dis);
			return map;
		} catch (Exception e) {
			return null;
		}
	}
	
	@RequestMapping("/findCheckedPointById")
	public @ResponseBody Object findCheckedPointById(HttpServletRequest request) throws Exception{
		String id = request.getParameter("id");
		String userId = (String)request.getSession().getAttribute("userid").toString();
		String sql = "select SYS_ACT_CHECKED_POINT.ID AS SYSACTCHECKEDPOINT_ID,SYS_ACT_CHECKED_POINT.CHECKED_REQUIRE AS SYSACTCHECKEDPOINT_CHECKED_REQUIRE,SYS_ACT_CHECKED_POINT.CHECKED_CONTENT AS SYSACTCHECKEDPOINT_CHECKED_CONTENT,SYS_ACT_CHECKED_POINT.IS_FILE AS SYSACTCHECKEDPOINT_IS_FILE,SYS_ACT_CHECKED_POINT.CREATER_TIME AS SYSACTCHECKEDPOINT_CREATER_TIME,SYS_ACT_CHECKED_POINT.CREATER_NAME AS SYSACTCHECKEDPOINT_CREATER_NAME,SYS_ACT_CHECKED_POINT.OPERATOR_TIME AS SYSACTCHECKEDPOINT_OPERATOR_TIME,SYS_ACT_CHECKED_POINT.OPERATOR_NAME AS SYSACTCHECKEDPOINT_OPERATOR_NAME,SYS_ACT_CHECKED_POINT.DUTY_TYPE AS SYSACTCHECKEDPOINT_DUTY_TYPE,SYS_ACT_CHECKED_POINT.CONTROL_TYPE AS SYSACTCHECKEDPOINT_CONTROL_TYPE ,SYS_ACT_CHECKED_POINT.IS_REQUIRE AS SYSACTCHECKEDPOINT_IS_REQUIRE from SYS_ACT_CHECKED_POINT WHERE ID = "+id;
		Map map = MybatisUtil.queryOne("runtime.selectSql", sql);
		map.put("SYSACTCHECKEDPOINT_OPERATOR_NAME", userId);
		map.put("SYSACTCHECKEDPOINT_OPERATOR_TIME", new Date());
		List<Map> result = new ArrayList<Map>();
		result.add(map);
		return result;
	}
	
	@RequestMapping("/findCheckedById")
	public @ResponseBody Object findCheckedById(HttpServletRequest request) throws Exception{
		String id = request.getParameter("id");
		String userId = (String)request.getSession().getAttribute("userid").toString();
		String sql = "SELECT	SYS_CHECKED_AND_NODE_RELATION.ID AS SYSCHECKEDANDNODERELATION_ID,	SYS_CHECKED_AND_NODE_RELATION.ACT_NODE_ID AS SYSCHECKEDANDNODERELATION_ACT_NODE_ID,	SYS_CHECKED_AND_NODE_RELATION.ACT_NODE_KEY AS SYSCHECKEDANDNODERELATION_ACT_NODE_KEY,	SYS_CHECKED_AND_NODE_RELATION.POWER AS SYSCHECKEDANDNODERELATION_POWER,	SYS_CHECKED_AND_NODE_RELATION.CHECKED_CODE AS SYSCHECKEDANDNODERELATION_CHECKED_CODE,	SYS_CHECKED_AND_NODE_RELATION.CHECKED_NAME AS SYSCHECKEDANDNODERELATION_CHECKED_NAME,	SYS_CHECKED_AND_NODE_RELATION.OPERATOR_TIME AS SYSCHECKEDANDNODERELATION_OPERATOR_TIME,	SYS_CHECKED_AND_NODE_RELATION.OPERATOR_NAME AS SYSCHECKEDANDNODERELATION_OPERATOR_NAME,SYS_CHECKED_AND_NODE_RELATION.CREATER_TIME AS SYSCHECKEDANDNODERELATION_CREATER_TIME,SYS_CHECKED_AND_NODE_RELATION.CREATER_NAME AS SYSCHECKEDANDNODERELATION_CREATER_NAME,SYS_CHECKED_AND_NODE_RELATION.DUTY_TYPE AS SYSCHECKEDANDNODERELATION_DUTY_TYPE FROM SYS_CHECKED_AND_NODE_RELATION where ID = "+id;
		Map map = MybatisUtil.queryOne("runtime.selectSql", sql);
		map.put("SYSCHECKEDANDNODERELATION_OPERATOR_NAME", userId);
		map.put("SYSCHECKEDANDNODERELATION_OPERATOR_TIME", new Date());
		List<Map> result = new ArrayList<Map>();
		result.add(map);
		return result;
	}
	
	@RequestMapping("/getActDataForChecked")
	public @ResponseBody Object getActDataForChecked(HttpServletRequest request) throws Exception{
		ActReModelExample example1=new ActReModelExample();
		List<ActReModel> models = modelMapper.selectByExample(example1);
		List<Map> datas = new ArrayList<Map>();
		Map mapRoot=new HashMap();
		mapRoot.put("expanded", false);
		mapRoot.put("isLeaf", false);
		mapRoot.put("isParent", false); 
		mapRoot.put("open", false);
		mapRoot.put("nodeName", "流程检查点管理树");
		mapRoot.put("id", "Root");
		mapRoot.put("nodeId", "Root");
		mapRoot.put("pid", "RootParent");
		mapRoot.put("ORG_DEL", "Root");
		datas.add(mapRoot);
		for (ActReModel model : models) {
			Map map=new HashMap();
			map.put("expanded", false);
			map.put("isLeaf", false);
			map.put("isParent", false); 
			map.put("open", false); 
			map.put("nodeName", model.getName());
			map.put("id", "model"+model.getId());
			map.put("nodeId", model.getId());
			map.put("pid", "Root");
			map.put("ORG_DEL", "Model");
			datas.add(map);
			ActNodePropertiesExpandExample example2 = new ActNodePropertiesExpandExample();
			example2.or().andActModelIdEqualTo(model.getId()+"").andActNodeNameNotEqualTo("\"\"").andActNodeNameNotEqualTo("");
			List<ActNodePropertiesExpand> nodes = actNodePropertiesExpandMapper.selectByExample(example2);
			for (ActNodePropertiesExpand actNodePropertiesExpand : nodes) {
				Map map2=new HashMap();
				map2.put("expanded", false);
				map2.put("isLeaf", false);
				map2.put("isParent", false); 
				map2.put("open", false); 
				map2.put("nodeName", actNodePropertiesExpand.getActNodeName());
				map2.put("id", "node"+actNodePropertiesExpand.getActNodePropertyExpandId());
				map2.put("nodeId", actNodePropertiesExpand.getActModelId()+"_"+actNodePropertiesExpand.getActNodeKey());
				map2.put("pid", model.getId());
				map2.put("ORG_DEL", "Node");
				datas.add(map2);
			}
		}
		return datas;
	}
	
	/**
	 * 获取评分表单字段
	 */
	@RequestMapping("/getQuestionsColumns")
	public @ResponseBody Object getQuestionsColumns(HttpServletRequest request,@RequestBody BatchObjids datas) throws Exception{
		String objId =  datas.getObjIds()[0];
		String scoreMan = request.getSession().getAttribute("empid")+"";
		String sql2 = "SELECT C.cname,C.code,B.weigth FROM PER_PER360SCORELIST_REG A JOIN PER_360TEMPLATE_TARGET B ON A.targetid = B.id JOIN PER_TARGET_360 C ON c.id=b.targetid JOIN dbo.PER_PER360SCORER_REG D ON A.scorer=D.scoreman JOIN EMP_EMPLOYEE e on e.EMPID = A.objid  AND A.objid = D.objid  WHERE A.objid = "+objId+" AND A.scorer = "+scoreMan+" ORDER BY b.xorder;";
		List<Map> dataObject2 = MybatisUtil.queryList("runtime.selectSql", sql2);
		List<Map> columns = new ArrayList<Map>();
		/*Map column0 = new HashMap();
		column0.put("field", "state");
		column0.put("align", "center");
		column0.put("checkbox", true);
		columns.add(column0);*/
		Map column1 = new HashMap();
		column1.put("title", "被评人ID");
		column1.put("field", "obj");
		column1.put("align", "center");
		column1.put("valign", "middle");
		column1.put("visible", false);
		columns.add(column1);
		Map column2 = new HashMap();
		column2.put("title", "被评人");
		column2.put("field", "cname");
		column2.put("align", "center");
		column2.put("valign", "middle");
		
		column2.put("colspan", 1);
		column2.put("rowspan", 1);
		columns.add(column2);
		for (Map map : dataObject2) {
			Map column = new HashMap();
			String cname = map.get("cname")+"(权重:"+map.get("weigth")+")";
			String code = map.get("code")+"";
			column.put("title", cname);
			column.put("field", code);
			column.put("align", "center");
			column.put("valign", "middle");
			column.put("colspan", 1);
			column.put("rowspan", 1);
			columns.add(column);
		}
		Map column3 = new HashMap();
		column3.put("title", "总计");
		column3.put("field", "count");
		column3.put("align", "center");
		column3.put("valign", "middle");
		column3.put("colspan", 1);
		column3.put("rowspan", 1);
		columns.add(column3);
		return columns;
	}
	
	/**
	 * 获取批量评分数据
	 * @param request
	 * @param datas
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/getbatchQuestions")
	public @ResponseBody Object getbatchQuestions(HttpServletRequest request,@RequestBody BatchObjids datas) throws Exception{
		String objId =  datas.getObjIds()[0];
		String scoreMan = request.getSession().getAttribute("empid")+"";
		String sql2 = "SELECT C.cname,C.code,B.weigth FROM PER_PER360SCORELIST_REG A JOIN PER_360TEMPLATE_TARGET B ON A.targetid = B.id JOIN PER_TARGET_360 C ON c.id=b.targetid JOIN dbo.PER_PER360SCORER_REG D ON A.scorer=D.scoreman AND A.objid = D.objid  WHERE A.objid = "+objId+" AND A.scorer = "+scoreMan+" ORDER BY b.xorder;";
		List<Map> dataObject2 = MybatisUtil.queryList("runtime.selectSql", sql2);
		String[] objIds = datas.getObjIds();
		List<Object> rows=new ArrayList<Object>();
		for (int i=0;i<objIds.length;i++) {
			Map map2 = new HashMap();
			map2.put("obj", objIds[i]);
			Map map3 = sysformconfigService.getDictValueMap("sql45");
			map2.put("cname", map3.get(objIds[i]));
			for (Map map : dataObject2) {
				String code = map.get("code")+"";
				String score = map.get("score")+"";
				String weight = map.get("weigth")+"";
				if(!score.equals("null")&&!score.equals("")){
					map2.put(code,Integer.valueOf(score));
					map2.put(code+"_Weight",weight);
				}else {
					map2.put(code,0);
					map2.put(code+"_Weight",weight);
				}
			}
			rows.add(map2);
		}
		ResultMap map = new ResultMap();
		map.setRows(rows);
		map.setTotal(rows.size());
		return map;
	}
	
	
}