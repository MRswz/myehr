<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/questionForm.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<style type="text/css">
			html,body{min-height: 100%;}
			li{list-style: upper-latin ;}
		</style>
		</head>
	<body class="gray-bg">
	<div class="container-fluid" style="height:100%;overflow:auto;margin:0">
		<div class="control-group" style="float: right;" id="changeButton">
		</div>
		
		<div class="wrapper wrapper-content animated fadeInRight" id="questionContent">
			<div class="row" style="margin-left:0"  id="first_Questions">
			
				<div class="BTNGROUP BTNGROUP_3335" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
					<div style="margin-right:10px;display:inline-block">
						<input type="button" id="lastQuestion"  class="btn btn-success" style="display:none" value="上一题" onclick="showLastQuestion()"/>
					</div>
					<div style="margin-right:10px;display:inline-block">
						<input type="button" id="nextQuestion"  class="btn btn-success" style="display:none" value="下一题" onclick="showNextQuestion()"/>
					</div>
				</div>
			</div>
		</div>
	</div>
		<script>
		var number = 0; 
		$(document).ready(function () {
				//加载试卷题目
				initExaminationQuestion();
				
				initSingleAnwser();
				initMultipleAnwser();
				initStarAnwser();
				initDiscussAnwser();
				$("[id='QuestionShow']").bootstrapSwitch({
						size : "small",
						onText:'单题式',
						offText:'全题式',  
						onSwitchChange : function(event, state) {
								if(state){
									switchType="single";
								}else{
									switchType = "all";
								}
								loadDataStart();
						}
				});
				var empId = '${param.empId}';
				var planId = '${param.planId}';
				initExaminationDataToEmp(empId,planId);
				$(".Multiple,.single").find('input').iCheck({
					checkboxClass: 'icheckbox_flat-blue',
					radioClass: 'iradio_flat-blue'
				});
				$("input[type='radio']").attr("disabled", true);
				$("input[type='checkbox']").attr("disabled", true);
				$("textarea").attr("disabled", true);
		});
		var parame={
			id:'',
			value:"N",
			width: "100px",
			height:"45px",
			url:'/myehr/question/searchOptionById.action?userId=${sessionScope.userid}',
			jsonParam:{},
			chang:function (e){
			}
		};
		function showLastQuestion(){
			number--;
			$(".singleShow").css("display","none");
			$(".singleShow").eq(number).css("display","block");
			if(number==0){
			$("#lastQuestion").css("display","none");
			}
			if(number<15){
			$("#nextQuestion").css("display","inline-block");
			}
		}
		function showNextQuestion(){
			number++;
			$(".singleShow").css("display","none");
			$(".singleShow").eq(number).css("display","block");
			if(number>0){
			$("#lastQuestion").css("display","inline-block");
			}
			if(number==15){
			$("#nextQuestion").css("display","none");
			}
		}
		function initExaminationQuestion(){
			var data = getExaminationQuestions();
			
			//加载试卷基础信息
			var examinationInfo =data.examinationInfo;
			document.title = examinationInfo.CNAME;
			
			var examinationInfo_title = '<p style="font-size: 35px;font-weight: 900;text-align: center;margin:10px" id="examination_title">'+examinationInfo.CNAME+'</p>';
			var examinationInfo_juanshou = '';
			var examinationInfo_juanwei = '';
			if(examinationInfo.BEGINDESC!=null){
				examinationInfo_juanshou = '<p style="font-size: 12px;font-weight: 700;padding:0 20px;margin:0" id="examination_juanshouyu">'+examinationInfo.BEGINDESC+'</p>';
			}
			if(examinationInfo.ENDDESC!=null){
				examinationInfo_juanwei = '<p style="font-size: 12px;font-weight: 700;padding:0 20px;margin:0" id="examination_juanweiyu">'+examinationInfo.ENDDESC+'</p>';
			}
			
			$("#changeButton").after(examinationInfo_juanshou);
			$("#changeButton").after(examinationInfo_title);
			$("#questionContent").after(examinationInfo_juanwei);
			
			//加载题目
			var single_datas = data.single_datas;
			var multiple_datas = data.multiple_datas;
			var discuss_datas = data.discuss_datas;
			var star_datas = data.star_datas;
			var cellObj = '';
			if(single_datas.length>0){
				cellObj +=  '<p style="font-size: 15px;font-weight: 900;text-align: left;margin:10px" id="examination_title">单选题</P>';
				for(var i=0;i<single_datas.length;i++){
					cellObj += 	'<div class="col-md-12 col-sm-12 col-lg-12 singleShow">'+
								'    <div class="contact-box">'+
								'		<div class="col-sm-11">'+
								'			<h3 style="margin-top:0;color:#000000;font-size:14px" title="'+single_datas[i].CNAME+'"><strong>'+i+'-'+single_datas[i].CNAME+'[单选题]('+single_datas[i].AMOUNT+'分)</strong></h3>'+
								'			<ul class="single" id="Single'+i+'" dataField = "'+single_datas[i].ID+'"></ul>'+
								'		</div>'+
								'		<div class="clearfix"></div>'+
								'	</div>'+
								'</div>';
				}
			}
			if(multiple_datas.length>0){
				cellObj +=  '<p style="font-size: 15px;font-weight: 900;text-align: left;margin:10px" id="examination_title">多选题</P>';
				for(var i=0;i<multiple_datas.length;i++){
					cellObj += 	'<div class="col-md-12 col-sm-12 col-lg-12 singleShow">'+
								'    <div class="contact-box">'+
								'		<div class="col-sm-11">'+
								'			<h3 style="margin-top:0;color:#000000;font-size:14px" title="'+multiple_datas[i].CNAME+'"><strong>'+i+'-'+multiple_datas[i].CNAME+'[多选题]('+multiple_datas[i].AMOUNT+'分)</strong></h3>'+
								'			<ul class="Multiple" id="Multiple'+i+'" dataField = "'+multiple_datas[i].ID+'"></ul>'+
								'		</div>'+
								'		<div class="clearfix"></div>'+
								'	</div>'+
								'</div>';
				}
			}
			if(discuss_datas.length>0){
				cellObj +=  '<p style="font-size: 15px;font-weight: 900;text-align: left;margin:10px" id="examination_title">问答题</P>';
				for(var i=0;i<discuss_datas.length;i++){
					cellObj += 	'<div class="col-md-12 col-sm-12 col-lg-12 singleShow">'+
								'    <div class="contact-box">'+
								'		<div class="col-sm-11">'+
								'			<h3 style="margin-top:0;color:#000000;font-size:14px" title="'+discuss_datas[i].CNAME+'"><strong>'+i+'-'+discuss_datas[i].CNAME+'[问答题]('+discuss_datas[i].AMOUNT+'分)</strong></h3>'+
								'			<ul class="Discuss" id="Discuss'+i+'" dataField = "'+discuss_datas[i].ID+'"></ul>'+
								'		</div>'+
								'		<div class="clearfix"></div>'+
								'	</div>'+
								'</div>';
				}
			}
			if(star_datas.length>0){
				cellObj +=  '<p style="font-size: 15px;font-weight: 900;text-align: left;margin:10px" id="examination_title">星条题</P>';
				for(var i=0;i<star_datas.length;i++){
					cellObj += 	'<div class="col-md-12 col-sm-12 col-lg-12 singleShow">'+
								'    <div class="contact-box">'+
								'		<div class="col-sm-11">'+
								'			<h3 style="margin-top:0;color:#000000;font-size:14px" title="'+star_datas[i].CNAME+'"><strong>'+i+'-'+star_datas[i].CNAME+'[星条题]('+star_datas[i].AMOUNT+'分)</strong></h3>'+
								'			<ul class="Star" id="Star'+i+'" dataField = "'+star_datas[i].ID+'"></ul>'+
								'		</div>'+
								'		<div class="clearfix"></div>'+
								'	</div>'+
								'</div>';
				}
			}
			$('#first_Questions').prepend(cellObj);
		}
		function getExaminationQuestions(){
			var datas ;
			$.ajax({
				url: '/myehr/question/getExaminationDatas.action?planId=${param.planId}&empId=214',
				type:'post',
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function(data) { // 获取当前的数据
					datas = data;
				}
			});
			return datas;
		}
		function initExaminationDataToEmp(empId,planId){
			var data=getExaminationAnswers(empId,planId);
			var answerByEmp_sin=data.answerByEmp_sin;
			var answerByEmp_mult=data.answerByEmp_mult;
			var answerByEmp_dis=data.answerByEmp_dis;
			var answerByEmp_star=data.answerByEmp_star;
			var answerByStand_choose=data.answerByStand_choose;
			var answerByStand_dis=data.answerByStand_dis;
			
			for(var i=0;i<answerByEmp_sin.length;i++){
				var obj = $("[for='"+answerByEmp_sin[i].ANSWER+"']");
				obj.parent().find("[type='radio']").attr("checked",true);
				obj.css("background-color","#e35b5a");
				obj.css("color","#000");
			}
			for(var i=0;i<answerByEmp_mult.length;i++){
				var mults = answerByEmp_mult[i].ANSWER.split(",");
				for(var j=0;j<mults.length;j++){
					var obj = $("[for='"+mults[j]+"']");
					obj.parent().find("[type='checkbox']").attr("checked",true);
					obj.css("background-color","#e35b5a");
					obj.css("color","#000");
				}
			}
			for(var i=0;i<answerByStand_choose.length;i++){
				var obj = $("[for='"+answerByStand_choose[i].ID+"']");
				obj.css("background-color","#44b6ae");
				obj.css("color","#000");
			}
			for(var i=0;i<answerByEmp_dis.length;i++){
				var obj = $("[datafield='"+answerByEmp_dis[i].QID+"']").find("textarea");
				obj.val(answerByEmp_dis[i].ANSWER);
				var standAnswer = '<p style="font-size: 15px;font-weight: 900;text-align: left;margin:10px;color:red">标准答案:'+answerByStand_dis[i].CNAME+'</P>';
				obj.after(standAnswer);
			}
			for(var i=0;i<answerByEmp_star.length;i++){
				var obj = $("[datafield='"+answerByEmp_star[i].QID+"']").find("[value='"+answerByEmp_star[i].ANSWER+"']");
				obj.attr("checked",true);
			}
		}
		function getExaminationAnswers(empId,planId){
			var datas ;
			$.ajax({
				url: '/myehr/question/getExaminationAnswers.action?planId='+planId+'&empId='+empId,
				type:'post',
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function(data) { // 获取当前的数据
					datas = data;
				}
			});
			return datas;
		}
		</script>
	</body>
</html>
