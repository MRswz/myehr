function initJsp(){
	var data = getData();
	setData(data);
	initClass();
	initQuestionData(data);//初始化数据
	if(isView=='true'){
		initView(data);
	}
	
}

function initView(e){//查看时控制页面显示样式
	$("#quickSave").css("display","none");
	$("#upup").css("display","none");
	$(".perQuestion").attr("readonly",true);
	$(":radio").attr("disabled",true);
	//$(":input").attr("readonly",true);
}


var maxNum = 0;
function refreshSwatch(e){
	var values=[];
	var i=0;
	$( ".slider" ).each(function() {
		values[i]=$(this).slider( "value" );
		if($(this).slider( "value" )>=0&&$(this).slider( "value" )<15){
			$(this).find("div").eq(0).css( "background", "#44b6ae" );
		}else if($(this).slider( "value" )>=15&&$(this).slider( "value" )<40){
			$(this).find("div").eq(0).css( "background", "#578ebe" );
		}else if($(this).slider( "value" )>=40&&$(this).slider( "value" )<60){
			$(this).find("div").eq(0).css( "background", "#8775a7" );
		}else if($(this).slider( "value" )>=60&&$(this).slider( "value" )<100){
			$(this).find("div").eq(0).css( "background", "#e35b5a" );
		}
		i++;
	});
}
function refreshSwatch1(e){
	var values=[];
	var i=0;
	$( ".slider1" ).each(function() {
		values[i]=$(this).slider( "value" );
		if($(this).slider( "value" )>=0&&$(this).slider( "value" )<30){
			$(this).find("div").eq(0).css( "background", "#578ebe" );
		}else if($(this).slider( "value" )>=30&&$(this).slider( "value" )<60){
			$(this).find("div").eq(0).css( "background", "#e35b5a" );
		}else if($(this).slider( "value" )>=60&&$(this).slider( "value" )<90){
			$(this).find("div").eq(0).css( "background", "#44b6ae" );
		}else if($(this).slider( "value" )>=90&&$(this).slider( "value" )<100){
			$(this).find("div").eq(0).css( "background", "#8775a7" );
		}
		i++;
	});
}
function initClass(){
	$(".knob").knob({
		max: maxNum,
		min: 0,
		width:100,
		height:100,
		thickness: .2,
		fgColor: '#2B99E6',
		bgColor: '#303030',
		'release':function(e){
		}
    });
	$(".knob1").knob({
		max: maxNum,
		min: 0,
		width:100,
		height:100,
		thickness: .2,
		fgColor: '#2B99E6',
		bgColor: '#303030',
		'release':function(e){
		}
    });
	$( ".slider" ).slider({
	      orientation: "horizontal",
	      range: "min",
	      max: maxNum,
	      value: 0,
	      slide: refreshSwatch,
	      change: refreshSwatch
	    });
	/*$( ".slider1" ).slider({
	      orientation: "horizontal",
	      range: "min",
	      max: maxNum,
	      value: 0,
	      slide: refreshSwatch1,
	      change: refreshSwatch1
	    });*/
}



function getData(){
	var data = {};
	$.ajax({
		url:'/myehr/question/getRegData.action?objid='+objid+'&scoreMan='+scoreMan+'&pid='+pid,
		type:'post',
		cache: false,
		async: false,
		success: function (obj) {
			data = obj;
		}
	});
	return data;
}

function initQuestionData(e){
	var hundred=[];
	var ten=[];
	var five = [];
	var j1 = 0;
	var j2 = 0;
	var j3 = 0;
	for(var i=0;i<e.datas1.length;i++){
		if(e.datas1[i].PS_CODE=='002'){
			ten[j1]=e.datas1[i];
			j1++;
		}else if(e.datas1[i].PS_CODE=='003'){
			five[j2]=e.datas1[i];
			j2++;
		}else{
			hundred[j3]=e.datas1[i];
			j3++;
		}
	}
	for(var i=0;i<hundred.length;i++){
		setHundredValue(i);
	}
	for(var i=0;i<five.length;i++){
		$("input[name='Five"+i+"'][value="+five[i].score+"]").attr("checked",true); 
	}//$("input[name='Ten"+i+"']:checked"
	for(var i=0;i<ten.length;i++){
		$("input[name='Ten"+i+"'][value="+ten[i].score+"]").attr("checked",true); 
	}
	setHundredValue(0);
}

function setData(e){
	//卡片数据加载
	$("#pid").val(e.data1.pid);
	$("#CYCLE").val(e.data1.CYCLE);
	$("#templateid").val(e.data1.templateName);
	$("#objid").val(e.data1.CNAME);
	$("#score").val(e.data1.score);
	$("#relationid").val(e.data2.relationid);
	$("#relationrate").val(e.data2.relationrate);
	$("#compid").val(e.data2.COMPID);
	$("#depid").val(e.data2.DEPID);
	$("#empcode").val(e.data2.EMPCODE);
	$("#cname").val(e.data2.CNAME);
	$("#score").val(e.data2.score);
	$("#scoreManId").val(e.data2.scoreman);
	$("#relationName").val(e.data2.relatName);
	$("#compName").val(e.data2.compName);
	$("#depName").val(e.data2.depName);
	//
	maxNum = e.data1.scoremode;
	//考核标准加载
	var hundred=[];
	var ten=[];
	var five = [];
	var j1 = 0;
	var j2 = 0;
	var j3 = 0;
	for(var i=0;i<e.datas1.length;i++){
		if(e.datas1[i].PS_CODE=='002'){
			ten[j1]=e.datas1[i];
			j1++;
		}else if(e.datas1[i].PS_CODE=='003'){
			five[j2]=e.datas1[i];
			j2++;
		}else{
			hundred[j3]=e.datas1[i];
			j3++;
		}
	}
	for(var i=0;i<hundred.length;i++){
		var colorNum = Math.ceil(Math.random()*4);
		var realValue = 0;
		var powerValue = 0;
		if(hundred[i].score!=null&&hundred[i].score!=''){
			powerValue = hundred[i].score;
			realValue = hundred[i].score*100/hundred[i].weigth;
		}
		var cellObj = $(//'<p style="padding:0 15px;font-size:20px"><strong>管理类</strong></p>'+
						'<div class="row" style="margin-left:0"  id="type1">'+
						'	<div class="col-md-12 col-sm-12 col-lg-12 singleShow">'+
						'		<div class="contact-box">'+
						'			<div class="col-sm-8" style="margin-bottom:20px">'+
						'				<h3 style="margin-top:0;color:#000000;font-size:18px" title="'+hundred[i].cname+'"><strong>'+hundred[i].cname+'</strong></h3>'+
						'				<h3 style="margin-top:0;color:#000000;font-size:14px" >('+hundred[i].scorestander+')</h3>'+
						'				<h3 style="margin-top:0;color:#000000;font-size:14px" ><strong>指标权重(%):</strong><input class="perQuestion_weight" id="hundred_powerMark'+i+'" type="text" readonly style="border:0;" value="'+hundred[i].weigth+'"/></h3>'+
						'				<h3 style="margin-top:0;color:#000000;font-size:14px;line-height:25px;float:left;" ><strong>评分:</strong></h3><input id="hundred_questionScore'+i+'" class="perQuestion" type="number" oninput="setHundredValue('+i+')" value="'+powerValue+'"/><span class="glyphicon glyphicon-list-alt" onclick="openHundredText('+i+')"></span>'+//
						'				<textarea id="hundred_reason'+i+'" style="display:none" >'+hundred[i].scoreReason+'</textarea>'+
						'			</div>'+
						'			<div class="col-sm-3" style="position: relative;">'+
						'				<div id="knobwrapper">'+
						//'					<input class="knob" id="hundred_realValue'+i+'" value="0">'+
						'					<input type="hidden" id="hundred_perScore360Id'+i+'" value="'+hundred[i].id+'">'+
						//'					<input class="knob1" id="hundred_powerValue'+i+'" value="0">'+
						'					<div class="slider" id="hundred_slider'+i+'" style="margin:60px 0 20px 0;height:24px;"></div>'+
						//'					<div class="slider1" id="hundred_slider1'+i+'" style="margin-bottom:20px;height:24px"></div>'+
						'				</div>'+
						'				<input type="text" style="font-size:20px;font-weight:800;border:0;position:absolute;top:0;" id="hundred_slider_value'+i+'"/>'+
						'				<div class="covered" style="height: 155;position: absolute;width: 400;top: 0;"></div>'+
						'			</div>'+
						'			<div class="clearfix"></div>'+
						'		</div>'+
						'	</div>'+
						'</div>');
		$('#content').append(cellObj);
	}
	for(var i=0;i<ten.length;i++){
		var colorNum = Math.ceil(Math.random()*4);
		var realValue = 0;
		var powerValue = 0;
		if(ten[i].score!=null&&ten[i].score!=''){
			powerValue = ten[i].score;
			realValue = ten[i].score*100/ten[i].weigth;
		}
		var cellObj = $(//'<p style="padding:0 15px;font-size:20px"><strong>管理类</strong></p>'+
						'<div class="row" style="margin-left:0"  id="type1">'+
						'	<div class="col-md-12 col-sm-12 col-lg-12 singleShow">'+
						'		<div class="contact-box">'+
						'			<div class="col-sm-8" style="margin-bottom:20px">'+
						'				<h3 style="margin-top:0;color:#000000;font-size:18px" title="'+ten[i].cname+'"><strong>'+ten[i].cname+'</strong></h3>'+
						'				<h3 style="margin-top:0;color:#000000;font-size:14px" >('+ten[i].scorestander+')</h3>'+
						'				<h3 style="margin-top:0;color:#000000;font-size:14px" ><strong>指标权重(%):</strong><input class="Ten_weight" id="ten_powerMark'+i+'" type="text" readonly style="border:0;" value="'+ten[i].weigth+'"/></h3>'+
						'				<h3 style="margin-top:0;color:#000000;font-size:14px;line-height:25px;float:left;" ><strong>评分:</strong></h3><span class="glyphicon glyphicon-list-alt" style="display:block;height:25px" onclick="openTenText('+i+')"></span>'+//
						'				<ul class="TenStar" id="TenStar'+i+'" style="padding:0" onclick="setTenValue('+i+')" datafield="'+ten[i].targetid+'">'+
						'					<fieldset id="star-num-'+i+'" class="starability-slot" style="width: 300px;"> '+
						'						<input type="radio" id="Ten91-'+i+'" name="Ten'+i+'" value="10"> '+
						'						<label for="Ten91-'+i+'" title="10颗星">10 stars</label> '+
						'						<input type="radio" id="Ten81-'+i+'" name="Ten'+i+'" value="9"> '+
						'						<label for="Ten81-'+i+'" title="9颗星">9 stars</label> '+
						'						<input type="radio" id="Ten71-'+i+'" name="Ten'+i+'" value="8"> '+
						'						<label for="Ten71-'+i+'" title="8颗星">8 stars</label> '+
						'						<input type="radio" id="Ten61-'+i+'" name="Ten'+i+'" value="7"> '+
						'						<label for="Ten61-'+i+'" title="7颗星">7 stars</label> '+
						'						<input type="radio" id="Ten51-'+i+'" name="Ten'+i+'" value="6"> '+
						'						<label for="Ten51-'+i+'" title="6颗星">6 stars</label>'+
						'						<input type="radio" id="Ten41-'+i+'" name="Ten'+i+'" value="5"> '+
						'						<label for="Ten41-'+i+'" title="5颗星">5 stars</label> '+
						'						<input type="radio" id="Ten31-'+i+'" name="Ten'+i+'" value="4"> '+
						'						<label for="Ten31-'+i+'" title="4颗星">4 stars</label> '+
						'						<input type="radio" id="Ten21-'+i+'" name="Ten'+i+'" value="3"> '+
						'						<label for="Ten21-'+i+'" title="3颗星">3 stars</label> '+
						'						<input type="radio" id="Ten11-'+i+'" name="Ten'+i+'" value="2"> '+
						'						<label for="Ten11-'+i+'" title="2颗星">2 stars</label> '+
						'						<input type="radio" id="Ten01-'+i+'" name="Ten'+i+'" value="1"> '+
						'						<label for="Ten01-'+i+'" title="1颗星">1 stars</label>'+
						'					</fieldset>'+
						'				</ul>'+
						'				<textarea id="ten_reason'+i+'" style="display:none">'+ten[i].scoreReason+'</textarea>'+
						'				<input type="hidden" id="ten_perScore360Id'+i+'" value="'+ten[i].id+'">'+
						'			</div>'+
						/*
						'			<div class="col-sm-3" style="position: relative;">'+
						'				<div id="knobwrapper">'+
						//'					<input class="knob" id="ten_realValue'+i+'" value="0">'+
						'					<input type="hidden" id="ten_perScore360Id'+i+'" value="'+ten[i].id+'">'+
						//'					<input class="knob1" id="ten_powerValue'+i+'" value="0">'+
						'					<div class="slider" id="ten_slider'+i+'" style="margin:60px 0 20px 0;height:24px;"></div>'+
						'					<div class="slider1" id="ten_slider1'+i+'" style="margin-bottom:20px;height:24px"></div>'+
						'				</div>'+
						'				<div class="covered" style="height: 155;position: absolute;width: 400;top: 0;"></div>'+
						'			</div>'+
						'			<div class="clearfix"></div>'+
						*/
						'		</div>'+
						'	</div>'+
						'</div>');
		$('#content').append(cellObj);
	}
	for(var i=0;i<five.length;i++){
		var colorNum = Math.ceil(Math.random()*4);
		var realValue = 0;
		var powerValue = 0;
		if(five[i].score!=null&&five[i].score!=''){
			powerValue = five[i].score;
			realValue = five[i].score*100/five[i].weigth;
		}
		var cellObj = $(//'<p style="padding:0 15px;font-size:20px"><strong>管理类</strong></p>'+
				'<div class="row" style="margin-left:0"  id="type1">'+
				'	<div class="col-md-12 col-sm-12 col-lg-12 singleShow">'+
				'		<div class="contact-box">'+
				'			<div class="col-sm-8" style="margin-bottom:20px">'+
				'				<h3 style="margin-top:0;color:#000000;font-size:18px" title="'+five[i].cname+'"><strong>'+five[i].cname+'</strong></h3>'+
				'				<h3 style="margin-top:0;color:#000000;font-size:14px" >('+five[i].scorestander+')</h3>'+
				'				<h3 style="margin-top:0;color:#000000;font-size:14px" ><strong>指标权重(%):</strong><input class="Five_weight" id="five_powerMark'+i+'" type="text" readonly style="border:0;" value="'+five[i].weigth+'"/></h3>'+
				'				<h3 style="margin-top:0;color:#000000;font-size:14px;line-height:25px;float:left;" ><strong>评分:</strong></h3><span class="glyphicon glyphicon-list-alt" style="display:block;height:25px" onclick="openFiveText('+i+')"></span>'+//
				'				<ul class="FiveStar" id="FiveStar'+i+'" style="padding:0;" onclick="setFiveValue('+i+')" datafield="'+five[i].targetid+'">'+
				'					<fieldset id="star-num-'+i+'" class="starability-slot" style="width: 150px;"> '+
				'						<input type="radio" id="Five41-'+i+'" name="Five'+i+'" value="5"> '+
				'						<label for="Five41-'+i+'" title="5颗星">5 stars</label> '+
				'						<input type="radio" id="Five31-'+i+'" name="Five'+i+'" value="4"> '+
				'						<label for="Five31-'+i+'" title="4颗星">4 stars</label> '+
				'						<input type="radio" id="Five21-'+i+'" name="Five'+i+'" value="3"> '+
				'						<label for="Five21-'+i+'" title="3颗星">3 stars</label> '+
				'						<input type="radio" id="Five11-'+i+'" name="Five'+i+'" value="2"> '+
				'						<label for="Five11-'+i+'" title="2颗星">2 stars</label> '+
				'						<input type="radio" id="Five01-'+i+'" name="Five'+i+'" value="1"> '+
				'						<label for="Five01-'+i+'" title="1颗星">1 stars</label>'+
				'					</fieldset>'+
				'				</ul>'+
				'				<textarea id="five_reason'+i+'" style="display:none">'+five[i].scoreReason+'</textarea>'+
				'				<input type="hidden" id="five_perScore360Id'+i+'" value="'+five[i].id+'">'+
				'			</div>'+
				/*
				'			<div class="col-sm-3" style="position: relative;">'+
				'				<div id="knobwrapper">'+
				//'					<input class="knob" id="five_realValue'+i+'" value="0">'+
				'					<input type="hidden" id="five_perScore360Id'+i+'" value="'+ten[i].id+'">'+
				//'					<input class="knob1" id="five_powerValue'+i+'" value="0">'+
				'					<div class="slider" id="five_slider'+i+'" style="margin:60px 0 20px 0;height:24px;"></div>'+
				'					<div class="slider1" id="five_slider1'+i+'" style="margin-bottom:20px;height:24px"></div>'+
				'				</div>'+
				'				<div class="covered" style="height: 155;position: absolute;width: 400;top: 0;"></div>'+
				'			</div>'+
				'			<div class="clearfix"></div>'+
				*/
				'		</div>'+
				'	</div>'+
				'</div>');
		$('#content').append(cellObj);
	}
}

function setHundredValue(i){
	$("#hundred_realValue"+i).val($("#hundred_questionScore"+i).val()).trigger('change'); ;
	$("#hundred_powerValue"+i).val($("#hundred_questionScore"+i).val()*$("#hundred_powerMark"+i).val()/100).trigger('change'); 
	$("#hundred_slider"+i).slider( "value", $("#hundred_questionScore"+i).val());
	$("#hundred_slider1"+i).slider( "value", $("#hundred_questionScore"+i).val()*$("#hundred_powerMark"+i).val()/100);
	refreshSwatch();
	refreshSwatch1();
	$("#score").val(countSum());
}

function setTenValue(i){
	$("#ten_realValue"+i).val($("input[name='Ten"+i+"']:checked").val()).trigger('change'); ;
	$("#ten_powerValue"+i).val($("input[name='Ten"+i+"']:checked").val()*$("#ten_powerMark"+i).val()/100).trigger('change'); 
	$("#ten_slider"+i).slider( "value", $("input[name='Ten"+i+"']:checked").val());
	$("#ten_slider1"+i).slider( "value", $("input[name='Ten"+i+"']:checked").val()*$("#ten_powerMark"+i).val()/100);
	refreshSwatch();
	refreshSwatch1();
	$("#score").val(countSum());
}

function setFiveValue(i){
	$("#five_realValue"+i).val($("input[name='Five"+i+"']:checked").val()).trigger('change'); ;
	$("#five_powerValue"+i).val($("input[name='Five"+i+"']:checked").val()*$("#five_powerMark"+i).val()/100).trigger('change'); 
	$("#five_slider"+i).slider( "value", $("input[name='Five"+i+"']:checked").val());
	$("#five_slider1"+i).slider( "value", $("input[name='Five"+i+"']:checked").val()*$("#five_powerMark"+i).val()/100);
	refreshSwatch();
	refreshSwatch1();
	$("#score").val(countSum());
}

function countSum(){
	var Sum = 0; 
//	var objs = $(".knob1");
//	for(var i=0;i<objs.length;i++){
//		if($(objs[i]).val()!=null&&$(objs[i]).val()!=''&&$(objs[i]).val()!=0){
//			Sum +=  parseInt($(objs[i]).val());
//		}
//	}
//	var objs = $(".slider1");
//	for(var i=0;i<objs.length;i++){
//		if($(objs[i]).slider( "value")!=null&&$(objs[i]).slider( "value")!=''&&$(objs[i]).slider( "value")!=0){
//			Sum +=  parseInt($(objs[i]).slider( "value"));
//		}
//	}
	var objs = $(".perQuestion");
	var objs_weight = $(".perQuestion_weight");
	for(var i=0;i<objs.length;i++){
		if($(objs[i]).val()!=null&&$(objs[i]).val()!=''&&$(objs[i]).val()!=0){
			if($(objs_weight[i]).val()!='null'){
				Sum +=  parseInt($(objs[i]).val())*parseInt($(objs_weight[i]).val())/100;
			}else{
				Sum +=  parseInt($(objs[i]).val());
			}
		}
	}
	objs = $(".TenStar");
	objs_weight = $(".Ten_weight");
	for(var i=0;i<objs.length;i++){
		if($("input[name='Ten"+i+"']:checked").val()!=null&&$("input[name='Ten"+i+"']:checked").val()!=''&&$("input[name='Ten"+i+"']:checked").val()!=0){
			if($(objs_weight[i]).val()!='null'){
				Sum +=  parseInt($("input[name='Ten"+i+"']:checked").val())*parseInt($(objs_weight[i]).val())/100;
			}else{
				Sum +=  parseInt($("input[name='Ten"+i+"']:checked").val());
			}
		}
	}
	objs = $(".FiveStar");
	objs_weight = $(".Five_weight");
	for(var i=0;i<objs.length;i++){
		if($("input[name='Five"+i+"']:checked").val()!=null&&$("input[name='Five"+i+"']:checked").val()!=''&&$("input[name='Five"+i+"']:checked").val()!=0){
			if($(objs_weight[i]).val()!='null'){
				Sum +=  parseInt($("input[name='Five"+i+"']:checked").val())*parseInt($(objs_weight[i]).val())/100;
			}else{
				Sum +=  parseInt($("input[name='Five"+i+"']:checked").val());
			}
		}
	}
	
	return Sum.toFixed(1);
}

function referData(){
	
//	var objs = $(".knob1");
	var objs1 = $(".perQuestion");
	var objs2 = $(".TenStar");
	var objs3 = $(".FiveStar");
	var data = {};
	var scoreList = [];
	var i=0
	for(;i<objs1.length;i++){
		var perScore = {};
		perScore.id = $("#hundred_perScore360Id"+i).val();
		perScore.score = $(objs1[i]).val();
		perScore.scoreReason = $("#hundred_reason"+i).val();
		scoreList[i] = perScore;
	}
	for(var j=0;j<objs2.length;i++,j++){
		var perScore = {};
		perScore.id = $("#ten_perScore360Id"+j).val();
		perScore.score = $("input[name='Ten"+j+"']:checked").val()
		perScore.scoreReason = $("#ten_reason"+j).val();
		scoreList[i] = perScore;
	}
	for(var j=0;j<objs3.length;i++,j++){
		var perScore = {};
		perScore.id = $("#five_perScore360Id"+j).val();
		perScore.score = $("input[name='Five"+j+"']:checked").val()
		perScore.scoreReason = $("#five_reason"+j).val();
		scoreList[i] = perScore;
	}
	
	data.sum = $("#score").val();
	data.scoreManId = $("#scoreManId").val();
	data.scoreList = scoreList;
	data.objId = objid ;
	$.ajax({
		url:'/myehr/question/saveData.action?saveType=upup',
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
	    data:JSON.stringify(data),
		success: function (obj) {
			if(obj[0]=='success'){
				layer.alert('评分成功', {
					  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
				closex();
			}else if(obj[1]=='1'){
				layer.alert('问卷已提交,不能重复提交', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
			}
			
		}
	});
	
}

function quickSaveData(){
	var objs1 = $(".perQuestion");
	var objs2 = $(".TenStar");
	var objs3 = $(".FiveStar");
	var data = {};
	var scoreList = [];
	var i=0
	for(;i<objs1.length;i++){
		var perScore = {};
		perScore.id = $("#hundred_perScore360Id"+i).val();
		perScore.score = $(objs1[i]).val();
		perScore.scoreReason = $("#hundred_reason"+i).val();
		scoreList[i] = perScore;
	}
	for(var j=0;j<objs2.length;i++,j++){
		var perScore = {};
		perScore.id = $("#ten_perScore360Id"+j).val();
		perScore.score = $("input[name='Ten"+j+"']:checked").val()
		perScore.scoreReason = $("#ten_reason"+j).val();
		scoreList[i] = perScore;
	}
	for(var j=0;j<objs3.length;i++,j++){
		var perScore = {};
		perScore.id = $("#five_perScore360Id"+j).val();
		perScore.score = $("input[name='Five"+j+"']:checked").val()
		perScore.scoreReason = $("#five_reason"+j).val();
		scoreList[i] = perScore;
	}
	
	data.sum = $("#score").val();
	data.scoreManId = $("#scoreManId").val();
	data.scoreList = scoreList;
	data.objId = objid ;
	$.ajax({
		url:'/myehr/question/saveData.action?saveType=quickSaveData',
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
	    data:JSON.stringify(data),
		success: function (obj) {
			if(obj[0]=='success'){
				layer.alert('评分成功', {
					  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
					closex();
			}else if(obj[1]=='1'){
				layer.alert('问卷已提交,不能重复提交', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
			}
			
		}
	});
	
}

function openHundredText(e){
	if(isView=='true'){
		content = "<textarea id='reason' rows='4' cols='26' readonly style='margin-top:5px;margin-left: 8px;'>"+$("#hundred_reason"+e).val()+"</textarea>";
	}else{
		content = "<textarea id='reason' rows='4' cols='26' style='margin-top:5px;margin-left: 8px;'>"+$("#hundred_reason"+e).val()+"</textarea>";
	}
	
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		content: content,
		area: ['260px', '250px'],
		btn: ['确定', '取消'],
		yes: function(index, layero){
			$("#hundred_reason"+e).val($("#reason").val());
			layer.close(index);
		  },
		btn2: function(index, layero){
		  }
	});
}
function openFiveText(e){
	if(isView=='true'){
		content = "<textarea id='reason' rows='4' cols='26' readonly style='margin-top:5px;margin-left: 8px;'>"+$("#five_reason"+e).val()+"</textarea>";
	}else{
		content = "<textarea id='reason' rows='4' cols='26' style='margin-top:5px;margin-left: 8px;'>"+$("#five_reason"+e).val()+"</textarea>";
	}
	
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		content: content,
		area: ['260px', '250px'],
		btn: ['确定', '取消'],
		yes: function(index, layero){
			$("#five_reason"+e).val($("#reason").val());
			layer.close(index);
		  },
		btn2: function(index, layero){
		  }
	});
}
function openTenText(e){
	if(isView=='true'){
		content = "<textarea id='reason' rows='4' cols='26' readonly style='margin-top:5px;margin-left: 8px;'>"+$("#ten_reason"+e).val()+"</textarea>";
	}else{
		content = "<textarea id='reason' rows='4' cols='26' style='margin-top:5px;margin-left: 8px;'>"+$("#ten_reason"+e).val()+"</textarea>";
	}
	
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		content: content,
		area: ['260px', '250px'],
		btn: ['确定', '取消'],
		yes: function(index, layero){
			$("#ten_reason"+e).val($("#reason").val());
			layer.close(index);
		  },
		btn2: function(index, layero){
		  }
	});
}
