<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@include file="/common/common.jsp"%>
<%
	String kguid = request.getParameter("kguid");
    kguid = (kguid==null || "root".equals(kguid))?"":kguid;
 %>
<html>
<!-- 
  - Author(s): YICS
  - Date: 2016-04-07 16:18:12
  - Description:
-->
<head>
<title>新增表单子目录</title>
</head>
<body>
<div class="nui-fit"  style="padding-left:0px;">
	<div style="padding-top:5px">
	<div id="form1">
		<input id="Kcalclass.kguid" name="Kcalclass.kguid" value="<%=kguid %>" class="nui-hidden" />
		<input id="Kcalclass.typeCode" name="Kcalclass.typeCode" value="SM"  class="nui-hidden" />
        <table style="width:100%;table-layout:fixed;" class="cbs-table" >
            <tr>
                <td style="width:90px;"><label for="Kcalclass.itemCode$text">日历班次编码：</label></td>
                <td>    
                    <input id="Kcalclass.itemCode" name="Kcalclass.itemCode" class="nui-textbox nui-form-input" required="true" vtype="rangeLength:1,20" width="100%" onvalidation="codevalidation"/>
                </td>
                <td style="width:90px;"><label for="Kcalclass.itemName$text">日历班次名称：</label></td>
                <td>    
                    <input id="Kcalclass.itemName" name="Kcalclass.itemName" class="nui-textbox nui-form-input" required="true" width="100%"  vtype="rangeLength:1,20"/>
                </td>
            </tr>
        </table>         
    </div>
    </div>
</div>
 <div id="toolBar" class="nui-toolbar" style="text-align:center;padding-top:0px;padding-bottom:0px;" 
	    borderStyle="border:0;">
    <div style="text-align:center;padding:5px;">
        <a class="nui-button"  onclick="onOk()" style="margin-right:10px;">保存</a>
        <a class="nui-button"  onclick="onCancel()">取消</a>
    </div>
</body>
<script type="text/javascript">
	nui.parse();
    var form = new nui.Form("#form1");
    
    var kguid = '<%=request.getParameter("kguid") %>';
	
    SetData(kguid);
    function SetData(data){
    	if(kguid=='null'||kguid=='root'){
    		return ;
    	}
    	//跨页面传递的数据对象，克隆后才可以安全使用
       	$.ajax({
	        url: "com.dcf.system.clendar.workday.workday.getRestCalendarFolderById.biz.ext",
	        type: 'POST',
	        data: nui.encode({kguid: kguid}),
	        cache: false,
	        contentType: 'text/json',
	        success: function (text) {
	            if(text.KcalCalss!=null) {
	            	form.setData(text);
	            	nui.get("Kcalclass.itemCode").setValue(text.KcalCalss.itemCode);
	            	nui.get("Kcalclass.itemName").setValue(text.KcalCalss.itemName);
	            	nui.get("Kcalclass.kguid").setValue(text.KcalCalss.kguid);
	            	nui.get("Kcalclass.typeCode").setValue(text.KcalCalss.typeCode);
	            }
	           	
	           	nui.get("Kcalclass.itemCode").setEnabled(false);		           	
	        },
	        error: function (jqXHR, textStatus, errorThrown) {
	            nui.alert(jqXHR.responseText);
	        }
	    });
	}
        
   	function SaveData() {
    	var o = form.getData(true,true);            
			
        form.validate();
        if (form.isValid() == false) return;

        var json = nui.encode(o);
        dcf.mask();
        $.ajax({
            url: "com.dcf.system.clendar.workday.workday.saveRestCalendarFolder.biz.ext",
            type: 'POST',
            data: json,
            cache: false,
            contentType:'text/json',
            success: function (text) {
               	dcf.unmask();
                if (text.reCode == "0") {
          			CloseWindow("ok");
          		}
          		if(text.reCode == "1"){
          			nui.alert("休息日历班次编码重复！", "系统提示", function(action){});
          		}
				if(text.reCode == "2"){
          			nui.alert("休息日历班次名称重复！", "系统提示", function(action){});
          		}
          		if(text.reCode == "4"){
          			CloseWindow("ok");
          		}
            },
            error: function (jqXHR, textStatus, errorThrown) {
                dcf.unmask();
                nui.alert(jqXHR.responseText);
            }
        });
    }
        
    function onOk(e) {
       SaveData();
    }
    
    function onCancel(e) {
        CloseWindow("cancel");
    }
        
    function codevalidation(e){
    	if(e.value == ''){
    		e.errorText = "必填";
	        e.isValid = false;
	        return;
    	}
        	
    	if(e.isValid){
    		if(e.value){
        		var folderTreeCode = e.value;
        		var json = nui.encode({'folderTreeCode':folderTreeCode});
	        	$.ajax({
                    url: "com.dcf.form.SysFormFolderComp.validateFolderCode.biz.ext",
                    type: 'POST',
	                data: json,
	                cache: false,
	                contentType:'text/json',
                    cache: false,
                    async:false,
                    success: function (text) {
                       var o = nui.decode(text);
                        if(o.data == "1"){
                        	e.errorText = "目录编码已存在，请请重新填写";
	        				e.isValid = false;
                        }
                    }
	           });
    		}
    	}
    }
    
	function CloseWindow(action) {            
        if (window.CloseOwnerWindow) {
        	return window.CloseOwnerWindow(action);
        } else {
        	window.close();
        }
	}
</script>
</html>