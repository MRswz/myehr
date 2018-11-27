<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" href="../bootstrap2/bootstrap-switch.min.css" type="text/css"></link>
<script type="text/javascript" src="../bootstrap2/bootstrap-switch.min.js"></script>
<style type="text/css">
.switch{float:left;display:none}
select{float:left;margin-right:5px}
.row.cell {margin-bottom:20px}
.content{border: 1px solid #ccc;border-radius: 12px;padding:5px 5px 5px 15px}
.dakuang{padding:5px 15px 5px 5px;overflow:auto}
.chartJs{
	width:100%;height:90%;font-size:14px;resize:none;border-radius: 12px;
}
</style>
</head>
<body>
<div class="container-fluid" style="width:100%;height:100%;padding:1% 0">
	<div class="row" style="width:85%;height:100%;margin:auto auto;">
		
		<div class="col-lg-8 col-md-8 col-sm-8 col-xs-8 dakuang">
			<div class="row content" style="margin-left:0;height:50%;" id="showWall">
				<div id="test_chart" ></div>
			</div>
			<div class="row content" style="margin-left:0;height:50%;" id="chartConfig">
				<div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
					<label style="float:left;font-size:12px">颜色数组: </label>
					<input id="colors" name="colors" type="text" class="form-control"  style="width:100%;" value="#5BBFE9,#FEC86B, #dd70d9, #34cf34,#6497ef, #85802b, #D7504B, #C6E579,#F4E001, #F0805A, #26C0C0" />
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">图例方向: </label>
					<select id="lo" title="图例方向" name="lo" class="form-control paramSelect" DictName="SYS_FORM_CHARTS_legend_orient" dictType="dict">
					</select>                                                                             
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">触发器类型: </label>
					<select id="tooltip_trigger" title="触发器类型" name="tooltip_trigger" class="form-control paramSelect" DictName="SYS_CHARTS_tooltip_trigger" dictType="dict">
					</select>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">图例对齐方式: </label>
					<select id="legend_orient_x" title="图例对齐方式" name="legend_orient_x" class="form-control paramSelect" DictName="SYS_CHARTS_align" dictType="dict"></select>
				</div>
				
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">饼图空心半径: </label>
					<input id="series_radius1" name="series_radius1" type="text" class="form-control"  style="width:100%;" value=0 />
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">饼图实心心半径: </label>
					<input id="series_radius2" name="series_radius2" type="text" class="form-control"  style="width:100%;" value=50 />
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">标签位置: </label>
					<select id="series_label_normal_position" title="标签位置" name="series_label_normal_position" class="form-control paramSelect" DictName="sys_charts_postion" dictType="dict">
					</select>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">是否显示指示字段: </label>
					<select id="series_label_normal_show" title="是否显示指示字段" name="series_label_normal_show" class="form-control paramSelect" DictName="SYS_CHARTS_toolbox_show" dictType="dict">
					</select>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">是否显示引导线: </label>
					<select id="series_label_labelLine_normal_show" title="是否显示引导线" name="series_label_labelLine_normal_show" class="form-control paramSelect" DictName="SYS_CHARTS_toolbox_show" dictType="dict">
					</select>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">标签背景颜色: </label>
					<input id="series_data_normal_backgroundColor" name="series_data_normal_backgroundColor" type="text" class="form-control"  style="width:100%;"  value="#eee"/>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">字体框的颜色: </label>
					<input id="series_data_normal_borderColor" name="series_data_normal_borderColor" type="text" class="form-control"  style="width:100%;"  value="#aaa"/>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">字体框的线宽: </label>
					<input id="series_data_normal_borderWidth" name="series_data_normal_borderWidth" type="text" class="form-control"  style="width:100%;"  value="1"/>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">字体线宽羽化值: </label>
					<input id="series_data_normal_borderRadius" name="series_data_normal_borderRadius" type="text" class="form-control"  style="width:100%;"  value="4"/>
				</div>
				
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">引导线水平长度: </label>
					<input id="series_labelLine_normal_length2" name="series_labelLine_normal_length2" type="text" class="form-control"  style="width:100%;"  value="50"/>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">引导线斜线长度: </label>
					<input id="series_labelLine_normal_length" name="series_labelLine_normal_length" type="text" class="form-control"  style="width:100%;"  value="15"/>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">图例关联字段: </label>
					<select id="bar-legend_column" title="图例关联字段" name="bar-legend_column" class="form-control trendSelect" >
					</select>
				</div>
				
				
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">x轴关联字段: </label>
					<select id="bar-x_column" title="x轴关联字段" name="bar-x_column" class="form-control trendSelect" >
					</select>
				</div>
				
				
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">x轴关联字典: </label>
					<input id="bar-x_column_dict" title="x轴关联字典" name="bar-x_column_dict" type="text" class="form-control"  style="width:100%;" value="dict|sys_datatime"/>
				</div>
				
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">图例数据源: </label>
					<input id="bar-legend_column_datas" title="图例数据源" name="bar-legend_column_datas" type="text" class="form-control"  style="width:100%;" value="select CHARTSTEST_Search_Type from (SELECT  CHARTSTEST.Search_Id AS CHARTSTEST_Search_Id,CHARTSTEST.Search_Type AS CHARTSTEST_Search_Type,CHARTSTEST.Search_Time AS CHARTSTEST_Search_Time,CHARTSTEST.Search_sex AS CHARTSTEST_Search_sex    FROM  CHARTSTEST)o group by CHARTSTEST_Search_Type"/>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">图例关联字典: </label>
					<input id="bar-legend_column_dict" title="x轴关联字典" name="bar-legend_column_dict" type="text" class="form-control"  style="width:100%;" />
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">数据源: </label>
					<input id="bar-DBDATA" title="数据源" name="bar-DBDATA" type="text" class="form-control"  style="width:100%;" value="ChartsTest"/>
				</div>
				<div class="col-lg-3 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">分组字段: </label>
					<input id="bar-groupName" title="分组字段" name="bar-groupName" type="text" class="form-control"  style="width:100%;" value="Search_sex"/>
				</div>
			</div>
		</div>
		
			
		
		<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4 dakuang">
			<div class="row content" style="margin-left:0;height:100%;" id="chartJs">
				<input class="btn btn-primary" type="button" value="加载JS" onclick="loadJs()"/>
				<input class="btn btn-primary" type="button" value="运行JS" onclick="yulan()"/>
				<textarea class="chartJs" id="chartJsContent">
				
				</textarea>
			</div>
		</div>
	</div>
	<!--
	<div  style="width:75%;height:4%;margin:auto auto;">
		<div class="BTNGROUP BTNGROUP_1042" style="margin:5px auto; display:inline-block;height: 30px;">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="yulan"  class="btn btn-primary" value="预览" onclick="yulan()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="save"  class="btn btn-success" value="保存" onclick="save()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addElement"  class="btn btn-info" value="增加" onclick="addElement(null)"/>
			</div>
		</div>
	</div>
	
	<div id="valueContent" class="form-control" style="width:75%;height:103%;margin:auto auto;position:relative;overflow:auto">
		<div class="row cell" id="divSize">
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left;font-size:12px">大屏显示列数: </lable>
					<input id="large" name="" type="text" class="form-control"  style="width:100px;"/>
					<input id="divSize_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left;font-size:12px">小屏显示列数: </lable>
					<input id="middle" name="" type="text" class="form-control"  style="width:100px;"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;">
					<lable style="float:left;font-size:12px">扩展字段显示列数: </lable>
					<input id="small" name="" type="text" class="form-control"  style="width:100px;" />
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">值间链接符号: </lable>
					<input id="divSize_linkMark" name="linkMark" type="hidden" class="form-control"  style="width:220px;" value=""/>
					<input id="divSize_linkMarkName" name="linkMarkName" type="text" class="form-control"  style="width:150px;float:left"/>
					<input type="button" id="chooseFormStep2"  class="btn btn-success" style="float:left" value='跳转表单' onclick="chooseFormStep2()"/>
				</div>
			</div>
		</div>
		<div class="row cell" id="title">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">标题元素: </lable>
					<select id="title_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="title_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">值间链接符号: </lable>
					<input id="title_linkMark" name="linkMark" type="text" class="form-control"  style="width:50px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="title_fontSize" name="fontSize" type="number" class="form-control"  style="width:150px;float:left" value="12"/><p style="float:left">px</p>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="title_fontColor" name="fontColor" type="color" class="form-control"  style="width:150px;" value="#000000"/>
				</div>
			</div>
		</div>
		<div class="row cell" id="address">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">位置元素: </lable>
					<select id="address_columnValue" styleType="select" name="columnValue" class="selectpicker bla bla bli" data-live-search="true" textField="dictName" valueField="dictId" multiSelect="true"  multiple  DictName="SYS_COMPANY_LEVEL" dataField="dict_form_3877" initParam = "_">
					</select>
					<input id="address_id" name="id" type="hidden"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">值间链接符号: </lable>
					<input id="address_linkMark" name="linkMark" type="text" class="form-control"  style="width:50px;" value="-"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">字体大小: </lable>
					<input id="address_fontSize" name="fontSize" type="number" class="form-control"  style="width:150px;float:left" value="12"/><p style="float:left">px</p>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">颜色: </lable>
					<input id="address_fontColor" name="fontColor" type="color" class="form-control"  style="width:150px;" value="#000000"/>
				</div>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control bs-docs-example" style="float:left">
					<lable style="float:left;font-size:12px">是否标签化: </lable>
					<input id="address_isTag" name="isTag" type="text" class="form-control"  style="width:150px;" value="N"/>
				</div>
			</div>
		</div>	
		<div class="row cell" id="photo">
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="float:left">
					<lable style="float:left;font-size:12px">图片元素: </lable>
					<select id="photo_columnValue"  styleType="select" name="columnValue"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMPANY_LEVEL" nullItemText="请选择..." dataField="dict_form_3877"initParam = "_">
					</select>
					<input id="photo_id" name="id" type="hidden"/>
				</div>
			</div>
		</div>
		<div class="row cell" id="name">	
			<div class="col-lg-4 col-md-4 col-sm-12 col-xs-12">
				<div class="ui search selection dropdown entitybox field-control" style="float:left">
					<lable style="float:left;font-size:12px">姓名元素: </lable>
					<select id="name_columnValue" title="" styleType="select" name="columnValue"  class="form-control" emptyText="请选择..."  style="width:200px;" textField="dictName" valueField="dictID" DictName="SYS_COMPANY_LEVEL" nullItemText="请选择..." dataField="dict_form_3877"initParam = "_">
					</select>
					<input id="name_id" name="id" type="hidden"/>
				</div>
			</div>
		</div>
		
	</div>
	-->
</div>
<script id="s1">
	
</script>
<script>
//根据表单ID获取字段信息做下拉项
$(function () { 
	initSelect();
	initData();
})

function initSelect(){
	var data;
	var formDefId = "${param.formDefId}";
	$.ajax({  
        url: '/myehr/formtemplate/getSelect.action?formDefId='+formDefId,  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    dataType:"json",    //服务器返回数据是什么类型  
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
	    	data = result;
	    }  
    });
	$(".trendSelect").each(function(){
		for(var i=0;i<data.length;i++){
			document.getElementById(this.id).options.add(new Option(data[i].text,data[i].id));		
		}
	});
	var classes = [];
	classes = $(".paramSelect");
	var columns = [];
	for(var i=0;i<classes.length;i++){
		var column = {};
		column.formColumnShowType = 'N';//是否空值
		column.formColumnUsName = $(classes[i]).attr("dictname");//字典编码
		column.formColumnGuiType = $(classes[i]).attr("dictType");//字典类型
		columns[i] = column;
	}
	var datas = getselectdatasAll(columns);
	for(var j=0;j<datas.length;j++){
		var data = datas[j];
		for(var i=0;i<data.length;i++){
			document.getElementById(classes[j].id).options.add(new Option(data[i].name,data[i].code));
		}
	}
	$('.selectpicker').selectpicker('refresh');
}
function getselectdatasAll(e){
	var dictDatas;
	$.ajax({ 
	   url:'/myehr/dict/getselectdatasAll.action',
	   type:'post',
	   cache: false,
	   async: false,
	   contentType: 'application/json;charset=utf-8',
	   data: JSON.stringify(e),
	   success: function (datas){ 
		dictDatas = datas;
	   }
   });
   return dictDatas;
}
	var color = [];//颜色
	//var toolbox_feature_dataView_readOnly={};
	var tooltip_trigger = "item";//默认：‘item’，数据项图形出发；'axis'坐标轴出发；'none'什么都不触发
	//var tooltip_axisPointer_type = "";//指示器配置项类型，'line' 直线指示器；'shadow' 阴影指示器；'cross' 十字准星指示器。其实是种简写，表示启用两个正交的轴的 axisPointer。
	//var toolbox_show = "";//是否显示
	var legend_orient = "";//图例布局朝向。‘horizontal’水平；'vertical'垂直
	var legend_orient_x = "left";//图例对齐方式
	//var title_text = "";//图表标题
	//var grid_borderWidth = null;//网格线宽
	//var series_barGap = null;//间隔
	//var barMaxWidth = null;//最大宽度
	//var grid_x = null;//
	//var grid_y = null;//
	//var grid_x2 = null;//
	//var grid_y2 = null;//
	//var toolbox_feature_magicType_Type = {};//启用的动态类型，包括'line'（切换为折线图）, 'bar'（切换为柱状图）, 'stack'（切换为堆叠模式）, 'tiled'（切换为平铺模式）。
	//var legend_bottom = null;//[ default: 'auto' ]图例组件离容器下侧的距离。
	//var xAxis_axisLabel_show = "";
	//var xAxis_axisLabel_interval = null;//坐标轴刻度标签的显示间隔，在类目轴中有效。
	//var xAxis_axisLabel_inside = "";//[ default: false ]刻度标签是否朝内，默认朝外。
	//var xAxis_axisLabel_rotate = null;//[ default: 0 ]刻度标签旋转的角度，在类目轴的类目标签显示不下的时候可以通过旋转防止标签之间重叠。旋转的角度从 -90 度到 90 度。
	//var xAxis_axisLabel_margin = 4;//[ default: 8 ]刻度标签与轴线之间的距离。
	//var xAxis_axisLabel_showMinLabel = null;//是否显示最小 tick 的 label。可取值 true, false, null。默认自动判定（即如果标签重叠，不会显示最小 tick 的 label）。
	//var xAxis_axisLabel_showMaxLabel = null;//是否显示最大 tick 的 label。可取值 true, false, null。默认自动判定（即如果标签重叠，不会显示最大 tick 的 label）
	//var title_x = "";//x轴对其方式
	//var xAxis_data = ['周一','周二','周三','周四','周五','周六','周日'];//x坐标轴的显示
	var legend_data = new Array();//['直达','营销广告','搜索引擎','邮件营销','联盟广告','视频广告','百度','谷歌','必应','其他'];//图标名称
	//var toolbox_feature_restore = {};//配置项还原
	//var toolbox_feature_saveAsImage = {};//保存为图片
	//var series_radius = "";//第一个参数为空心半径，第二个是外围实心
	var series_label_normal_position = 'inner';//标签位置，outside外面
	var series_label_labelLine_normal_show  = "";//是否显示引导线
	var series_label_normal_show = "";//是否显示指示字段
	var series_data_normal_backgroundColor = "";//字体背景颜色
	var series_data_normal_borderColor = "";//字体框的颜色
	var series_data_normal_borderWidth = "";//字体框的线宽
	var series_data_normal_borderRadius = "";//字体线宽羽化值
	var series_radius = new Array();
	var series_labelLine_normal_length = "";//引导线水平长度
	var series_labelLine_normal_length2 = "";//引导线斜线长度
	var seriesDatas = [];
function loadJs(){	
	var options = {};
	color = $("#colors").val().split(",");
	tooltip_trigger = $("#tooltip_trigger").val();
	legend_orient = $("#lo").val();
	legend_orient_x = $("#legend_orient_x").val();
	series_radius1 = $("#series_radius1").val();
	series_radius2 = $("#series_radius2").val();
	if(series_radius1==null){
		series_radius1=0;
	}
	series_radius[0] = series_radius1;
	series_radius[1] = series_radius2;
	series_label_labelLine_normal_show = $("#series_label_labelLine_normal_show").val();
	if(series_label_labelLine_normal_show=="false"){
		series_label_labelLine_normal_show=false;
	}else{
		series_label_labelLine_normal_show=true;
	}
	series_label_normal_show = $("#series_label_normal_show").val();
	if(series_label_normal_show=="false"){
		series_label_normal_show=false;
	}else{
		series_label_normal_show=true;
	}
	series_data_normal_backgroundColor = $("#series_data_normal_backgroundColor").val();
	series_data_normal_borderColor = $("#series_data_normal_borderColor").val();
	series_data_normal_borderWidth = $("#series_data_normal_borderWidth").val();
	series_data_normal_borderRadius = parseInt($("#series_data_normal_borderRadius").val());
	
	series_labelLine_normal_length = parseInt($("#series_labelLine_normal_length").val());
	series_labelLine_normal_length2 =parseInt($("#series_labelLine_normal_length2").val());
	series_label_normal_position = $("#series_label_normal_position").val();
	
	var sql11 = "select Search_Type from ChartsTest2";
	
	var legend_data_sign  =  myehr_SQLFORBID_sql(sql11);
	for(var i=0;legend_data_sign.length>i;i++){
	 legend_data.push(legend_data_sign[i].Search_Type);
	}
	var sql12 = "select Search_Value,Search_Type from ChartsTest2";
	var lseries_data_sign  =  myehr_SQLFORBID_sql(sql12);
	options = {
		color:color,
    tooltip: {
        trigger: tooltip_trigger,
       
    },
    legend: {
        orient: legend_orient,
        x: legend_orient_x,
        data:legend_data,//['直达','营销广告','搜索引擎','邮件营销','联盟广告','视频广告','百度','谷歌','必应','其他']
    },
    series: [
       
        {
            name:'访问来源',
            type:'pie',
            radius: series_radius,
            label: {
                normal: {
					show:series_label_normal_show,
                    position:series_label_normal_position,//'inner'
                    backgroundColor: series_data_normal_backgroundColor,//'#eee',
                    borderColor:series_data_normal_borderColor,//'#aaa',
                    borderWidth: series_data_normal_borderWidth,
                    borderRadius: series_data_normal_borderRadius,
                    // shadowBlur:3,
                    // shadowOffsetX: 2,
                    // shadowOffsetY: 2,
                    // shadowColor: '#999',
                    // padding: [0, 7],
                  
                }
            },
			labelLine: {
                normal: {
                    show: series_label_labelLine_normal_show,//false
					length:series_labelLine_normal_length,//10,
                    length2:series_labelLine_normal_length2,//15
                }
            },
			
            data:[
                {value:335, name:'直达'},
                {value:310, name:'邮件营销'},
                {value:234, name:'联盟广告'},
                {value:135, name:'视频广告'},
                {value:1048, name:'百度'},
                {value:251, name:'谷歌'},
                {value:147, name:'必应'},
                {value:102, name:'其他'}
            ]
        }
    ]
};
	var chartJs = initJson(JSON.stringify(options));
	$("#chartJsContent").val("");
	$("#chartJsContent").val(chartJs);
}

function getChartXDates(){
	var x_column = $("#x_column").val().split('|')[0];
	if(x_column==''||x_column==null){
		return false;
	}
	var x_column_sql = $("#x_column_datas").val();
	if(x_column_sql==''||x_column_sql==null){
		return false;
	}
	var x_column_dict = $("#x_column_dict").val().split("|");
	var x = myehr_SQLFORBID_sql(x_column_sql);
	var y = [];
	if(x_column_dict[0]!=""){
		var dict = getDictDatas(x_column_dict[0],x_column_dict[1]);//获取字典数组
		//翻译数据
		for(var i=0;i<x.length;i++){
			y[i] = dict[x[i][x_column]];
		}
	}else{
		for(var i=0;i<x.length;i++){
			y[i] = x[i][x_column];
		}
	}
	return y ;
}
function getChartDatas(){
	
}
function getChartLegends(){
	var legend_column = $("#legend_column").val().split('|')[0];
	if(legend_column==''||legend_column==null){
		return false;
	}
	var legend_column_sql = $("#legend_column_datas").val();
	if(legend_column_sql==''||legend_column_sql==null){
		return false;
	}
	var legend_column_dict = $("#legend_column_dict").val().split("|");
	var x = myehr_SQLFORBID_sql(legend_column_sql);
	var y = [];
	if(legend_column_dict[0]!=""){
		var dict = getDictDatas(legend_column_dict[0],legend_column_dict[1]);//获取字典数组
		//翻译数据
		for(var i=0;i<x.length;i++){
			y[i] = dict[x[i][legend_column]];
		}
	}else{
		for(var i=0;i<x.length;i++){
			y[i] = x[i][legend_column];
		}
	}
	return y ;
}

function getDictDatas(dictType,dictCode){
	return getDictDatasPublic(dictType,dictCode);//List<Map>
}

function getDictDatasPublic(dictType,dictCode){
	var dictDatas ;
	$.ajax({ 
	   url:'/myehr/dict/selectSqlDictEntryByValue.action?dataField='+dictType+'&DictName='+dictCode,
	   type:'post',
	   cache: false,
	   async: false,
	   success: function (datas){ 
			dictDatas = datas;
	   }
    });
	return dictDatas;
}

function yulan(){
	document.getElementById('test_chart').style.width='95%';
    document.getElementById('test_chart').style.height='90%';
	var myChart = echarts.init(document.getElementById('test_chart'));
	var options = JSON.parse($("#chartJsContent").val());
	myChart.setOption(options);
}
				

function initJson(json, options) {
            var reg = null,
              formatted = '',
              pad = 0,
              PADDING = '    '; // one can also use '\t' or a different number of spaces
            // optional settings
            options = options || {};
            // remove newline where '{' or '[' follows ':'
            options.newlineAfterColonIfBeforeBraceOrBracket = (options.newlineAfterColonIfBeforeBraceOrBracket === true) ? true : false;
            // use a space after a colon
            options.spaceAfterColon = (options.spaceAfterColon === false) ? false : true;

            // begin formatting...

            // make sure we start with the JSON as a string
            if (typeof json !== 'string') {
                json = JSON.stringify(json);
            }
            // parse and stringify in order to remove extra whitespace
            json = JSON.parse(json);
            json = JSON.stringify(json);

            // add newline before and after curly braces
            reg = /([\{\}])/g;
            json = json.replace(reg, '\r\n$1\r\n');

            // add newline before and after square brackets
            reg = /([\[\]])/g;
            json = json.replace(reg, '\r\n$1\r\n');

            // add newline after comma
            reg = /(\,)/g;
            json = json.replace(reg, '$1\r\n');

            // remove multiple newlines
            reg = /(\r\n\r\n)/g;
            json = json.replace(reg, '\r\n');

            // remove newlines before commas
            reg = /\r\n\,/g;
            json = json.replace(reg, ',');

            // optional formatting...
            if (!options.newlineAfterColonIfBeforeBraceOrBracket) {
                reg = /\:\r\n\{/g;
                json = json.replace(reg, ':{');
                reg = /\:\r\n\[/g;
                json = json.replace(reg, ':[');
            }
            if (options.spaceAfterColon) {
                reg = /\:/g;
                json = json.replace(reg, ': ');
            }

            $.each(json.split('\r\n'), function(index, node) {
                var i = 0,
                  indent = 0,
                  padding = '';

                if (node.match(/\{$/) || node.match(/\[$/)) {
                    indent = 1;
                } else if (node.match(/\}/) || node.match(/\]/)) {
                    if (pad !== 0) {
                        pad -= 1;
                    }
                } else {
                    indent = 0;
                }

                for (i = 0; i < pad; i++) {
                    padding += PADDING;
                }

                formatted += padding + node + '\r\n';
                pad += indent;
            });

            return formatted;
        }


var templateId = "0";
function save(){
	var sList = [];
	var rows = $("#valueContent .row.cell");
	var rightNum=0;
	for(var i=0;i<rows.length;i++){
		var sysGridbycardTemplateColumn={};
		if(rows[i].id=='divSize'){
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=$("#large").val()+','+$("#middle").val()+','+$("#small").val();
			sysGridbycardTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}else if(rows[i].id=='address'||rows[i].id=='title'){
			var values = "";
			var columnValue = $(rows[i]).find('select[name="columnValue"]').val();
			if(columnValue!=null){
				for(var j = 0; j<columnValue.length ;j++){
					if(j==0){
						values = values + columnValue[0];
					}else{
						values = values +"&"+ columnValue[j];
					}
				}
				sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
				sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
				sysGridbycardTemplateColumn.templateIsTag=$(rows[i]).find('input[name="isTag"]').val();
				sysGridbycardTemplateColumn.templateColumnLinkMark=$(rows[i]).find('input[name="linkMark"]').val();
			}
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=values;
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
		}else if(rows[i].id=='photo'||rows[i].id=='name'){
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode=rows[i].id;
			sysGridbycardTemplateColumn.templateColumnValue=$(rows[i]).find('select[name="columnValue"]').val();
			sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
			rightNum++;
		}else{
			sysGridbycardTemplateColumn.templateColumnId=$(rows[i]).find('input[name="id"]').val();
			sysGridbycardTemplateColumn.templateColumnTemplateId=${param.templateId};
			sysGridbycardTemplateColumn.templateColumnCode="right"+rightNum;
			sysGridbycardTemplateColumn.templateColumnValue=$(rows[i]).find('select[name="columnValue"]').val();
			sysGridbycardTemplateColumn.templateColumnFontSize=$(rows[i]).find('input[name="fontSize"]').val();
			sysGridbycardTemplateColumn.templateColumnFontColor=$(rows[i]).find('input[name="fontColor"]').val();
			sysGridbycardTemplateColumn.templateColumnFormDefId=${param.formDefId};
			rightNum++;
		}
		sList[i]=sysGridbycardTemplateColumn;
	}
	
	$.ajax({  
        url: '/myehr/formtemplate/saveCardTemplate.action',  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    data:JSON.stringify(sList),
		contentType: 'application/json;charset=utf-8',
	    success:function(result){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
			layer.alert('保存成功', {
					  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
	    	closex();
	    }  
    });
}

var cesllObjNum = 0;
function initData(){
	$.ajax({  
        url: '/myehr/formtemplate/getDataInfo.action?formDefId=${param.formDefId}&templateId=${param.templateId}',  
        async:false, //是否为异步操作  
	    cache:false,    //是否缓存结果  
	    type:"POST",    //请求方式  
	    success:function(datas){   //此函数在服务器执行成功时被调用，参数result是服务器返回的值  
			for(var k=0;k<datas.length;k++){
				if(datas[k].templateColumnCode=='divSize'){
					$("#"+datas[k].templateColumnCode).find('input[name="id"]').val(datas[k].templateColumnId);
					$("#large").val(datas[k].templateColumnValue.split(",")[0]);
					$("#middle").val(datas[k].templateColumnValue.split(",")[1]);
					$("#small").val(datas[k].templateColumnValue.split(",")[2]);
					$("#"+datas[k].templateColumnCode).find('input[name="fontColor"]').val(datas[k].templateColumnFontColor);
				}else if(datas[k].templateColumnCode=='title'||datas[k].templateColumnCode=='address'||datas[k].templateColumnCode=='photo'||datas[k].templateColumnCode=='name'){
					$("#"+datas[k].templateColumnCode).find('input[name="id"]').val(datas[k].templateColumnId);
					$("#"+datas[k].templateColumnCode).find('select[name="columnValue"]').val(datas[k].templateColumnValue.split("&"));
					$("#"+datas[k].templateColumnCode).find('input[name="fontSize"]').val(datas[k].templateColumnFontSize);
					$("#"+datas[k].templateColumnCode).find('input[name="fontColor"]').val(datas[k].templateColumnFontColor);
					$("#"+datas[k].templateColumnCode).find('input[name="isTag"]').val(datas[k].templateIsTag);
					$("#"+datas[k].templateColumnCode).find('input[name="linkMark"]').val(datas[k].templateColumnLinkMark);
				}else{
					addElement(datas[k]);
				}
			}
	    }  
    });
}



function chooseFormStep2(e){
	var url = '/myehr/jsp/form/formcreate/formChoose.jsp?fromType=config_form&widget=model5';
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'选择表单',
		content:url,
		success:function(layero,index){
		},
		end:function(){			
			
		}
	 }); 
} 

function closex(){
	var index=parent.layer.getFrameIndex(window.name);
	parent.layer.close(index);
}

function getFormNameById(formDefId){
	var formDefName;
	$.ajax({
		url:'/myehr/form/getFormNameById.action?formDefId='+formDefId,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
			formDefName = data.formDefName;
			}
		});
	return formDefName;
}



</script>
</body>
</html>