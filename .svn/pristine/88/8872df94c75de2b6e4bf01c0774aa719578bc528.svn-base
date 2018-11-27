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
					<input id="radar-colors" name="radar-colors" type="text" class="form-control paramXName"  style="width:100%;" value="#5BBFE9,#FEC86B, #dd70d9, #34cf34,#6497ef, #85802b, #D7504B, #C6E579,#F4E001, #F0805A, #26C0C0" />
				</div>
				
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">触发器类型: </label>
					<select id="radar-tooltip_trigger" title="触发器类型" name="radar-tooltip_trigger" class="form-control paramSelect paramXName" DictName="SYS_CHARTS_tooltip_trigger" dictType="dict">
					</select>
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">图标标题: </label>
					<input id="radar-title_text" name="radar-title_text" type="text" class="form-control paramXName"  style="width:100%;"  value="分支行人员分布"/>
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">副标题: </label>
					<input id="radar-title_subtext" name="radar-title_subtext" type="text" class="form-control paramXName"  style="width:100%;"  value="分支行人员分布"/>
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">对齐方式: </label>
					<select id="radar-title_x" title="是否显示" name="radar-title_x" class="form-control paramSelect paramXName" DictName="SYS_CHARTS_align" dictType="dict">
					</select>
				</div>
				
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">是否显示附加功能: </label>
					<select id="radar-toolbox_show" title="是否显示附加功能" name="radar-toolbox_show" class="form-control paramSelect paramXName" DictName="SYS_CHARTS_toolbox_show" dictType="dict">
					</select>
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">是否显示数据视图: </label>
					<select id="radar-toolbox_dataView_show" title="是否显示数据视图" name="radar-toolbox_dataView_show" class="form-control paramSelect paramXName" DictName="SYS_CHARTS_toolbox_show" dictType="dict">
					</select>
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">是否支持下载视图: </label>
					<select id="radar-toolbox_feature_saveAsImage" title="是否支持下载视图" name="radar-toolbox_feature_saveAsImage" class="form-control paramSelect paramXName" DictName="SYS_CHARTS_toolbox_show" dictType="dict">
					</select>
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">工艺字与图距离: </label>
					<input id="radar-polar_nameGap" name="radar-polar_nameGap" type="text" class="form-control paramXName"  style="width:100%;" value=5 />
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">雷达图大小: </label>
					<input id="radar-polar_radius" name="radar-polar_radius" type="text" class="form-control paramXName"  style="width:100%;" value=130 />
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">网格数个数: </label>
					<input id="radar-polar_splitNumber" name="radar-polar_splitNumber" type="text" class="form-control paramXName"  style="width:100%;" value=4 />
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">图形位置横坐标: </label>
					<input id="radar-polar_center_x" name="radar-polar_center_x" type="text" class="form-control paramXName"  style="width:100%;" value=50% />
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">图形位置纵坐标: </label>
					<input id="radar-polar_center_y" name="radar-polar_center_y" type="text" class="form-control paramXName"  style="width:100%;" value=50% />
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">是否显示工艺文字: </label>
					<select id="radar-polar_name_show" title="是否显示工艺等文字" name="radar-polar_name_show" class="form-control paramSelect paramXName" DictName="SYS_CHARTS_toolbox_show" dictType="dict">
					</select>
				</div>
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">字体颜色数组: </label>
					<input id="radar-polar_name_color" name="radar-polar_name_color" type="text" class="form-control paramXName"  style="width:100%;" value="#a3a5b6" />
				</div>
				
				
				
				
				<div class="col-lg-2 col-md-4 col-sm-4 col-xs-6">
					<label style="float:left;font-size:12px">离容器下侧距离: </label>
					<input id="radar-legend_bottom" name="radar-legend_bottom" type="text" class="form-control paramXName"  style="width:100%;" value="0"/>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<label style="float:left;font-size:12px">x轴关联字段: </label>
					<select id="x_column" title="x轴关联字段" name="x_column" class="form-control trendSelect paramXName" >
					</select>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<label style="float:left;font-size:12px">x轴数据源: </label>
					<input id="x_column_datas" title="x轴数据源" name="x_column_datas" type="text" class="form-control paramXName"  style="width:100%;" />
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<label style="float:left;font-size:12px">x轴关联字典: </label>
					<input id="x_column_dict" title="x轴关联字典" name="x_column_dict" type="text" class="form-control paramXName"  style="width:100%;" />
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<label style="float:left;font-size:12px">图例关联字段: </label>
					<select id="legend_column" title="图例关联字段" name="legend_column" class="form-control trendSelect paramXName" >
					</select>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<label style="float:left;font-size:12px">图例数据源: </label>
					<input id="legend_column_datas" title="图例数据源" name="legend_column_datas" type="text" class="form-control paramSelect paramXName"  style="width:100%;" />
				</div>
				<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
					<label style="float:left;font-size:12px">图例关联字典: </label>
					<input id="legend_column_dict" title="图例关联字典" name="legend_column_dict" type="text" class="form-control paramXName"  style="width:100%;" />
				</div>
			</div>
		</div>
		<div class="col-lg-4 col-md-4 col-sm-4 col-xs-4 dakuang">
			<div class="row content" style="margin-left:0;height:100%;" id="chartJs">
				<input class="btn btn-primary" type="button" value="加载JS" onclick="loadJs()"/>
				<input class="btn btn-primary" type="button" value="运行JS" onclick="yulan()"/>
				<input class="btn btn-primary" type="button" value="保存js" onclick="saveJs()"/>
				<textarea class="chartJs" id="chartJsContent">
				
				</textarea>
			</div>
		</div>
	</div>
	
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
	var title_text = "";//图表标题
	var tooltip_trigger = "";//默认：‘item’，数据项图形出发；'axis'坐标轴出发；'none'什么都不触发
	var title_subtext = "";//文本副标题
	var toolbox_show = "";//是否显示
	var toolbox_feature_dataView_show = "";//是否显示数据视图
	var toolbox_feature_saveAsImage = {};//保存为图片
	var polar_nameGap = null;//图中工艺等字距离图的距离
	var polar_radius = null;//雷达图大小
	var polar_splitNumber = null;//网格数个数
	var polar_center_x = null;//图形横坐标
	var polar_center_y = null;//图形纵坐标
	var polar_name_show = "";//是否显示工艺等文字
	var polar_name_color = "";//工艺字颜色
	
     //var tooltip_axisPointer_type = "";//指示器配置项类型，'line' 直线指示器；'shadow' 阴影指示器；'cross' 十字准星指示器。其实是种简写，表示启用两个正交的轴的 axisPointer。
	
	//var legend_orient = "";//图例布局朝向。‘horizontal’水平；'vertical'垂直
	
	//var grid_borderWidth = null;//网格线宽
	//var series_radarGap = null;//间隔
	//var radarMaxWidth = null;//最大宽度
	//var grid_x = null;//
	//var grid_y = null;//
	//var grid_x2 = null;//
	//var grid_y2 = null;//
	//var toolbox_feature_magicType_Type = {};//启用的动态类型，包括'line'（切换为折线图）, 'radar'（切换为柱状图）, 'stack'（切换为堆叠模式）, 'tiled'（切换为平铺模式）。
	//var legend_bottom = null;//[ default: 'auto' ]图例组件离容器下侧的距离。
	//var xAxis_axisLabel_show = "";
	//var xAxis_axisLabel_interval = null;//坐标轴刻度标签的显示间隔，在类目轴中有效。
	//var xAxis_axisLabel_inside = "";//[ default: false ]刻度标签是否朝内，默认朝外。
	//var xAxis_axisLabel_rotate = null;//[ default: 0 ]刻度标签旋转的角度，在类目轴的类目标签显示不下的时候可以通过旋转防止标签之间重叠。旋转的角度从 -90 度到 90 度。
	//var xAxis_axisLabel_margin = 4;//[ default: 8 ]刻度标签与轴线之间的距离。
	//var xAxis_axisLabel_showMinLabel = null;//是否显示最小 tick 的 label。可取值 true, false, null。默认自动判定（即如果标签重叠，不会显示最小 tick 的 label）。
	//var xAxis_axisLabel_showMaxLabel = null;//是否显示最大 tick 的 label。可取值 true, false, null。默认自动判定（即如果标签重叠，不会显示最大 tick 的 label）
	var title_x = "";//x轴对其方式
	//var xAxis_data = ['周一','周二','周三','周四','周五','周六','周日'];//x坐标轴的显示
	var legend_data = ['直接访问','邮件营销','联盟广告','视频广告','搜索引擎','百度','谷歌','必应','其他'];//图标名称
	//var toolbox_feature_restore = {};//配置项还原
	
function loadJs(){	
	var options = {};
	
	color = $("#radar-colors").val().split(",");
	tooltip_trigger = $("#radar-tooltip_trigger").val();
	title_text  = $("#radar-title_text").val();
	if(title_text==null||title_text==""){
		title_text = "开发柱状图";//图表标题
	}
	title_subtext = $("#radar-title_subtext").val;
	toolbox_show = $("#radar-toolbox_show").val();
	if (toolbox_show=="true"){
		toolbox_show=true;
	}else if(toolbox_show=="false"){
		toolbox_show=false;
	}
	toolbox_feature_dataView_show = $("#radar-toolbox_feature_dataView_show").val();
	if (toolbox_feature_dataView_show=="true"){
		toolbox_feature_dataView_show=true;
	}else if(toolbox_feature_dataView_show=="false"){
		toolbox_feature_dataView_show=false;
	}
	toolbox_feature_saveAsImage =  $("#radar-toolbox_feature_saveAsImage").val();
	if (toolbox_feature_saveAsImage=="true"){
		toolbox_feature_saveAsImage=true;
	}else if(toolbox_feature_saveAsImage=="false"){
		toolbox_feature_saveAsImage=false;
	}
	
	polar_nameGap = $("#radar-polar_nameGap").val();
	polar_radius = $("#radar-polar_radius").val();
	polar_splitNumber = $("#radar-polar_splitNumber").val();
	polar_center_x = $("#radar-polar_center_x").val();
	polar_center_y = $("#radar-polar_center_y").val();
	polar_name_show = $("#radar-polar_name_show").val();
	if (polar_name_show=="true"){
		polar_name_show=true;
	}else if(polar_name_show=="false"){
		polar_name_show=false;
	}
	polar_name_color = $("#radar-polar_name_color").val();
	
	
	
	
	
	legend_bottom = $("#radar-legend_bottom").val();
	if(legend_bottom==null||legend_bottom==""){
		legend_bottom = 0;//
	}
	
	
	

	
	
	
	
	
	title_x = $("#radar-title_x").val();//x轴对其方式
	if(title_x==null||title_x==""){
		title_x = "center";//
	}
	
	if(getChartXDates()!=false){
		xAxis_data = getChartXDates();
	}
	if(getChartLegends()!=false){
		legend_data = getChartLegends();
	}
	
	var Datas = getChartDatas();
	var dateList = [
   
    ['2017-3-1', '初四'],
    ['2017-3-2', '初五'],
    ['2017-3-3', '初六'],
    ['2017-3-4', '初七'],
    ['2017-3-5', '初八', '驚蟄'],
    ['2017-3-6', '初九'],
    ['2017-3-7', '初十'],
    ['2017-3-8', '十一'],
    ['2017-3-9', '十二'],
    ['2017-3-10', '十三'],
    ['2017-3-11', '十四'],
    ['2017-3-12', '十五'],
    ['2017-3-13', '十六'],
    ['2017-3-14', '十七'],
    ['2017-3-15', '十八'],
    ['2017-3-16', '十九'],
    ['2017-3-17', '二十'],
    ['2017-3-18', '廿一'],
    ['2017-3-19', '廿二'],
    ['2017-3-20', '廿三', '春分'],
    ['2017-3-21', '廿四'],
    ['2017-3-22', '廿五'],
    ['2017-3-23', '廿六'],
    ['2017-3-24', '廿七'],
    ['2017-3-25', '廿八'],
    ['2017-3-26', '廿九'],
    ['2017-3-27', '三十'],
    ['2017-3-28', '三月'],
    ['2017-3-29', '初二'],
    ['2017-3-30', '初三'],
    ['2017-3-31', '初四'],
 
  
];

var heatmapData = [];
var lunarData = [];
for (var i = 0; i < dateList.length; i++) {
    heatmapData.push([
        dateList[i][0],
        Math.random() * 300
    ]);
    lunarData.push([
        dateList[i][0],
        1,
        dateList[i][1],
        dateList[i][2]
    ]);
}
	options =   {
    tooltip: {
        formatter: function (params) {
            return '降雨量: ' + params.value[1].toFixed(2);
        }
    },

    visualMap: {
        show: false,
        min: 0,
        max: 300,
        calculable: true,
        seriesIndex: [2],
        orient: 'horizontal',
        left: 'center',
        bottom: 20,
        inRange: {
            color: ['#e0ffff', '#006edd'],
            opacity: 0.3
        },
        controller: {
            inRange: {
                opacity: 0.5
            }
        }
    },

    calendar: [{
        left: 'center',
        top: 'middle',
        cellSize: [70, 70],
        yearLabel: {show: false},
        orient: 'vertical',
        dayLabel: {
            firstDay: 1,
            nameMap: 'cn'
        },
        monthLabel: {
            show: false
        },
        range: '2017-03'
    }],

    series: [{
        type: 'scatter',
        coordinateSystem: 'calendar',
        symbolSize: 1,
        label: {
            normal: {
                show: true,
                formatter: function (params) {
                    var d = echarts.number.parseDate(params.value[0]);
                    return d.getDate() + '\n\n' + params.value[2] + '\n\n';
                },
                textStyle: {
                    color: '#000'
                }
            }
        },
        data: lunarData
    }, {
        type: 'scatter',
        coordinateSystem: 'calendar',
        symbolSize: 1,
        label: {
            normal: {
                show: true,
                formatter: function (params) {
                    return '\n\n\n' + (params.value[3] || '');
                },
                textStyle: {
                    fontSize: 14,
                    fontWeight: 700,
                    color: '#a00'
                }
            }
        },
        data: lunarData
    }, {
        name: '降雨量',
        type: 'heatmap',
        coordinateSystem: 'calendar',
        data: heatmapData
    }]
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
function saveJs(){
	var objval = $(".paramXName");
	var ur = window.location.href;
	
	
	
	
	var formDefId = ur.substring(ur.indexOf("=")+1,ur.indexOf("&"));
	var templateId = ur.substring(ur.indexOf("templateId=")+11);
	var objvalue = [];
	var charts = [];
	for(var i=0;i<objval.length;i++){
		var radar={};
		radar.templateColumnCode = objval.eq(i).attr("id");
		radar.templateColumnValue = objval.eq(i).val();
		radar.templateColumnFormDefId = formDefId;
		radar.templateColumnTemplateId = templateId;
		charts.push(radar);
	}
	$.ajax({
		url:'${pageContext.request.contextPath }/charts/SavechChartsdata.action?formDefId'+formDefId,
		type:'post',
		cache: true,
		async: false,
		contentType: 'application/json;charset=utf-8',
		data :JSON.stringify(charts),
	   success: function (data){ 
			layer.alert('保存成功', {
					  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})

	   }
    });
	
	
	
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