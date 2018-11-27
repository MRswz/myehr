package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.myehr.pojo.formmanage.template.gridbycard.SysGridbycardTemplateColumn;


public class ChartFormBeansUtil implements Serializable {
	public static StringBuffer getChartFormJsp(SysFormconfigCache form,Map map) {
		StringBuffer jsp = new StringBuffer();
		jsp.append(	"\n" +
					"<%@ page language=\"java\" import=\"java.util.*\" import=\"com.myehr.common.util.LangUtil\" pageEncoding=\"UTF-8\"%>\n" +
					"<%@ include file=\"/common/common.jsp\" %>\n"+
					"<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n" +
					"<html>\n" +
					"<head>\n" +
					"<style type=\"text/css\">\n" );
		jsp.append(	".switch{float:left;display:none}\n" +
					"select{float:left;margin-right:5px}\n" +
					".row.cell {margin-bottom:20px}\n" +
					".content{border: 1px solid #ccc;border-radius: 12px;padding:5px 5px 5px 15px}\n" +
					".dakuang{padding:5px 15px 5px 5px;overflow:auto}\n" +
					".chartJs{\n" +
					"	width:100%;height:90%;font-size:14px;resize:none;border-radius: 12px;\n" +
					"}\n" );
		jsp.append(	"</style>\n" +
					"</head>\n" +
					"<body>\n" );
		jsp.append(	"<div class='container-fluid' style='width:100%;height:100%;padding:1% 0'>\n" +
					"	<div class='row' style='margin-left:0;' id='showWall'>\n" +
					"		<div id='test_chart' >\n" +
					"		</div>\n" +
					"	</div>\n" +
					"</div>\n" +
					"<script>\n" );
		jsp.append(	"window.onload=function(){\n" );
		jsp.append(	"	loadJs();\n" +
					"	yulan();\n" );
		jsp.append(	"}		\n" );
		jsp.append(	"	var color = '"+((SysGridbycardTemplateColumn)map.get("bar-colors")).getTemplateColumnValue()+"'.split(',');//颜色\n"+
					"	var toolbox_feature_dataView_readOnly="+((SysGridbycardTemplateColumn)map.get("bar-toolbox_feature_dataView_readOnly")).getTemplateColumnValue()+";\n"+
					"	var tooltip_trigger = '"+((SysGridbycardTemplateColumn)map.get("bar-tooltip_trigger")).getTemplateColumnValue()+"';//默认：‘item’，数据项图形出发；'axis'坐标轴出发；'none'什么都不触发\n"+
					"	var tooltip_axisPointer_type = '"+((SysGridbycardTemplateColumn)map.get("tooltip_axisPointer_type")).getTemplateColumnValue()+"';//指示器配置项类型，'line' 直线指示器；'shadow' 阴影指示器；'cross' 十字准星指示器。其实是种简写，表示启用两个正交的轴的 axisPointer。\n"+
					"	var toolbox_show = '"+((SysGridbycardTemplateColumn)map.get("bar-toolbox_show")).getTemplateColumnValue()+"';//是否显示\n"+
					"	var legend_orient = '"+((SysGridbycardTemplateColumn)map.get("bar-lo")).getTemplateColumnValue()+"';//图例布局朝向。‘horizontal’水平；'vertical'垂直\n"+
					"	var title_text = '"+((SysGridbycardTemplateColumn)map.get("bar-title_text")).getTemplateColumnValue()+"';//图表标题\n"+
					"	var grid_borderWidth = "+((SysGridbycardTemplateColumn)map.get("bar-grid_borderWidth")).getTemplateColumnValue()+";//网格线宽\n"+
					"	var series_barGap = "+((SysGridbycardTemplateColumn)map.get("bar-grid_borderWidth")).getTemplateColumnValue()+";//间隔\n"+
					"	var barMaxWidth = '"+((SysGridbycardTemplateColumn)map.get("bar-barMaxWidth")).getTemplateColumnValue()+"';//最大宽度\n"+
					"	var grid_x = "+((SysGridbycardTemplateColumn)map.get("bar-grid_x")).getTemplateColumnValue()+";//\n"+
					"	var grid_y = "+((SysGridbycardTemplateColumn)map.get("bar-grid_y")).getTemplateColumnValue()+";//\n"+
					"	var grid_x2 = "+((SysGridbycardTemplateColumn)map.get("bar-grid_x2")).getTemplateColumnValue()+";//\n"+
					"	var grid_y2 = "+((SysGridbycardTemplateColumn)map.get("bar-grid_y2")).getTemplateColumnValue()+";//\n"+
					"	var toolbox_feature_magicType_Type = '"+((SysGridbycardTemplateColumn)map.get("bar-toolbox_feature_magicType_Type")).getTemplateColumnValue()+"'.split(',');//启用的动态类型，包括'line'（切换为折线图）, 'bar'（切换为柱状图）, 'stack'（切换为堆叠模式）, 'tiled'（切换为平铺模式）。\n"+
					"	var legend_bottom = "+((SysGridbycardTemplateColumn)map.get("bar-legend_bottom")).getTemplateColumnValue()+";//[ default: 'auto' ]图例组件离容器下侧的距离。\n"+
					"	var xAxis_axisLabel_show = "+((SysGridbycardTemplateColumn)map.get("bar-xAxis_axisLabel_show")).getTemplateColumnValue()+";\n"+
					"	var xAxis_axisLabel_interval = "+((SysGridbycardTemplateColumn)map.get("bar-xAxis_axisLabel_interval")).getTemplateColumnValue()+";//坐标轴刻度标签的显示间隔，在类目轴中有效。\n"+
					"	var xAxis_axisLabel_inside = "+((SysGridbycardTemplateColumn)map.get("bar-xAxis_axisLabel_inside")).getTemplateColumnValue()+";//[ default: false ]刻度标签是否朝内，默认朝外。\n"+
					"	var xAxis_axisLabel_rotate = "+((SysGridbycardTemplateColumn)map.get("bar-xAxis_axisLabel_rotate")).getTemplateColumnValue()+";//[ default: 0 ]刻度标签旋转的角度，在类目轴的类目标签显示不下的时候可以通过旋转防止标签之间重叠。旋转的角度从 -90 度到 90 度。\n"+
					"	var xAxis_axisLabel_margin ="+ ((SysGridbycardTemplateColumn)map.get("bar-xAxis_axisLabel_margin")).getTemplateColumnValue()+";//[ default: 8 ]刻度标签与轴线之间的距离。\n"+
					"	var xAxis_axisLabel_showMinLabel = "+((SysGridbycardTemplateColumn)map.get("bar-xAxis_axisLabel_showMinLabel")).getTemplateColumnValue()+";//是否显示最小 tick 的 label。可取值 true, false, null。默认自动判定（即如果标签重叠，不会显示最小 tick 的 label）。\n"+
					"	var xAxis_axisLabel_showMaxLabel = "+((SysGridbycardTemplateColumn)map.get("bar-xAxis_axisLabel_showMaxLabel")).getTemplateColumnValue()+";//是否显示最大 tick 的 label。可取值 true, false, null。默认自动判定（即如果标签重叠，不会显示最大 tick 的 label）\n"+
					"	var title_x = '"+((SysGridbycardTemplateColumn)map.get("bar-title_x")).getTemplateColumnValue()+"';//x轴对其方式\n"+
					"	var x_column = '"+((SysGridbycardTemplateColumn)map.get("bar-x_column")).getTemplateColumnValue()+"'.split('|')[0];\n"+
					"	var x_column_sql = '"+((SysGridbycardTemplateColumn)map.get("bar-x_column_datas")).getTemplateColumnValue()+"';\n"+
					"	var x_column_dict = '"+((SysGridbycardTemplateColumn)map.get("bar-x_column_dict")).getTemplateColumnValue()+"'.split('|');\n"+
					"	var legend_column = '"+((SysGridbycardTemplateColumn)map.get("bar-legend_column")).getTemplateColumnValue()+"'.split('|')[0];\n"+
					"	var legend_column_sql = '"+((SysGridbycardTemplateColumn)map.get("bar-legend_column_datas")).getTemplateColumnValue()+"';\n"+
					"	var legend_column_dict = '"+((SysGridbycardTemplateColumn)map.get("bar-legend_column_dict")).getTemplateColumnValue()+"'.split('|');\n"+
					"	var groupName = '"+((SysGridbycardTemplateColumn)map.get("bar-groupName")).getTemplateColumnValue()+"';\n"+
					"	var xAxis_data = getChartXDates(x_column,x_column_sql,x_column_dict);\n"+
					"	var xAxis_datax = getChartXDatex(x_column,x_column_sql,x_column_dict);\n"+
					"	var xAxis_data_value = getChartXDates(x_column,x_column_sql,'');\n"+
					"	var legend_data = getChartXDates(legend_column,legend_column_sql,legend_column_dict);//图标名称\n"+
					"	var legend_datax = getChartXDatex(legend_column,legend_column_sql,legend_column_dict);\n"+
					"	var xsql = \""+((SysGridbycardTemplateColumn)map.get("sql1")).getTemplateColumnValue()+"\";\n"+
					"	var ysql = \""+((SysGridbycardTemplateColumn)map.get("sql2")).getTemplateColumnValue()+"\";\n"+
					"	var toolbox_feature_restore = {};//配置项还原\n"+
					"	var toolbox_feature_saveAsImage = {};//保存为图片\n");
					
		jsp.append(	"	var seriesDatas = [];\n"+
					"	var options = {};\n");
		jsp.append(	"	function setOptionx(){\n"+
					"		options = {color: color,\n"+
					"					tooltip : {\n"+
					"						trigger: tooltip_trigger,\n"+
					"						axisPointer : {           \n"+
					"							type : tooltip_axisPointer_type        \n"+
					"						}\n"+
					"					},\n"+
					"					toolbox: {\n"+
					"						show: toolbox_show,\n"+
					"						feature: {\n"+
					"							dataView: toolbox_feature_dataView_readOnly,\n"+
					"							magicType: {type:toolbox_feature_magicType_Type},\n"+
					"							restore: toolbox_feature_restore,\n"+
					"							saveAsImage: toolbox_feature_saveAsImage\n"+
					"						}\n"+
					"					},\n"+
					"				   title:{\n"+
					"					   text:title_text,\n"+
					"					   x: title_x\n"+
					"				   },grid:{\n"+
					"					   x:grid_x,\n"+
					"					   y:grid_y,\n"+
					"					   x2:grid_x2,\n"+
					"					   y2:grid_y2,\n"+
					"					   borderWidth:grid_borderWidth\n"+
					"				   },\n"+
					"					legend:{\n"+
					"						data:legend_data,\n"+
					"						orient: legend_orient,\n"+
					"						bottom: legend_bottom\n"+
					"					},\n"+
					"					xAxis:{\n"+
					"						data : xAxis_data,\n"+
					"						axisLabel: {\n"+
					"							show: xAxis_axisLabel_show,\n"+
					"							interval:xAxis_axisLabel_interval,\n"+
					"							inside: xAxis_axisLabel_inside,\n"+
					"							rotate: xAxis_axisLabel_rotate,\n"+
					"							margin: xAxis_axisLabel_margin,\n"+
					"							showMinLabel: xAxis_axisLabel_showMinLabel,\n"+
					"							showMaxLabel: xAxis_axisLabel_showMaxLabel,\n"+
					"							formatter:function(params){\n"+
					"								var newParamsName = '';\n"+
					"								var paramsNameNumber = params.length;\n"+
					"								var provideNumber = series_barGap;\n"+
					"								var rowNumber = Math.ceil(paramsNameNumber / provideNumber);\n"+
					"								if (paramsNameNumber > provideNumber) {\n"+
					"									for (var p = 0; p < rowNumber; p++) {\n"+
					"										var tempStr = '';\n"+
					"										var start = p * provideNumber;\n"+
					"										var end = start + provideNumber;\n"+
					"										if (p == rowNumber - 1) {\n"+
					"											tempStr = params.substring(start, paramsNameNumber);\n"+
					"										} else {\n"+
					"											tempStr = params.substring(start, end) + '\\n';\n"+
					"										}\n"+
					"										newParamsName += tempStr;\n"+
					"									}\n"+
					"								} else {\n"+
					"									newParamsName = params;\n"+
					"								}\n"+
					"								return newParamsName\n"+
					"							}\n"+
					"						}\n"+
					"					},\n"+
					"					yAxis: [\n"+
					"						{\n"+
					"							type : 'value'\n"+
					"						}\n"+
					"					],\n"+
					"					series : seriesDatas\n"+
					"					}\n"+
					"	}\n");

		jsp.append(	"function loadJs(){	\n" +
					"	seriesDatas = [];\n" +
					"	if(groupName!=null&&groupName!=''){\n" +
					"		var legend_column_g = legend_column.substring(legend_column.indexOf('_')+1,legend_column.length);\n" +
					"		var x_column_g = x_column.substring(x_column.indexOf('_')+1,x_column.length);\n" +
					"		var sql1 = xsql;\n" +
					"		var datas0 = myehr_SQLFORBID_sql(sql1);\n" +
					"		var datas1 = [];\n" +
					"		for(var i=0;i<datas0.length;i++){\n" +
					"			var xxx = {};\n" +
					"			var data = [];\n" +
					"			var name = datas0[i].DATACONTENT+'_'+datas0[i].GROUPNAME;\n" +
					"			legend_data[i] = name;\n" +
					"			var sql2 = ysql;\n" +
					"			datas1[name] = myehr_SQLFORBID_sql(sql2); \n" +
					"			for(var j=0;j<datas1[name].length;j++){\n" +
					"				data[j] = datas1[name][j].DATENUM;\n" +
					"			}\n" +
					"			xxx.name = name;\n" +
					"			xxx.type = 'bar';\n" +
					"			xxx.data = data;\n" +
					"			xxx.stack = datas0[i].DATACONTENT;\n" +
					"			seriesDatas[i] = xxx;\n" +
					"		}\n" +
					"	}else{\n" +
					"		var legend_column_g = legend_column.substring(legend_column.indexOf('_')+1,legend_column.length);\n" +
					"		var x_column_g = x_column.substring(x_column.indexOf('_')+1,x_column.length);\n" +
					"		var sql1 = xsql;\n" +
					"		var datas0 = myehr_SQLFORBID_sql(sql1);\n" +
					"		var datas1 = [];\n" +
					"		for(var i=0;i<datas0.length;i++){\n" +
					"			var xxx = {};\n" +
					"			var data = [];\n" +
					"			var name = legend_datax[datas0[i].DATACONTENT];\n" +
					"			var sql2 = ysql.replace(/\\[yValue\\]/, datas0[i].DATACONTENT);\n" +
					"			datas1[name] = myehr_SQLFORBID_sql(sql2); \n" +
					"			for(var j=0;j<xAxis_data_value.length;j++){\n" +
					"				for(var k=0;k<datas1[name].length;k++){\n" +
					"					if(datas1[name][k].DATACONTENT == xAxis_data_value[j]){\n" +
					"						data[j] = datas1[name][k].DATENUM;\n" +
					"						break;\n"+
					"					}else{\n" +
					"						data[j] = 0;\n" +
					"					}\n" +
					"				}\n" +
					"			}\n" +
					"			xxx.name = name;\n" +
					"			xxx.type = 'bar';\n" +
					"			xxx.data = data;\n" +
					"			seriesDatas[i] = xxx;\n" +
					"		}\n" +
					"	}\n" +
					"	setOptionx();\n" +
					"}\n" +
					"function yulan(){\n" +
					"	document.getElementById('test_chart').style.width='95%';\n" +
					"    document.getElementById('test_chart').style.height='90%';\n" +
					"	echarts.init(document.getElementById('test_chart')).clear();\n" +
					"	var myChart = echarts.init(document.getElementById('test_chart'));\n" +
					//"	var options = JSON.parse($('#chartJsContent').val());\n" +
					"	myChart.setOption(options);\n" +
					"}\n" +
					"</script>\n" +
					"</body>\n" +
					"</html>\n" +
					""); 
		return jsp;
	}
}