var formSql; //映射Sql
var realSql; //翻译后Sql
var chooseMark;//选中字段
var parame={
		id:'',
		value:"N",
		width: "100px",  
		height:"45px",
		url:'/myehr/dict/searchSysDictEntryTypeCode.action?userId=1',
		jsonParam:{},
		chang:function (e){
			var aaa = e;
		}
}
    
var setting = {
	    view: {
	        addHoverDom: addHoverDom,
	        removeHoverDom: removeHoverDom,
	        selectedMulti: false,
	        showLine: false
	    },
	    check: {
	        enable: false
	    },
	    data: {
	        simpleData: {
	            enable: true
	        }
	    },
	    edit: {
	        enable: false
	    },
	    callback: {
		        onClick: onClickNode
		        }
	};
function addHoverDom(treeId, treeNode) {
    var sObj = $("#" + treeNode.tId + "_span");
    if (treeNode.editNameFlag || $("#addBtn_" + treeNode.tId).length > 0) return;
    var addStr = "<span class='button add' id='addBtn_" + treeNode.tId
        + "' title='add node' onfocus='this.blur();'></span>";
    sObj.after(addStr);
    var btn = $("#addBtn_" + treeNode.tId);
    if (btn) btn.bind("click", function () {
        var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo");
        zTree.addNodes(treeNode, { id: (100 + newCount), pId: treeNode.id, name: "new node" + (newCount++) });
        return false;
    });
};
function removeHoverDom(treeId, treeNode) {
    $("#addBtn_" + treeNode.tId).unbind().remove();
};
//节点点击事件
function onClickNode(e, treeId, treeNode) {
   	var zTree = $.fn.zTree.getZTreeObj("entityTreeDemo");
   	zTree.checkNode(treeNode, !treeNode.checked, null, true);
   	insertData(treeNode);
   	
   	return false;
}
function insertData(treeNode){
	var $input = document.getElementById("formSql");
    var cursurPosition=0;
	if($input.selectionStart){//非IE
		cursurPosition= $input.selectionStart;
	}else{//IE
		try{
		var range = document.selection.createRange();
		range.moveStart("character",-$input.value.length);
		cursurPosition=range.text.length;
		}catch(e){
		 cursurPosition = 0;
		}
	}	
	var sql = $("#formSql").val();
	var sql1 = sql.substring(0,cursurPosition);
	var sql2 = sql.substring(cursurPosition,sql.length);
	var strEn ;
	var strCh;
	if(treeNode.level==1){
		//2级节点
		var str = treeNode.name;
		strEn = str.substring(str.indexOf("(")+1,str.indexOf(")"));
		strCh = str.split("(")[0];
	}else if(treeNode.level==2){
		//3级节点
		strCh = treeNode.getParentNode().name.split("(")[0]+"."+treeNode.name;
	}
	
	sql = sql1 + ' ['+strCh+'] ' + sql2;
	$("#formSql").val(sql);
}
function loadStep_2(){
	loadTree();
	initColumns();
	$("#formSql").val(formSql);
}

function textCheckTypeStep2(){
	if($("#textboxCheckType").val()=='fun'){
		$("#widgetTextInfo9").css("display","block");
	}else{
		$("#widgetTextInfo9").css("display","none");
	}
}

function lookupCustomDatabackFunStep2(){
	if($("#lookupCustomDataback").val()=='Y'){
		$("#widgetLookupInfo12").css("display","block");
	}else{
		$("#widgetLookupInfo12").css("display","none");
	}
}

function cboxGuiChanged(){
	$("#comboboxTextfield").val("text");
	$("#comboboxValuefield").val("id");
	$("#comboboxDatafield").val("data");

	if($("#comboboxGuiInitType").val()=='sql'){
		
		$(".comboboxGuiInitValue1").css("display","none");
		$(".comboboxGuiInitValue2").css("display","none");
		$(".comboboxGuiInitValue3").css("display","inline-block");
		
	}else if($("#comboboxGuiInitType").val()=='dict'){
		$("#comboboxTextfield").val("dictName");
		$("#comboboxValuefield").val("dictId");
		$("#comboboxDatafield").val("dicts");
		$(".comboboxGuiInitValue1").css("display","none");
		$(".comboboxGuiInitValue2").css("display","inline-block");
		$(".comboboxGuiInitValue3").css("display","none");
		
	}else if($("#comboboxGuiInitType").val()=='json'){
		var model = "json模板:[ {\"text\":\"字典项名1\",\"id\":\"字典项ID1\"},\n"+
                    "		   {\"text\":\"字典项名2\",\"id\":\"字典项ID2\"}]";
		$(".comboboxGuiInitValue1").css("display","inline-block");
		$(".comboboxGuiInitValue1").attr("placeholder",model);
		$(".comboboxGuiInitValue2").css("display","none");
		$(".comboboxGuiInitValue3").css("display","none");		
	}
}
function rListGuiChanged(){
	$("#radiolistTextfield").val("text");
	$("#radiolistValuefield").val("id");
	$("#radiolistDatafield").val("data");
	if($("#radiolistGuiInitType").val()=='sql'){		
		$(".radiolistGuiInitValue1").css("display","none");
		$(".radiolistGuiInitName2").css("display","none");
		$(".radiolistGuiInitValue3").css("display","inline-block");				
	}else if($("#radiolistGuiInitType").val()=='dict'){		
		$(".radiolistGuiInitValue1").css("display","none");
		$(".radiolistGuiInitName2").css("display","inline-block");
		$(".radiolistGuiInitValue3").css("display","none");
		$("#radiolistTextfield").val("dictName");
		$("#radiolistValuefield").val("dictId");
		$("#radiolistDatafield").val("dicts");		
	}else if($("#radiolistGuiInitType").val()=='json'){
		var model = "json模板:[ {\"text\":\"字典项名1\",\"id\":\"字典项ID1\"},\n"+
                    "		   {\"text\":\"字典项名2\",\"id\":\"字典项ID2\"}]";
		$(".radiolistGuiInitValue1").css("display","inline-block");
		$(".radiolistGuiInitValue1").attr("placeholder",model);
		$(".radiolistGuiInitName2").css("display","none");
		$(".radiolistGuiInitValue3").css("display","none");		
	}
}
function cListGuiChanged(){
	$("#checkboxlistTextfield").val("text");
	$("#checkboxlistValuefield").val("id");
	$("#checkboxlistDatafield").val("data");
	if($("#checkboxlistGuiInitType").val()=='sql'){		
		$(".checkboxlistGuiInitValue1").css("display","none");
		$(".checkboxlistGuiInitName2").css("display","none");
		$(".checkboxlistGuiInitValue3").css("display","inline-block");
		
	}else if($("#checkboxlistGuiInitType").val()=='dict'){
		$("#checkboxlistTextfield").val("dictName");
		$("#checkboxlistValuefield").val("dictId");
		$("#checkboxlistDatafield").val("dicts");
		$(".checkboxlistGuiInitValue1").css("display","none");
		$(".checkboxlistGuiInitName2").css("display","inline-block");
		$(".checkboxlistGuiInitValue3").css("display","none");
		
	}else if($("#checkboxlistGuiInitType").val()=='json'){
		var model = "json模板:[ {\"text\":\"字典项名1\",\"id\":\"字典项ID1\"},\n"+
                    "		   {\"text\":\"字典项名2\",\"id\":\"字典项ID2\"}]";
		$(".checkboxlistGuiInitValue1").css("display","inline-block");
		$(".checkboxlistGuiInitValue1").attr("placeholder",model);
		$(".checkboxlistGuiInitName2").css("display","none");
		$(".checkboxlistGuiInitValue3").css("display","none");		
	}
}

function textDataFromTypeStep2(){
	if($("#textboxDataFromType").val()=='initFun'){
		$("#widgetTextInfo8").css("display","block");
		$("#textboxDataFromValue").attr("readonly",true);
		$("#textboxDataFromValue").val("");
	}else{
		$("#widgetTextInfo8").css("display","none");
		$("#textboxDataFromValue").attr("readonly",false);
	}
}

function checkboxDataFromTypeStep2(){
	if($("#checkboxDataFromType").val()=='initFun'){
		$("#widgetCheckboxInfo8").css("display","block");
		$("#checkboxDataFromValue").attr("readonly",true);
		$("#checkboxDataFromValue").val("");
	}else{
		$("#widgetTextInfo8").css("display","none");
		$("#textboxDataFromValue").attr("readonly",false);
	}
}

function lookupDataFromTypeStep2(){
	if($("#lookupDataFromType").val()=='initFun'){
		$("#widgetLookupInfo8").css("display","block");
		$("#lookupDataFromValue").attr("readonly",true);
		$("#lookupDataFromValue").val("");
	}else{
		$("#widgetLookupInfo8").css("display","none");
		$("#lookupDataFromValue").attr("readonly",false);
	}
}

function textareaCheckTypeStep2(){
	if($("#textareaCheckType").val()=='fun'){
		$("#widgetTextareaInfo9").css("display","block");
	}else{
		$("#widgetTextareaInfo9").css("display","none");
	}
}

function textareaDataFromTypeStep2(){
	if($("#textareaDataFromType").val()=='initFun'){
		$("#widgetTextareaInfo8").css("display","block");
		$("#textareaDataFromValue").attr("readonly",true);
		$("#textareaDataFromValue").val("");
	}else{
		$("#widgetTextareaInfo8").css("display","none");
		$("#textareaDataFromValue").attr("readonly",false);
	}
}

function dateDataFromTypeStep2(){
	if($("#datepickerDataFromType").val()=='initFun'){
		$("#widgetDateInfo12").css("display","block");
		$("#datepickerDataFromValue").val("");
		$("#datepickerDataFromValue").attr("readonly",true);
		$("#datepickerDataFromValue").val("");
	}else{
		$("#widgetDateInfo12").css("display","none");
		$("#datepickerDataFromValue").attr("readonly",false);
	}
}

function comboboxDataFromTypeStep2(){
	if($("#comboboxDataFromType").val()=='initFun'){
		$("#widgetComboboxInfo17").css("display","block");
		$("#comboboxDataFromValue").val("");
		$("#comboboxDataFromValue").attr("readonly",true);
		$("#comboboxDataFromValue").val("");
	}else{
		$("#widgetComboboxInfo17").css("display","none");
		$("#comboboxDataFromValue").attr("readonly",false);
	}
}

function radiolistDataFromTypeStep2(){
	if($("#radiolistDataFromType").val()=='initFun'){
		$("#widgetRadiolistInfo17").css("display","block");
		$("#radiolistDataFromValue").val("");
		$("#radiolistDataFromValue").attr("readonly",true);
		$("#radiolistDataFromValue").val("");
	}else{
		$("#widgetRadiolistInfo17").css("display","none");
		$("#radiolistDataFromValue").attr("readonly",false);
	}
}

function checkboxlistDataFromTypeStep2(){
	if($("#checkboxlistDataFromType").val()=='initFun'){
		$("#widgetCheckboxlistInfo17").css("display","block");
		$("#checkboxlistDataFromValue").val("");
		$("#checkboxlistDataFromValue").attr("readonly",true);
		$("#checkboxlistDataFromValue").val("");
	}else{
		$("#widgetCheckboxlistInfo17").css("display","none");
		$("#checkboxlistDataFromValue").attr("readonly",false);
	}
}

function checkboxDataFromTypeStep2(){
	if($("#checkboxDataFromType").val()=='initFun'){
		$("#widgetCheckboxInfo17").css("display","block");
		$("#checkboxDataFromValue").val("");
		$("#checkboxDataFromValue").attr("readonly",true);
		$("#checkboxDataFromValue").val("");
	}else{
		$("#widgetCheckboxInfo17").css("display","none");
		$("#checkboxDataFromValue").attr("readonly",false);
	}
}
function changeWidgetShow(type){
		if(type==1){//文本
			$("#textboxColumnGuiType").val("1");
			$("#text").css("display","block");
			$("#combobox").css("display","none");
			$("#date").css("display","none");	
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==2){//下拉
			$("#comboboxFormColumnGuiType").val("2");
			$("#text").css("display","none");
			$("#combobox").css("display","block");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==6){
			$("#dateFormColumnGuiType").val("6");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","block");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==8){
			$("#textareaGuiType").val("8");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","block");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==3){
			$("#radiolistFormColumnGuiType").val("3");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","block");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==4){
			$("#checkboxlistFormColumnGuiType").val("4");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","block");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==5){
			$("#checkboxColumnGuiType").val("5");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","block");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","none");
		}else if(type==7){
			$("#lookupGuiType").val("7");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","block");
			$("#fileupload").css("display","none");
		}else if(type==9){
			$("#fileuploadGuiType").val("9");
			$("#text").css("display","none");
			$("#combobox").css("display","none");
			$("#date").css("display","none");
			$("#textarea").css("display","none");
			$("#radiolist").css("display","none");
			$("#checkboxlist").css("display","none");
			$("#checkbox").css("display","none");
			$("#lookup").css("display","none");
			$("#fileupload").css("display","block");
		}
}


function showExpandInfo(data){
	$("#formColumnEntityId").val(data.formColumnEntityId);
	$("#formEntityTableName").val(data.formEntityTablename);
	$("#formColumnColumnId").val(data.formColumnColumnId);
	$("#formFieldTableName").val(data.formFieldTablename);
	$("#formColumnLable").val(data.formColumnLable);
	$("#formColumnLableWidth").val(data.formColumnLabelWidth);
	$("#formColumnGuiType").val(data.formColumnGuiType);
	$("#formColumnWidth").val(data.formColumnWidth);
	$("#formColumnHeight").val(data.formColumnHeight);
	$("#formColumnSort").val(data.formColumnSort);
	$("#formColumnAlign").val(data.formColumnAlign);
	$("#formColumnRequired").val(data.formColumnRequired);
	$("#formColumnColSpan").val(data.formColumnColSpan);
	$("#formColumnMaxLength").val(data.formColumnMaxLength);
	$("#formColumnMinLength").val(data.formColumnMinLength);
	$("#formColumnColorCondition").val(data.formColumnColorCondition);
	$("#formColumnColor").val(data.formColumnColor);
	$("#formColumnType").val(data.formColumnType);
	$("#formColumnRowSpan").val(data.formColumnRowSpan);
	$("#formColumnTotal").val(data.formColumnTotal);
	$("#formColumnIsDev").val(data.formColumnIsDev);
}

function showComboboxInfoStep2(data){
	$("#comboboxId").val(data.comboboxId);
	$("#comboboxDataFromType").val(data.comboboxDataFromType);
	if(data.comboboxDataFromType=="initFun"){
		comboboxDataFromTypeStep2();
	}
	$("#comboboxcheckFun").val(data.comboboxcheckFun);
	$("#comboboxCheckSelf").val(data.comboboxCheckSelf);
	$("#comboboxInitFun").val(data.comboboxInitFun);
	$("#comboboxValuechangeFun").val(data.comboboxValuechangeFun);
	$("#comboboxClickFun").val(data.comboboxClickFun);
	$("#comboboxDataFromValue").val(data.comboboxDataFromValue);
	$("#comboboxGuiInitType").val(data.comboboxGuiInitType);
		cboxGuiChanged();
	$("#comboboxGuiInitName2").val(getDictnameByCode(data.comboboxGuiInitValue));
	$("#comboboxGuiInitValue2").val(data.comboboxGuiInitValue);
	$("#comboboxTextfield").val(data.comboboxTextfield);
	$("#comboboxValuefield").val(data.comboboxValuefield);
	$("#comboboxDatafield").val(data.comboboxDatafield);
	$("#comboboxEmptytext").val(data.comboboxEmptytext);
	if(data.comboboxAllowinput=="true"){
		$("#comboboxAllowinput").prop('checked',true);
	}
	if(data.comboboxMultiselect=="true"){
		$("#comboboxMultiselect").prop('checked',true);
	}
	$("#comboboxNullitemtext").val(data.comboboxNullitemtext);
	$("#comboboxGuiInitExcsqlId").val(data.comboboxGuiInitExcsqlId);
	$("#comboboxIstext").val(data.comboboxIstext);
	$("#comboboxDictSql").val(data.comboboxDictSql);
	if(data.comboboxIsSearch=="true"){
		$("#comboboxIsSearch").prop('checked',true);
	}
}

function showTextInfoStep2(data){
	$("#textboxId").val(data.textboxId);
	$("#textboxCheckType").val(data.textboxCheckType);
	if(data.textboxCheckType=="fun"){
		textCheckTypeStep2();
	}
	$("#textboxCheckSelf").val(data.textboxCheckSelf);
	$("#textboxDataFromType").val(data.textboxDataFromType);
	$("#textboxDataFromValue").val(data.textboxDataFromValue);
	if(data.textboxDataFromType=="initFun"){
		textDataFromTypeStep2();
	}
	$("#textboxEmptytext").val(data.textboxEmptytext);
	$("#textboxInitFun").val(data.textboxInitFun);
	$("#textboxCheckFun").val(data.textboxCheckFun);
	$("#textboxValuechangeFun").val(data.textboxValuechangeFun);
	$("#textboxClickFun").val(data.textboxClickFun);
	if(data.textboxIsLink=="true"){
		$("#textboxIsLink").prop('checked',true);
	}
	if(data.textboxLinkIsForm=="true"){
		$("#textboxLinkIsForm").prop('checked',true);
		$("#textboxDetailFormId").val(data.textboxLinkForm);
		$("#textboxDetailFormName").val(getFormNameById(data.textboxLinkForm));
	}else{
		$("#textboxLinkIsForm").prop('checked',false);
		$("#textboxLinkUrl1").val(data.textboxLinkUrl);
		linkIsFormStep2();
	}
	if(data.textboxLinkWinOpenType=='2'){
		$("#textboxLinkWinOpenType2").click();
		newJsp();
	}else{
		$("#textboxLinkWinOpenType1").click();
		layerJsp();
	}
	$("#textboxLinkSuccessDeal").val(data.textboxLinkSuccessDeal);
	$("#textboxLinkWinTitle").val(data.textboxLinkWinTitle);
	$("#textboxLinkWinWidth").val(data.textboxLinkWinWidth);
	$("#textboxLinkWinHeight").val(data.textboxLinkWinHeight);
}

function showDateInfoStep2(data){
	$("#datepickerId").val(data.datepickerId);
	$("#datepickerDataFromType").val(data.datepickerDataFromType);
	if(data.datepickerDataFromType=="initFun"){
		dateDataFromTypeStep2();
	}
	$("#datepickerFormat").val(data.datepickerFormat);
	$("#datepickerDataFromValue").val(data.datepickerDataFromValue);
	if(data.datepickerAllowinput=="true"){
		$("#datepickerAllowinput").prop('checked',true);
	}
	if(data.datepickerShowtime=="true"){
		$("#datepickerShowtime").prop('checked',true);
	}
	if(data.datepickerShowokbutton=="true"){
		$("#datepickerShowokbutton").prop('checked',true);
	}
	if(data.datepickerShowclearbutton=="true"){
		$("#datepickerShowclearbutton").prop('checked',true);
	}
	if(data.datepickerShowtodaybutton=="true"){
		$("#datepickerShowtodaybutton").prop('checked',true);
	}
	$("#datepickerInitFun").val(data.datepickerInitFun);

	$("#datepickerValuechangeFun").val(data.datepickerValuechangeFun);
	$("#datepickerClickFun").val(data.datepickerClickFun);
	$("#datepickerDrawdatefun").val(data.datepickerDrawdateFun);
}

function showTextareaInfoStep2(data){
	$("#textareaId").val(data.textareaId);
	$("#textareaCheckType").val(data.textareaCheckType);
	if(data.textareaCheckType=="fun"){
		textareaCheckTypeStep2();
	}
	$("#textareaCheckSelf").val(data.textareaCheckSelf);
	$("#textareaDataFromType").val(data.textareaDataFromType);
	$("#textareaDataFromValue").val(data.textareaDataFromValue);
	if(data.textareaDataFromType=="initFun"){
		textareaDataFromTypeStep2();
	}
	$("#textareaInitFun").val(data.textareaInitFun);
	$("#textareaCheckFun").val(data.textareaCheckFun);
	$("#textareaValuechangeFun").val(data.textareaValuechangeFun);
	$("#textareaClickFun").val(data.textareaClickFun);
}

function showCheckboxInfoStep2(data){
	$("#checkboxId").val(data.checkboxId);
	$("#checkboxDataFromType").val(data.checkboxDataFromType);
	$("#checkboxDataFromValue ").val(data.checkboxDataFromValue );
	if(data.checkboxDataFromType=="initFun"){
		checkboxDataFromTypeStep2();
	}
	$("#checkboxShowName").val(data.checkboxShowName);
	$("#checkboxInitFun").val(data.checkboxInitFun);
	$("#checkboxValuechangeFun").val(data.checkboxValuechangeFun);
	$("#checkboxClickFun").val(data.checkboxClickFun);
}

function showCheckboxlistInfoStep2(data){
	$("#checkboxlistId").val(data.checkboxlistId);
	$("#checkboxlistDataFromType").val(data.checkboxlistDataFromType);
	if(data.checkboxlistDataFromType=="initFun"){
		checkboxlistDataFromTypeStep2();
	}
	$("#checkboxlistcheckFun").val(data.checkboxlistcheckFun);
	$("#checkboxlistCheckSelf").val(data.checkboxlistCheckSelf);
	$("#checkboxlistInitFun").val(data.checkboxlistInitFun);
	$("#checkboxlistValuechangeFun").val(data.checkboxlistValuechangeFun);
	$("#checkboxlistClickFun").val(data.checkboxlistClickFun);
	$("#checkboxlistDataFromValue").val(data.checkboxlistDataFromValue);
	$("#checkboxlistGuiInitType").val(data.checkboxlistGuiInitType);
	cboxGuiChanged();
	$("#checkboxlistGuiInitValue2").val(data.checkboxlistGuiInitValue);
	$("#checkboxlistGuiInitName2").val(getDictnameByCode(data.checkboxlistGuiInitValue));
	$("#checkboxlistTextfield").val(data.checkboxlistTextfield);
	$("#checkboxlistValuefield").val(data.checkboxlistValuefield);
	$("#checkboxlistDatafield").val(data.checkboxlistDatafield);
	$("#checkboxlistEmptytext").val(data.checkboxlistEmptytext);
	if(data.checkboxlistAllowinput=="true"){
		$("#checkboxlistAllowinput").prop('checked',true);
	}
	if(data.checkboxlistMultiselect=="true"){
		$("#checkboxlistMultiselect").prop('checked',true);
	}
	$("#checkboxlistNullitemtext").val(data.checkboxlistNullitemtext);
	$("#checkboxlistGuiInitExcsqlId").val(data.checkboxlistGuiInitExcsqlId);
	$("#checkboxlistIstext").val(data.checkboxlistIstext);
	$("#checkboxlistDictSql").val(data.checkboxlistDictSql);
	if(data.checkboxlistIsSearch=="true"){
		$("#checkboxlistIsSearch").prop('checked',true);
	}
	$("#checkboxlistRepeatdirection").val(data.checkboxlistRepeatdirection);
	$("#checkboxlistRepeatitems").val(data.checkboxlistRepeatitems);
	$("#checkboxlistRepeatlayout").val(data.checkboxlistRepeatlayout);
}
//radiolistGuiInitName2
function showRadiolistInfoStep2(data){
	$("#radiolistId").val(data.radiolistId);
	$("#radiolistDataFromType").val(data.radiolistDataFromType);
	if(data.radiolistDataFromType=="initFun"){
		radiolistDataFromTypeStep2();
	}
	$("#radiolistcheckFun").val(data.radiolistcheckFun);
	$("#radiolistCheckSelf").val(data.radiolistCheckSelf);
	$("#radiolistInitFun").val(data.radiolistInitFun);
	$("#radiolistValuechangeFun").val(data.radiolistValuechangeFun);
	$("#radiolistClickFun").val(data.radiolistClickFun);
	$("#radiolistDataFromValue").val(data.radiolistDataFromValue);
	$("#radiolistGuiInitType").val(data.radiolistGuiInitType);
		rListGuiChanged();
	$("#radiolistGuiInitValue2").val(data.radiolistGuiInitValue);
	$("#radiolistGuiInitName2").val(getDictnameByCode(data.radiolistGuiInitValue));
	$("#radiolistTextfield").val(data.radiolistTextfield);
	$("#radiolistValuefield").val(data.radiolistValuefield);
	$("#radiolistDatafield").val(data.radiolistDatafield);
	$("#radiolistEmptytext").val(data.radiolistEmptytext);
	if(data.radiolistAllowinput=="true"){
		$("#radiolistAllowinput").prop('checked',true);
	}
	if(data.radiolistMultiselect=="true"){
		$("#radiolistMultiselect").prop('checked',true);
	}
	$("#radiolistNullitemtext").val(data.radiolistNullitemtext);
	$("#radiolistGuiInitExcsqlId").val(data.radiolistGuiInitExcsqlId);
	$("#radiolistIstext").val(data.radiolistIstext);
	$("#radiolistDictSql").val(data.radiolistDictSql);
	if(data.radiolistIsSearch=="true"){
		$("#radiolistIsSearch").prop('checked',true);
	}
	$("#radiolistRepeatdirection").val(data.radiolistRepeatdirection);
	$("#radiolistRepeatitems").val(data.radiolistRepeatitems);
	$("#radiolistRepeatlayout").val(data.radiolistRepeatlayout);
}

function showLookupInfoStep2(data){
	$("#lookupId").val(data.lookupId);
	$("#lookupDataFromType").val(data.lookupDataFromType);
	$("#lookupDataFromValue").val(data.lookupDataFromValue);
	if(data.lookupDataFromType=="initFun"){
		lookupDataFromTypeStep2();
	}
	$("#lookupFormWinType").val(data.lookupFormWinType);
	if(data.lookupFormWinType=="1"){
		lookupFormWinTypeStep2();
		$("#lookupWinTitle").val(data.lookupWinTitle);
		$("#lookupWinWidth").val(data.lookupWinWidth);
		$("#lookupWinHeight").val(data.lookupWinHeight);
		$("#lookupShowProperty").val(data.lookupShowProperty);
		$("#lookupValueProperty").val(data.lookupValueProperty);		
		$("#lookupDetailFormId").val(data.lookupFormId);
		$("#lookupDetailFormName").val(getFormNameById(data.lookupFormId));
		$("#lookupCustomDataback").val(data.lookupCustomDataback);//是否自定义回显
		if($("#lookupCustomDataback").val()=='Y'){
			lookupCustomDatabackFunStep2('Y');
			$("#lookupCustomDatabackFun").val(data.lookupCustomDatabackFun);
		}
	}else if(data.lookupFormWinType=="2"){
		lookupFormWinTypeStep2();
		$("#lookupWinTitle").val(data.lookupWinTitle);
		$("#lookupWinWidth").val(data.lookupWinWidth);
		$("#lookupWinHeight").val(data.lookupWinHeight);
		$("#lookupShowProperty").val(data.lookupShowProperty);
		$("#lookupValueProperty").val(data.lookupValueProperty);
		$("#lookupFormUrl").val(data.lookupFormUrl);
	}else if(data.lookupFormWinType=="3"){
		lookupFormWinTypeStep2();
		$("#lookupButtonclickFun").val(data.lookupButtonclickFun);
	}else{
		$("#lookupFormWinType").val("1");
		lookupFormWinTypeStep2();
	}
	$("#lookupDatabackType").val(data.lookupDatabackType);
	$("#lookupDatabackValue").val(data.lookupDatabackValue);
	
	$("#lookupCheckFun").val(data.lookupCheckFun);
	$("#lookupInitFun").val(data.lookupInitFun);
	$("#lookupValuechangeFun").val(data.lookupValuechangeFun);
	$("#lookupClickFun").val(data.lookupClickFun);
}

function showFileuploadInfoStep2(data){
	$("#fileuploadId").val(data.fileuploadId);
	if(data.fileuploadUploadFiletypes!=null){		
		$('#fileuploadUploadFiletypes').selectpicker('val', data.fileuploadUploadFiletypes.split(","));
	}
	
	
	
	$("#fileuploadMaxFileCount ").val(data.fileuploadMaxFileCount );	
	if(data.fileuploadAutoUpload=="true"){
		$("#fileuploadAutoUpload").prop('checked',true);
	}else{
		$("#fileuploadAutoUpload").prop('checked',false);
	}
}

function lookupFormWinTypeStep2(){
	var formWinType = $("#lookupFormWinType").val();
	//lookupForm lookupUrl lookuptype2
	if(formWinType=='1'){
		$(".lookuptype2").css("display","inline-block");
		$(".lookupForm").css("display","inline-block");
		$(".lookupUrl").css("display","none");
		$("#widgetLookupInfo13").css("display","none");
	}else if(formWinType=='2'){
		$(".lookuptype2").css("display","inline-block");
		$(".lookupForm").css("display","none");
		$(".lookupUrl").css("display","inline-block");
		$("#widgetLookupInfo13").css("display","none");
	}else{
		$(".lookuptype2").css("display","none");
		$(".lookupForm").css("display","none");
		$(".lookupUrl").css("display","none");
		$("#widgetLookupInfo13").css("display","block");
	}
}

function inputText(obj){
	var id = $(obj).parent().find("textarea").eq(0).attr("id");
	var content = $(obj).parent().find("textarea").eq(0).val();
	content = "<textarea id='xxx' rows='7' cols='63' >"+content+"</textarea>";
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		content: content,
		area: ['500px', '300px'],
		btn: ['确定', '取消'],
		yes: function(index, layero){
			$(obj).parent().find("textarea").eq(0).val($("#xxx").val());
			$(obj).parent().find("textarea").eq(0).attr("title",$("#xxx").val());
			layer.close(index);
		  },
		btn2: function(index, layero){
		  }
	});
}
function layerJsp(){
	if($("#textboxLinkWinOpenType1").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else{
		$(".jumpJsp").css("display","none");
	}
}
function newJsp(){
	if($("#textboxLinkWinOpenType1").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else{
		$(".jumpJsp").css("display","none");
	}
}


function chooseFormStep2(e){
	var url = '/myehr/jsp/form/formcreate/formChoose.jsp?fatherId=${param.formDefId}&fromType=config_form&widget='+e;
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'选择表单',
		content:url,
		success:function(layero,index){
			//$('.layui-layer-max').click();
		},
		end:function(){			}
	 }); 
} 

function chooseDictStep2(e){
	var url = '/myehr/jsp/form/formcreate/chooseDict.jsp?widget='+e;
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'选择表单',
		content:url,
		success:function(layero,index){
			//$('.layui-layer-max').click();
		},
		end:function(){			}
	 }); 
} 



function linkIsFormStep2(){
	if($("#textboxLinkIsForm").prop('checked')){
		$("#widgetTextLinkInfo2").css("display","none");
		$("#widgetTextLinkInfo3").css("display","inline-block");
	}else{
		$("#widgetTextLinkInfo3").css("display","none");
		$("#widgetTextLinkInfo2").css("display","inline-block");
	}
}

function batchUpdate(obj){
	
	var sforms = $("#columnList").bootstrapTable('getSelections');
	if(sforms.length>0){
		var content;
		content =   "<div id='batchUp' class='row cell' style='border:none;line-height:25px;height:95%;overflow:auto;' >\n"+
					"<div id='batchUpdate1' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>显示宽度</lable>\n"+
					"		<input id='width_step2' name='width_step2' type='text' class='form-control' style='width:60%;'/>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='batchUpdate2' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>显示方式</lable>\n"+
					"		<select id='showType_step2' title='显示方式' styleType='select' name='showType_step2'  class='form-control' style='width:60%;' DictName='SYS_FORM_COLUMN_SHOW_TYPE' dataField='dict' initParam = '_'>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='batchUpdate3' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>对齐方式</lable>\n"+
					"		<select id='align_step2' title='对齐方式' styleType='select' name='align_step2'  class='form-control' style='width:60%;' DictName='SYS_FORM_COLUMN_ALIGN' dataField='dict' initParam = '_'>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='batchUpdate4' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>是否必填</lable>\n"+
					"		<select id='required_step2' title='是否必填' styleType='select' name='required_step2'  class='form-control' style='width:60%;' DictName='SYS_COMMON_YES_NO' dataField='dict' initParam = '_'>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='batchUpdate5' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>所属分组</lable>\n"+
					"		<select id='group_step2' title='所属分组' styleType='select' name='group_step2'  class='form-control' style='width:60%;' DictName='SYS_FORM_COLUMN_TYPE' dataField='dict' initParam = '_'>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n"+
					"</div>\n";
		layer.open({
			title:'输入内容',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['600px', '300px'],
			btn: ['保存', '取消'],
			success: function(layero, index){
				var classes = [];
				if(''=='APP'){
					$("input").each(function(){
						if($(this).attr('dataField') != undefined){
							classes.push($(this)[0]);
						}
					})
				}else{
					classes = $("#batchUp select");
				}
				for(var i=0;i<classes.length;i++){
					parame.id=classes[i].id;
					var type=$(classes[i]).attr('multiSelect');
					var dataField=$(classes[i]).attr('dataField');
					dataField = dataField+"|"+formId;
					parame.placeholder="";
					parame.value=$(classes[i]).attr('value');
					parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
					if(type=="true"){
						myehr_initSelectMore(parame,dataField);
					}else{
						myehr_initSelect(parame,dataField);
					}
				}
			},
			yes: function(index, layero){
				$(obj).parent().find("textarea").eq(0).val($("#xxx").val());
				$(obj).parent().find("textarea").eq(0).attr("title",$("#xxx").val());
				layer.close(index);
			  },
			btn2: function(index, layero){
			  }
		});
	}else{
		alert("请至少选中一条数据!!");
	}
	
}