$(function(){  
	$(":input").blur(function(){   //此处可获取各种表单如（：text/:button）  
		var required = $(this).attr('required');
		//验证必填
		var checkvalue1 = false;
		if(required=="required"){
			checkvalue1 = checkRequired($(this));
		}
		var vtype = $(this).attr('vtype');
		
		var checkvalue2 = false;
		var checkvalue3 = false;
		if(vtype!="undefined" && vtype!="" && vtype!=null){
			checkvalue2 = checkCommon($(this));
			if(vtype.indexOf("maxLength")>-1 || vtype.indexOf("minLength")>-1){
				checkvalue3 = checkLength($(this));
			}
		}
		
		if(checkvalue1==true&&checkvalue2==true&&checkvalue3==true){
			writeCheckErrorMessage($(this),"");
		}
	});  
 });
 
function checkCommon(obj){
//	var bb=obj.val();
//	var vtype=obj.attr('vtype');
//	var vtypes= new Array();
//	vtypes=vtype.split(";");
//	
//	var re=new RegExp("[^?!@#$%\^&*()]+$");
//	var errorText = "包含非法字符";
//	if (bb !="" && bb!=null) {
//		if(vtypes[0].indexOf("letter")==0){
//			re = new RegExp("^[a-zA-Z\_]+$");//自定义英文
//			errorText = "请输入正确的英文";
//		}
//	    if(vtypes[0].indexOf("zh")==0){
//			re = new RegExp("^[\u4e00-\u9fa5]+$");//自定义中文
//			errorText = "请输入正确的中文";
//		}
//		if(vtypes[0].indexOf("chinaMobile")==0){
//			re = /1\d{10}/;//自定义手机号码
//			errorText = "请输入正确的手机号码";
//		}
//		if(vtypes[0].indexOf("chinaZipcode")==0){
//			re = /[1-9]{1}(\d+){5}/;//自定义邮政编码
//			errorText = "请输入正确的英文";
//		}
//		if(vtypes[0].indexOf("chinaIDNo")==0){
//			re = /^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/;//自定义身份证号码
//			errorText = "请输入正确的身份证号码";
//		}
//		if(vtypes[0].indexOf("email")==0){
//			re = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;//自定义邮箱
//			errorText = "请输入正确的邮箱";
//		}
//	    if (re.test(bb)) return true;
//	    writeCheckErrorMessage(obj,errorText);
//	    return false;
//    }
//    return true;
}
function checkLength(obj){
	var maxLength=0;
	var minLength=0;
	var bb=obj.val();
	var vtype=obj.attr('vtype');
	var vtypes= new Array();
	vtypes=vtype.split(";");
	for(var i=0;i<vtypes.length;i++){
		if(vtypes[i].indexOf("maxLength")==0){
			var maxLengths= new Array();
			maxLengths=vtypes[i].split(":");
			maxLength=maxLengths[1];
		}
		if(vtypes[i].indexOf("minLength")==0){
			var minLengths= new Array();
			minLengths=vtypes[i].split(":");
			minLength=minLengths[1];
		}
	}
	
	if (bb !="" && bb!=null) {
	    if (bb.length>maxLength){
	    	writeCheckErrorMessage(obj,"最大长度为"+maxLength);
	    	return false;
	    }
	    if (bb.length<minLength){
	    	writeCheckErrorMessage(obj,"最小长度为"+minLength);
	    	return false;
	    }
    }
    return true;
}

function checkRequired(obj){
 	/*
	if(obj.val()==null||obj.val()==''){
 		writeCheckErrorMessage(obj,' *');
 		return false;
 	}
 	*/
 	return true;
}
 
function writeCheckErrorMessage(obj,errorMessage){
	var temp = document.getElementById('error_'+obj.attr('id'));
	if(temp){
		temp.innerHTML=errorMessage;
	}else {
    	obj.after("<span id='error_"+obj.attr("id")+"' style='color:red'>"+errorMessage+"</span>");
	}
}