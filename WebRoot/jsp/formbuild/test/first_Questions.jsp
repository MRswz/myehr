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
		<!--
			<div class="switch" data-on="primary" data-off="info">
				<input id = "QuestionShow" type="checkbox" checked2/>
			</div>
		-->
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
					<div style="margin-right:10px;display:inline-block">
						<input type="button" id="upup"  class="btn btn-success" value="提交" onclick="saveExaminationAnswer()"/>
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
				if('${param.isView}'=='isView'&&'${param.userId}'!=''){//查看试卷
				var userId = '${param.userId}';
				initData(userId);
				}
				$(".Multiple,.single").find('input').iCheck({
					checkboxClass: 'icheckbox_flat-blue',
					radioClass: 'iradio_flat-blue'
				});
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
			var examinationInfo_juanshou = '<p style="font-size: 12px;font-weight: 700;padding:0 20px;margin:0" id="examination_juanshouyu">'+examinationInfo.BEGINDESC+'</p>';
			var examinationInfo_juanwei = '<p style="font-size: 12px;font-weight: 700;padding:0 20px;margin:0" id="examination_juanshouyu">'+examinationInfo.ENDDESC+'</p>';
			$("#changeButton").after(examinationInfo_juanshou);
			$("#changeButton").after(examinationInfo_title);
			$("#questionContent").after(examinationInfo_juanwei);
			
			
			//加载题目
			var single_datas = data.single_datas;
			var multiple_datas = data.multiple_datas;
			var discuss_datas = data.discuss_datas;
			var star_datas = data.star_datas;
			var cellObj = '';
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
		function saveExaminationAnswer(){
			var objs = getExaminationData();
			var url = "/myehr/question/saveExaminationAnswer.action?planId=${param.planId}";
			$.ajax({  
				url: encodeURI(url, "UTF-8"),  
				async:false, //是否为异步操作  
				cache:false,    //是否缓存结果  
				type:"POST",    //请求方式  
				contentType: 'application/json;charset=utf-8',
				data:JSON.stringify(objs),
				success:function(data){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
					if(data[0]=="success"){
						layer.alert('提交完成', {
							  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
							  skin: 'layer-ext-moon' //
							})
					}else if(data[0]=="error"){
						if(data[1]=="1"){
							layer.alert('答案提交异常', {
								  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' //
								})
						}else if(data[1]=="2"){
							layer.alert('提交空卷', {
								  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' //
								})
						}else if(data[1]=="3"){
							layer.alert('该用户已提交过此问卷,不可重复提交', {
								  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
								  skin: 'layer-ext-moon' //
								})
						}
					}
					
				}  
			});
		}
		
		function getExaminationData(){
			var objs_single = $(".single");//单选
			var objs_Multiple = $(".Multiple");//多选
			var objs_Discuss = $(".Discuss");//问答
			var objs_Star = $(".Star");//星条
			var Single_answer = [];
			var Multiple_answer = [];
			var Discuss_answer = [];
			var Star_answer = [];
			var answer_objs = [];
			for(var i=0;i<objs_single.length;i++){
				$("[name='single"+i+"']").each(function(){
					var answer_obj = {};
					answer_obj.qid = parseInt($(objs_single[i]).attr("datafield"));
					//answer_obj.questionType = 'single';
					if($(this).prop('checked')){
						answer_obj.answer = $(this).attr('id');
						Single_answer[i] = answer_obj;
					}
				})
			}
			Array.prototype.push.apply(answer_objs, Single_answer);  
			var j = 0;
			for(var i=0;i<objs_Multiple.length;i++){
				
				var answer_obj = {};
				answer_obj.qid = parseInt($(objs_Multiple[i]).attr("datafield"));
				var num = 0;
				var answer = '';
				$("[name='multiple"+i+"']").each(function(){
					if($(this).prop('checked')&&num==0){
						answer = $(this).attr('id');
						num++;
					}else if($(this).prop('checked')&&num>0){
						answer += ','+$(this).attr('id');
						num++;
					}
				})
				answer_obj.answer = answer;
				Multiple_answer[i] = answer_obj;
			}
			Array.prototype.push.apply(answer_objs, Multiple_answer);
			for(var i=0;i<objs_Discuss.length;i++){
				var answer_obj = {};
				answer_obj.qid = parseInt($(objs_Discuss[i]).attr("datafield"));
				//answer_obj.questionType = 'discuss';
				answer_obj.answer = $("[id='discuss"+i+"']").val();
				Discuss_answer[i] = answer_obj;
			}
			Array.prototype.push.apply(answer_objs, Discuss_answer);
			
			for(var i=0;i<objs_Star.length;i++){
				$("[name='rating"+i+"']").each(function(){
					var answer_obj = {};
					answer_obj.qid = parseInt($(objs_Star[i]).attr("datafield"));
					//answer_obj.questionType = 'star';
					if($(this).prop('checked')){
						answer_obj.answer = $(this).val();
						Star_answer[i] = answer_obj;
					}
				})
			}
			Array.prototype.push.apply(answer_objs, Star_answer);
			return answer_objs;
		}
		</script>
	</body>
</html>
