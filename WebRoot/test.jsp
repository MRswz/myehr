<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@include file="/common/common.jsp"%>
<html>
<head>
<title>读卡器</title>
  	
  </head>
  
  <body>
  <center>
  	
  	<div id="backcolor">
		<div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-4">重要级别</label>
				<div class="col-md-8">
					<select id="Importance" name="Importance" class="form-control select2" placeholder="重要级别..."></select>
				</div>
			</div>
		</div>
		 <div class="col-md-6">
			<div class="form-group">
				<label class="control-label col-md-4">认可程度</label>
				<div class="col-md-8">
					<select id="Recognition" name="Recognition" class="form-control select2" placeholder="认可程度..."></select>
					<select id="ResponseDemand" name="ResponseDemand" multiple="multiple" class="form-control select2"></select>
				</div>
			</div>
		</div>
		
	</center>
  </body>
  
  <script type="text/javascript">
	$(document).ready(function() {
	    $(".js-example-basic-single").select2();
		InitDictItem();
	});
	
	//绑定字典内容到指定的Select控件
	function BindSelect(ctrlName, url) {
		var control = $('#' + ctrlName);
		//设置Select2的处理
		control.select2({
			allowClear: true,
			formatResult: formatResult,
			formatSelection: formatSelection,
			escapeMarkup: function (m) {
				return m;
			}
		});

		//绑定Ajax的内容
		$.getJSON(url, function (data) {
			control.empty();//清空下拉框
			$.each(data, function (i, item) {
				control.append("<option value='" + item.Value + "'>&nbsp;" + item.Text + "</option>");
			});
		});
	}
	
	//绑定字典内容到指定的控件
	function BindDictItem(ctrlName, dictTypeName) {
		var url = '/DictData/GetDictJson?dictTypeName=' + encodeURI(dictTypeName);
		BindSelect(ctrlName, url);
	}
	
	//初始化字典信息（下拉列表）
	function InitDictItem() {
		//部分赋值参考            
		BindDictItem("Area","市场分区");
		BindDictItem("Industry", "客户行业");
		BindDictItem("Grade","客户级别");
		BindDictItem("CustomerType", "客户类型");
		BindDictItem("Source", "客户来源");
		BindDictItem("CreditStatus", "信用等级");
		BindDictItem("Stage","客户阶段");
		BindDictItem("Status", "客户状态");
		BindDictItem("Importance",  "重要级别");     
		
		// 绑定省份、城市、行政区（联动处理）
		BindSelect("Province", "/Province/GetAllProvinceNameDictJson");
		$("#Province").on("change", function (e) {
			var provinceName = $("#Province").val();
			BindSelect("City", "/City/GetCitysByProvinceNameDictJson?provinceName="+ provinceName);
		});

		$("#City").on("change", function (e) {
			var cityName = $("#City").val();
			BindSelect("District", "/District/GetDistrictByCityNameDictJson?cityName="+ cityName);
		});
	}
	
	
	function getData(){
			var data = {};
			data.name = $("#name").val();
            data.sex = $("#sex").val();
            data.nation = $("#nation").val();
            data.birthday = $("#birthday").val();
            data.address = $("#address").val();
            data.idcode = $("#idcode").val();
            data.partment = $("#partment").val();
            data.startdate = $("#startdate").val();
            data.enddate = $("#enddate").val();
		return data;
	}
	function getForm(){
					var object=[];
						$("#form1").find("input").each(function(){
								var name = this.name.split(".")[1];
								object[name]=this.name;
						})
						$("#form1").find("select").each(function(){
								var name = this.name.split(".")[1];
								object[name]=this.name;
						})
						return object;
			}		
	//获取当前时间	
	function getNowFormatDate() {
	    var date = new Date();
	    var seperator1 = "-";
	    var seperator2 = ":";
	    var month = date.getMonth() + 1;
	    var strDate = date.getDate();
	    if (month >= 1 && month <= 9) {
	        month = "0" + month;
	    }
	    if (strDate >= 0 && strDate <= 9) {
	        strDate = "0" + strDate;
	    }
	    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
	            + " " + date.getHours() + seperator2 + date.getMinutes()
	            + seperator2 + date.getSeconds();
	    return currentdate;
	}
  </script>
  
</html>
