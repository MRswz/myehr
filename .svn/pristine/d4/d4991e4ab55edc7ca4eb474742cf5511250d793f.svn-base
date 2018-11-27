//褰撳墠椤靛拰涓€娆℃樉绀哄灏戞潯鏁版嵁(鍗曟潯璁板綍榛樿涓€鏉�)
var Currentpage11 = 0;
var pagesize11 = 1;
var Currentpage21 = 0;//(灞曞紑鏁版嵁鏈€澶�100鏉�)
var pagesize21 = 100;
//褰撳墠椤靛拰涓€娆℃樉绀哄灏戞潯鏁版嵁
var Currentpage01 = 0;
var pagesize01 = 1;
//鐘舵€佸彉閲�
var youxiao1 = 'Y';
var zuixin1 = null;
var newElementNum1 = 0;
function submitButton_save_6093(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6093';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]=='error'){
					alert("鎿嶄綔寮傚父");
					return ;
				}else {
					hzsParam = text;
				}
			}
		});
		if(hzsParam.length>0){
			_param.excresult = hzsParam;
			$.ajax({
				url:'/myehr/form/hzAction.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
				}
			});
		}
submitButton_refer_6093();
	}
}
function submitButton_refer_6093(){
			var paramsMap = {};
			var _param = {};
			paramsMap.bussinessId = BUSSINESSID_ACT;
			_param.formId=formId_main;
			_param = cardGetdata_main_act('#submitButton_main',formId_main);
			_param.buttonId='6093';
			_param.paramsMap = paramsMap;
			_param.actFlowParams= {key:param_key};
			$.ajax({
				url:'/myehr/act/task/start.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
					if(text[0]==0){
						alert("淇濆瓨鎴愬姛");
						closex();
					}else if(text[0]=='error'){
						alert("鎿嶄綔寮傚父");
						return ;
					}else {
						alert("鎿嶄綔澶辫触");
						return ;
					}
				}
			});
		}
function approved_save_6094(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6094';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]=='error'){
					alert("鎿嶄綔寮傚父");
					return ;
				}else {
					hzsParam = text;
				}
			}
		});
		if(hzsParam.length>0){
			_param.excresult = hzsParam;
			$.ajax({
				url:'/myehr/form/hzAction.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
				}
			});
		}
	}
}
function approved_refer_6094(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='閫氳繃'){
			if(!approved_save_6094()){
				content = "<select id='shenpi1' title='閫氳繃鎰忚' name='shenpi' style='width:200px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='approvalopinion' datafield1='dict' onchange='writeYiJian(this)'></select><textarea id='approveRemark' class='SHENPIYIJIANC' rows='7' cols='63' ></textarea>";
			}else{
				layer.alert('鏈夊繀閫夌殑鎸囨爣鏈嬀閫�', {
		  		  	  offset:'50%',
				      shift: 6,
					  icon: 5,//1:鈭�;2:脳;3:闂彿;4:閿�;5:鍝劯;6.绗戣劯;7:锛�;
					  skin: 'layer-ext-moon' 
					})
				return ;
			}
		}else if(buttonType=='椹冲洖'){
			if(!approved_save_6094()){
				getHisTask();
				var datas = hisTask;
				content = "<select id='shenpi2' title='閫氳繃鎰忚' name='shenpi' style='width:200px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='FinalRejection' datafield1='dict' onchange='writeYiJian(this)'></select><div style='margin-bottom:10px'>椹冲洖鏂瑰紡<select id='rejectType' >";
				content+= "<option value ='previousNode'>椹冲洖鍒颁笂鑺傜偣</option>";
				content+= "<option value ='startUser'>椹冲洖鍒扮敵璇蜂汉</option>";
				content+= "</select></div>";
				content += "<div style='margin-bottom:10px'>椹冲洖鑺傜偣<select id='rejectNode' >";
				for(var i=0;i<datas.length;i++){
					content+="<option value ='"+datas[i].taskId+"'>"+datas[i].ACTNAME+"</option>";
				}
				content+="</select></div>";
				content += "<textarea class='SHENPIYIJIANC' id='approveRemark' rows='7' cols='63' ></textarea>";
			}else{
				layer.alert('鏈夊繀閫夌殑鎸囨爣鏈嬀閫�', {
		  		  	  offset:'50%',
				      shift: 6,
					  icon: 5,//1:鈭�;2:脳;3:闂彿;4:閿�;5:鍝劯;6.绗戣劯;7:锛�;
					  skin: 'layer-ext-moon' 
					})
				return ;
			}
		}
		layer.open({
			title:'璇峰～鍐欏鎵规剰瑙�',
			shadeClose: true,
			offset: 't',
			zIndex:9999,
			content: content,
			area: ['500px', '350px'],
			btn: ['纭畾', '鍙栨秷'],
			success: function(layero, index){
				initSelectForShenPi(buttonType);
			},
			yes:function(index, layero){
				var approveRemark=document.getElementById("approveRemark").value;
				var rejectType;
				if(buttonType=='椹冲洖'){
					rejectType=document.getElementById("rejectType").value;
				}
				layer.close(index);
				approved_refer2_6094(buttonType,approveRemark,rejectType);
			},
		})
	}else{
		layer.alert('鏈夊繀閫夌殑鎸囨爣鏈嬀閫�', {
  		  	  offset:'50%',
		      shift: 6,
			  icon: 5,//1:鈭�;2:脳;3:闂彿;4:閿�;5:鍝劯;6.绗戣劯;7:锛�;
			  skin: 'layer-ext-moon' 
			})
	}
}
function approved_refer2_6094(buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
    if(flowAction=='start'){
	    var paramsMap = {};
	    var _param = {};
	    _param.formId=formId_main;
	    _param =  cardGetdata_main_act('#submitButton_main',formId_main);
	    _param.buttonId='6094';
	    _param.paramsMap = paramsMap;
	    _param.actFlowParams= {key:param_key};
	    $.ajax({
		     url:'/myehr/act/task/start.action',
		     type:'post',
		     data: JSON.stringify(_param),
		     cache: false,
			 async: false,
		     contentType: 'application/json;charset=utf-8',
		     success: function (text) {
			     if(text[0]==0){
				     alert("淇濆瓨鎴愬姛锛�");
				     closex();
			     }else if(text[0]=='error'){
				     alert("鎿嶄綔寮傚父");
					 return ;
			     }else {
				     alert("鎿嶄綔澶辫触");
					 return ;
			     }
		     }
	     });
    }else{
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=formId_main;
	     _param =  cardGetdata_main('#submitButton_main',formId_main);
	     _param.buttonId='6094';
	     _param.paramsMap = paramsMap;
	     _param.actFlowParams= {taskId:param_taskId,procInsId:param_procInsId,buttonType:buttonType,approveRemark:approveRemark,rejectType:rejectType};
	     $.ajax({
		     url:'/myehr/act/task/complete.action',
		     type:'post',
		     data: JSON.stringify(_param),
		     cache: false,
			 async: false,
		     contentType: 'application/json;charset=utf-8',
		     success: function (text) {
			     if(text[0]==0){
				     alert("淇濆瓨澶辫触锛�");
					return ;
			     }else if(text[0]=='error'){
				     alert("鎿嶄綔寮傚父");
					return ;
			     }else {
				     alert("鎿嶄綔鎴愬姛");
				     closex();
			     }
		     }
	     });
    }
}
function approved_save_6095(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6095';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]=='error'){
					alert("鎿嶄綔寮傚父");
					return ;
				}else {
					hzsParam = text;
				}
			}
		});
		if(hzsParam.length>0){
			_param.excresult = hzsParam;
			$.ajax({
				url:'/myehr/form/hzAction.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
				}
			});
		}
	}
}
function approved_refer_6095(buttonType){
	if(checkedPointRequire()){
		if(buttonType=='閫氳繃'){
			if(!approved_save_6095()){
				content = "<select id='shenpi1' title='閫氳繃鎰忚' name='shenpi' style='width:200px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='approvalopinion' datafield1='dict' onchange='writeYiJian(this)'></select><textarea id='approveRemark' class='SHENPIYIJIANC' rows='7' cols='63' ></textarea>";
			}else{
				layer.alert('鏈夊繀閫夌殑鎸囨爣鏈嬀閫�', {
		  		  	  offset:'50%',
				      shift: 6,
					  icon: 5,//1:鈭�;2:脳;3:闂彿;4:閿�;5:鍝劯;6.绗戣劯;7:锛�;
					  skin: 'layer-ext-moon' 
					})
				return ;
			}
		}else if(buttonType=='椹冲洖'){
			if(!approved_save_6095()){
				getHisTask();
				var datas = hisTask;
				content = "<select id='shenpi2' title='閫氳繃鎰忚' name='shenpi' style='width:200px;margin-bottom:20px' class='form-control SHENPIYIJIANS' emptytext='' datafield1='dict' required='true' shownullitem='true' dictname='FinalRejection' datafield1='dict' onchange='writeYiJian(this)'></select><div style='margin-bottom:10px'>椹冲洖鏂瑰紡<select id='rejectType' >";
				content+= "<option value ='previousNode'>椹冲洖鍒颁笂鑺傜偣</option>";
				content+= "<option value ='startUser'>椹冲洖鍒扮敵璇蜂汉</option>";
				content+= "</select></div>";
				content += "<div style='margin-bottom:10px'>椹冲洖鑺傜偣<select id='rejectNode' >";
				for(var i=0;i<datas.length;i++){
					content+="<option value ='"+datas[i].taskId+"'>"+datas[i].ACTNAME+"</option>";
				}
				content+="</select></div>";
				content += "<textarea class='SHENPIYIJIANC' id='approveRemark' rows='7' cols='63' ></textarea>";
			}else{
				layer.alert('鏈夊繀閫夌殑鎸囨爣鏈嬀閫�', {
		  		  	  offset:'50%',
				      shift: 6,
					  icon: 5,//1:鈭�;2:脳;3:闂彿;4:閿�;5:鍝劯;6.绗戣劯;7:锛�;
					  skin: 'layer-ext-moon' 
					})
				return ;
			}
		}
		layer.open({
			title:'璇峰～鍐欏鎵规剰瑙�',
			shadeClose: true,
			offset: 't',
			zIndex:9999,
			content: content,
			area: ['500px', '350px'],
			btn: ['纭畾', '鍙栨秷'],
			success: function(layero, index){
				initSelectForShenPi(buttonType);
			},
			yes:function(index, layero){
				var approveRemark=document.getElementById("approveRemark").value;
				var rejectType;
				if(buttonType=='椹冲洖'){
					rejectType=document.getElementById("rejectType").value;
				}
				layer.close(index);
				approved_refer2_6095(buttonType,approveRemark,rejectType);
			},
		})
	}else{
		layer.alert('鏈夊繀閫夌殑鎸囨爣鏈嬀閫�', {
  		  	  offset:'50%',
		      shift: 6,
			  icon: 5,//1:鈭�;2:脳;3:闂彿;4:閿�;5:鍝劯;6.绗戣劯;7:锛�;
			  skin: 'layer-ext-moon' 
			})
	}
}
function approved_refer2_6095(buttonType,approveRemark,rejectType){
    var flowAction = param_flowAction;
    if(flowAction=='start'){
	    var paramsMap = {};
	    var _param = {};
	    _param.formId=formId_main;
	    _param =  cardGetdata_main_act('#submitButton_main',formId_main);
	    _param.buttonId='6095';
	    _param.paramsMap = paramsMap;
	    _param.actFlowParams= {key:param_key};
	    $.ajax({
		     url:'/myehr/act/task/start.action',
		     type:'post',
		     data: JSON.stringify(_param),
		     cache: false,
			 async: false,
		     contentType: 'application/json;charset=utf-8',
		     success: function (text) {
			     if(text[0]==0){
				     alert("淇濆瓨鎴愬姛锛�");
				     closex();
			     }else if(text[0]=='error'){
				     alert("鎿嶄綔寮傚父");
					 return ;
			     }else {
				     alert("鎿嶄綔澶辫触");
					 return ;
			     }
		     }
	     });
    }else{
	     var paramsMap = {};
	     var _param = {};
	     _param.formId=formId_main;
	     _param =  cardGetdata_main('#submitButton_main',formId_main);
	     _param.buttonId='6095';
	     _param.paramsMap = paramsMap;
	     _param.actFlowParams= {taskId:param_taskId,procInsId:param_procInsId,buttonType:buttonType,approveRemark:approveRemark,rejectType:rejectType};
	     $.ajax({
		     url:'/myehr/act/task/complete.action',
		     type:'post',
		     data: JSON.stringify(_param),
		     cache: false,
			 async: false,
		     contentType: 'application/json;charset=utf-8',
		     success: function (text) {
			     if(text[0]==0){
				     alert("淇濆瓨澶辫触锛�");
					return ;
			     }else if(text[0]=='error'){
				     alert("鎿嶄綔寮傚父");
					return ;
			     }else {
				     alert("鎿嶄綔鎴愬姛");
				     closex();
			     }
		     }
	     });
    }
}
function temporaryStorage_save_6096(){
	var paramsMap = {};
	var _param = {};
	var hzsParam = [];
	_param.formId=formId_main;
	_param = cardGetdata_main('#submitButton_main',formId_main);
	_param.buttonId='6096';
	_param.paramsMap = paramsMap;
	if(checkNull($("#MainElement").find("form"))){
		return true;
	}else{
		$.ajax({
			url:'/myehr/form/saveButtonSave.action',
			type:'post',
			data: JSON.stringify(_param),
			cache: false,
			async: false,
			contentType: 'application/json;charset=utf-8',
			success: function (text) {
				if(text[0]=='error'){
					alert("鎿嶄綔寮傚父");
					return ;
				}else if(text[0]='000000'){
					alert("鎿嶄綔鎴愬姛");
					closex();
				}else {
					hzsParam = text;
				}
			}
		});
		if(hzsParam.length>0){
			_param.excresult = hzsParam;
			$.ajax({
				url:'/myehr/form/hzAction.action',
				type:'post',
				data: JSON.stringify(_param),
				cache: false,
				async: false,
				contentType: 'application/json;charset=utf-8',
				success: function (text) {
				}
			});
		}
	}
}
	function LC_ENTRY_LCENTRY_WHETHER_valueChange_4420(e){

		var obj= $('[id="LC_ENTRY.LCENTRY_WHETHER_4420"]');
var val=obj.val();
if(val== 1){
  $('[id="LC_ENTRY.LCENTRY_DEPARTURE_4420"]').next().next().after("<span>*</span>");
  $('[id="LC_ENTRY.LCENTRY_DEPARTURE_4420"]').next().next().next().css({"color":"red","line-height":"35px","font-size":"27px"});
  $('[id="LC_ENTRY.LCENTRY_DEPARTURE_4420"]').attr("required","true");
  $('[id="LC_ENTRY.LCENTRY_RETURNDATE_4420"]').next().next().after("<span>*</span>");
  $('[id="LC_ENTRY.LCENTRY_RETURNDATE_4420"]').next().next().next().css({"color":"red","line-height":"35px","font-size":"27px"});
  $('[id="LC_ENTRY.LCENTRY_RETURNDATE_4420"]').attr("required","true");
  $('[id="LC_ENTRY.LCENTRY_DISCIPLINE_4420"]').prev().before("<div style='border:2px solid #F2F2F2;'><p>1銆佷弗鏍兼墽琛屽嚭鍥斤紙澧冿級浠诲姟鎵逛欢鎵瑰噯鐨勫唴瀹癸紝涓嶅緱鎿呰嚜寤堕暱鍦ㄥ鍋滅暀鏃堕棿锛涙湭缁忔壒鍑嗕笉寰楀彉鏇村嚭璁胯矾绾匡紝涓嶅緱闅忔剰鍒犲噺浜嬪厛鍟嗗畾鐨勫叕鍔℃椿鍔紱 涓嶅緱鍙傚姞涓庡嚭鍥戒换鍔℃棤鍏崇殑娲诲姩鍜屼細璁€�</p>"+ 
"<p>2銆佷弗鏍兼墽琛岃绀烘眹鎶ュ埗搴︼紝涓嶅緱闅忔剰鍗曠嫭琛屽姩銆�</p>"+ 
"<p>3銆佷弗绂佸嚭鍏ヨ祵鍗氥€佽壊鎯呯瓑涓嶆褰撳満鎵€銆�</p>"+ 
"<p>4銆佷笉寰楀弬鍔犳秹鍙婁綆绾ц叮鍛崇殑濞变箰娓歌椤圭洰锛涗笉寰楄繚鍙嶈瀹氭敹閫佺ぜ鍝併€�</p>"+ 
"<p>5銆佽唉铏氳皑鎱庯紝灏婇噸鍚勫浗椋庝織涔犳儻锛涜█璋堟湁鍒嗗锛屼笉鍋氫换浣曚笉鍒╀簬鍥藉鍜屽崟浣嶇殑浜嬶紝涓嶈浠讳綍涓嶅埄浜庡浗瀹跺拰鍗曚綅鐨勮瘽銆�</p>"+ 
"<p>6銆佹湭缁忔壒鍑嗭紝涓嶅緱鎼哄甫娑夊瘑杞戒綋锛屼笉寰楀澶栨彁渚涘唴閮ㄦ枃浠跺拰璧勬枡锛屼笉寰楁硠闇插唴閮ㄩ儴缃插拰鍐崇瓥銆�</p>"+ 
"<p>7銆佷笉鍦ㄩ潪淇濆瘑鍦烘墍璋堣娑夊瘑浜嬮」锛屼笉寰楁硠闇插浗瀹剁瀵嗗拰鍟嗕笟绉樺瘑銆�</p>"+ 
"<p>8銆佸湪澶栨湡闂撮伩鍏嶄笌鍙枒浜哄憳鎺ヨЕ锛屾嫆鏀朵换浣曞彲鐤戜俊鍑藉拰鐗╁搧锛屽寮洪槻鐩椼€侀槻鎶€侀槻璇堥獥鐨勮嚜鎴戜繚鎶ゆ剰璇嗐€�</p>"+ 
"<p>9銆佸繀椤诲繝浜庣鍥斤紝鑷缁存姢鍥藉涓绘潈銆佸浗瀹跺舰璞″拰姘戞棌灏婁弗銆�</p>"+ 
"<p>10銆侀伒瀹堢洰鐨勫浗锛堝锛夋硶寰嬫硶瑙勫拰鍑哄叆澧冩惡甯﹀姹囥€佺墿鍝佺殑闄愬埗鎬ц瀹氥€�</p>"+ 
"<p>11銆侀噸瑙嗙ぞ浜ょぜ鑺傦紝娉ㄩ噸浠鏈嶉グ锛屽皧閲嶅綋鍦伴淇椾範鎯拰绂佸繉锛岃鍔ㄨ绗﹀悎韬唤锛岃█璁鸿鏈夊垎瀵革紝绀艰矊瑕佸悎涔庡父瑙勶紝鎬佸害瑕佸ぇ鏂圭ǔ閲嶃€�</p>"+ 
"<p>12銆佷笉瑕佸湪闄愬埗鍦扮偣鎷嶇収銆佸惛鐑熴€佸ぇ澹板枾鍝椼€�</p></div>");
}else{
  $('[id="LC_ENTRY.LCENTRY_DEPARTURE_4420"]').next().next().next().remove();
  $('[id="LC_ENTRY.LCENTRY_RETURNDATE_4420"]').next().next().next().remove();
  $('[id="LC_ENTRY.LCENTRY_DISCIPLINE_4420"]').prev().prev().remove();
}
	}
	 function addFunction(e){
changeCssForApp4();
	}
	 function showDate_3863(arr,total,e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 for (var i = arr.length - 1; i >= 0; i--) {
var LCENCLOSURE_ID = '';
if(arr.length>0&&arr[i].LCENCLOSURE_ID!=null){
LCENCLOSURE_ID = arr[i].LCENCLOSURE_ID;
}
var LCENCLOSURE_AAA = '';
if(arr.length>0&&arr[i].LCENCLOSURE_AAA!=null){
LCENCLOSURE_AAA = arr[i].LCENCLOSURE_AAA;
}
var LCENCLOSURE_BBB = '';
if(arr.length>0&&arr[i].LCENCLOSURE_BBB!=null){
LCENCLOSURE_BBB = arr[i].LCENCLOSURE_BBB;
}
var LCENCLOSURE_CCC = '';
if(arr.length>0&&arr[i].LCENCLOSURE_CCC!=null){
LCENCLOSURE_CCC = arr[i].LCENCLOSURE_CCC;
}
var LCENCLOSURE_DDD = '';
if(arr.length>0&&arr[i].LCENCLOSURE_DDD!=null){
LCENCLOSURE_DDD = arr[i].LCENCLOSURE_DDD;
}
			if(0 == Currentpage11){
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>';
			}else if(total-1==Currentpage11){
				cellObj += '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}else{
				cellObj += '<span class="fa fa-arrow-circle-right" style="font-size:30px;padding-right:15px;float:right" onclick="next(\''+e+'\')"></span>'+
						   '<span class="fa fa-arrow-circle-left" style="font-size:30px;padding-right:15px;float:right" onclick="last(\''+e+'\')"></span>';
			}
			cellObj += 		'<div name="fubiaoElement"  class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_ID_4578" name="LCENCLOSURE_ID" value="'+LCENCLOSURE_ID+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_BBB_4578" name="LCENCLOSURE_BBB" value="'+LCENCLOSURE_BBB+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_CCC_4578" name="LCENCLOSURE_CCC" value="'+LCENCLOSURE_CCC+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_DDD_4578" name="LCENCLOSURE_DDD" value="'+LCENCLOSURE_DDD+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">闄勪欢: </label>'+
  '			<input id="LC_ENCLOSURE.LCENCLOSURE_AAA_4578_'+i+'" name="LCENCLOSURE_AAA" dataType="text" class="CCReadText"  value="'+LCENCLOSURE_AAA+'" type="text" readonly oninput="myFunction(this,\'LCENCLOSURE_AAA\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
							'		</div>'+
							'	</div>'+
							'</div>';
			}
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	}
	 var newElementNum = 0;
	 function showDate_3864(arr,total,e){
	 if(e=='fubiao1'){
		 var cellObj = '';
		 if(arr.length>0){
		 for (var i = arr.length - 1; i >= 0; i--) {
var LCENCLOSURE_ID = '';
if(arr.length>0&&arr[i].LCENCLOSURE_ID!=null){
LCENCLOSURE_ID = arr[i].LCENCLOSURE_ID;
}
var LCENCLOSURE_AAA = '';
if(arr.length>0&&arr[i].LCENCLOSURE_AAA!=null){
LCENCLOSURE_AAA = arr[i].LCENCLOSURE_AAA;
}
var LCENCLOSURE_BBB = '';
if(arr.length>0&&arr[i].LCENCLOSURE_BBB!=null){
LCENCLOSURE_BBB = arr[i].LCENCLOSURE_BBB;
}
var LCENCLOSURE_CCC = '';
if(arr.length>0&&arr[i].LCENCLOSURE_CCC!=null){
LCENCLOSURE_CCC = arr[i].LCENCLOSURE_CCC;
}
var LCENCLOSURE_DDD = '';
if(arr.length>0&&arr[i].LCENCLOSURE_DDD!=null){
LCENCLOSURE_DDD = arr[i].LCENCLOSURE_DDD;
}
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12" name="fubiaoElement" >'+
							'    <div class="contact-box" style="min-height:110px">'+
							'		<form class="row cell" style="padding-right:50px">'+
							'		<span class="fa fa-trash-o deleteButton" id="deleteButton_'+i+'" title="鍒犻櫎" style="position: absolute;right: 30px;font-size: 25px;top: 5px;" onclick="deleteElement(this,\'4578\')"></span>'+
							'		<span class="fa fa-save saveButton" id="saveButton_'+i+'" title="淇濆瓨" style="position: absolute;right: 29px;font-size: 25px;top: 40px;" onclick="saveElement(this,\'4578\')"></span>'+
							'		<span class="fa fa-edit updateButton" id="updateButton_'+i+'" title="淇敼" style="position: absolute;right: 25px;font-size: 25px;top: 77px;" onclick="updateElement(this,\''+i+'\',\''+e+'\')"></span>'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_ID_4578" name="LCENCLOSURE_ID" value="'+LCENCLOSURE_ID+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_BBB_4578" name="LCENCLOSURE_BBB" value="'+LCENCLOSURE_BBB+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_CCC_4578" name="LCENCLOSURE_CCC" value="'+LCENCLOSURE_CCC+'"  type="hidden" >'+
  '	<input id="LC_ENCLOSURE.LCENCLOSURE_DDD_4578" name="LCENCLOSURE_DDD" value="'+LCENCLOSURE_DDD+'"  type="hidden" >'+
  '	<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12" >'+
  '		<div class="ui search selection dropdown entitybox field-control" style="display: inline-block;width:100%">'+
  '			<label style="float:left;font-size:14px;width:100px;line-height:25px">闄勪欢: </label>'+
  '			<input id="LC_ENCLOSURE.LCENCLOSURE_AAA_4578_'+i+'" name="LCENCLOSURE_AAA" dataType="text" class="CCReadText"  value="'+LCENCLOSURE_AAA+'" type="text" readonly oninput="myFunction(this,\'LCENCLOSURE_AAA\')"   style="width:200px;height:25px;padding:0;border:none;background-color:#fff"/>'+
  '			<span style="color:red;"></span>'+
  '		</div>'+
  '	</div>'+
							'		</form>'+
							'	</div>'+
							'</div>';
	}
		 }
	$("#"+e).find("[id='TEST_FEE_INFO_FORM2']").html(cellObj);
}
	}
	 function showAccount(arr,e){
	 if(e=='fubiao1'){
		 var cellObj = '';
			cellObj += 		'<div class="col-md-12 col-sm-12 col-lg-12">'+
							'    <div class="contact-box">'+
							'		<div class="row cell">'+
							'		</div>'+
							'	</div>'+
							'</div>';
	$("#"+e).find("[id='TEST_FEE_INFO_FORM']").html(cellObj);
}
	}
	 function updateElement(e,num,x){
console.time('updateElementJs');
		if(x=='fubiao1'){
		//淇敼鎿嶄綔琛屾牱寮�
		$("#"+x).find("[id='"+e.id+"']").css("color","red");
		$("#"+x).find("[id='"+e.id+"']").attr("onclick","");
		$("#"+x).find("[id='"+e.id+"']").parent().parent().css("border-color","red");
		$("#"+x).find("[id='"+e.id+"']").parent().parent().addClass("CCUpdating");
		$("#"+x).find("[id='"+e.id+"']").parent().attr("class","row cell editing");
		var xx=$("#"+x).find("[id='"+e.id+"']").parent();//褰撳墠鎿嶄綔琛�,鎵€鏈変笅鎷夋棩鏈熸敼鍙樻帶浠舵牱寮�
		var obj1 ;
xx.find("[id='LC_ENCLOSURE.LCENCLOSURE_AAA_4578_"+num+"']").attr("readonly",false);
xx.find("[id='LC_ENCLOSURE.LCENCLOSURE_AAA_4578_"+num+"']").css("display","inline");
xx.find("[id='LC_ENCLOSURE.LCENCLOSURE_AAA_4578_"+num+"']").attr("class","form-control");
		var pid = xx.attr("id");
		elementsListSelectInitFunction(e);
		cardAndCardDateWidInitFunction(e);
}
changeCssForApp3();
console.timeEnd('updateElementJs');
	}
function youxiaoFunction(e){
	if(e=='fubiao1'){
		Currentpage11=0;
		zuixin1=null;
		youxiao1='Y';
	}
	loadDataStart2(e);
}
function zuixinFunction(e){
	if(e=='fubiao1'){
		Currentpage11=0;
		youxiao1=null;
		zuixin1='Y';
	}
	loadDataStart2(e);
}
function allFunction(e){
	if(e=='fubiao1'){
		Currentpage11=0;
		youxiao1=null;
		zuixin1=null;
	}
	loadDataStart2(e);
}
function next(e){
	if(e=='fubiao1'){
		Currentpage11--;
		loadDataStart2(e);
	}
	loadDataStart2(e);
}
function last(e){
	if(e=='fubiao1'){
		Currentpage11--;
		loadDataStart2(e);
	}
	loadDataStart2(e);
}
	 function loadDataStart2(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_ENCLOSURE_LIST_fun(xx),//HTTP璇锋眰绫诲瀷
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage01++;
				var arr=data.rows;
				showDate_3863(arr,data.total,e);
			  }
		});
	 }
	}
	 function loadDataStart3(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_ENCLOSURE_LIST_funx(xx),//HTTP璇锋眰绫诲瀷
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage01++;
				var arr=data.rows;
				showDate_3864(arr,data.total,e);
			  }
		});
	 }
	}
	 function loadDataStart4(e){
	 if(e=='fubiao1'){
		 $.ajax({
			url: "/myehr/form/cardformInitData.action",
			type: 'post',
			data:grid_LC_ENCLOSURE_LIST_funx(xx),//HTTP璇锋眰绫诲瀷
			contentType: 'application/json;charset=utf-8',
			cache: false,
			async: false,
			success: function (data) {
				Currentpage01++;
				var arr=data.rows;
				showAccount(arr,e);
			  }
		});
	 }
	}
function grid_LC_ENCLOSURE_LIST_fun(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4578;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4578;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage11*pagesize11;;
	pageReqeust.limit=pagesize11;;
	if(heightGadedata_4578!=null&&heightGadedata_4578!=undefined){
		pageReqeust.heightGrade = heightGadedata_4578;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_LC_ENCLOSURE_LIST_funx(pageReqeust){
	var _filterdata={};
	var paramsMap = {};
	var requestParam={};
		requestParam = {};
	pageReqeust.containerParam=containerParam_4578;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=param_empIds;
	pageReqeust.formId=_formId_4578;
	pageReqeust.isView=null;
	pageReqeust.offset=Currentpage21*pagesize21;;
	pageReqeust.limit=pagesize21;;
	if(heightGadedata_4578!=null&&heightGadedata_4578!=undefined){
		pageReqeust.heightGrade = heightGadedata_4578;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
	 function initAddValue(e,num){
	 if(e=='fubiao1'){
	 	num--;
		var obj = $("#newElement"+num);
	 }
	}