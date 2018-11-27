    function queryBatchEdit_672(e) {
        $("#batchEdit"+e).bootstrapTable({
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : false,
            striped : false,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            cache : false,
            columns : [
            {
                title : '机构行业',
                field : 'ORGCOMPANY_COMPTRADE',
                visible :false,
            },{
                title : '机构行业',
                field : 'ORGCOMPANY_COMPTRADE_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPTRADE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '预留1',
                field : 'ORGCOMPANY_ORGGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留1\">"+value+"</a>"
                }
            },
  {
                title : '预留2',
                field : 'ORGCOMPANY_ORGGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留2\">"+value+"</a>"
                }
            },
  {
                title : '预留3',
                field : 'ORGCOMPANY_ORGGROUP3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留3\">"+value+"</a>"
                }
            },
  {
                title : '预留4',
                field : 'ORGCOMPANY_ORGGROUP4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留4\">"+value+"</a>"
                }
            },
  {
                title : '预留5',
                field : 'ORGCOMPANY_ORGGROUP5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留5\">"+value+"</a>"
                }
            },
            {
                title : '是否失效',
                field : 'ORGCOMPANY_ISDISABLED',
                visible :false,
            },{
                title : '是否失效',
                field : 'ORGCOMPANY_ISDISABLED_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ISDISABLED\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构ID',
                field : 'ORGCOMPANY_COMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构ID\">"+value+"</a>"
                }
            },
  {
                title : '租户ID',
                field : 'ORGCOMPANY_ZUID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ZUID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"租户ID\">"+value+"</a>"
                }
            },
  {
                title : '组织码',
                field : 'ORGVCOMPANY_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGVCOMPANY_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"组织码\">"+value+"</a>"
                }
            },
            {
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANY_ISALLOW',
                visible :false,
            },{
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANY_ISALLOW_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ISALLOW\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否保护期',
                field : 'ORGCOMPANY_ISPROTECT',
                visible :false,
            },{
                title : '是否保护期',
                field : 'ORGCOMPANY_ISPROTECT_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ISPROTECT\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '挂片领导',
                field : 'ORGCOMPANY_HANGLEADER',
                visible :false,
            },{
                title : '挂片领导',
                field : 'ORGCOMPANY_HANGLEADER_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_HANGLEADER\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否人行金融机构',
                field : 'ORGCOMPANY_ORG_ISFININSTITU',
                visible :false,
            },{
                title : '是否人行金融机构',
                field : 'ORGCOMPANY_ORG_ISFININSTITU_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORG_ISFININSTITU\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '人行金融机构代码',
                field : 'ORGCOMPANY_ORG_FININSTITU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORG_FININSTITU\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"人行金融机构代码\">"+value+"</a>"
                }
            },
  {
                title : '网点号',
                field : 'ORGCOMPANY_ORG_WEBNUM',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORG_WEBNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"网点号\">"+value+"</a>"
                }
            },
  {
                title : '省联社机构代码',
                field : 'ORGCOMPANY_ORG_PROAGENCCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORG_PROAGENCCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"省联社机构代码\">"+value+"</a>"
                }
            },
  {
                title : '机构编码',
                field : 'ORGCOMPANY_COMPCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_compcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构编码\">"+value+"</a>"
                }
            },
  {
                title : '主键',
                field : 'ORGVCOMPANY_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGVCOMPANY_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"主键\">"+value+"</a>"
                }
            },
  {
                title : '机构名称',
                field : 'ORGCOMPANY_CNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_cname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:underline;color:black;width:100px;\" name=\"ORGCOMPANY_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构名称\">"+value+"</a>"
                }
            },
            {
                title : '机构类型',
                field : 'ORGCOMPANY_COMPTYPE',
                visible :false,
            },{
                title : '机构类型',
                field : 'ORGCOMPANY_COMPTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_comptype,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '上级机构',
                field : 'ORGCOMPANY_PARENTID',
                visible :false,
            },{
                title : '上级机构',
                field : 'ORGCOMPANY_PARENTID_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_parentid,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_PARENTID\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '法人代表',
                field : 'ORGCOMPANY_LEGALPERSON',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_legalperson,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_LEGALPERSON\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"法人代表\">"+value+"</a>"
                }
            },
  {
                title : '机构地址',
                field : 'ORGCOMPANY_ORGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_orgaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构地址\">"+value+"</a>"
                }
            },
  {
                title : '联系电话',
                field : 'ORGCOMPANY_TELPHONE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_telphone,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_TELPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"联系电话\">"+value+"</a>"
                }
            },
            {
                title : '机构状态',
                field : 'ORGCOMPANY_COMPSTATUS',
                visible :false,
            },{
                title : '机构状态',
                field : 'ORGCOMPANY_COMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_compStatus,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构简称',
                field : 'ORGCOMPANY_ENAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_ename,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构简称\">"+value+"</a>"
                }
            },
            {
                title : '机构级别',
                field : 'ORGCOMPANY_COMPLEVEL',
                visible :false,
            },{
                title : '机构级别',
                field : 'ORGCOMPANY_COMPLEVEL_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_complevel,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPLEVEL\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '机构区域',
                field : 'ORGCOMPANY_COMPAREA',
                visible :false,
            },{
                title : '机构区域',
                field : 'ORGCOMPANY_COMPAREA_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_comparea,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_COMPAREA\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '成立日期',
                field : 'ORGCOMPANY_CREATEDATE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_createdate,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANY_CREATEDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"成立日期\">"+date+"</a>";
                }
            },
  {
                title : '注册地址',
                field : 'ORGCOMPANY_REGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_regaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_REGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"注册地址\">"+value+"</a>"
                }
            },
  {
                title : '邮政编码',
                field : 'ORGCOMPANY_POSTCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_postcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_POSTCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"邮政编码\">"+value+"</a>"
                }
            },
  {
                title : '传真号码',
                field : 'ORGCOMPANY_FAX',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_fax,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_FAX\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"传真号码\">"+value+"</a>"
                }
            },
  {
                title : '机构网站',
                field : 'ORGCOMPANY_WEBSITE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_website,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_WEBSITE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构网站\">"+value+"</a>"
                }
            },
  {
                title : '排序',
                field : 'ORGCOMPANY_XORDER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_XORDER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"排序\">"+value+"</a>"
                }
            },
  {
                title : '备注',
                field : 'ORGCOMPANY_REMARK',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"备注\">"+value+"</a>"
                }
            },
  {
                title : '失效日期',
                field : 'ORGCOMPANY_DISABLEDDATE',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_disableddate,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_DISABLEDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"失效日期\">"+value+"</a>"
                }
            },
  {
                title : '组织码',
                field : 'ORGCOMPANY_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANY_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"组织码\">"+value+"</a>"
                }
            },
            {
                title : '最近修改日期',
                field : 'ORGCOMPANY_UPDATETIME',
                align : 'center',
                visible : columnvisible.ORGCOMPANY_updatetime,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"ORGCOMPANY_UPDATETIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"最近修改日期\">"+date+"</a>";
                }
            },
]
})
}
function batchEdit_672(e,formId){
	var selects = $("#"+e).bootstrapTable('getSelections');
	var content = '<table id ="batchEdit'+e+'"></table>';
	layer.open({
		title:'机构信息列表',
		shadeClose: true,
		zIndex:9999,
		area : ['100%', '100%'],
		maxmin: true,            //最大化按钮
		content: content,
		btn: ['保存','关闭'],
		yes: function(index, layero){
		//按钮【按钮一】的回调
			var datas = selects;
			layer.msg('加载中', {
				  icon: 16
				  ,shade: 1
				});
			var trs = $("#batchEdit"+e).find("tbody tr");
			for(var i=0;i<trs.length;i++){
				var input = trs.eq(i).find("input");
				var data = datas[i];
				for(j=0;j<input.length;j++){
					var columnName = input.eq(j).attr("name");
					data[columnName] = input.eq(j).val();
				}
			}
			var reCode = saveFunction(selects,formId);
			if(reCode == '0'){
				layer.alert('保存成功', {
					  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
			}else{
				layer.alert(reCode, {
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
			}
		},
		success:function(layero,index){
			queryBatchEdit_672(e);
			$("#batchEdit"+e).bootstrapTable('load',selects); 
		},
		end:function(){
			$("#"+e).bootstrapTable('refresh');
		}
	}); 
}
    function queryBatchEdit_676(e) {
        $("#batchEdit"+e).bootstrapTable({
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : false,
            striped : false,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            cache : false,
            columns : [
  {
                title : '主键',
                field : 'ORGCOMPANYREG_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"主键\">"+value+"</a>"
                }
            },
  {
                title : '操作类型',
                field : 'ORGCOMPANYREG_XTYPE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XTYPE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"操作类型\">"+value+"</a>"
                }
            },
  {
                title : '机构ID',
                field : 'ORGCOMPANYREG_COMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构ID\">"+value+"</a>"
                }
            },
            {
                title : '机构行业',
                field : 'ORGCOMPANYREG_COMPTRADE',
                visible :false,
            },{
                title : '机构行业',
                field : 'ORGCOMPANYREG_COMPTRADE_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPTRADE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '预留1',
                field : 'ORGCOMPANYREG_ORGGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留1\">"+value+"</a>"
                }
            },
  {
                title : '预留2',
                field : 'ORGCOMPANYREG_ORGGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留2\">"+value+"</a>"
                }
            },
  {
                title : '预留3',
                field : 'ORGCOMPANYREG_ORGGROUP3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留3\">"+value+"</a>"
                }
            },
  {
                title : '预留4',
                field : 'ORGCOMPANYREG_ORGGROUP4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留4\">"+value+"</a>"
                }
            },
  {
                title : '预留5',
                field : 'ORGCOMPANYREG_ORGGROUP5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留5\">"+value+"</a>"
                }
            },
  {
                title : '租户ID',
                field : 'ORGCOMPANYREG_ZUID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ZUID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"租户ID\">"+value+"</a>"
                }
            },
  {
                title : '生效',
                field : 'ORGCOMPANYREG_VALID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"生效\">"+value+"</a>"
                }
            },
  {
                title : '生效人',
                field : 'ORGCOMPANYREG_VALIDBY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALIDBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"生效人\">"+value+"</a>"
                }
            },
            {
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW',
                visible :false,
            },{
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW_DICTNAME',
                align : 'center',
                visible : false,
                valign : '',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISALLOW\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT',
                visible :false,
            },{
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT_DICTNAME',
                align : 'center',
                visible : false,
                valign : '',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISPROTECT\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构码',
                field : 'ORGCOMPANYREG_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构码\">"+value+"</a>"
                }
            },
            {
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER',
                visible :false,
            },{
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER_DICTNAME',
                align : 'center',
                visible : false,
                valign : '',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_HANGLEADER\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU',
                visible :false,
            },{
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_ISFININSTITU\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '人行金融机构代码',
                field : 'ORGCOMPANYREG_ORG_FININSTITU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_FININSTITU\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"人行金融机构代码\">"+value+"</a>"
                }
            },
  {
                title : '网点号',
                field : 'ORGCOMPANYREG_ORG_WEBNUM',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_WEBNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"网点号\">"+value+"</a>"
                }
            },
  {
                title : '省联社机构代码',
                field : 'ORGCOMPANYREG_ORG_PROAGENCCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_PROAGENCCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"省联社机构代码\">"+value+"</a>"
                }
            },
  {
                title : '机构编码',
                field : 'ORGCOMPANYREG_COMPCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构编码\">"+value+"</a>"
                }
            },
  {
                title : '机构名称',
                field : 'ORGCOMPANYREG_CNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_cname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构名称\">"+value+"</a>"
                }
            },
            {
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE',
                visible :false,
            },{
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comptype,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID',
                visible :false,
            },{
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_parentid,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_PARENTID\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '法人代表',
                field : 'ORGCOMPANYREG_LEGALPERSON',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_legalperson,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_LEGALPERSON\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"法人代表\">"+value+"</a>"
                }
            },
  {
                title : '机构地址',
                field : 'ORGCOMPANYREG_ORGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_orgaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构地址\">"+value+"</a>"
                }
            },
  {
                title : '联系电话',
                field : 'ORGCOMPANYREG_TELPHONE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_telphone,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_TELPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"联系电话\">"+value+"</a>"
                }
            },
            {
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS',
                visible :false,
            },{
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compStatus,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构简称',
                field : 'ORGCOMPANYREG_ENAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_ename,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构简称\">"+value+"</a>"
                }
            },
            {
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL',
                visible :false,
            },{
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_complevel,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPLEVEL\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA',
                visible :false,
            },{
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comparea,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPAREA\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '成立日期',
                field : 'ORGCOMPANYREG_VALIDDATE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_VALIDDATE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_VALIDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"成立日期\">"+date+"</a>";
                }
            },
  {
                title : '注册地址',
                field : 'ORGCOMPANYREG_REGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"注册地址\">"+value+"</a>"
                }
            },
  {
                title : '邮政编码',
                field : 'ORGCOMPANYREG_POSTCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_postcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_POSTCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"邮政编码\">"+value+"</a>"
                }
            },
  {
                title : '传真号码',
                field : 'ORGCOMPANYREG_FAX',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_fax,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_FAX\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"传真号码\">"+value+"</a>"
                }
            },
  {
                title : '机构网站',
                field : 'ORGCOMPANYREG_WEBSITE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_website,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_WEBSITE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构网站\">"+value+"</a>"
                }
            },
            {
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY',
                visible :false,
            },{
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regby,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGBY\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '登记时间',
                field : 'ORGCOMPANYREG_REGTIME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regtime,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_REGTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"登记时间\">"+date+"</a>";
                }
            },
  {
                title : '排序',
                field : 'ORGCOMPANYREG_XORDER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XORDER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"排序\">"+value+"</a>"
                }
            },
  {
                title : '备注',
                field : 'ORGCOMPANYREG_REMARK',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"备注\">"+value+"</a>"
                }
            },
]
})
}
function batchEdit_676(e,formId){
	var selects = $("#"+e).bootstrapTable('getSelections');
	var content = '<table id ="batchEdit'+e+'"></table>';
	layer.open({
		title:'机构登记列表',
		shadeClose: true,
		zIndex:9999,
		area : ['100%', '100%'],
		maxmin: true,            //最大化按钮
		content: content,
		btn: ['保存','关闭'],
		yes: function(index, layero){
		//按钮【按钮一】的回调
			var datas = selects;
			layer.msg('加载中', {
				  icon: 16
				  ,shade: 1
				});
			var trs = $("#batchEdit"+e).find("tbody tr");
			for(var i=0;i<trs.length;i++){
				var input = trs.eq(i).find("input");
				var data = datas[i];
				for(j=0;j<input.length;j++){
					var columnName = input.eq(j).attr("name");
					data[columnName] = input.eq(j).val();
				}
			}
			var reCode = saveFunction(selects,formId);
			if(reCode == '0'){
				layer.alert('保存成功', {
					  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
			}else{
				layer.alert(reCode, {
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
			}
		},
		success:function(layero,index){
			queryBatchEdit_676(e);
			$("#batchEdit"+e).bootstrapTable('load',selects); 
		},
		end:function(){
			$("#"+e).bootstrapTable('refresh');
		}
	}); 
}
    function queryBatchEdit_679(e) {
        $("#batchEdit"+e).bootstrapTable({
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : false,
            striped : false,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            cache : false,
            columns : [
  {
                title : '主键',
                field : 'ORGCOMPANYREG_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"主键\">"+value+"</a>"
                }
            },
            {
                title : '操作类型',
                field : 'ORGCOMPANYREG_XTYPE',
                visible :false,
            },{
                title : '操作类型',
                field : 'ORGCOMPANYREG_XTYPE_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构ID',
                field : 'ORGCOMPANYREG_COMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构ID\">"+value+"</a>"
                }
            },
  {
                title : '机构行业',
                field : 'ORGCOMPANYREG_COMPTRADE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPTRADE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构行业\">"+value+"</a>"
                }
            },
  {
                title : '预留1',
                field : 'ORGCOMPANYREG_ORGGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留1\">"+value+"</a>"
                }
            },
  {
                title : '预留2',
                field : 'ORGCOMPANYREG_ORGGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留2\">"+value+"</a>"
                }
            },
  {
                title : '预留3',
                field : 'ORGCOMPANYREG_ORGGROUP3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留3\">"+value+"</a>"
                }
            },
  {
                title : '预留4',
                field : 'ORGCOMPANYREG_ORGGROUP4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留4\">"+value+"</a>"
                }
            },
  {
                title : '预留5',
                field : 'ORGCOMPANYREG_ORGGROUP5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留5\">"+value+"</a>"
                }
            },
  {
                title : '租户ID',
                field : 'ORGCOMPANYREG_ZUID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ZUID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"租户ID\">"+value+"</a>"
                }
            },
            {
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW',
                visible :false,
            },{
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISALLOW\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT',
                visible :false,
            },{
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISPROTECT\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构码',
                field : 'ORGCOMPANYREG_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构码\">"+value+"</a>"
                }
            },
            {
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER',
                visible :false,
            },{
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_HANGLEADER\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构编码',
                field : 'ORGCOMPANYREG_COMPCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构编码\">"+value+"</a>"
                }
            },
  {
                title : '机构名称',
                field : 'ORGCOMPANYREG_CNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_cname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构名称\">"+value+"</a>"
                }
            },
            {
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE',
                visible :false,
            },{
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comptype,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANYREG_COMPTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID',
                visible :false,
            },{
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_parentid,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_PARENTID\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '法人代表',
                field : 'ORGCOMPANYREG_LEGALPERSON',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_legalperson,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_LEGALPERSON\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"法人代表\">"+value+"</a>"
                }
            },
  {
                title : '机构地址',
                field : 'ORGCOMPANYREG_ORGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_orgaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构地址\">"+value+"</a>"
                }
            },
  {
                title : '联系电话',
                field : 'ORGCOMPANYREG_TELPHONE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_telphone,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_TELPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"联系电话\">"+value+"</a>"
                }
            },
            {
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS',
                visible :false,
            },{
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compStatus,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构简称',
                field : 'ORGCOMPANYREG_ENAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_ename,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构简称\">"+value+"</a>"
                }
            },
            {
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL',
                visible :false,
            },{
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_complevel,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPLEVEL\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA',
                visible :false,
            },{
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comparea,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPAREA\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '成立日期',
                field : 'ORGCOMPANYREG_VALIDDATE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_VALIDDATE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_VALIDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"成立日期\">"+date+"</a>";
                }
            },
  {
                title : '注册地址',
                field : 'ORGCOMPANYREG_REGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"注册地址\">"+value+"</a>"
                }
            },
  {
                title : '邮政编码',
                field : 'ORGCOMPANYREG_POSTCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_postcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_POSTCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"邮政编码\">"+value+"</a>"
                }
            },
  {
                title : '传真号码',
                field : 'ORGCOMPANYREG_FAX',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_fax,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_FAX\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"传真号码\">"+value+"</a>"
                }
            },
  {
                title : '机构网站',
                field : 'ORGCOMPANYREG_WEBSITE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_website,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_WEBSITE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构网站\">"+value+"</a>"
                }
            },
            {
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY',
                visible :false,
            },{
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regby,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGBY\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '登记时间',
                field : 'ORGCOMPANYREG_REGTIME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regtime,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_REGTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"登记时间\">"+date+"</a>";
                }
            },
  {
                title : '排序',
                field : 'ORGCOMPANYREG_XORDER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XORDER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"排序\">"+value+"</a>"
                }
            },
  {
                title : '备注',
                field : 'ORGCOMPANYREG_REMARK',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"备注\">"+value+"</a>"
                }
            },
  {
                title : '生效',
                field : 'ORGCOMPANYREG_VALID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"生效\">"+value+"</a>"
                }
            },
  {
                title : '生效人',
                field : 'ORGCOMPANYREG_VALIDBY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALIDBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"生效人\">"+value+"</a>"
                }
            },
  {
                title : '人行金融机构代码',
                field : 'ORGCOMPANYREG_ORG_FININSTITU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_FININSTITU\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"人行金融机构代码\">"+value+"</a>"
                }
            },
  {
                title : '省联社机构代码',
                field : 'ORGCOMPANYREG_ORG_PROAGENCCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_PROAGENCCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"省联社机构代码\">"+value+"</a>"
                }
            },
  {
                title : '网点号',
                field : 'ORGCOMPANYREG_ORG_WEBNUM',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_WEBNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"网点号\">"+value+"</a>"
                }
            },
            {
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU',
                visible :false,
            },{
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_ISFININSTITU\" title=\""+value+"\">"+value+"</a>";
                }
            },

]
})
}
function batchEdit_679(e,formId){
	var selects = $("#"+e).bootstrapTable('getSelections');
	var content = '<table id ="batchEdit'+e+'"></table>';
	layer.open({
		title:'机构变更列表',
		shadeClose: true,
		zIndex:9999,
		area : ['100%', '100%'],
		maxmin: true,            //最大化按钮
		content: content,
		btn: ['保存','关闭'],
		yes: function(index, layero){
		//按钮【按钮一】的回调
			var datas = selects;
			layer.msg('加载中', {
				  icon: 16
				  ,shade: 1
				});
			var trs = $("#batchEdit"+e).find("tbody tr");
			for(var i=0;i<trs.length;i++){
				var input = trs.eq(i).find("input");
				var data = datas[i];
				for(j=0;j<input.length;j++){
					var columnName = input.eq(j).attr("name");
					data[columnName] = input.eq(j).val();
				}
			}
			var reCode = saveFunction(selects,formId);
			if(reCode == '0'){
				layer.alert('保存成功', {
					  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
			}else{
				layer.alert(reCode, {
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
			}
		},
		success:function(layero,index){
			queryBatchEdit_679(e);
			$("#batchEdit"+e).bootstrapTable('load',selects); 
		},
		end:function(){
			$("#"+e).bootstrapTable('refresh');
		}
	}); 
}
    function queryBatchEdit_682(e) {
        $("#batchEdit"+e).bootstrapTable({
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : false,
            striped : false,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            cache : false,
            columns : [
  {
                title : '主键',
                field : 'ORGCOMPANYREG_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"主键\">"+value+"</a>"
                }
            },
            {
                title : '操作类型',
                field : 'ORGCOMPANYREG_XTYPE',
                visible :false,
            },{
                title : '操作类型',
                field : 'ORGCOMPANYREG_XTYPE_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构ID',
                field : 'ORGCOMPANYREG_COMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构ID\">"+value+"</a>"
                }
            },
            {
                title : '机构行业',
                field : 'ORGCOMPANYREG_COMPTRADE',
                visible :false,
            },{
                title : '机构行业',
                field : 'ORGCOMPANYREG_COMPTRADE_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPTRADE\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '预留1',
                field : 'ORGCOMPANYREG_ORGGROUP1',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留1\">"+value+"</a>"
                }
            },
  {
                title : '预留2',
                field : 'ORGCOMPANYREG_ORGGROUP2',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留2\">"+value+"</a>"
                }
            },
  {
                title : '预留3',
                field : 'ORGCOMPANYREG_ORGGROUP3',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP3\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留3\">"+value+"</a>"
                }
            },
  {
                title : '预留4',
                field : 'ORGCOMPANYREG_ORGGROUP4',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留4\">"+value+"</a>"
                }
            },
  {
                title : '预留5',
                field : 'ORGCOMPANYREG_ORGGROUP5',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"预留5\">"+value+"</a>"
                }
            },
  {
                title : '租户ID',
                field : 'ORGCOMPANYREG_ZUID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ZUID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"租户ID\">"+value+"</a>"
                }
            },
            {
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW',
                visible :false,
            },{
                title : '是否享受海岛津贴',
                field : 'ORGCOMPANYREG_ISALLOW_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISALLOW\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT',
                visible :false,
            },{
                title : '是否保护期',
                field : 'ORGCOMPANYREG_ISPROTECT_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ISPROTECT\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构码',
                field : 'ORGCOMPANYREG_ORGCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构码\">"+value+"</a>"
                }
            },
            {
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER',
                visible :false,
            },{
                title : '挂片领导',
                field : 'ORGCOMPANYREG_HANGLEADER_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_HANGLEADER\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构编码',
                field : 'ORGCOMPANYREG_COMPCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构编码\">"+value+"</a>"
                }
            },
  {
                title : '机构名称',
                field : 'ORGCOMPANYREG_CNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_cname,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构名称\">"+value+"</a>"
                }
            },
            {
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE',
                visible :false,
            },{
                title : '机构类型',
                field : 'ORGCOMPANYREG_COMPTYPE_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comptype,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPTYPE\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID',
                visible :false,
            },{
                title : '上级机构',
                field : 'ORGCOMPANYREG_PARENTID_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_parentid,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_PARENTID\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '法人代表',
                field : 'ORGCOMPANYREG_LEGALPERSON',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_legalperson,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_LEGALPERSON\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"法人代表\">"+value+"</a>"
                }
            },
  {
                title : '机构地址',
                field : 'ORGCOMPANYREG_ORGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_orgaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构地址\">"+value+"</a>"
                }
            },
  {
                title : '联系电话',
                field : 'ORGCOMPANYREG_TELPHONE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_telphone,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_TELPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"联系电话\">"+value+"</a>"
                }
            },
            {
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS',
                visible :false,
            },{
                title : '机构状态',
                field : 'ORGCOMPANYREG_COMPSTATUS_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_compStatus,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPSTATUS\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '机构简称',
                field : 'ORGCOMPANYREG_ENAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_ename,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构简称\">"+value+"</a>"
                }
            },
            {
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL',
                visible :false,
            },{
                title : '机构级别',
                field : 'ORGCOMPANYREG_COMPLEVEL_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_complevel,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPLEVEL\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA',
                visible :false,
            },{
                title : '机构区域',
                field : 'ORGCOMPANYREG_COMPAREA_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_comparea,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_COMPAREA\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '成立日期',
                field : 'ORGCOMPANYREG_VALIDDATE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_VALIDDATE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_VALIDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"成立日期\">"+date+"</a>";
                }
            },
  {
                title : '注册地址',
                field : 'ORGCOMPANYREG_REGADDRESS',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regaddress,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"注册地址\">"+value+"</a>"
                }
            },
            {
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU',
                visible :false,
            },{
                title : '是否人行金融机构',
                field : 'ORGCOMPANYREG_ORG_ISFININSTITU_DICTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_ISFININSTITU\" title=\""+value+"\">"+value+"</a>";
                }
            },

  {
                title : '人行金融机构代码',
                field : 'ORGCOMPANYREG_ORG_FININSTITU',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_FININSTITU\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"人行金融机构代码\">"+value+"</a>"
                }
            },
  {
                title : '网点号',
                field : 'ORGCOMPANYREG_ORG_WEBNUM',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_WEBNUM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"网点号\">"+value+"</a>"
                }
            },
  {
                title : '省联社机构代码',
                field : 'ORGCOMPANYREG_ORG_PROAGENCCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_ORG_PROAGENCCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"省联社机构代码\">"+value+"</a>"
                }
            },
  {
                title : '邮政编码',
                field : 'ORGCOMPANYREG_POSTCODE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_postcode,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_POSTCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"邮政编码\">"+value+"</a>"
                }
            },
  {
                title : '传真号码',
                field : 'ORGCOMPANYREG_FAX',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_fax,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_FAX\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"传真号码\">"+value+"</a>"
                }
            },
  {
                title : '机构网站',
                field : 'ORGCOMPANYREG_WEBSITE',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_website,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_WEBSITE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"机构网站\">"+value+"</a>"
                }
            },
            {
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY',
                visible :false,
            },{
                title : '登记人',
                field : 'ORGCOMPANYREG_REGBY_DICTNAME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regby,
                valign : 'left',
				  sortable: true,
                formatter: function (value, row, index) {
						if(value==undefined||value=='null'||value==''){
        					value='-';
    					}
                    	return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REGBY\" title=\""+value+"\">"+value+"</a>";
                }
            },

            {
                title : '登记时间',
                field : 'ORGCOMPANYREG_REGTIME',
                align : 'center',
                visible : columnvisible.ORGCOMPANYREG_regtime,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
        return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:100px\" name=\"ORGCOMPANYREG_REGTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"登记时间\">"+date+"</a>";
                }
            },
  {
                title : '排序',
                field : 'ORGCOMPANYREG_XORDER',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_XORDER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"排序\">"+value+"</a>"
                }
            },
  {
                title : '备注',
                field : 'ORGCOMPANYREG_REMARK',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"备注\">"+value+"</a>"
                }
            },
  {
                title : '生效',
                field : 'ORGCOMPANYREG_VALID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"生效\">"+value+"</a>"
                }
            },
  {
                title : '生效人',
                field : 'ORGCOMPANYREG_VALIDBY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:100px;\" name=\"ORGCOMPANYREG_VALIDBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\"  data-title=\"生效人\">"+value+"</a>"
                }
            },
]
})
}
function batchEdit_682(e,formId){
	var selects = $("#"+e).bootstrapTable('getSelections');
	var content = '<table id ="batchEdit'+e+'"></table>';
	layer.open({
		title:'机构失效列表',
		shadeClose: true,
		zIndex:9999,
		area : ['100%', '100%'],
		maxmin: true,            //最大化按钮
		content: content,
		btn: ['保存','关闭'],
		yes: function(index, layero){
		//按钮【按钮一】的回调
			var datas = selects;
			layer.msg('加载中', {
				  icon: 16
				  ,shade: 1
				});
			var trs = $("#batchEdit"+e).find("tbody tr");
			for(var i=0;i<trs.length;i++){
				var input = trs.eq(i).find("input");
				var data = datas[i];
				for(j=0;j<input.length;j++){
					var columnName = input.eq(j).attr("name");
					data[columnName] = input.eq(j).val();
				}
			}
			var reCode = saveFunction(selects,formId);
			if(reCode == '0'){
				layer.alert('保存成功', {
					  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
			}else{
				layer.alert(reCode, {
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
			}
		},
		success:function(layero,index){
			queryBatchEdit_682(e);
			$("#batchEdit"+e).bootstrapTable('load',selects); 
		},
		end:function(){
			$("#"+e).bootstrapTable('refresh');
		}
	}); 
}
