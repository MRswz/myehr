package com.myehr.controller.form;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.controller.dict.param.ResultMapNew;
import com.myehr.controller.form.parambean.ReportParamDatas;
import com.myehr.controller.form.parambean.SaveFilterColumnDataParams;
import com.myehr.mapper.formmanage.form.SysFormYkReportQueryparamsMapper;
import com.myehr.pojo.formmanage.form.SysFormYkReportQueryparams;
import com.myehr.pojo.formmanage.form.SysFormYkReportQueryparamsExample;
import com.myehr.test.dao.TMapperExt;

@Controller
@RequestMapping("/reportForm")
public class ReportController {
//	@Autowired
	@Resource(name = "TMapperExt")
	private TMapperExt tMapperExt;
	
	@Autowired
	private SysFormYkReportQueryparamsMapper sysFormYkReportQueryparamsMapper;
	
	
	
	
	@RequestMapping("/queryFormReportParamsByFormId")
	public @ResponseBody ResultMapNew queryFormReportParamsByFormId(HttpServletRequest request) throws Exception{
		String formId = request.getParameter("formId");
		
		String sql = "select o.QUERY_PARAM_ID as queryParamId, " +
				" o.REPORT_ID as reportId, "+
				" o.PARAMS_ID as paramsId, "+
				" o.SORT as sort, "+
				" o.COLSPAN_COUNT as colspanCount, "+
				" o.OPERATOR_NAME as operatorName, "+
				" o.OPERATOR_TIME as operatorTime, "+
				" o.PARAMS_WIDTH as paramsWidth, "+
				" o.SHOW_TYPE as showType, "+
				" o.sql_params_code as sqlParamsCode, "+
				" o.sql_params_name as sqlParamsName, "+
				" o.sql_params_gui_type as sqlParamsGuiType, "+
				" o.report_form_id as reportFormId "+
				" from (select t1.*, t2.sql_params_code, t2.sql_params_name, t2.sql_params_gui_type,t3.report_form_id " +
				" from SYS_FORM_YK_REPORT_QUERYPARAMS t1 " +
				" join sys_sql_params t2 " +
				" on t2.sql_params_id = t1.params_id " +
				" join SYS_FORM_YK_REPORT t3 on t3.report_id = t1.report_id) o"+
				" where o.report_form_id  = "+formId;
		List<Map> reportParams = tMapperExt.queryByFormDefSql(sql);
		
		ResultMapNew resultMap=new ResultMapNew();
		
		resultMap.setTotal(reportParams.size());
		resultMap.setRows(reportParams);
		return resultMap;
		
	}
	
	/**
	 * 删除查询字段
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/deleteReportColumn")
	public @ResponseBody String[]  deleteFilterColumn(HttpServletRequest request,@RequestBody SysFormYkReportQueryparams reportParam) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		
		sysFormYkReportQueryparamsMapper.deleteByPrimaryKey(reportParam.getQueryParamId());
		
		return recode;
	}
	
	
	/**
	 * 保存报表参数
	 * @param request
	 * @param params
	 * @throws Throwable 
	 */
	@RequestMapping("/saveReportColumn")
	public @ResponseBody String[]  saveFilterColumnData(HttpServletRequest request,@RequestBody SaveFilterColumnDataParams param) throws Throwable {
		String[] recode = new String[2];
		recode[0]="0";
		recode[1]="操作成功";
		
		List<Map> filterColumns = param.getColumns();
		
		for (int i = 0; i < filterColumns.size(); i++) {
			SysFormYkReportQueryparams filterColumn = new SysFormYkReportQueryparams();
			Map obj = filterColumns.get(i);
			filterColumn.setQueryParamId(Long.parseLong((String)obj.get("queryParamId")));
			filterColumn.setReportId(Long.valueOf((Integer)obj.get("reportId")));
			filterColumn.setParamsId(Long.parseLong((String)obj.get("paramsId")));
			filterColumn.setSort(Long.parseLong((String)obj.get("sort")));
			filterColumn.setColspanCount(Long.parseLong((String)obj.get("colspanCount")));
			filterColumn.setParamsWidth((String)obj.get("paramsWidth"));
			filterColumn.setShowType((String)obj.get("showType"));
			filterColumn.setOperatorName("1");
			filterColumn.setOperatorTime(new Date());
			
			if (filterColumn.getQueryParamId()!=null && !(filterColumn.getQueryParamId()+"").equals("")) {
				sysFormYkReportQueryparamsMapper.updateByPrimaryKey(filterColumn);
			}else {
				sysFormYkReportQueryparamsMapper.insert(filterColumn);
			}
		}
		
		return recode;
	}
	
	/**
	 * 保存所选参数
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/saveSelectParam")
	public @ResponseBody String saveSelectParam(HttpServletRequest request,@RequestBody ReportParamDatas paramDatas) throws Exception{
		long reportId = paramDatas.getReportId();
		SysFormYkReportQueryparamsExample example = new SysFormYkReportQueryparamsExample();
		com.myehr.pojo.formmanage.form.SysFormYkReportQueryparamsExample.Criteria criteria = example.createCriteria();
		criteria.andReportIdEqualTo(reportId);
		List<SysFormYkReportQueryparams> reportparams = sysFormYkReportQueryparamsMapper.selectByExample(example);
		
		int flag = 0;
		List<Map> params= paramDatas.getSelectParams();
		for (int i = 0; i < params.size(); i++) {
			for (int j = 0; j < reportparams.size(); j++) {
				if (reportparams.get(j).getParamsId().intValue() == (Integer)params.get(i).get("sqlParamsId")) {
					flag=1;
				}
			}
			if (flag==0) {
				SysFormYkReportQueryparams obj = new SysFormYkReportQueryparams();
				obj.setReportId(reportId);
				obj.setParamsId(Long.valueOf((Integer)params.get(i).get("sqlParamsId")));
				obj.setSort(Long.parseLong("1"));
				obj.setColspanCount(Long.parseLong("1"));
				obj.setParamsWidth("200");
				obj.setShowType("show");
				sysFormYkReportQueryparamsMapper.insert(obj);
			}
			
		}
		return "success";
	}
}
