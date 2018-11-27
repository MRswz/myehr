<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<link rel="stylesheet" href="jscss/css/pictureViewer.css" type="text/css"></link>
	<script type="text/javascript" src="jscss/js/jquery.mousewheel.min.js"></script>
	<script type="text/javascript" src="jscss/js/pictureViewer.js"></script>
</head>
<style>
.tableCell{
	min-height:10px !important;
	padding:0;
}
</style>
<body style="text-align:center">
<div class='TagWall' >
	<label style='display:inline-block'>标签: </label><div id='TagWall' style='display:inline-block'></div>
</div>
<div class="row" style="margin:0;background-color:#eee"  id="CARD_FORM">
	
</div>	
<script>
$(function () {
	showFormList();
});
window.onload=function(){
	addHtml_FormTag('FormTags','TagWall');
}
function showFormList(){
	$("#CARD_FORM").html("");
	var formInfos = getFormBaseInfo();
	for(var i=0;i<formInfos.length;i++){
		var cell =  '<div class="col-md-6 col-sm-12 col-lg-4 PicWall">'+
					'	<div class="image-list" id="wall'+i+'">'+
					'		<div class="" style="padding:30px">'+
					'			<div class="row cell" style="width:160px;font-size:12px;border:none">'+
					'				<div class="col-lg-5 col-md-5 col-sm-5 col-xs-5 tableCell">'+
					'					<h4>表单类型:</h4>'+
					'				</div>'+
					'				<div class="col-lg-7 col-md-7 col-sm-7 col-xs-7 tableCell">'+
					'					<h4>'+formInfos[i].showInfo.formTypeName+'</h4>'+
					'				</div>'+
					'				<div class="col-lg-5 col-md-5 col-sm-5 col-xs-5 tableCell">'+
					'					<h4>主要用途:</h4>'+
					'				</div>'+
					'				<div class="col-lg-7 col-md-7 col-sm-7 col-xs-7 tableCell">'+
					'					<h4>'+formInfos[i].showInfo.formFunction+'</h4>'+
					'				</div>'+
					'				<div class="col-lg-5 col-md-5 col-sm-5 col-xs-5 tableCell">'+
					'					<h4>表单数量:</h4>'+
					'				</div>'+
					'				<div class="col-lg-7 col-md-7 col-sm-7 col-xs-7 tableCell">'+
					'					<h4>'+formInfos[i].number+'</h4>'+
					'				</div>'+
					'				<div class="col-lg-5 col-md-5 col-sm-5 col-xs-5 tableCell">'+
					'					<h4>表单分类:</h4>'+
					'				</div>'+
					'				<div class="col-lg-7 col-md-7 col-sm-7 col-xs-7 tableCell">';
					
					
			var tags = formInfos[i].showInfo.formTag;
			if(tags!=null){
				var tagx = tags.split(",");
				cell += '<ul class=\"tag-list-sm\" style=\"padding: 0\">';	
				for(var k=1;k<tagx.length-1;k++){
					cell += '<li><a id=\"tag_'+k+'\">'+tagx[k]+'</a></li>';
				}
				cell += '</ul>';
			}
				
			
			cell += '				</div>'+
					'				<div class="col-lg-6 col-md-6 col-sm-6 col-xs-6">'+
					'					<input class="btn btn-info" style="width:50px" value="创建" onclick="creatForm(\''+formInfos[i].showInfo.formType+'\',\''+formInfos[i].showInfo.formTypeCode+'\')"/>'+
					'				</div>'+
					'			</div>'+
					'		</div>';
			if(formInfos[i].showInfo.formPic!=null){
				var pics = formInfos[i].showInfo.formPic.split(",");
				for(var j=0;j<pics.length;j++){
					cell += '<div class="cover coverImg"><img src="http://192.168.0.115:9999/表单图片/'+pics[j]+'" alt=""></div>';
				}
			}else{
				cell += '<div class="cover coverImg"><img src="http://192.168.0.115:9999/表单图片/0.png" alt=""></div>';
				cell += '<div class="cover coverImg"><img src="http://192.168.0.115:9999/表单图片/1.png" alt=""></div>';
			}

			cell += '</div></div>';
			$("#CARD_FORM").append(cell);
	}
	for(var i=0;i<formInfos.length;i++){
		$('#wall'+i).on('click', '.cover', function () {
			var this_ = $(this);
			var images = this_.parents('.image-list').find('.cover');
			var imagesArr = new Array();
			$.each(images, function (i, image) {
				imagesArr.push($(image).children('img').attr('src'));
			});
			$.pictureViewer({
				images: imagesArr, //需要查看的图片，数据类型为数组
				initImageIndex: this_.index(), //初始查看第几张图片，默认1
				scrollSwitch: true //是否使用鼠标滚轮切换图片，默认false
			});
		});
	}
}

var tags_Form = "";
function getFormBaseInfo(){
	var url='/myehr/form/showFormBaseInfo.action?tags='+tags_Form;
	var datas = [];
	$.ajax({
		url:url,
		type: 'post',
		cache: true,
		async: false,
		success: function (data) {
			datas = data;
		}
	});
	return datas;
}
function addHtml_FormTag(dictName,id){
	var html = "";
	data = getDictData(dictName);
	html = "<ul class=\"tag-list\" style=\"padding: 0\">";
	for(var i=0;i<data.length;i++){
		html += "<li onclick=\"changeTag_FormTag('"+data[i].dictEntryCode+"')\"><a id=\"tag_"+data[i].dictEntryCode+"\" class=\"\" >"+data[i].dictEntryName+"</a></li>"
	}
	html += "</ul>";
	$("#"+id).html(html);
}	

function creatForm(type,typeCode){
	if('${param.FOLDER_TREE_ID}'==''){
		alert("系统参数错误，未找到业务类型。");
		return;
	}
    var url = '/myehr/jsp/form/formcreate/';
	var content =   "<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">表单编码: </lable>\n"+
					"		<input id=\"formDefCode\" name=\"formDefCode\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">表单名称: </lable>\n"+
					"		<input id=\"formDefName\" name=\"formDefName\" type=\"text\"  required=\"true\" class=\"form-control\"  />\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">表单布局类型: </lable>\n"+
					"		<select id=\"formDefLayoutType\" title=\"表单布局类型\" styleType=\"select\" name=\"formDefLayoutType\" onchange=\"LayoutTypeChanged()\"  class=\"form-control\" style=\"width:200px;\">\n"+
					"			<option value>请选择</option>\n"+
					"			<option value=\"1\">普通卡片式</option>\n"+
					"			<option value=\"2\">栅格式列表</option>\n"+
					"			<option value=\"10\">卡片式列表</option>\n"+
					"			<option value=\"3\">普通树</option>\n"+
					"			<option value=\"4\">普通报表</option>\n"+
					"			<option value=\"6\">方案树</option>\n"+
					"			<option value=\"5\">主从表(tab)</option>\n"+	
					"			<option value=\"7\">多Tab</option>\n"+		
					"			<option value=\"8\">易客报表</option>\n"+		
					"			<option value=\"9\">图表</option>\n"+							
					"			<option value=\"11\">时间轴表单</option>\n"+
					"			<option value=\"12\">布局表单</option>\n"+
					"			<option value=\"13\">问卷表单</option>\n"+
					"			<option value=\"14\">新闻表单</option>\n"+
					"			<option value=\"15\">九宫格表单</option>\n"+
					"			<option value=\"16\">新图表表单</option>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id=\"gridType\" class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\" style=\"display:none\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px\">列表类型: </lable>\n"+
					"		<select id=\"expandField\" title=\"列表类型\" styleType=\"select\" name=\"expandField\"  class=\"form-control\" style=\"width:200px;\">\n"+
					"			<option value=\"\">栅格式列表</option>\n"+
					"			<option value=\"GRIDBYCARD\">卡片式列表</option>\n"+						
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n";
		//	$("#formDefLayoutType ").val(type);		
		layer.open({
			title:'输入内容',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['700px', '300px'],
			btn: ['确定', '取消'],
			success:function(layero,index){
			$("#formDefLayoutType ").val(type);
			$(function(){ $("select").attr("disabled", "disabled");  
       //如果和jquery1.6以上版本，可以使用以下语句：  
        $("select").prop("disabled", true);});  	
			},
			yes: function(index, layero){
				var param = {};
				param.formDefName = $("#formDefName").val();
				param.formDefCode = $("#formDefCode").val();
				param.formDefFolderId = '${param.FOLDER_TREE_ID}';
				param.formDefLayoutType = $("#formDefLayoutType").val();
				param.formDefRowCount = '3,2,1';
				param.formLableWidth =	'200';
				param.expandField = $("#expandField").val();
				if(param.formDefName!=""&&param.formDefCode!=""&&param.formDefLayoutType!=""){
					$.ajax({
						url:'${pageContext.request.contextPath }/form/saveFormParam.action',
						type:'POST',
						data: JSON.stringify(param),
					    cache: false,
					    contentType: 'application/json;charset=utf-8',
						async: false,
						success: function (data) {
								if(data=='0'){
									layer.alert('保存失败!表单编码重复', {
										  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
										  skin: 'layer-ext-moon' 
										})
								} else if(data=='2'){
									layer.alert('保存失败!表单中存在多个此表单编码', {
										  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
										  skin: 'layer-ext-moon' 
										})
									$('#formList_step2').bootstrapTable('refresh'); 
								} else{
									if(param.formDefLayoutType=="1"){
										url+= "formCardBuildStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="2"){
										url+= "formGridBuildStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="3"){
										url+= "formTreeBuildStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="5"){
										url+= "formMstBuildStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="7"){
										url+= "formTabsBuildStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="10"){
										url+= "formGridByCardBuildStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="8"){
										url+= "formYKreportBuildStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="9"){
										url+= "formChartsBuildStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="11"){
										url+= "formTimeAxisBuildStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="12"){
										url+= "formDragFormStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="13"){
										url+= "formQuestionBuildStep.jsp?formDefId="+data;
										layer.close(index);
										window.open(url);
									}else if(param.formDefLayoutType=="16"){
										url+= "formNewChartsBuildStep.jsp?formDefId="+data+"&typeCode="+typeCode;
										layer.close(index);
										window.open(url);
									}
								}
							
							}
						});
				}else{
					layer.alert('信息输入不完整', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
				}
			  },
			btn2: function(index, layero){
				
			  }
		});

}
function changeTag_FormTag(type){
	tags_Form = "";
	if($("#tag_"+type).attr("class")!="tag"){
		$("#tag_"+type).attr("class","tag");
		$("#tag_"+type).css("background-color","orange");
	}else{
		$("#tag_"+type).attr("class","");
		$("#tag_"+type).css("background-color","#f3f3f4");
	}
	var tag = $(".tag");
	for(var i=0;i<tag.length;i++){
		tags_Form += tag[i].innerText+","
	}
	if(tags_Form.length>0){
		tags_Form = tags_Form.substring(0, tags_Form.length-1);
	}
	showFormList();
}	
</script>
</body>
</html>