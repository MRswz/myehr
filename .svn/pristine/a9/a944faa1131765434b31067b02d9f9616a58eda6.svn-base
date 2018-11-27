package com.myehr.controller.orgPicture;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.mapper.formmanage.form.SysFormGeneralParamMapper;
import com.myehr.mapper.formmanage.form.SysTreeSolutionColumnMapper;
import com.myehr.mapper.formmanage.form.SysTreeSolutionMapper;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormGeneralParamExample;
import com.myehr.pojo.formmanage.form.SysTreeSolution;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumn;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumnExample;
import com.myehr.pojo.formmanage.form.SysTreeSolutionExample;
import com.myehr.test.dao.TMapperExt;


@Controller
@RequestMapping("/org")
public class OrgPictureController {
//	@Autowired
	@Resource(name = "TMapperExt")
	private TMapperExt tMapperExt;
	
	@Autowired
	private SysTreeSolutionMapper sysTreeSolutionMapper;
	
	@Autowired
	private SysTreeSolutionColumnMapper sysTreeSolutionColumnMapper;
	
	@Autowired
	private SysFormGeneralParamMapper sysFormGeneralParamMapper;
	
	//查询数据
	@RequestMapping("/searchData")
	public @ResponseBody Map searchData(HttpServletRequest request) throws Exception{
		HttpSession session  = request.getSession();
		String userId = session.getAttribute("userid").toString();
		String orgid =request.getParameter("orgid");
		
		String sql = " SELECT p.*,p.CONTENT as \"name\" FROM "
				+" (SELECT * FROM deptcode )p  "
				+" where p.DEPT_ID in (select DEPT_ID from dbo.F_SYS_USER_ORG("+userId+")) ";
		
		/*String sql = " with cte as "
				+" ( "
				+"  select deptcode.* from deptcode where dept_id in (select org_id FROM sys_user_org "
		+" where user_id =1) "
		+"  union all "
		+"  select a.* from deptcode a inner join cte b on a.dept_id=b.PARENT_ID "
		+" ), "
		+"  cte2 as "
		+" ( "
		+"  select deptcode.* from deptcode where dept_id in (select org_id FROM sys_user_org "
		+" where user_id =1) "
		+"  union all "
		+"  select c.* from deptcode c inner join cte2 d on c.PARENT_ID=d.dept_ID "
		+" ) "
		+" select cte.*,'Y' orgMark,tt.CONTENT  COMP_NAME from cte  "
		+"   left join deptcode tt on tt.DEPT_ID=cte.parent_ID "
		+"  union "
		+" select cte2.*,'Y' orgMark,tt.CONTENT COMP_NAME from cte2 "
		+"  left join deptcode tt on tt.DEPT_ID=cte2.parent_ID "
		+" order by DEPT_CODE ";*/
		
		/*String sql = "select deptcode.*,deptcode.CONTENT as \"name\" from deptcode"
			+" join (SELECT DEPT_ID FROM DEPTCODE"
			+" join (select distinct org_id from SYS_ORG_ROLE t1 join (select role_id from SYS_USER_ROLE where USER_ID="+userId+")t2"
		+"	 on t1.ROLE_ID=t2.ROLE_ID)t3 on t3.ORG_ID=DEPTCODE.PARENT_ID"
		+" UNION" 
		+" SELECT DEPT_ID FROM DEPTCODE "
		+" JOIN (select distinct org_id from SYS_ORG_ROLE t1 join (select role_id from SYS_USER_ROLE where USER_ID="+userId+")t2 "
		+" on t1.ROLE_ID=t2.ROLE_ID)t4 on t4.ORG_ID=DEPTCODE.DEPT_ID )T5 ON T5.DEPT_ID=DEPTCODE.DEPT_ID"
		+"	 where deptcode.ORG_DEL = 'N' "
		+" order by deptcode.dept_code";*/
		/*String sql ="select DEPTCODE.DEPT_ID as treeid,DEPTCODE.CONTENT as treename,'aa' as content,DEPTCODE.PARENT_ID as treeparent,'org' as  treetype    from DEPTCODE   where DEPTCODE.ORG_DEL = 'N' "
				+" union "
				+" select A01.A0188 as treeid,A01.A0101+A01.A0190 as treename,'aa' as content,A01.DEPT_ID as treeparent,'emp' as  treetype  from  A01  where A01.A0191<>'离职人员'";*/
		
		List<Map> t = (List<Map>) tMapperExt.queryByFormDefSql(sql);
		if(t.size() >0){
			Map root = null;
			for(int i=0; i<t.size(); i++){
				if(t.get(i).get("children")==null){
					t.get(i).put("children", new ArrayList<Map>());
				}
				List<Map> l = (List)t.get(i).get("children");
				for(int k=0; k<t.size(); k++){
					if (t.get(k).get("PARENT_ID")==null) {
						continue;
					}else{
						if(t.get(k).get("PARENT_ID").toString().equals(t.get(i).get("DEPT_ID").toString())){
							l.add(t.get(k));
						}
					}
				}
				if(t.get(i).get("DEPT_ID").toString().equals(orgid) ){
					root = t.get(i);
				}
			}
			return root;
		}
		return null;
	}
	
	//查询数据
	@RequestMapping("/searchDataView")
	public @ResponseBody Map searchDataView(HttpServletRequest request) throws Exception{
		HttpSession session  = request.getSession();
		String userId = session.getAttribute("userid").toString();
		String orgid =request.getParameter("orgid");
		String postId =request.getParameter("postId");
		
		String wherepost="";
		if (postId !=null && postId!="") {
			wherepost =" where 岗位ID ="+postId;
		}
		
		String sql = "select * from view_org_post "+wherepost;
		
		List<Map> t = (List<Map>) tMapperExt.queryByFormDefSql(sql);
		if(t.size() >0){
			Map root = null;
			for(int i=0; i<1000; i++){
				if(t.get(i).get("children")==null){
					t.get(i).put("children", new ArrayList<Map>());
				}
				List<Map> l = (List)t.get(i).get("children");
				for(int k=0; k<1000; k++){
					if (t.get(k).get("上级岗位")==null) {
						continue;
					}else{
						if(t.get(k).get("上级岗位").toString().equals(t.get(i).get("岗位ID").toString())){
							l.add(t.get(k));
						}
					}
				}
				if(t.get(i).get("岗位ID").toString().equals("704") ){
					root = t.get(i);
				}
			}
			return root;
		}
		return null;
	}
	
	//查询数据
	@RequestMapping("/searchTreeData")
	public @ResponseBody Map searchTreeData(HttpServletRequest request) throws Exception{
		HttpSession session  = request.getSession();
		String userId = session.getAttribute("userid").toString();
		String treeSolutionId =request.getParameter("treeSolutionId");
		String formId =request.getParameter("formId");
		
		SysTreeSolutionExample example = new SysTreeSolutionExample();
		com.myehr.pojo.formmanage.form.SysTreeSolutionExample.Criteria criteria = example.createCriteria();
		criteria.andTreeSolutionIdEqualTo(new BigDecimal(treeSolutionId));
		SysTreeSolution sysTreeSolution = sysTreeSolutionMapper.selectByExample(example).get(0);
		
		SysTreeSolutionColumnExample example1 = new SysTreeSolutionColumnExample();
		com.myehr.pojo.formmanage.form.SysTreeSolutionColumnExample.Criteria criteria1 = example1.createCriteria();
		criteria1.andTreeSolutionIdEqualTo(new BigDecimal(treeSolutionId));
		List<SysTreeSolutionColumn> SolutionColumns = sysTreeSolutionColumnMapper.selectByExample(example1);
		
		
		SysFormGeneralParamExample example2 = new SysFormGeneralParamExample();
		com.myehr.pojo.formmanage.form.SysFormGeneralParamExample.Criteria criteria2 = example2.createCriteria();
		criteria2.andParamTypeValueEqualTo(new BigDecimal(formId));
		criteria2.andParamTypeEqualTo("FORMCONFIG|JS_VAR");
		List<SysFormGeneralParam> generalParams = sysFormGeneralParamMapper.selectByExample(example2);
		
		
		String nodeId = "";
		String nodeParent = "";
		String nodeContent = "";
		String nodeName = "";
		for (int i = 0; i < SolutionColumns.size(); i++) {
			String tableName = SolutionColumns.get(i).getTreeEntityTablename();
			tableName=tableName.replaceAll("_", "");
			tableName = tableName.toUpperCase();
			if (SolutionColumns.get(i).getTreeColumnType()!=null) {
				if(SolutionColumns.get(i).getTreeColumnType().equals("nodeId")){
					nodeId = tableName+"_"+SolutionColumns.get(i).getTreeFieldTablename();
				}
				if(SolutionColumns.get(i).getTreeColumnType().equals("nodeParent")){
					nodeParent = tableName+"_"+SolutionColumns.get(i).getTreeFieldTablename();
				}
				if(SolutionColumns.get(i).getTreeColumnType().equals("nodeContent")){
					nodeContent = tableName+"_"+SolutionColumns.get(i).getTreeFieldTablename();
				}
				if(SolutionColumns.get(i).getTreeColumnType().equals("nodeName")){
					nodeName = tableName+"_"+SolutionColumns.get(i).getTreeFieldTablename();
				}
			}
		}
		System.out.println(request.getParameter("ORGVORGANIZATION_ID"));
		String orgid =request.getParameter(generalParams.get(0).getParamName());
		
		String sql = sysTreeSolution.getTreeSolutionExcSql();
		sql = sql.replace("[s:userId]", userId);
		
		List<Map> t = (List<Map>) tMapperExt.queryByFormDefSql(sql);
		if(t.size() >0){
			Map root = null;
			for(int i=0; i<t.size(); i++){
				t.get(i).put("name", t.get(i).get(nodeName));
				if(t.get(i).get("children")==null){
					t.get(i).put("children", new ArrayList<Map>());
				}
				List<Map> l = (List)t.get(i).get("children");
				for(int k=0; k<t.size(); k++){
					if (t.get(k).get(nodeParent)==null) {
						continue;
					}else{
						if(t.get(k).get(nodeParent).toString().equals(t.get(i).get(nodeId).toString())){
							String nodeNameValue = t.get(k).get(nodeName)+"";
							Map obj=new HashMap();
							obj = t.get(k);
							obj.put("name", nodeNameValue);
							l.add(obj);
						}
					}
				}
				if (orgid==null || orgid.equals("") || orgid.equals("null")) {
					if(t.get(i).get(nodeParent)==null|| t.get(i).get(nodeParent).equals("") || t.get(i).get(nodeParent).equals("null")){
						String nodeNameValue = t.get(i).get(nodeName)+"";
						t.get(i).put("name", nodeNameValue);
						root = t.get(i);
						root.put("total", t.size());
					}
				}else{
					if(t.get(i).get(nodeId).toString().equals(orgid) ){
						String nodeNameValue = t.get(i).get(nodeName)+"";
						t.get(i).put("name", nodeNameValue);
						root = t.get(i);
						root.put("total", t.size());
					}
				}
			}
			return root;
		}
		return null;
	}

}
