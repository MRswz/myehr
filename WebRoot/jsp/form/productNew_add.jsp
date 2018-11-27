<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" href="bootstrap.min.css" type="text/css"></link>
<script type="text/javascript" src="jquery-1.7.1.js"></script>
<script type="text/javascript" src="select2.js"></script>
<link rel="stylesheet" href="select2.min.css" type="text/css"></link>
</head>
<body>
<div id="body">
<table class="table table-bordered table-striped" width="800" border="none" cellspacing="0" cellpadding="0">
	<tbody>
		<tr>
			<td align="right">多选标签——火影忍者：</td> 
			<td>
				<select class="combox" id="sel_productTag" name="tagId" multiple> 
					<optgroup label="小辈儿组">
						<option value="kakaxi">卡卡西</option>
						<option value="mingren">鸣人</option>
						<option value="zuozhu">佐助</option>
						<option value="xiaoying">小樱</option>
					</optgroup>
					<optgroup label="大辈儿组">
						<option value="bofengshuimen">波风水门</option>
						<option value="dashewan">大蛇丸</option>
						<option value="gangshou">纲手</option>
						<option value="自来也">自来也</option>
					</optgroup>
				</select>
			</td>
		</tr>
		<tr>
			<td align="right">单选标签——火影忍者：</td>
			<td>
				<select class="combox" id="sel_recommender" name="recommenderId"> 
					<option value="">请选择...</option>
					<optgroup label="小辈儿组">
						<option value="kakaxi">卡卡西</option>
						<option value="mingren">鸣人</option>
						<option value="zuozhu">佐助</option>
						<option value="xiaoying">小樱</option>
					</optgroup>
					<optgroup label="大辈儿组">
						<option value="bofengshuimen">波风水门</option>
						<option value="dashewan">大蛇丸</option>
						<option value="gangshou">纲手</option>
						<option value="自来也">自来也</option>
					</optgroup>
				</select>
			</td>
		</tr>
    </tbody>
</table>
</div>

<script type="text/javascript">
$(function(){
	$('#sel_productTag').select2({
		placeholder: "请至少选择一个人名",
		tags:true,
		createTag:function (decorated, params) {
			return null;
		},
		width:'256px'
	});

	function formatState (state) {
		if (!state.id) { return state.text; }
		var $state = $(
		'<span>' + state.text + '</span>'
		);
		return $state;
	};

	$('#sel_recommender').select2({
		placeholder: "请选择一个人名",
		templateResult: formatState,
		width:'256px'
	});
});
</script>
</body>
</html>