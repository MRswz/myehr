var Template_Type_All = 'TIMELINE';
function openTemplateManage(e){
	var parentObj = $(e).parent().parent();
	var parentCode = parentObj.find(".TEMPLATE_CODE").html();
	layer.msg('是否创建新模板', {
		  time: 0 //不自动关闭
		  ,btn: ['是', '不是']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
			layer.close(index);
			var type = Template_Type_All;
		    var time = getRealRule("[YYYY][MM][DD][hh][mm][ss]");
			var templateCode = type+"_"+time;
			var content;
			content = "<span>"+type+"_"+time+"</span><input type='text' id='markForYou' class='form-control' placeholder='比如\"_WT\"'>";
			layer.open({
				title:'自定义签名',
				shadeClose: true,
				zIndex:9999,
				content: content,
				area: ['100px', '200px'],
				btn: ['好了', '不签'],
				success: function(layero, index){
					
				},
				yes: function(index, layero){
					layer.close(index);
					templateCode += $("#markForYou").val();
					createNewTemplate(templateCode,parentCode);
					
				},
				btn2: function(index, layero){
					layer.close(index);
					createNewTemplate(templateCode,parentCode);
					
				}
			})
		  }
		  ,btn2: function(index){
			 layer.close(index);
				if(parentCode=='ORIGINAL_TIMELINE_WT'){
					layer.alert('对于最原始模板,不允许修改', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' //
						})
					return;
				}else{
					openTemplateConfig(parentCode);
				}
				
		  }
		});
}
function createNewTemplate(code,parentCode){
	var flag = false;
	$.ajax({
		url: "/myehr/formtemplate/createNewTemplate.action?templateType="+Template_Type_All+"&templateCode="+code+"&parentCode="+parentCode,
		type: 'POST',
		cache: false,
		async: false,
		success: function (text) {
			flag = true;
		}
	});
	if(flag){
		openTemplateConfig(code);
	}
}

function openTemplateConfig(code){
	var url = '';
	var title = '';
	if(Template_Type_All=='TIMELINE'){
		url = '/myehr/jsp/form/formcreate/formtemplatebuild/gridtocardtemplate/manageJsp/timeline/timelineConfig.jsp?templateCode='+code;
		title = '时间轴模板配置';
	}
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:title,
		content:url,
		success:function(layero,index){	
			$('.layui-layer-max').click();			
		}
	}); 
}

function loadTempalte(){
	var datas = getTemplateDatas();
	var cellObjs = '';
	for(var i=0;i<datas.length;i++){
		 var dateTime = new Date(datas[i].createTime).Format("yyyy年MM月dd日 hh时mm分")
		 cellObjs += "<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12 TEMPLATE_ELEMENT\">"+
					 "	<div class=\"TEMPLATE_ELEMENT_CONTENT contact-box TOP\">"+
					 "		<div class=\"LEFT DIV2\">"+
					 "			<img class=\"TEMPLATE_PHOTO\" src=\"http://116.62.243.28:9875/"+datas[i].templatePhoto+"\">"+
					 "		</div>"+
					 "		<div class=\"CENTER DIV2\">"+
					 "			<p class=\"TITLE TEMPLATE_CODE\" title=\""+datas[i].templateCode+"\">"+datas[i].templateCode+"</p>"+
					 "			<p class=\"DESC\" title=\"时间轴基础配置模板,诞生于"+dateTime+"\">时间轴基础配置模板,诞生于"+dateTime+"</p>"+
					 "		</div>"+
					 "		<div class=\"RIGHT DIV2\">"+
					 "			<input type=\"text\" readonly class=\"form-control\" title=\"使用模板\" value=\"使用模板\" onclick=\"openTemplateManage(this)\">"+
					 "			<input type=\"hidden\" />"+
					 "		</div>"+
					 "	</div>"+
					 "	<div class=\"TEMPLATE_ELEMENT_CONTENT contact-box BOTTOM\">"+
					 "	</div>"+
					 "</div>";
	}
	$(".TEMPLATE_WALL").html(cellObjs);
}
function getTemplateDatas(){
	var objs ;
	$.ajax({
		url: "/myehr/formtemplate/getTemplateDatas.action?templateType="+Template_Type_All,
		type: 'POST',
		cache: false,
		async: false,
		success: function (datas) {
			objs = datas;
		}
	});
	return objs;
}