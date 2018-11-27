<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body style="text-align:center">
<form id="form_1881" name="form_1881" >
<div class="container-fluid">
	<div style="margin-top:5px;">
<input id="EMP_EMPLOYEE.EMP_ID_1881" name="EMP_ID" type="hidden" class="form-control"  style="width:200px;"/><input id="EMP_EMPLOYEE.EMP_ORDER_1881" name="EMP_ORDER" type="hidden" class="form-control"  style="width:200px;"/><input id="EMP_EMPLOYEE.EMP_WASTAGE_TIME_1881" name="EMP_WASTAGE_TIME" type="hidden" class="form-control"  style="width:200px;"/><input id="EMP_EMPLOYEE.EMP_PUT_LEAVE_TIME_1881" name="EMP_PUT_LEAVE_TIME" type="hidden" class="form-control"  style="width:200px;"/><input id="EMP_EMPLOYEE.EMP_IS_NEED_AUDIT_1881" name="EMP_IS_NEED_AUDIT" type="hidden" class="form-control"  style="width:200px;"/><input id="EMP_EMPLOYEE.EMP_PUT_LEAVE_NOTE_1881" name="EMP_PUT_LEAVE_NOTE" type="hidden" class="form-control"  style="width:200px;"/><input id="EMP_EMPLOYEE.EMP_WASTAGE_NOTE_1881" name="EMP_WASTAGE_NOTE" type="hidden" class="form-control"  style="width:700px;"/><input id="EMP_EMPLOYEE.EMP_OPNAME_1881" name="EMP_OPNAME" type="hidden" class="form-control"  style="width:200px;"/><input id="EMP_EMPLOYEE.EMP_DEL_1881" name="EMP_DEL" type="hidden" class="form-control"  style="width:200px;"/><input id="EMP_EMPLOYEE.EMP_SEQ_1881" name="EMP_SEQ" type="hidden" class="form-control"  style="width:200px;"/><div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">员工信息</h3>
			<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_STATUS_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>" name="EMP_STATUS"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="EmployeeStatus" nullItemText="请选择..." dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用工形式")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_USE_TYPE_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"用工形式")%>" name="EMP_USE_TYPE"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="EmploymentForm" nullItemText="请选择..." dataField="dicts"></select></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工层级")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_HIERARCHY_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工层级")%>" name="EMP_HIERARCHY"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="EmployeeHierarchy" nullItemText="请选择..." dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"现任层级日期")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_POST_TIME_1881"  style="width:200px;" name="EMP_POST_TIME"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"政治面貌")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_POLITICAL_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"政治面貌")%>" name="EMP_POLITICAL"  class="form-control" emptyText="请选择..."  onchange="EMP_EMPLOYEE_EMP_POLITICAL_valueChange_1881()" style="width:200px;" textField="dictName" valueField="dictID" DictName="political_status" nullItemText="请选择..." dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入党时间")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_JOIN_TIME_1881"  style="width:200px;" name="EMP_JOIN_TIME"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"国籍")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_COUNTRY_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"国籍")%>" name="EMP_COUNTRY"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="nation" nullItemText="请选择..." dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件类型")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_NO_TYPE_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件类型")%>" name="EMP_NO_TYPE"  class="form-control" emptyText="请选择..."  required="true"  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_CARDTYPE" nullItemText="请选择..." dataField="dicts"></select></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_NO_CODE_1881" name="EMP_NO_CODE" type="text" class="form-control"  vtype="illegalChar;maxLength:20;minLength:null;"  onchange="EMP_EMPLOYEE_EMP_NO_CODE_valueChange_1881()" required="true"  onvalidation="EMP_EMPLOYEE_EMP_NO_CODE_validation" style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_SEX_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>" name="EMP_SEX"  class="form-control" emptyText="请选择..."  enabled="false" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_GENDER" nullItemText="请选择..." dataField="dicts"></select></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生日期")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_BIRTHDAY_1881"  style="width:200px;" name="EMP_BIRTHDAY"  onchange="EMP_EMPLOYEE_EMP_BIRTHDAY_valueChange_1881()" required="true"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd"  timeFormat="HH:mm:ss"  showClearButton="true" showTodayButton="true"/>
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"年龄")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_AGE_1881" name="EMP_AGE" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;"  readonly="true" style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口所在地")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_ORIGIN_1881" name="EMP_ORIGIN" type="text" class="form-control"  vtype="illegalChar;maxLength:33;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口性质")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_HUKOU_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口性质")%>" name="EMP_HUKOU"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="AccountProperties" nullItemText="请选择..." dataField="dicts"></select></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_REG_ORIGIN_1881" name="EMP_REG_ORIGIN" type="text" class="form-control"  vtype="illegalChar;maxLength:33;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"专业技术职务")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_POST_1881" name="EMP_POST" type="text" class="form-control"  vtype="illegalChar;maxLength:50;minLength:null;"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"现任专业技术职务日期")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_WORK_TIME_1881"  style="width:200px;" name="EMP_WORK_TIME"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"手机号")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_PHONE_1881" name="EMP_PHONE" type="text" class="form-control"  vtype="chinaMobile;illegalChar;maxLength:11;minLength:null;"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"办公电话")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_OFFICE_PHONE_1881" name="EMP_OFFICE_PHONE" type="text" class="form-control"  vtype="phone;illegalChar;maxLength:15;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司邮箱")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_TRADEE_MAIL_1881" name="EMP_TRADEE_MAIL" type="text" class="form-control"  vtype="email;illegalChar;maxLength:18;minLength:null;"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"个人邮箱")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_MAIL_ADDRESS_1881" name="EMP_MAIL_ADDRESS" type="text" class="form-control"  vtype="email;illegalChar;maxLength:18;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"身高")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_HEIGHT_1881" name="EMP_HEIGHT" type="text" class="form-control"  vtype="float;illegalChar;maxLength:null;minLength:null;"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"体重")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_WEIGHT_1881" name="EMP_WEIGHT" type="text" class="form-control"  vtype="float;illegalChar;maxLength:null;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"血型")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_BLOOD_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"血型")%>" name="EMP_BLOOD"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="BloodType" nullItemText="请选择..." dataField="dicts"></select></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职称")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_PRO_TITLE_NAME_1881" name="EMP_PRO_TITLE_NAME" type="text" class="form-control"  vtype="illegalChar;maxLength:42;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"专业")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_MAJOR_1881" name="EMP_MAJOR" type="text" class="form-control"  vtype="illegalChar;maxLength:42;minLength:null;"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"毕业院校")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_SCHOOL_1881" name="EMP_SCHOOL" type="text" class="form-control"  vtype="illegalChar;maxLength:60;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"毕业时间")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_GRAD_TIME_1881"  style="width:200px;" name="EMP_GRAD_TIME"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学历")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_HIGH_EDU_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学历")%>" name="EMP_HIGH_EDU"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="HighestEducation" nullItemText="请选择..." dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"学历性质")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_EDU_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"学历性质")%>" name="EMP_EDU"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="EducationalBackground" nullItemText="请选择..." dataField="dicts"></select></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学位")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_DEGREE_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"最高学位")%>" name="EMP_DEGREE"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="HighestDegree" nullItemText="请选择..." dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"婚姻状况")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_MARITAL_STATUS_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"婚姻状况")%>" name="EMP_MARITAL_STATUS"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="MaritalStatus" nullItemText="请选择..." dataField="dicts"></select></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同期限类型")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_CONT_TERM_TYPE_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同期限类型")%>" name="EMP_CONT_TERM_TYPE"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="TypeofContractPeriod" nullItemText="请选择..." dataField="dicts"></select></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同签定次数")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_CONT_FREQUENCY_1881" name="EMP_CONT_FREQUENCY" type="text" class="form-control"  vtype="int;illegalChar;maxLength:6;minLength:null;"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同开始日期")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_CONT_START_TIME_1881"  style="width:200px;" name="EMP_CONT_START_TIME"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同结束日期")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_CONT_END_TIME_1881"  style="width:200px;" name="EMP_CONT_END_TIME"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
			</tr>
		</table>
</div>
<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">任职信息</h3>
			<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属公司")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >					<div class='input-group'  style="width:200px;;float:left;">
						<input id="EMP_EMPLOYEE.EMP_COMP_ID_1881" name="EMP_COMP_ID" type="hidden">
						<input type='text' class="form-control" readonly=true id="EMP_EMPLOYEE.EMP_COMP_ID_1881_name"/>
						<span class="input-group-addon" onclick="EMP_EMPLOYEE_EMP_COMP_ID_1881_emp_emp_edit_onbuttonclick(this)">
							<span class="glyphicon glyphicon-plus">
							</span>
						</span>
					</div>
</td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属部门")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >					<div class='input-group'  style="width:200px;;float:left;">
						<input id="EMP_EMPLOYEE.EMP_DEPT_ID_1881" name="EMP_DEPT_ID" type="hidden">
						<input type='text' class="form-control" readonly=true id="EMP_EMPLOYEE.EMP_DEPT_ID_1881_name"/>
						<span class="input-group-addon" onclick="EMP_EMPLOYEE_EMP_DEPT_ID_1881_emp_emp_edit_onbuttonclick(this)">
							<span class="glyphicon glyphicon-plus">
							</span>
						</span>
					</div>
</td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"所属岗位")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >					<div class='input-group'  style="width:200px;;float:left;">
						<input id="EMP_EMPLOYEE.EMP_POST_ID_1881" name="EMP_POST_ID" type="hidden">
						<input type='text' class="form-control" readonly=true id="EMP_EMPLOYEE.EMP_POST_ID_1881_name"/>
						<span class="input-group-addon" onclick="EMP_EMPLOYEE_EMP_POST_ID_1881_emp_emp_edit_onbuttonclick(this)">
							<span class="glyphicon glyphicon-plus">
							</span>
						</span>
					</div>
</td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位类别")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_POST_ODER_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位类别")%>" name="EMP_POST_ODER"  class="form-control" emptyText="请选择..."  enabled="false" style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_POST_ORDE" nullItemText="请选择..." dataField="dicts"></select></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工作地")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_WORKING_GROUND_1881" name="EMP_WORKING_GROUND" type="text" class="form-control"  vtype="illegalChar;maxLength:166;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级领导")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >					<div class='input-group'  style="width:200px;;float:left;">
						<input id="EMP_EMPLOYEE.EMP_SUPER_LEADER_1881" name="EMP_SUPER_LEADER" type="hidden">
						<input type='text' class="form-control" readonly=true id="EMP_EMPLOYEE.EMP_SUPER_LEADER_1881_name"/>
						<span class="input-group-addon" onclick="EMP_EMPLOYEE_EMP_SUPER_LEADER_1881_emp_emp_edit_onbuttonclick(this)">
							<span class="glyphicon glyphicon-plus">
							</span>
						</span>
					</div>
</td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"担任岗位时间")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_POST_CHANGE_TIME_1881"  style="width:200px;" name="EMP_POST_CHANGE_TIME"  required="true"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd"  timeFormat="HH:mm:ss"  showClearButton="true" showTodayButton="true"/>
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否调迁")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >						<select id="EMP_EMPLOYEE.EMP_IS_MOVE_1881" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"是否调迁")%>" name="EMP_IS_MOVE"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMMON_YES_NO" nullItemText="请选择..." dataField="dicts"></select></td>
			</tr>
		</table>
</div>
<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">入离职信息</h3>
			<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职时间")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_TIME_1881"  style="width:200px;" name="EMP_TIME"  required="true"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"转正日期")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_CON_EMP_1881"  style="width:200px;" name="EMP_CON_EMP"  required="true"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"招聘渠道")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_RECRUIT_WAY_1881" name="EMP_RECRUIT_WAY" type="text" class="form-control"  vtype="illegalChar;maxLength:39;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参加工作时间")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_WORK_EMP_1881"  style="width:200px;" name="EMP_WORK_EMP"  required="true"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入行日期")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_JOIN_DATE_1881"  style="width:200px;" name="EMP_JOIN_DATE"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行内工作年限")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_WORK_LINE_1881" name="EMP_WORK_LINE" type="text" class="form-control"  vtype="int;illegalChar;maxLength:null;minLength:null;"  required="true"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中断工龄月")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_BREAK_MON_1881" name="EMP_BREAK_MON" type="text" class="form-control"  vtype="int;illegalChar;maxLength:3;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"中断工龄年")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_BREAK_YEAR_1881" name="EMP_BREAK_YEAR" type="text" class="form-control"  vtype="int;illegalChar;maxLength:3;minLength:null;"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"累计工龄月")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_ADD_MON_1881" name="EMP_ADD_MON" type="text" class="form-control"  vtype="int;illegalChar;maxLength:3;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"累计工龄年")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_ADD_YEAR_1881" name="EMP_ADD_YEAR" type="text" class="form-control"  vtype="int;illegalChar;maxLength:3;minLength:null;"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"来本单位工龄")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_ORG_EMP_1881" name="EMP_ORG_EMP" type="text" class="form-control"  vtype="int;illegalChar;maxLength:3;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"减员时间")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_LEAVE_TIME_1881"  style="width:200px;" name="EMP_LEAVE_TIME"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd"  timeFormat="HH:mm:ss"  showClearButton="true" showTodayButton="true"/>
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"减员备注")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  colspan="3" ><input id="EMP_EMPLOYEE.EMP_RESIGN_REASON_1881" name="EMP_RESIGN_REASON" type="textarea" class="form-control"  vtype="illegalChar;maxLength:166;minLength:null;"  style="width:700px;"/></td>
			</tr>
		</table>
</div>
<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">联系信息</h3>
			<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"紧急联系人")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_EMERG_NAME_1881" name="EMP_EMERG_NAME" type="text" class="form-control"  vtype="illegalChar;maxLength:18;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"紧急联系人电话")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_EMERG_TEL_1881" name="EMP_EMERG_TEL" type="text" class="form-control"  vtype="chinaMobile;illegalChar;maxLength:18;minLength:null;"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"家庭电话")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_FAMILY_TEL_1881" name="EMP_FAMILY_TEL" type="text" class="form-control"  vtype="phone;illegalChar;maxLength:18;minLength:null;"  style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"档案所在地")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_FILE_PLACE_1881" name="EMP_FILE_PLACE" type="text" class="form-control"  vtype="illegalChar;maxLength:250;minLength:null;"  style="width:200px;"/></td>
			</tr>
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"当前住址")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="EMP_EMPLOYEE.EMP_ADDRESS_1881" name="EMP_ADDRESS" type="text" class="form-control"  vtype="illegalChar;maxLength:60;minLength:null;"  style="width:200px;"/></td>
		</table>
</div>
<div style="border:1px solid #ccc; position:relative;border-radius:5px;margin-bottom:10px">
		<h3 style=" background:#FFF;color:blue; display:block;font-size:12;position:absolute; left:10px; top:-27px;text-align:center">系统信息</h3>
			<table style="width:100%;table-layout:fixed;" class="cbs-table"  >
			<tr style="height:65px">
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作者")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  ><input id="VIR.USER_NAME_1881" name="USER_NAME" type="text" class="form-control"  vtype="illegalChar;maxLength:null;minLength:null;"  readonly="true" style="width:200px;"/></td>
				<td style="padding-left:10px;"  width="150"  ><lable><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作时间")%>: </lable></td>
				<td style="padding-left:10px;"  align="left"  >
					<div class='controls input-append date form_date1' data-date=""  data-link-field="dtp_input2" data-link-format="yyyy-mm-dd" style="float:left;">
						<input type='text' readonly class="form-control " dateType="controls input-append date form_date1" id="EMP_EMPLOYEE.EMP_OPTIME_1881"  style="width:200px;" name="EMP_OPTIME"  format="yyyy-MM-dd" valueformat="yyyy-MM-dd"  timeFormat="HH:mm:ss"  showClearButton="true" showTodayButton="true" enabled="false" />
							<span class="add-on"><i class="icon-remove"></i></span>
							<span class="add-on" style="margin-right:70px"><i class="icon-th"></i></span>
					</div></td>
			</tr>
		</table>
</div>
		<table style="width:100%;table-layout:fixed;padding-top:5px;padding-right:5px;">
		</table>
		<div style="margin:0 auto; display:inline-block;height: 35px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save_formemp_emp_edit"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存")%> onclick="save_formemp_emp_edit_click_1881()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="closeemp_emp_edit"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"关闭")%> onclick="closex_1881()"/>
			</div>
		</div>
</div>
</div>
</form>
<script>
var classes = $("select");
var parame={
				id:'',
				value:"N",
				width: "100px",  
				height:"45px",
				url:'${pageContext.request.contextPath }/dict/searchSysDictEntryTypeCode.action?userId=${sessionScope.userid}',
				jsonParam:{},
				chang:function (e){
					var aaa = e;
				}
};

$(function () {  
			$('.form_date1').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 2,  
			 minView: 2,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date2').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd hh:ii",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 2,  
			 minView: 0,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date3').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"hh:ii",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 0,  
			 minView: 2,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
			$('.form_date4').datetimepicker({ 
			 language:  'zh-CN',  
			 format:"yyyy-mm-dd",  
			 weekStart: 1,  
			 todayBtn:  1,  
			 autoclose: 1,  
			 todayHighlight: 1,  
			 startView: 4,  
			 minView: 4,  
			 forceParse: 0,  
			 pickerPosition: "bottom-left"  
			});  
});
function getdata_1881(buttonId,formId){
			var param = {};
			var data = {buttonId:buttonId,formId:formId,param:{},paramsMap:{}};
			$.map($('[name=form_'+formId+']').serializeArray(), function(item, index){
				var property =item['name'];
				var value = item['value'];
				param[property] = value;
			});
			data.param = param;
		return data;
}
	function formatDatebox(value,key) {
			var type = document.getElementById(key).getAttribute("dateType");
			type = type.substr(type.length-1,1);
		    var year=value.substr(0,4);
		    var index1=value.indexOf("-");
		    var index2=value.lastIndexOf("-");
		    var d1=parseInt(index2)-(parseInt(index1)+1);
		    var month=value.substr((parseInt(index1)+1),d1);
		    var kg=value.indexOf(" ");
		    d2=parseInt(kg)-parseInt(index2);
		    var day=value.substr(parseInt(index2)+1,d2);
		    var mh=value.indexOf(":");
		    d3=parseInt(mh)-(parseInt(kg)+1);
		    var hh=value.substr(parseInt(kg)+1,d3);
		    var mh2=value.lastIndexOf(":");
		    d4=parseInt(mh2)-(parseInt(mh)+1);
		    var mm=value.substr(parseInt(mh)+1,d4);
		    if(mm!=0){
		    	mm = parseInt(mm)+6;
		    	if(parseInt(mm)<10){
		    		mm = "0"+mm;
		    	}else if(parseInt(mm)==60){
		    		mm="00";
		    		hh=parseInt(hh)+1;
		    		}else if(parseInt(mm)>60){
		    			mm=parseInt(mm)-60;
		    			mm="0"+mm;
		    			hh=parseInt(hh)+1;
		    			}
		    }
		    var mh2=value.lastIndexOf(":");
		    var ss=value.substr(parseInt(mh2)+1);
		    if(type == 1){
			        return year+"-"+month+"-"+day;
		    }else if(type == 2){
			        return year+"-"+month+"-"+day+" "+hh+":"+mm;
		    }else if(type == 3){
			        return hh+":"+mm;
		    }else if(type == 4){
			        return year;
		    }else if(type == 5){
			        return year+month;
		    }
	}
	var _formId_1881='1881';
	window.onload=function(){
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		parame.placeholder="";
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame);
		}else{
			myehr_initSelect(parame);
		}
	}

		document.getElementById("EMP_EMPLOYEE.EMP_ID_1881").value="${param.EMP_ID}";
		document.getElementById("EMP_EMPLOYEE.EMP_POLITICAL_1881").value="13";
		document.getElementById("EMP_EMPLOYEE.EMP_COUNTRY_1881").value="1";
		document.getElementById("EMP_EMPLOYEE.EMP_OPNAME_1881").value="1";
		document.getElementById("EMP_EMPLOYEE.EMP_DEL_1881").value="N";

	}

	function save_formemp_emp_edit_click_1881(){
		var paramsMap = {		'c_8543' : document.getElementById('EMP_EMPLOYEE.EMP_CHINA_NAME_1881').value,
		'c_8542' : document.getElementById('EMP_EMPLOYEE.EMP_CODE_1881').value,
		'c_8541' : document.getElementById('EMP_EMPLOYEE.EMP_ID_1881').value,
		's_userId' : '1'};

		var _param = {};
		_param.formId=_formId_1881;
		_param.buttonId=2803;
		_param = getdata_1881(_param.buttonId,_formId_1881);
		_param.paramsMap = paramsMap
		$.ajax({
			url:'${pageContext.request.contextPath }/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
			if(text[0]==0){
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"保存失败！")%>");
			}else if(text[0]=='error'){
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作异常")%>");
			}else {
				alert("<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"操作成功")%>");
				closex_1881()
			}
			}
		});
	}
	function EMP_EMPLOYEE_EMP_POLITICAL_valueChange_1881(e){

		var P=nui.get('EMP_EMPLOYEE.EMP_POLITICAL').getValue();
if(P==13)
{
  nui.get("EMP_EMPLOYEE.EMP_JOIN_TIME").setEnabled(false);
} else {
  nui.get("EMP_EMPLOYEE.EMP_JOIN_TIME").setEnabled(true);
}
	}
	function EMP_EMPLOYEE_EMP_NO_CODE_valueChange_1881(e){

		var type=nui.get('EMP_EMPLOYEE.EMP_NO_TYPE').getValue();
if(type==1){
  var number=nui.get('EMP_EMPLOYEE.EMP_NO_CODE').getValue();
  var num=number.substr(16,1);
  var birthday=number.substr(6,8);
  var birthday1=new  Date(birthday.substr(0,4)+'/'+birthday.substr(4,2)+'/'+birthday.substr(6,2)); 
  nui.get('EMP_EMPLOYEE.EMP_BIRTHDAY').setValue(birthday1);
  var birthday2=nui.get('EMP_EMPLOYEE.EMP_BIRTHDAY').getValue();
  var birthday3=new  Date(Date.parse(birthday2.replace(/-/g, "/")));
  var aDate=new Date();    
  var thisYear=aDate.getFullYear();
  var ageYear=thisYear-birthday2.substr(0,4);
  var thisMonth=aDate.getMonth()+1;
  var Month=birthday3.getMonth()+1;
  var ageMonth=thisMonth-Month;
  if(ageMonth>0){
    nui.get('EMP_EMPLOYEE.EMP_AGE').setValue(ageYear);
  }else if(ageMonth==0){
    var thisDay=aDate.getDate();
    var Day=birthday3.getDate();
    var ageDay=thisDay-Day;
    if(ageDay>=0){
    nui.get('EMP_EMPLOYEE.EMP_AGE').setValue(ageYear);
   }else {
    age=ageYear-1;
    nui.get('EMP_EMPLOYEE.EMP_AGE').setValue(age);
   }
  }else{
    age=ageYear-1;
    nui.get('EMP_EMPLOYEE.EMP_AGE').setValue(age);
  }
  if(num%2==0){
     nui.get('EMP_EMPLOYEE.EMP_SEX').setValue('F');
}else{   
     nui.get('EMP_EMPLOYEE.EMP_SEX').setValue('M');
 }
}else {    
     nui.get('EMP_EMPLOYEE.EMP_SEX').setValue(null);
     nui.get('EMP_EMPLOYEE.EMP_BIRTHDAY').setValue(null);  
     nui.get('EMP_EMPLOYEE.EMP_AGE').setValue(null);   
}
	}
	function EMP_EMPLOYEE_EMP_BIRTHDAY_valueChange_1881(e){

		var birthday=nui.get('EMP_EMPLOYEE.EMP_BIRTHDAY').getValue();
  var birthday1=new  Date(Date.parse(birthday.replace(/-/g, "/")));
  var aDate=new Date();    
  var thisYear=aDate.getFullYear();
  var ageYear=thisYear-birthday.substr(0,4);
  var thisMonth=aDate.getMonth()+1;
  var Month=birthday1.getMonth()+1;
  var ageMonth=thisMonth-Month;
  if(ageMonth>0){
    nui.get('EMP_EMPLOYEE.EMP_AGE').setValue(ageYear);
  }else if(ageMonth==0){
    var thisDay=aDate.getDate();
    var Day=birthday1.getDate();
    var ageDay=thisDay-Day;
    if(ageDay>=0){
    nui.get('EMP_EMPLOYEE.EMP_AGE').setValue(ageYear);
   }else {
    age=ageYear-1;
    nui.get('EMP_EMPLOYEE.EMP_AGE').setValue(age);
   }
  }else{
    age=ageYear-1;
    nui.get('EMP_EMPLOYEE.EMP_AGE').setValue(age);
  }
	}
	function EMP_EMPLOYEE_EMP_NO_CODE_validation(e){

		if (e.isValid) {
    var type=nui.get('EMP_EMPLOYEE.EMP_NO_TYPE').getValue();
    if(type==1){
     var card=nui.get('EMP_EMPLOYEE.EMP_NO_CODE').getValue();
     var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;  
     if(reg.test(card) == false)  
     {  
          e.errorText = "身份证输入不合法";
          e.isValid = false;
     } else      
       e.isValid = true;
        var field = 'EMP_NO_CODE';
        var val = e.value;
        var pkvalue = nui.get('EMP_EMPLOYEE.EMP_ID').getValue();
        var result;
        $.ajax({
            url:'com.dcf.form.runtime.guicommonComp.checkUniqueVerify.biz.ext',
            type:'post',
            data: nui.encode({'formId':_formId, 'field':field, 'value':val,pkvalue:pkvalue}),
            cache: false,
            contentType: 'text/json',
            async:false,
            success: function (text) {
                result = text.result;
            },
            error: function (jqXHR, textStatus, errorThrown) {
            }
        });
        if (result == true) {
            e.errorText = '字段值重复！';
            e.isValid = false;
        }
     }
   }
	}

	function _initData(pkId){
		var _param = {};
		if(pkId){
			_param = {pkId:pkId,formId:_formId_1881};
		}else {
			_param = {requestParam:{EMP_ID:'${param.EMP_ID}'},pkId:pkId,formId:_formId_1881};
		}
		var _form = getForm("#form_1881");
		var _Type = getType("#form_1881");
		$.ajax({
			url:'${pageContext.request.contextPath }/form/cardformInitData.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text.rows&&text.rows.length>0){
					var object = text.rows[0];
						for(var key in object){
							if(_form[key]!=null&&_form[key]!="undefined"){
									if(_Type[key]=="dateTime"){
										date = new Date(object[key]).Format("yyyy-MM-dd hh:mm:ss");
										document.getElementById(_form[key]).value=formatDatebox(date,_form[key]);
									}else{
										document.getElementById(_form[key]).value=object[key];
									}
							}
						}
						;
					var _lookupData=text.datas[0];
					_setLookupText(_lookupData);
					EMP_COMP_ID_emp_emp_edit_lookup();
EMP_DEPT_ID_emp_emp_edit_lookup();
EMP_POST_ID_emp_emp_edit_lookup();
EMP_SUPER_LEADER_emp_emp_edit_lookup();

					if("undefined" != typeof mstTab_activechanged ){
						mstTab_activechanged();}
				} else {
					_initAfter();
				}
			},
			error: function (jqXHR, textStatus, errorThrown) {
			}
		});
	}
		function EMP_COMP_ID_emp_emp_edit_lookup(){
		var paramsMap = {		'c_8561' : document.getElementById("EMP_EMPLOYEE.EMP_COMP_ID_1881").value};
			var data = {
			'formId' : _formId,
			'columnId' : 8561,
			'execSqlRelaid' : 724,
			'params' : paramsMap
			};
			$.ajax({
				url: "com.dcf.form.runtime.exexSqlForNameComp.execSqlForColumnName.biz.ext",
				type: 'POST',
				data: nui.encode(data),
				cache: false,
				contentType: 'text/json',
				success: function(text) {
					if (text.datas[0] == '000000') {
						nui.get('EMP_EMPLOYEE.EMP_COMP_ID_1881').setText(text.datas[1]);
					}
				},
				error: function(jqXHR, textStatus, errorThrown) {
				}
			});
	}
	function EMP_EMPLOYEE_EMP_COMP_ID_1881_emp_emp_edit_onbuttonclick(e){
		var id = $(e).prev().prev()[0].id;
		var url = '/myehr/form/toForm.action?formId=1844'+"&fatherId="+id+"";
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['500','500'],
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%>',
			content:url,
			success:function(layero,index){
			},
			end:function(){			}
		 }); 
	}

	function _setLookupText(_lookupData){
		nui.get('EMP_EMPLOYEE.EMP_COMP_ID_1881').setValue(_lookupData.EMP_COMP_ID);
	}
		function EMP_DEPT_ID_emp_emp_edit_lookup(){
		var paramsMap = {		'c_8563' : document.getElementById("EMP_EMPLOYEE.EMP_DEPT_ID_1881").value};
			var data = {
			'formId' : _formId,
			'columnId' : 8563,
			'execSqlRelaid' : 725,
			'params' : paramsMap
			};
			$.ajax({
				url: "com.dcf.form.runtime.exexSqlForNameComp.execSqlForColumnName.biz.ext",
				type: 'POST',
				data: nui.encode(data),
				cache: false,
				contentType: 'text/json',
				success: function(text) {
					if (text.datas[0] == '000000') {
						nui.get('EMP_EMPLOYEE.EMP_DEPT_ID_1881').setText(text.datas[1]);
					}
				},
				error: function(jqXHR, textStatus, errorThrown) {
				}
			});
	}
	function EMP_EMPLOYEE_EMP_DEPT_ID_1881_emp_emp_edit_onbuttonclick(e){
		var id = $(e).prev().prev()[0].id;
		var url = '/myehr/form/toForm.action?formId=1207'+"&fatherId="+id+"";
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['500','500'],
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%>',
			content:url,
			success:function(layero,index){
			},
			end:function(){			}
		 }); 
	}

	function _setLookupText(_lookupData){
		nui.get('EMP_EMPLOYEE.EMP_DEPT_ID_1881').setValue(_lookupData.EMP_DEPT_ID);
	}
		function EMP_POST_ID_emp_emp_edit_lookup(){
		var paramsMap = {		'c_8566' : document.getElementById("EMP_EMPLOYEE.EMP_POST_ID_1881").value};
			var data = {
			'formId' : _formId,
			'columnId' : 8566,
			'execSqlRelaid' : 726,
			'params' : paramsMap
			};
			$.ajax({
				url: "com.dcf.form.runtime.exexSqlForNameComp.execSqlForColumnName.biz.ext",
				type: 'POST',
				data: nui.encode(data),
				cache: false,
				contentType: 'text/json',
				success: function(text) {
					if (text.datas[0] == '000000') {
						nui.get('EMP_EMPLOYEE.EMP_POST_ID_1881').setText(text.datas[1]);
					}
				},
				error: function(jqXHR, textStatus, errorThrown) {
				}
			});
	}
	function EMP_EMPLOYEE_EMP_POST_ID_1881_emp_emp_edit_onbuttonclick(e){
		var id = $(e).prev().prev()[0].id;
		var url = '/myehr/form/toForm.action?formId=1882&POST_DEPT="+param_null+"'+"&fatherId="+id+"";
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['600','400'],
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%>',
			content:url,
			success:function(layero,index){
			},
			end:function(){			}
		 }); 
	}

	function _setLookupText(_lookupData){
		nui.get('EMP_EMPLOYEE.EMP_POST_ID_1881').setValue(_lookupData.EMP_POST_ID);
	}
		function EMP_SUPER_LEADER_emp_emp_edit_lookup(){
		var paramsMap = {		'c_8580' : document.getElementById("EMP_EMPLOYEE.EMP_SUPER_LEADER_1881").value};
			var data = {
			'formId' : _formId,
			'columnId' : 8580,
			'execSqlRelaid' : 727,
			'params' : paramsMap
			};
			$.ajax({
				url: "com.dcf.form.runtime.exexSqlForNameComp.execSqlForColumnName.biz.ext",
				type: 'POST',
				data: nui.encode(data),
				cache: false,
				contentType: 'text/json',
				success: function(text) {
					if (text.datas[0] == '000000') {
						nui.get('EMP_EMPLOYEE.EMP_SUPER_LEADER_1881').setText(text.datas[1]);
					}
				},
				error: function(jqXHR, textStatus, errorThrown) {
				}
			});
	}
	function EMP_EMPLOYEE_EMP_SUPER_LEADER_1881_emp_emp_edit_onbuttonclick(e){
		var id = $(e).prev().prev()[0].id;
		var url = '/myehr/form/toForm.action?formId=1381'+"&fatherId="+id+"";
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['500','500'],
			title:'<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择")%>',
			content:url,
			success:function(layero,index){
			},
			end:function(){			}
		 }); 
	}

	function _setLookupText(_lookupData){
		nui.get('EMP_EMPLOYEE.EMP_SUPER_LEADER_1881').setValue(_lookupData.EMP_SUPER_LEADER);
	}
true	//关闭
	function closex_1881(){ 
			    var index = parent.layer.getFrameIndex(window.name); //获取当前窗体索引
			    parent.layer.close(index);//执行关闭
	}
	function getForm(formId){
					var object=[];
						$(formId).find("input").each(function(){
								var xxx = this.id.split(".")[1];
								if(xxx!=undefined){
									var xx = xxx.split("_");
									var arr = [];
									var id = "";
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
											id = id+xx[i]+"_";
										}else{
											id = id+xx[i];
										}
									}
								object[id]=this.id;
									}
						})
						$(formId).find("select").each(function(){
								var xxx = this.id.split(".")[1];
								if(xxx!=undefined){
									var xx = xxx.split("_");
									var arr = [];
									var id = "";
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
											id = id+xx[i]+"_";
										}else{
											id = id+xx[i];
										}
									}
								object[id]=this.id;
									}
						})
						return object;
			}
	function getType(formId){
					var object=[];
							$(formId).find("input").each(function(){
							var vtype = $(this).attr('format');
							if(vtype!=undefined){
								var xxx = this.id.split(".")[1];
									var xx = xxx.split("_");
									var arr = [];
									var id = "";
									for(var i=0;i<xx.length-1;i++){
										if(i<xx.length-2){
											id = id+xx[i]+"_";
										}else{
											id = id+xx[i];
										}
									}
								object[id]="dateTime";
							}
							})
						return object;
			}
</script>
</body>
</html>
