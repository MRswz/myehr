var color = [];//颜色
	var toolbox_feature_dataView_readOnly={};
	var tooltip_trigger = "";//默认：‘item’，数据项图形出发；'axis'坐标轴出发；'none'什么都不触发
	var tooltip_axisPointer_type = "";//指示器配置项类型，'line' 直线指示器；'shadow' 阴影指示器；'cross' 十字准星指示器。其实是种简写，表示启用两个正交的轴的 axisPointer。
	var toolbox_show = "";//是否显示
	var legend_orient = "";//图例布局朝向。‘horizontal’水平；'vertical'垂直
	var title_text = "";//图表标题
	var grid_borderWidth = null;//网格线宽
	var series_barGap = null;//间隔
	var barMaxWidth = null;//最大宽度
	var grid_x = null;//
	var grid_y = null;//
	var grid_x2 = null;//
	var grid_y2 = null;//
	var toolbox_feature_magicType_Type = {};//启用的动态类型，包括'line'（切换为折线图）, 'bar'（切换为柱状图）, 'stack'（切换为堆叠模式）, 'tiled'（切换为平铺模式）。
	var legend_bottom = null;//[ default: 'auto' ]图例组件离容器下侧的距离。
	var xAxis_axisLabel_show = "";
	var xAxis_axisLabel_interval = null;//坐标轴刻度标签的显示间隔，在类目轴中有效。
	var xAxis_axisLabel_inside = "";//[ default: false ]刻度标签是否朝内，默认朝外。
	var xAxis_axisLabel_rotate = null;//[ default: 0 ]刻度标签旋转的角度，在类目轴的类目标签显示不下的时候可以通过旋转防止标签之间重叠。旋转的角度从 -90 度到 90 度。
	var xAxis_axisLabel_margin = 4;//[ default: 8 ]刻度标签与轴线之间的距离。
	var xAxis_axisLabel_showMinLabel = null;//是否显示最小 tick 的 label。可取值 true, false, null。默认自动判定（即如果标签重叠，不会显示最小 tick 的 label）。
	var xAxis_axisLabel_showMaxLabel = null;//是否显示最大 tick 的 label。可取值 true, false, null。默认自动判定（即如果标签重叠，不会显示最大 tick 的 label）
	var title_x = "";//x轴对其方式
	var xAxis_data = ['周一','周二','周三','周四','周五','周六','周日'];//x坐标轴的显示
	var legend_data = ['直接访问','邮件营销','联盟广告','视频广告','搜索引擎','百度','谷歌','必应','其他'];//图标名称
	var toolbox_feature_restore = {};//配置项还原
	var toolbox_feature_saveAsImage = {};//保存为图片
	var seriesDatas = [];
	var options = {};
	function setOptionx(){
		
		options = {color: color,
					tooltip : {
						trigger: tooltip_trigger,
						axisPointer : {           
							type : tooltip_axisPointer_type        
						}
					},
					toolbox: {
						show: toolbox_show,
						feature: {
							dataView: toolbox_feature_dataView_readOnly,
							magicType: toolbox_feature_magicType_Type,
							restore: toolbox_feature_restore,
							saveAsImage: toolbox_feature_saveAsImage
						}
					},
				   title:{
					   text:title_text,
					   x: title_x
				   },grid:{
					   x:grid_x,
					   y:grid_y,
					   x2:grid_x2,
					   y2:grid_y2,
					   borderWidth:grid_borderWidth
				   },
					legend:{
						data:legend_data,
						orient: legend_orient,
						bottom: legend_bottom
					},
					xAxis:{
						data : xAxis_data,
						axisLabel: {
							show: xAxis_axisLabel_show,
							interval:xAxis_axisLabel_interval,
							inside: xAxis_axisLabel_inside,
							rotate: xAxis_axisLabel_rotate,
							margin: xAxis_axisLabel_margin,
							showMinLabel: xAxis_axisLabel_showMinLabel,
							showMaxLabel: xAxis_axisLabel_showMaxLabel,
							formatter:function(params){
								var newParamsName = '';
								var paramsNameNumber = params.length;
								var provideNumber = 1;
								var rowNumber = Math.ceil(paramsNameNumber / provideNumber);
								if (paramsNameNumber > provideNumber) {
									for (var p = 0; p < rowNumber; p++) {
										var tempStr = '';
										var start = p * provideNumber;
										var end = start + provideNumber;
										if (p == rowNumber - 1) {
											tempStr = params.substring(start, paramsNameNumber);
										} else {
											tempStr = params.substring(start, end) + '\n';
										}
										newParamsName += tempStr;
									}
								} else {
									newParamsName = params;
								}
								return newParamsName
							}
						}
					},
					yAxis: [
						{
							type : 'value'
						}
					],
					series : seriesDatas
					}
	}