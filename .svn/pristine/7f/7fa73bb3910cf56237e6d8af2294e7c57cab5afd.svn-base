function getDataxx(){
	$("#zhankai").attr("class","fa fa-arrow-up");
	$("#zhankai").attr("onclick","shouqi()");
	$("#zhankai").attr("title","收起");
	var data = {};
	$.ajax({
		url:"/myehr/evaluation/findEvaluationList.action",
		type:'post',
		cache: false,
		async: false,
		success: function (obj) {
			setDataxx(obj);
		}
	});
	return data;
}
function shouqi(){
	$("#zhankai").attr("class","fa fa-arrow-down");
	$("#zhankai").attr("onclick","getDataxx()");
	$("#zhankai").attr("title","展开");
	$('#xxxxx').html("");
}

function setDataxx(data){
	for(var i=0;i<data.length;i++){
		data[i].evaluationDatetime = new Date(data[i].evaluationDatetime).Format("yyyy-MM-dd");
		var cellObj = $(
				'<div class="comment-list">'+
				'<div class="comment-info">'+
				'	<div class="comment-right">'+
				'		<div style="height:40px;width:40px;border-radius:50%;overflow:hidden;position:absolute;top: 6px;left:90px;"><img src="./images/headImg/0.png" style="width:100%;height:auto;"></div>'+
				'       <input type="hidden" name="evaluationId" value="'+data[i].evaluationId+'"/>'+
				'		<p style="padding-left:40px;">评论人:'+data[i].evaluationName+'</p>'+
				'		<p class="content" style="padding-left:40px;">评论内容:'+data[i].evaluationContent+'</p>'+
				'		<div class="comment-content-footer">'+
				'			<div class="row">'+
				'				<div class="col-md-10">'+
				'					<span style="position:  absolute;left: -150px;top:-44px;padding-left: 76px;">'+data[i].evaluationDatetime+'</span>'+
				'				</div>'+
				'				<div class="col-md-2"><span class="reply-btn" onclick="openReply(this)">回复</span></div>'+
				'			</div>'+
				'		</div>'+
				'		<div class="reply-list" id="replyxxxxx">'+
				'		</div>'+
				'	</div>'+
				'  </div>'+
				' </div>');
		$('#xxxxx').append(cellObj);
		
		var dataReply= getReplyDatas(data[i].evaluationId);
		for(var k=0;k<dataReply.length;k++){
			dataReply[k].replyTime = new Date(dataReply[k].replyTime).Format("yyyy-MM-dd");
			var addReply =$(
				'<div class="reply" style="position:relative;padding:14px;padding-left:46px;">'+
				'	<div style="height:40px;width:40px;border-radius:50%;overflow:hidden;position:absolute;top: 8px;left: 4px;"><img src="./images/headImg/0.png" style="width:100%;height:auto;"></div>'+
				'	<div style="padding-top:0px;"><a href="javascript:void(0)">'+dataReply[k].replyName+'</a>:<a href="javascript:void(0)">@'+data[i].evaluationName+'</a><span>'+dataReply[k].replyContent+'</span></div>'+
				'	<p><span style="position:  absolute;left: -150px;top:16px;padding-left: 66px;">'+dataReply[k].replyTime+'</span></p>'+
				'</div>');
			$('#replyxxxxx').append(addReply);
			}
		}
}

function referDataxxxx(){
	var content = $("#contentx").val();
	var assess={};
	assess.evaluationFormid=realFormId;
	assess.evaluationContent=content;
	$.ajax({
        url: '/myehr/evaluation/saveEvaluationList.action?formId='+realFormId,
	    type:'post',
		data: JSON.stringify(assess),
		cache: false,
		contentType: 'application/json;charset=utf-8',
        success: function(datas) { // 获取当前的数据
			if(datas=="1"){	
				alert("评价成功");
				location.reload();
			}
		}
	});
	return assess;
}
function getReplyDatas(e){
	var replyDatas={};
	$.ajax({
		url:"/myehr/evaluation/findReplyList.action?evaluationId="+e,
		type:'post',
		cache: false,
		async: false,
		success: function (obj) {
			replyDatas = obj;
		}
	});
	return replyDatas;
}

function openReply(e){
		var evaluationId=$(e).parent().parent().parent().parent().find("[name='evaluationId']").val();
		var textarea = ' <div class="row" style="width: 420px;  margin-left:7px; margin-top:10px;">'+  
							'<div class="col-sm-12">'+
								'<div class="input-group">'+ 
									'<textarea style="width:720px;height:126px;" placeholder="请输入内容......" class="mytextarea" id="replyText"></textarea>'+
								'</div> '+
							'</div>'+
						'</div>';		
		layer.open({
			title:'回复内容',
			shadeClose: true,
			zIndex:9999,
			content: textarea,
			area: ['800px', '280px'],
			btn: ['确定', '取消'],
			success:function(layero,index){
			},
			yes: function(index, layero){
				var replyxx = {};
				replyxx.replyContent = $("#replyText").val();
				replyxx.evaluationId = evaluationId;
				$.ajax({
						url:'/myehr/evaluation/SaveReplyList.action',
						type:'POST',
						data: JSON.stringify(replyxx),
					    cache: false,
					    contentType: 'application/json;charset=utf-8',
						async: false,
						success: function (data) {
							layer.alert('回复成功')
						}

				});
			  },
			btn2: function(index, layero){
				
			  }
	})

}