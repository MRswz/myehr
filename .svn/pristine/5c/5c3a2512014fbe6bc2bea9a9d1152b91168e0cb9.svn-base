
   
    function addHtml(){
    	var html = "";
    	data = getDictData("ORG_TAGS");
    	html = "<ul class=\"tag-list\" style=\"padding: 0\">";
    	for(var i=0;i<data.length;i++){
    		html += "<li onclick=\"changeTag('"+data[i].dictEntryCode+"')\"><a id=\"tag_"+data[i].dictEntryCode+"\" class=\"\">"+data[i].dictEntryName+"</a></li>"
    	}
    	html += "</ul>";
    	$("#fileManage_tagType").html(html);
    }	
    	
    function getDictData(dictName){
		var dictEntrys = [];
		$.ajax({
			url:'/myehr/FileList/getDictData.action?DictName='+dictName,
			type:'post',
			cache: false,
			async: false,
			success: function (obj) {
				dictEntrys = obj;
			}
		});
		return dictEntrys;
	}
    function changeTag(type){
    	tag = "";
    	if($("#tag_"+type).attr("class")!="tag"){
    		$("#tag_"+type).attr("class","tag");
    	}else{
    		$("#tag_"+type).attr("class","");
    	}
    	var tags = $(".tag");
    	for(var i=0;i<tags.length;i++){
    		tag += tags[i].innerText+","
    	}
    	if(tag.length>0){
    		tag = tag.substring(0, tag.length-1);
    	}
    	$("#tag").val(tag);
    }
    
