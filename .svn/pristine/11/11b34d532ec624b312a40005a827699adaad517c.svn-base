<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/cardcommon.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>评论</title>
<style>
	.container{
		width: 1000px;
	}
	.commentbox{
		width: 900px;
		margin: 20px auto;
	}
	.mytextarea {
	    width: 100%;
	    overflow: auto;
	    word-break: break-all;
	    height: 100px;
	    color: #000;
	    font-size: 1em;
	    resize: none;
	}
	.comment-list{
		width: 900px;
		margin: 20px auto;
		clear: both;
		padding-top: 20px;
	}
	.comment-list .comment-info{
		position: relative;
		margin-bottom: 20px;
		margin-bottom: 20px;
		border-bottom: 1px solid #ccc;
	}
	.comment-list .comment-info header{
		width: 10%;
		position: absolute;
	}
	.comment-list .comment-info header img{
		width: 100%;
		border-radius: 50%;
		padding: 5px;
	}
	.comment-list .comment-info .comment-right{
		padding:5px 0px 5px 11%; 
	}
	.comment-list .comment-info .comment-right h3{
		margin: 5px 0px;
	}
	.comment-list .comment-info .comment-right .comment-content-header{
		height: 25px;
	}
	.comment-list .comment-info .comment-right .comment-content-header span,.comment-list .comment-info .comment-right .comment-content-footer span{
		padding-right: 2em;
		color: #aaa;
	}
	.comment-list .comment-info .comment-right .comment-content-header span,.comment-list .comment-info .comment-right .comment-content-footer span.reply-btn,.send,.reply-list-btn{
		cursor: pointer;
	}
	.comment-list .comment-info .comment-right .reply-list {
		border-left: 3px solid #ccc;
		padding-left: 7px;
	}
	.comment-list .comment-info .comment-right .reply-list .reply{
		border-bottom: 1px dashed #ccc;
	}
	.comment-list .comment-info .comment-right .reply-list .reply div span{
		padding-left: 10px;
	}
	.comment-list .comment-info .comment-right .reply-list .reply p span{
		padding-right: 2em;
		color: #aaa;
	}
</style>
<script type="text/javascript" src="/myehr/common/js/evaluate.js"></script>
<script type="text/javascript" src="/myehr/common/css/gridbycard/jquery.min.js"></script>
<link rel="stylesheet" href="/myehr/common/css/gridbycard/style.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/common/css/gridbycard/animate.css" type="text/css"></link>
<link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css " rel="stylesheet">
<script type="text/javascript" src="/myehr/common/js/question.js"></script>
<script type="text/javascript" src="/myehr/common/js/icheck.js"></script>
<link rel="stylesheet" href="/myehr/common/js/flat/blue.css" type="text/css"></link>
<script type="text/javascript" src="/myehr/common/js/assets/bootstrap2/bootstrap-switch.min.js"></script>
<link rel="stylesheet" href="/myehr/common/js/assets/bootstrap2/bootstrap-switch.min.css" type="text/css"></link>
<link rel="stylesheet" href="/myehr/common/js/star/css/starability-all.css" type="text/css"></link>
<!-- 弹框-->
<script type="text/javascript" src="/myehr/common/js/layer/layer.js"></script>
</head>
<body>

<div class="container">
	<div class="commentbox">
	<div class="col-sm-11">
					<p style="margin-top:0;color:#000000;font-size:14px;height: 30px;line-height:  30px;float: left;" title="请您评价"><strong>请您评价</strong></p> 
					<ul class="Star" id="Star0" datafield="55">
						<fieldset id="star-num-0" class="starability-slot" style="width: 150px;"> 
						<input type="radio" id="rate41-0" name="rating0" value="179"> 
						<label for="rate41-0" title="极好">179 stars</label> 
						<input type="radio" id="rate31-0" name="rating0" value="178"> 
						<label for="rate31-0" title="好">178 stars</label> 
						<input type="radio" id="rate21-0" name="rating0" value="177"> 
						<label for="rate21-0" title="一般">177 stars</label> 
						<input type="radio" id="rate11-0" name="rating0" value="175"> 
						<label for="rate11-0" title="差">175 stars</label> 
						<input type="radio" id="rate01-0" name="rating0" value="2"> 
						<label for="rate01-0" title="极差">2 stars</label>
						</fieldset>
					</ul>
				</div>
		<textarea cols="80" rows="50" placeholder="来说几句吧......" class="mytextarea" id="contentx"></textarea>
		<div style="margin-left:50%;display:inline-block">
			<input type="button" id="referData"  class="btn btn-success" value="评论" onclick="referDataxxxx()"/>
		</div>
	</div>
	<div class="comment-list">
		<div class="comment-info">
			<div class="comment-right" id="xxxxx">
				
			</div>
		</div>	
	</div>
</div>
<script>
var path ='${pageContext.request.contextPath }';
var formId = '1';
$(function(){
	getDataxx();
})
function referDataxxxx(){
		var content = $("#contentx").val();
		var assess={};
		assess.evaluationFormid=formId;
		assess.evaluationContent=content;
		$.ajax({
            url: '/myehr/evaluation/saveEvaluationList.action?formId='+formId,
		    type:'post',
			data: JSON.stringify(assess),
			cache: false,
			contentType: 'application/json;charset=utf-8',
            success: function(datas) { // 获取当前的数据
				if(datas=="success"){	
					alert("评价成功");
					closex();
				}
			}
		});
		return assess;
	}
</script>
</body>
</html>