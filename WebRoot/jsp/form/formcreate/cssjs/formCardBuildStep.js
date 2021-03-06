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

function changeSqlCN(){
	var entitySql = encodeURI(document.getElementById('formSql').value, "UTF-8");
	var content = "";
	$.ajax({
		url:'/myehr/form/getRealSqlCN.action?entitySql='+entitySql,
		type:'post',
		cache: false,
		async: false,
		success: function (data) {
			content = data.sql;
		}
    });
	content = "<textarea id='sqlCN' rows='7' cols='63' >"+content+"</textarea>";
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		content: content,
		area: ['500px', '300px']
	});
}


function filter(treeId, parentNode, childNodes) {
	if (!childNodes) return null;
	for (var i=0, l=childNodes.length; i<l; i++) {
		childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
	}
	return childNodes;
}

function addDiyDom(treeId, treeNode) {
	var spaceWidth = 5;
	var switchObj = $("#" + treeNode.tId + "_switch"),
	icoObj = $('#' + treeNode.tId + '_ico');
	switchObj.remove();
	icoObj.before(switchObj);
	if (treeNode.level > 1) {
		var spaceStr = "<span style='display: inline-block;width:" + (spaceWidth * treeNode.level)+ "px'></span>";
		switchObj.before(spaceStr);
	}else{
		var spaceStr = "<span style='display: inline-block;'></span>";
		switchObj.before(spaceStr);
	}
}


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
		if(countMark(str,"\\(")>1){
			strCh = str.split("(")[0]+"("+str.split("(")[1];
		}else{
			strCh = str.split("(")[0];
		}
		
	}else if(treeNode.level==2){
		//3级节点
		strCh = treeNode.getParentNode().name.split("(")[0]+"."+treeNode.name;
	}
	
	sql = sql1 + ' ['+strCh+'] ' + sql2;
	$("#formSql").val(sql);
}

function countMark(str,c){
	var regex = new RegExp(c, 'g'); // 使用g表示整个字符串都要匹配
	var result = str.match(regex);
	var count = !result ? 0 : result.length;
	return count;
}

function loadStep_2(){
	loadTree();
	initColumns();
	$("#formSql").val(formSql);
}

function loadTabsStep_2(){
	querys_step2();
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

function lookupDatabackType(){
	if($("#lookupDatabackType").val()=='other'){
		$("#lookupDatabackValue1").css("display","none");
		$("#lookupDatabackValue").css("display","block");
		$("#lookupSql").css("display","none");
		$("#lookupEditSql").css("display","none");
	}else if($("#lookupDatabackType").val()=='self'){
		$("#lookupDatabackValue1").css("display","block");
		$("#lookupDatabackValue1").attr("readonly",true);
		$("#lookupDatabackValue").css("display","none");
		$("#lookupSql").css("display","none");
		$("#lookupEditSql").css("display","none");
	}else if($("#lookupDatabackType").val()=='sql'){
		$("#lookupDatabackValue1").css("display","none");
		$("#lookupDatabackValue").css("display","none");
		$("#lookupSql").css("display","inline-block");
		$("#lookupEditSql").css("display","inline-block");
	}else{
		$("#lookupDatabackValue1").css("display","block");
		$("#lookupDatabackValue").css("display","none");
		$("#lookupDatabackValue1").attr("readonly",false);
		$("#lookupSql").css("display","none");
		$("#lookupEditSql").css("display","none");
	}
}

function cboxGuiChanged(){
	$("#comboboxTextfield").val("text");
	$("#comboboxValuefield").val("id");
	$("#comboboxDatafield").val("data");

	if($("#comboboxGuiInitType").val()=='sql'){
//		$(".comboboxGuiInitValue1").css("display","none");
//		$(".comboboxGuiInitValue2").css("display","none");
//		$(".comboboxGuiInitValue3").css("display","inline-block");
		$(".comboboxGuiInitValue1").css("display","none");
		$(".comboboxGuiInitValue2").css("display","inline-block");
		$(".comboboxGuiInitValue3").css("display","none");
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

function cboxSql(){
	if($("#comboboxGuiInitExcsqlId").val()!=null&&$("#comboboxGuiInitExcsqlId").val()!=""){
		$("#comboboxGuiInitValue3").val("--已编写SQL--");
	}else{
		$("#comboboxGuiInitValue3").val("--未编写SQL--");
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
	$("#formColumnShowType").val(data.formColumnShowType);
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
	$("#formGroupId").val(data.formColumnGroupId);
	//$("#formGroupName").val(getGroupNameById(data.formColumnGroupId));
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
	//  if(data.comboboxGuiInitType=='dict'){
	$("#comboboxGuiInitName2").val(getDictnameByCode(data.comboboxGuiInitValue));
	$("#comboboxGuiInitValue2").val(data.comboboxGuiInitValue);
    /*}else if(data.comboboxGuiInitType=='sql'){
    	$("#comboboxGuiInitExcsqlId").val(data.comboboxGuiInitExcsqlId);
    }*/
	//cboxSql();
	$("#comboboxTextfield").val(data.comboboxTextfield);
	$("#comboboxValuefield").val(data.comboboxValuefield);
	$("#comboboxDatafield").val(data.comboboxDatafield);
	$("#comboboxEmptytext").val(data.comboboxEmptytext);
	if(data.comboboxAllowinput=="Y"||data.comboboxAllowinput=="true"){
		$("#comboboxAllowinput").prop('checked',true);
	}else if(data.comboboxAllowinput=="N"||data.comboboxAllowinput=="false"){
		$("#comboboxAllowinput").prop('checked',false);
	}
	if(data.comboboxMultiselect=="Y"||data.comboboxMultiselect=="true"){
		$("#comboboxMultiselect").prop('checked',true);
	}else if(data.comboboxMultiselect=="N"||data.comboboxMultiselect=="false"){
		$("#comboboxMultiselect").prop('checked',false);
	}
	$("#comboboxNullitemtext").val(data.comboboxNullitemtext);
	$("#comboboxDictNameColumn").val(data.comboboxDictNameColumn);
	$("#comboboxGuiInitExcsqlId").val(data.comboboxGuiInitExcsqlId);
	$("#comboboxIstext").val(data.comboboxIstext);
	$("#comboboxDictSql").val(data.comboboxDictSql);
	if(data.comboboxIsSearch=="Y"||data.comboboxIsSearch=="true"){
		$("#comboboxIsSearch").prop('checked',true);
	}else if(data.comboboxIsSearch=="N"||data.comboboxIsSearch=="false"){
		$("#comboboxIsSearch").prop('checked',false);
	}
	if(data.comboboxShownullitem=="Y"||data.comboboxShownullitem=="true"){
		$("#comboboxShownullitem").prop('checked',true);
	}else if(data.comboboxShownullitem=="N"||data.comboboxShownullitem=="false"){
		$("#comboboxShownullitem").prop('checked',false);
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
	if(data.textboxIsLink=="true"||data.textboxIsLink=="Y"){
		$("#textboxIsLink").prop('checked',true);
	}else if(data.textboxIsLink=="false"||data.textboxIsLink=="N"){
		$("#textboxIsLink").prop('checked',false);
	}
	if(data.textboxLinkIsForm=="true"||data.textboxLinkIsForm=="Y"){
		$("#textboxLinkIsForm").prop('checked',true);
		$("#textlinkDetailFormId").val(data.textboxLinkForm);
		$("#textlinkDetailFormName").val(getFormNameById(data.textboxLinkForm));
		linkIsFormStep2();
	}else{
		$("#textboxLinkIsForm").prop('checked',false);
		$("#textboxLinkUrl1").val(data.textboxLinkUrl);
		linkIsFormStep2();
	}
	if(data.textboxLinkWinOpenType=='2'){
		$("#textboxLinkWinOpenType2").click();
		newJsp();
	}else if(data.textboxLinkWinOpenType=='3'){
		$("#textboxLinkWinOpenType3").click();
	}else if(data.textboxLinkWinOpenType=='4'){
		$("#textboxLinkWinOpenType4").click();
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
	if(data.datepickerAllowinput=="true"||data.datepickerAllowinput=="Y"){
		$("#datepickerAllowinput").prop('checked',true);
	}else if(data.datepickerAllowinput=="false"||data.datepickerAllowinput=="N"){
		$("#datepickerAllowinput").prop('checked',false);
	}
	if(data.datepickerShowtime=="true"||data.datepickerShowtime=="Y"){
		$("#datepickerShowtime").prop('checked',true);
	}else if(data.datepickerShowtime=="false"||data.datepickerShowtime=="N"){
		$("#datepickerShowtime").prop('checked',false);
	}
	if(data.datepickerShowokbutton=="true"||data.datepickerShowokbutton=="Y"){
		$("#datepickerShowokbutton").prop('checked',true);
	}else if(data.datepickerShowokbutton=="false"||data.datepickerShowokbutton=="N"){
		$("#datepickerShowokbutton").prop('checked',false);
	}
	if(data.datepickerShowclearbutton=="true"||data.datepickerShowclearbutton=="Y"){
		$("#datepickerShowclearbutton").prop('checked',true);
	}else if(data.datepickerShowclearbutton=="false"||data.datepickerShowclearbutton=="N"){
		$("#datepickerShowclearbutton").prop('checked',false);
	}
	if(data.datepickerShowtodaybutton=="true"||data.datepickerShowtodaybutton=="Y"){
		$("#datepickerShowtodaybutton").prop('checked',true);
	}else if(data.datepickerShowtodaybutton=="false"||data.datepickerShowtodaybutton=="N"){
		$("#datepickerShowtodaybutton").prop('checked',false);
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
	if(data.checkboxlistAllowinput=="true"||data.checkboxlistAllowinput=="Y"){
		$("#checkboxlistAllowinput").prop('checked',true);
	}else if(data.checkboxlistAllowinput=="false"||data.checkboxlistAllowinput=="N"){
		$("#checkboxlistAllowinput").prop('checked',false);
	}
	if(data.checkboxlistMultiselect=="true"||data.checkboxlistMultiselect=="Y"){
		$("#checkboxlistMultiselect").prop('checked',true);
	}else if(data.checkboxlistMultiselect=="false"||data.checkboxlistMultiselect=="N"){
		$("#checkboxlistMultiselect").prop('checked',false);
	}
	$("#checkboxlistNullitemtext").val(data.checkboxlistNullitemtext);
	$("#checkboxlistGuiInitExcsqlId").val(data.checkboxlistGuiInitExcsqlId);
	$("#checkboxlistIstext").val(data.checkboxlistIstext);
	$("#checkboxlistDictSql").val(data.checkboxlistDictSql);
	if(data.checkboxlistIsSearch=="true"||data.checkboxlistIsSearch=="Y"){
		$("#checkboxlistIsSearch").prop('checked',true);
	}else if(data.checkboxlistIsSearch=="false"||data.checkboxlistIsSearch=="N"){
		$("#checkboxlistIsSearch").prop('checked',false);
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
	if(data.radiolistAllowinput=="true"||data.radiolistAllowinput=="Y"){
		$("#radiolistAllowinput").prop('checked',true);
	}else if(data.radiolistAllowinput=="false"||data.radiolistAllowinput=="N"){
		$("#radiolistAllowinput").prop('checked',false);
	}
	if(data.radiolistMultiselect=="true"||data.radiolistMultiselect=="Y"){
		$("#radiolistMultiselect").prop('checked',true);
	}else if(data.radiolistMultiselect=="false"||data.radiolistMultiselect=="N"){
		$("#radiolistMultiselect").prop('checked',false);
	}
	$("#radiolistNullitemtext").val(data.radiolistNullitemtext);
	$("#radiolistGuiInitExcsqlId").val(data.radiolistGuiInitExcsqlId);
	$("#radiolistIstext").val(data.radiolistIstext);
	$("#radiolistDictSql").val(data.radiolistDictSql);
	if(data.radiolistIsSearch=="true"||data.radiolistIsSearch=="Y"){
		$("#radiolistIsSearch").prop('checked',true);
	}else if(data.radiolistIsSearch=="false"||data.radiolistIsSearch=="N"){
		$("#radiolistIsSearch").prop('checked',false);
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
		if($("#lookupCustomDataback").val()=='Y'||$("#lookupCustomDataback").val()=="true"){
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
	lookupDatabackType();
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
	$("#fileuploadMaxFileCount ").val(data.fileuploadMaxFileCount);	
	
	if(data.fileuploadAutoUpload=="true"||data.fileuploadAutoUpload=="Y"){
		$("#fileuploadAutoUpload").prop('checked',true);
	}else{
		$("#fileuploadAutoUpload").prop('checked',false);
	}
	
	$("#fileuploadDataFromType").val(data.fileuploadDataFromType);	
	$("#fileuploadDataFromValue").val(data.fileuploadDataFromValue);	
	$("#fileuploadTagGuiInitValue2").val(data.fileuploadTagGuiType);
	$("#fileuploadTagGuiInitName2").val(getDictnameByCode(data.fileuploadTagGuiType));
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
	}else if($("#textboxLinkWinOpenType3").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else if($("#textboxLinkWinOpenType4").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else{
		$(".jumpJsp").css("display","none");
	}
}
function newJsp(){
	if($("#textboxLinkWinOpenType1").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else if($("#textboxLinkWinOpenType3").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else if($("#textboxLinkWinOpenType4").prop('checked')){
		$(".jumpJsp").css("display","inline-block");
	}else{
		$(".jumpJsp").css("display","none");
	}
}


function chooseFormStep2(e){
	var url = '/myehr/jsp/form/formcreate/formChoose.jsp?fatherId='+formId+'&fromType=config_form&widget='+e;
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

function checkedConfig(){
	var url = '/myehr/jsp/form/formcreate/findCheckedByFormId.jsp?formId='+formId;
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'检查点配置',
		content:url,
		success:function(layero,index){
		},
		end:function(){	
		}
	 }); 
} 

function chooseDictStep2(e){
	var str = '';
	if($("#comboboxGuiInitType").val()=='sql'){
		str = '&type=SQL';
	}
	var url = '/myehr/jsp/form/formcreate/chooseDict.jsp?widget='+e+str;
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
	//var datas = {};
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
					"		<select id='group_step2' title='所属分组' styleType='select' name='group_step2'  class='form-control' style='width:60%;' DictName='' dataField='sql_form_0001' initParam = '_'>\n"+
					"		</select>\n"+
					"	</div>\n"+
					"</div>\n"+
					"</div>\n";
		layer.open({
			title:'输入内容',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['600px', '370px'],
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
				var datas = [];
				for(var i = 0 ;i<sforms.length;i++){
					var data1 = {};
					data1.formColumnAlign = $("#align_step2").val();
					data1.formColumnWidth = $("#width_step2").val();
					data1.formColumnRequired = $("#required_step2").val();
					data1.formColumnGroupId = $("#group_step2").val();
					data1.formColumnShowType = $("#showType_step2").val();
					data1.formColumnId = sforms[i].formColumnId;
					datas[i] = data1;
				}
				//datas.formsBloBs = sforms;
				var url = "/myehr/form/updateForms.action";//更新实体信息
				$.ajax({
					url:url,
					type:'post',
					cache: false,
					contentType: 'application/json;charset=utf-8',
					data:JSON.stringify(datas),
					async: false,
					success: function (data) {	
						refreshColumns();
							layer.close(index);
						}
					});
				
			  },
			btn2: function(index, layero){
			  }
		});
	}else{
		alert("请至少选中一条数据!!");
	}
}

function getIdSelections() {
    var arr = $("#columnList").bootstrapTable('getSelections');
    var newArr = [];
    for(var i = 0; i< arr.length; i++) {    	
        newArr.push(arr[i].formColumnId);
    }
    return newArr;
}

function reveseCheck() {
    var arr = getIdSelections();
    $('#columnList').bootstrapTable('checkAll');
    for(var i= 0; i<= arr.length; i++){
    	var xx = $('#columnList tr[data-uniqueid="' + arr[i]+ '"]');
    	console.log(xx.attr('data-index'));
        $('#columnList').bootstrapTable('uncheck', xx.attr('data-index'));
    }
}

function getGroupNameById(formGroupId){
	var formGroupName;
	$.ajax({
		url:'/myehr/form/getGroupNameById.action?formGroupId='+formGroupId,
		type:'post',
		cache: false,
		async: false,
		contentType: 'application/json;charset=utf-8',
		success: function (data) {
			formGroupName = data.formGroupName;
			}
		});
	return formGroupName;
}

function refreshColumns(){
	$('#columnList').bootstrapTable('refresh');
}

function addColumn(){
	var content;
	content =   "<div id='addColumn' class='row cell' style='border:none;line-height:25px;height:95%;overflow:auto;' >\n"+
				"<div id='addColumn1' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
				"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
				"		<lable style='float:left;font-size:12px'>字段名称</lable>\n"+
				"		<input id='xformFieldTablename' name='xformFieldTablename' type='text' class='form-control' style='width:60%;'/>\n"+
				"	</div>\n"+
				"</div>\n"+
				"<div id='addColumn1' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
				"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
				"		<lable style='float:left;font-size:12px'>字段显示名称</lable>\n"+
				"		<input id='xformColumnLable' name='xformColumnLable' type='text' class='form-control' style='width:60%;'/>\n"+
				"	</div>\n"+
				"</div>\n"+
				"</div>\n";
	layer.open({
		title:'输入内容',
		shadeClose: true,
		zIndex:9999,
		content: content,
		area: ['600px', '370px'],
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
				classes = $("#addColumn select");
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
			var sforms = {};
			sforms.formFieldTablename = $("#xformFieldTablename").val();
			sforms.formColumnLable = $("#xformColumnLable").val();
			sforms.formColumnType = '2';
			sforms.formColumnFormDefId = formId;
			var url = "/myehr/form/addColumn.action";//更新实体信息
			$.ajax({
				url:url,
				type:'post',
				cache: false,
				contentType: 'application/json;charset=utf-8',
				data:JSON.stringify(sforms),
				async: false,
				success: function (data) {	
					refreshColumns();
					layer.close(index);
					}
				});
			
		  },
		btn2: function(index, layero){
		  }
	});
}

function deleteColumns(){
	var forms = {};
	forms.formsBloBs = $('#columnList').bootstrapTable('getSelections');
	layer.msg('确定要删除所选字段', {
		  time: 0 //不自动关闭
		  ,btn: ['确定', '再想想']
		  ,success: function(layero){
				layero.find('.layui-layer-btn').css('text-align', 'center');
			}
		  ,yes: function(index){
		    layer.close(index);
			if(forms.formsBloBs==null||forms.formsBloBs.length==0){
				layer.alert('请至少选择一条数据执行删除操作', {
					  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' //
					})
				return;
			}
			$.ajax({
		        url: "/myehr/form/deleteColumns.action",
		        type: 'POST',
		        cache: false,
		        async: false,
		        contentType: 'application/json;charset=utf-8',
				data:JSON.stringify(forms),
		        success: function (text) {
		        	if(text=="true"){  
                    	layer.alert('删除成功', {
							  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
							  skin: 'layer-ext-moon' 
							})

                    }else{  
                    	layer.alert('删除失败', {
							  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
							  skin: 'layer-ext-moon' 
							})

                    }  
		        	refreshColumns();
		        }
		    });

		  }
		});
	
	
}

function initSelect(){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $("#form_step2 select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		if(dataField.split("_")[2]=="0000"||dataField.split("_")[2]=="0001"){
 			dataField = dataField+"|"+formId;
 		}
		parame.placeholder="";
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField);
		}else{
			myehr_initSelect(parame,dataField);
		}
	}
}

function createGroup(){
	var url = '/myehr/jsp/form/formcreate/group/groupManage.jsp?formDefId='+formId;
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'分组配置',
		content:url,
		success:function(layero,index){			
		},
		end:function(){		
			$('#columnList').bootstrapTable('refresh');
			initSelect();
		}
	 }); 
}

function CloseWebPage(){
	 if (navigator.userAgent.indexOf("MSIE") > 0) {
	  if (navigator.userAgent.indexOf("MSIE 6.0") > 0) {
	   window.opener = null;
	   window.close();
	  } else {
	   window.open('', '_top');
	   window.top.close();
	  }
	 }
	 else if (navigator.userAgent.indexOf("Firefox") > 0) {
	  window.location.href = 'about:blank ';
	 } else {
	  window.opener = null;
	  window.open('', '_self', '');
	  window.close();
	 }
	}
function addSqlStep2(e){
	var execId = "";
	var url = "";
	if(e=='combobox'){
		url = '/myehr/jsp/form/formcreate/button/execute_sql_form_widget.jsp?execSqlType=COMBOBOX_INIT&execSqlRelaid='+$("#comboboxId").val();
	}else if(e=='lookup'){
		url = '/myehr/jsp/form/formcreate/button/execute_sql_form_widget.jsp?execSqlType=EXECSQL_LOOKUPBACK&execSqlRelaid='+$("#lookupId").val();
	}
	
	layer.open({
		type:2,
		closeBtn:1,
		shadeClose:true,
		area:['950','700'],
		maxmin:true,
		title:'编写SQL',
		content:url,
		success:function(layero,index){			
		},
		end:function(){	
			
		}
	 });
}

function jsParamInit1(e){
	$("#jsList1").bootstrapTable({  
        url : '/myehr/form/findJsParamList.action?paramTypeValue='+e, 
		height:'200',
        queryParams :'',
        undefinedText : '-',  
        striped : true, // 是否显示行间隔色  
        cache : false, // 是否使用缓存  
        clickToSelect: true,
        pagination : false,        
        uniqueId : "paramId", // 每一行的唯一标识  
        sidePagination : "server", // 服务端处理分页  
        columns : [ 
		{  
		    title : '主键',  
		    field : 'paramId', 
		    visible:false
		},
        {  
            title : '操作',  
            field : 'paramType', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {            	
            	return "<div style=\"position:relative\">"+
            		   "<i class=\"glyphicon glyphicon-remove\" style=\"position: absolute;opacity: 0.5;right: 38px;top: -6px;cursor: pointer;\" onclick=\"remove1(this)\"></i><div>" ;
        	}
        },{  
            title : '参数名称',  
            field : 'paramName', 
            align: 'center',
            valign: 'middle',
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<div style=\"position:relative\"><input class=\"form-control\" title=\"参数名称\" type=\"text\" name=\"buttonParamName\" style=\"padding:0 24px 0 12px;\" value=\""+value+"\"/>" ;
        	}
        }, {  
            title : '绑定表单ID',  
            field : 'paramTypeValue',  
            align : 'center',  
            valign : 'middle', 
            visible:false
        }, {  
            title : '参数值来源类型',  
            field : 'paramFromType',  
            align : 'center',  
            valign : 'middle',  
            formatter: function (value, row, index) {
            	var select1,select2,select3,select4;
            	if(value==undefined){
	        		value = "";
	        	}else if(value=="session"){
	        		select1="selected";
	        	}else if(value=="containerParam"){
	        		select2="selected";
	        	}else if(value=="parameter"){
	        		select3="selected";
	        	}else if(value=="constant"){
	        		select4="selected";
	        	}
            	return  "		<select id=\"formDefLayoutType\" title=\"表单布局类型\" styleType=\"select\" name=\"buttonParamFrom\" value=\""+value+"\"  class=\"form-control\" >\n"+
						"			<option value >请选择</option>\n"+
						"			<option value=\"session\" "+select1+">会话参数</option>\n"+
						"			<option value=\"containerParam\" "+select2+">容器参数</option>\n"+
						"			<option value=\"parameter\" "+select3+">请求参数</option>\n"+
						"			<option value=\"constant\" "+select4+">常量</option>\n"+					
						"		</select>\n";
        	}
        }, {  
            title : '参数值来源',  
            field : 'paramFromValue',  
            align : 'center',  
            valign : 'middle', 
            formatter: function (value, row, index) {
            	if(value==undefined){
	        		value = "";
	        	}
            	return "<input class=\"form-control\"  name=\"buttonParamValue\" data-type=\"text\" title=\"参数值来源\" value=\""+value+"\"/>";
        	}
        }  	  
        ],
        onClickRow: function (row, $element) {
	                curRow = row;
	                
	            },
	            onLoadSuccess: function (aa, bb, cc) {
	                
	            },
	            data:[],       
        responseHandler : function(res) {  
            return {  
                total : res.total,  
                rows : res.rows  
            };  
        }, 
    });
}

function saveJs1(){
	var datas = $("#jsList1").bootstrapTable("getData");
	var saveDatas = [];
	for(var i=0;i<datas.length;i++){
		var paramName = $("#jsList1>tbody").find("tr").eq(i).find("input").eq(0).val();
		var paramFromValue = $("#jsList1>tbody").find("tr").eq(i).find("input").eq(1).val();
		var paramFromType = $("#jsList1>tbody").find("tr").eq(i).find("select").eq(0).val();
		if(paramName!=datas[i].paramName||paramFromValue!=datas[i].paramFromValue||paramFromType!=datas[i].paramFromType){		
		//实体可修改部分是否修改(有一处不同,就需修改)
			datas[i].paramName=paramName;
			datas[i].paramFromValue=paramFromValue;
			datas[i].paramFromType=paramFromType;
			datas[i].paramTypeValue=$("#textboxId").val();
			datas[i].paramType = 'COLUMN_TEXTBOX|COLUMN_LINK';
			saveDatas.push(datas[i]);
		}
	}
	var url = "/myehr/form/updateJsParam.action";//更新实体信息
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		contentType: 'application/json;charset=utf-8',
		data:JSON.stringify(saveDatas),
		async: false,
		success: function (data) {				
			}
		});
	$('#jsList1').bootstrapTable('refresh');
}

function remove1(obj){
	var jsParam = {};
	jsParam.paramName = $(obj).parent().parent().parent().find("input").eq(0).val();
	$.ajax({
		url:'/myehr/form/deleteJsParam.action',
		type:'post',
		cache: false,
		data:JSON.stringify(jsParam),
		contentType: 'application/json;charset=utf-8',
		async: false,
		success: function (data) {
			
			}
		});
	$('#jsList1').bootstrapTable('refresh');
}

function saveSql(){
	var entitySql = encodeURI(document.getElementById('formSql').value, "UTF-8");
	
	$.ajax({
        url: "/myehr/form/findColumnListSteps_3.action?formDefId="+formId+"&entitySql="+entitySql,
        type: 'POST',
        cache: false,
        async: false,
        success: function (text) {
        	if(text=='1'){
        		layer.alert('保存成功', {
					  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
        	}else{
        		layer.alert('保存失败', {
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
        	}
        }
    });
}

function saveInterfaceSchemeSql(){
	var entitySql = encodeURI(document.getElementById('formSql').value, "UTF-8");
	
	$.ajax({
        url: "/myehr/form/saveInterfaceSchemeSql.action?interfaceSchemeId="+interfaceSehemeId+"&entitySql="+entitySql,
        type: 'POST',
        cache: false,
        async: false,
        success: function (text) {
        	if(text=='1'){
        		layer.alert('保存成功', {
					  icon: 6,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
        	}else{
        		layer.alert('保存失败', {
					  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
					  skin: 'layer-ext-moon' 
					})
        	}
        }
    });
}

function appEdit(){
	var datas = {};
	var sforms = $("#columnList").bootstrapTable('getSelections');
	if(sforms.length>0){
		var content;
		content =   "<div id='appBatchUp' class='row cell' style='border:none;line-height:25px;height:95%;overflow:auto;' >\n"+
					"<div id='appBatchUp1' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>字体</lable>\n"+
					"		<span class=\"h1\">h1</span>\n"+
					"		<span class=\"h2\">h2</span>\n"+
					"		<span class=\"h3\">h3</span>\n"+
					"		<span class=\"h4\">h4</span>\n"+
					"		<span class=\"h5\">h5</span>\n"+
					"	</div>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>加粗后字体</lable>\n"+
					"		<span class=\"h1 bold\">h1</span>\n"+
					"		<span class=\"h2 bold\">h2</span>\n"+
					"		<span class=\"h3 bold\">h3</span>\n"+
					"		<span class=\"h4 bold\">h4</span>\n"+
					"		<span class=\"h5 bold\">h5</span>\n"+
					"	</div>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>标签形式</lable>\n"+
					"		<span class=\"tag1\">tag1</span>\n"+
					"		<span class=\"tag2\">tag2</span>\n"+
					"		<span class=\"tag3\">tag3</span>\n"+
					"		<span class=\"tag4\">tag4</span>\n"+
					"		<span class=\"tag5\">tag5</span>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='appBatchUp5' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>字体风格</lable>\n"+
					"		<select id='fontStyle_step2' title='字体风格' styleType='select' name='fontStyle_step2'  class='form-control' style='width:60%;float:left' DictName='fontStyle' dataField='dict_form_0001' initParam = '_'>\n"+
					"		</select>\n"+
					"		<input id=\"fontStyle\" type=\"checkbox\" class=\"form-control\" style=\"float:left;width:25px;margin:0\"/>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='appBatchUp6' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>Tag风格</lable>\n"+
					"		<select id='tagStyle_step2' title='Tag风格' styleType='select' name='tagStyle_step2'  class='form-control' style='width:60%;float:left' DictName='tagStyle' dataField='dict_form_0001' initParam = '_'>\n"+
					"		</select>\n"+
					"		<input id=\"tagStyle\" type=\"checkbox\" class=\"form-control\" style=\"float:left;width:25px;margin:0\"/>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='appBatchUp7' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>是否加粗</lable>\n"+
					"		<select id='blod_step2' title='是否加粗' styleType='select' name='blod_step2'  class='form-control' style='width:60%;float:left' DictName='SYS_COMMON_YES_NO' dataField='dict_form_0001' initParam = '_'>\n"+
					"		</select>\n"+
					"		<input id=\"blod\" type=\"checkbox\" class=\"form-control\" style=\"float:left;width:25px;margin:0\"/>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='appBatchUp8' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>是否隐藏</lable>\n"+
					"		<select id='hidden_step2' title='是否隐藏' styleType='select' name='hidden_step2'  class='form-control' style='width:60%;float:left' DictName='SYS_COMMON_YES_NO' dataField='dict_form_0001' initParam = '_'>\n"+
					"		</select>\n"+
					"		<input id=\"hidden\" type=\"checkbox\" class=\"form-control\" style=\"float:left;width:25px;margin:0\"/>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div id='appBatchUp9' class='col-lg-12 col-md-12 col-sm-12 col-xs-12'>\n"+
					"	<div class='ui search selection dropdown entitybox field-control' style='display: inline-block;width:100%;'>\n"+
					"		<lable style='float:left;font-size:12px'>排序编辑</lable>\n"+
					"		<input id=\"isSame\" onclick=\"showSameSort()\" type=\"checkbox\" class=\"form-control\" style=\"float:left;width:25px;margin:0\"/>\n"+
					"	</div>\n";
					for(var i = 0 ;i<sforms.length;i++){
						content+= "	<div class='ui search selection dropdown entitybox field-control appSort' style='width:50%;float:left'>\n"+
								  "		<lable style='float:left;font-size:12px'>"+sforms[i].formColumnLable+"</lable>\n"+
								  "		<input id=\"sort_"+i+"\" type=\"text\" class=\"form-control \" style=\"float:left;width:60%;\"/>\n"+
								  "	</div>\n";
					}
		   content+="</div>\n"+
					"</div>\n";
		layer.open({
			title:'自定义编辑',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['600px', '670px'],
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
					classes = $("#appBatchUp select");
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
				var appAndColumn = {};
				var app = {};
				app.fontStyle = "";
				app.tagStyle = "";
				app.isblod = "";
				app.ishidden = "";
				if($("#isSame").prop("checked")){
					for(var i = 0 ;i<sforms.length;i++){
						if($("#sort_"+i).val()!=null&&$("#sort_"+i).val()!=""){
							sforms[i].formColumnPositionSort = $("#sort_"+i).val();
						}else{
							sforms[i].formColumnPositionSort = "赋空";
						}
					}
				}
				for(var i = 0 ;i<sforms.length;i++){
					sforms[i].formColumnPositionSort = $("#sort_"+i).val();
				}
				if($("#fontStyle").prop("checked")){
					if($("#fontStyle_step2").val()!=null&&$("#fontStyle_step2").val()!=""){
						app.fontStyle = $("#fontStyle_step2").val();
					}else{
						app.fontStyle = "赋空";
					}
				}
				if($("#tagStyle").prop("checked")){
					if($("#tagStyle_step2").val()!=null&&$("#tagStyle_step2").val()!=""){
						app.tagStyle = $("#tagStyle_step2").val();
					}else{
						app.tagStyle = "赋空";
					}
				}
				if($("#blod").prop("checked")){
					if($("#blod_step2").val()!=null&&$("#blod_step2").val()!=""){
						app.isblod = $("#blod_step2").val();
					}else{
						app.isblod = "赋空";
					}
				}
				if($("#hidden").prop("checked")){
					if($("#hidden_step2").val()!=null&&$("#hidden_step2").val()!=""){
						app.ishidden = $("#hidden_step2").val();
					}else{
						app.ishidden = "赋空";
					}
				}
				appAndColumn.columns = sforms;
				appAndColumn.appClass = app;
				var url = "/myehr/app/saveAppClass.action";//更新
				$.ajax({
					url:url,
					type:'post',
					cache: false,
					contentType: 'application/json;charset=utf-8',
					data:JSON.stringify(appAndColumn),
					async: false,
					success: function (data) {	
						refreshColumns();
						layer.close(index);
						}
					});
				
			  },
			btn2: function(index, layero){
			  }
		});
	}else{
		alert("请至少选中一条数据!!");
	}
}

function showSameSort(){
	if($("#isSame").prop("checked")){
		$(".appSort").css("display","inline-block");
	}else{
		$(".appSort").css("display","none");
	}
	
}

function setForm(Fid){
	var url = "/myehr/form/setFormById.action?formId="+Fid;//更新
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		success: function (data) {
			
		}
	});
}

function clearCheckedAndPoint(){
	var url = "/myehr/form/clearCheckedAndPoint.action";//更新
	$.ajax({
		url:url,
		type:'post',
		cache: false,
		async: false,
		success: function (data) {
			
		}
	});
}

function fileUploadConfig(){
	var url = '/myehr/jsp/form/fileUploadConfig/';
	var content =   "<div class=\"row cell\" id=\"fileUploadConfigForm\">\n" +
					"<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">文件个数限制: </lable>\n"+
					"		<input id=\"NumLimit\" name=\"NumLimit\" type=\"text\" class=\"form-control\" style=\"width:220px\" />\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">文件大小限制(\"0\"表示无限制)(单位:KB): </lable>\n"+
					"		<input id=\"SizeLimit\" name=\"SizeLimit\" type=\"text\" class=\"form-control\" style=\"width:220px\"/>\n"+
					"	</div>\n"+
					"</div>\n"+
					"<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control bs-docs-example\" style=\"float:left\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">文件类型限制: </lable>\n"+
					"		<select id=\"TypeLimit\" styleType=\"select\" name=\"TypeLimit\" class=\"selectpicker bla bla bli\" data-live-search=\"true\" textField=\"dictName\" valueField=\"dictId\" multiSelect=\"true\"  multiple  DictName=\"SYS_FORM_FILEUPLOAD_UPLOAD_FILETYPES\" dataField=\"dict_form_3877\" initParam = \"_\">\n"+
					"		</select>\n"+
					"	</div>\n" +
					"</div>\n" +
					"<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control bs-docs-example\" style=\"float:left\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">文件关联对象类型: </lable>\n"+
					"		<input id=\"fileObjType\" name=\"fileObjType\" type=\"text\" class=\"form-control\" style=\"width:220px\" />\n"+
					"	</div>\n" +
					"</div>\n" +
					"<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n"+
					"	<div class=\"ui search selection dropdown entitybox field-control\" style=\"display: inline-block;\">\n"+
					"		<lable style=\"float:left;font-size:12px;width:100%\">文件关联对象值: </lable>\n"+
					"		<input id=\"fileObjValue\" name=\"fileObjValue\" type=\"text\" class=\"form-control\" style=\"width:220px\" />\n"+
					"	</div>\n"+
					"</div>\n"+
					"</div>\n";
		layer.open({
			title:'输入内容',
			shadeClose: true,
			zIndex:9999,
			content: content,
			area: ['300px', '500px'],
			btn: ['确定', '取消'],
			success:function(layero,index){
				cardSelectInitFunctionById('#fileUploadConfigForm');
			},
			yes: function(index, layero){
				var param = {};
				var types = $("#TypeLimit").val();
				var typeLimit = "";
				for(var i=0;i<types.length;i++){
					typeLimit += types[i]+",";
				}
				param.id = fileuploadConfig_id;
				param.sizeLimit = $("#SizeLimit").val();
				param.numLimit = $("#NumLimit").val();
				param.typeLimit = typeLimit.substring(0,typeLimit.length-1);
				param.fileObjValue = $("#fileObjValue").val();
				param.fileObjType = $("#fileObjType").val();
				if(param.sizeLimit!=""&&param.numLimit!=""&&param.typeLimit!=""){
					$.ajax({
						url:'/myehr/form/saveFileuploadConfig.action?formId='+formId,
						type:'POST',
						data: JSON.stringify(param),
					    cache: false,
					    contentType: 'application/json;charset=utf-8',
						async: false,
						success: function (data) {
								if(data=='0'){
									layer.alert('保存失败!', {
										  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
										  skin: 'layer-ext-moon' 
									})
								}else{
									layer.alert('保存成功!', {
										  icon: 1,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
										  skin: 'layer-ext-moon' 
									})
								}
							}
						});
				}else{
					layer.alert('信息输入不完整', {
						  icon: 5,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
						  skin: 'layer-ext-moon' 
						})
				}
			  },
			btn2: function(index, layero){
				
			  }
		});
	}
function cardSelectInitFunctionById(e){
	var classes = [];
	if(''=='APP'){
		$("input").each(function(){
			if($(this).attr('dataField') != undefined){
				classes.push($(this)[0]);
			}
		})
	}else{
		classes = $(e).find("select");
	}
	for(var i=0;i<classes.length;i++){
		parame.id=classes[i].id;
		var type=$(classes[i]).attr('multiSelect');
		var dataField=$(classes[i]).attr('dataField');
		parame.placeholder="";
		parame.jsonParam.nullItemText='请选择';
		parame.jsonParam.dictTypeCode=$(classes[i]).attr('DictName');
		if(type=="true"){
			myehr_initSelectMore(parame,dataField,containerParam);
		}else{
			myehr_initSelect(parame,dataField,containerParam);
		}
	}
}

function layerCacheConfig(e){
	var buttonId = $(e).parent().parent().parent().find("[name='formButtonId']").val();
	if(buttonId==''){
		layer.alert('请先保存按钮', {
			  icon: 2,//1:√;2:×;3:问号;4:锁;5:哭脸;6.笑脸;7:！;
			  skin: 'layer-ext-moon' 
			})
	}else{
		var url = '/myehr/jsp/cache/cacheRefreshConfig.jsp?buttonId='+buttonId;
		layer.open({
			type:2,
			closeBtn:1,
			shadeClose:true,
			area:['950','700'],
			maxmin:true,
			title:'刷新缓存配置',
			content:url,
			success:function(layero,index){			
			}
		 }); 
	}
}

function saveExpandConfig(){
	$("#columnList").find("[name='btSelectAll']").click();
	var columns = $("#columnList").bootstrapTable("getSelections");
	var columnTrs = $("#columnList").find("tbody").find("tr");
	var paramcolumns = [];
	for(var i=0;i<columnTrs.length;i++){
		var column = {};
		column.formColumnId = columns[i].formColumnId;
		column.isshowweb = columnTrs.eq(i).find("[name='isshowweb']").prop("checked");
		column.isshowmobile = columnTrs.eq(i).find("[name='isshowmobile']").prop("checked");
		column.defaultsort = columnTrs.eq(i).find("[name='defaultsort']").prop("checked");
		column.issort = columnTrs.eq(i).find("[name='issort']").prop("checked");
		paramcolumns.push(column);
	}
	$.ajax({
		url:'/myehr/form/saveColumnExpandConfig.action?formId='+formId,
		type:'POST',
		data: JSON.stringify(paramcolumns),
	    cache: false,
	    contentType: 'application/json;charset=utf-8',
		success: function (data) {
			}
		});
}

function saveFilterExpandConfig(){
	var whereTrs = $("#tableListStep4").find("tbody").find("tr");
	var paramwheres = [];
	for(var i=0;i<whereTrs.length;i++){
		var where = {};
		where.queryColumnId = whereTrs.eq(i).find("[name='queryColumnId']").val();
		where.isshowweb = whereTrs.eq(i).find("[name='isshowweb']").prop("checked");
		where.isshowmobile = whereTrs.eq(i).find("[name='isshowmobile']").prop("checked");
		paramwheres.push(where);
	}
	$.ajax({
		url:'/myehr/form/saveFilterExpandConfig.action',
		type:'POST',
		data: JSON.stringify(paramwheres),
	    cache: false,
	    contentType: 'application/json;charset=utf-8',
		success: function (data) {
			}
		});
}

function saveButtonExpandConfig(){
	var buttonTrs = $("#tableListstep5").find("tbody").find("tr");
	var parambuttons = [];
	for(var i=0;i<buttonTrs.length;i++){
		var button = {};
		button.formButtonId = buttonTrs.eq(i).find("[name='formButtonId']").val();
		button.isshowweb = buttonTrs.eq(i).find("[name='isshowweb']").prop("checked");
		button.isshowmobile = buttonTrs.eq(i).find("[name='isshowmobile']").prop("checked");
		button.showArea = buttonTrs.eq(i).find("[name='showArea']").val();
		button.showType = buttonTrs.eq(i).find("[name='showType']").val();
		parambuttons.push(button);
	}
	$.ajax({
		url:'/myehr/form/saveButtonExpandConfig.action',
		type:'POST',
		data: JSON.stringify(parambuttons),
	    cache: false,
	    contentType: 'application/json;charset=utf-8',
		success: function (data) {
			}
		});
}
