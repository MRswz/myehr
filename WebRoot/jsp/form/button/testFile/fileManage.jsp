<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>文件管理</title>
<style>
#file_wall_view{height: 95%;overflow: auto}
.tag{background-color:#449d44 !important}
.wrapper{width:98%;margin:0 auto;padding-top:5px}
.row{margin:0;}
.wizard > .content > .body{padding: 0.5% 2.5%;}
.row.cell>div lable{font-weight:600}
.fixed-table-container thead th .th-inner, .fixed-table-container tbody td .th-inner{font-weight:600}
fieldset{height:100%}
.file-box{height:200px}
.ztree li a{width:89%}
#step2_part2 .fixed-table-body {height:100%}
.wizard > .content > .body ul > li{list-style:none}
#step2_part2 .clearfix{display:none}
.row.cell>div{min-height:30px;margin:10px 0 0 0;}
#form-p-5,#form-p-4,#form-p-3,#form-p-2,#form-p-1{width:100%;height:97%}
       .sidebar{height: 100%;
           position: relative;
           border-radius: 5px;
           margin-bottom: 10px;
           padding: 10px;}
      .searchInput{position: relative;}
       .searchInfo{position: absolute;top: 0;right: 0;margin-right: 30px;}
       .searchInfoWrapper>div{display: inline-block;}
       .searchInfoWrapper>div a{cursor: pointer;}
       .searchInfoWrapper label {margin: 4px 5px 0;vertical-align: top;}
       .panel-heading {padding: 5px 15px;}
       .btn-file{display:none}
</style>
<script type="text/javascript" src="js/fileManage.js"></script>
<link rel="stylesheet" href="../../formcreate/formtemplatebuild/bootstrap2/bootstrap-switch.min.css" type="text/css"></link>
<script type="text/javascript" src="../../formcreate/formtemplatebuild/bootstrap2/bootstrap-switch.min.js"></script>
<script type="text/javascript" src="js/fileinput.js"></script>
<link rel="stylesheet" href="css/fileinput.css" type="text/css"></link>
</head>
<body class="gray-bg">
    <div class="wrapper wrapper-content">
        <div class="row">
            <div class="col-sm-3">
                <div class="ibox float-e-margins">
                    <div class="ibox-content">
                        <div class="file-manager">
                            
                            <div id="Tree" class="nui-layout" style="height:50%;position:relative;margin:0;">
								<div class="zTreeDemoBackground">
							        <div class="tab" role="tabpanel">
							            <!-- Nav tabs -->
							            <ul class="nav nav-tabs" role="tablist">
							                <li role="presentation" class="active"><a href="#Section1" aria-controls="home" role="tab" data-toggle="tab"><span><i class="glyphicon glyphicon-globe"></i></span></a></li>
							                <li role="presentation"><a href="#Section2" aria-controls="profile" role="tab" data-toggle="tab"><span><i class="glyphicon glyphicon-search"></i></span></a></li>
							            </ul>
							            <!-- Tab panes -->
							            <div class="tab-content tabs" style="height:93%">
							                <div role="tabpanel" class="tab-pane panel panel-primary fade in active" id="Section1" style="height:93%;margin:0">
							                    <div class="panel-heading">组织机构树</div>
												<div class="sidebar panel-body">
													<div class="searchInput">
														<input type="text"  id="key" class="empty form-control" placeholder="Search..." onkeyup="callNumber()">
														<i class="glyphicon glyphicon-search" style="position: absolute;right: 6px;top: 6px;cursor: pointer;"></i>
														<div class="searchInfo">
															<label type="text" class="searchInfoWrapper"  id="resultKey">
															<div>
																<i id="clickUp" class="glyphicon glyphicon-arrow-up" onclick="clickUp()" style="top:4px"></i>
																<i id="clickDown" class="glyphicon glyphicon-arrow-down" onclick="clickDown()" style="top:4px"></i>
															</div>
															<label id="number"></label>
															</label>
														</div>
													</div>
													<ul id="tree_emp_Personneltree" style="overflow-y: auto;overflow-x: hidden;height: 75%;margin-top: 10px;" class="ztree" value="FOLDER_TREE_NAME" parentField="FOLDER_TREE_PARENT_ID" ></ul>
												</div>  
							                </div>
							                <div role="tabpanel" class="tab-pane panel panel-info fade" id="Section2"  style="height:93%;margin:0">
							                    <div class="panel-heading">党组织树</div>
							                    <div class="sidebar panel-body">   
							                        <div class="searchInput">
							                            <input type="text"  id="key2" class="empty form-control" placeholder="Search..." onkeyup="callNumber2()">
							                            <i class="glyphicon glyphicon-search" style="position: absolute;right: 6px;top: 6px;cursor: pointer;"></i>
							                            <div class="searchInfo">  
							                                <label type="text" class="searchInfoWrapper" id="resultKey2">  
							                                    <div>  
							                                        <i id="clickUp2" class="glyphicon glyphicon-arrow-up" onclick="clickUp2()" style="top:4px;"></i>
							                                        <i id="clickDown2" class="glyphicon glyphicon-arrow-down" onclick="clickDown2()" style="top:4px;"></i>  
							                                    </div>  
							                                    <label id="number2"></label>  
							                                </label>  
							                            </div>                  
							                        </div>  
							                        <ul id="tree_Partyorganizationtree" style="overflow-y: auto;overflow-x: hidden;height: 75%;margin-top: 10px;" class="ztree" >
							                        </ul>
							                    </div> 
							                </div>
							            </div>
							        </div>
								</div>
							</div>
                            <h5 class="tag-title">标签</h5>
                            <div id="fileManage_tagType" style="height:90px">
	                            
                            </div>
                            <div class="hr-line-dashed"></div>
                            <button class="btn btn-primary btn-block" onclick="layerUpload()">上传文件</button>
                            <div class="hr-line-dashed"></div>
                            <h5>文件夹</h5>
                            <div id="fileManage_folderType">
	                            
                            </div>
                            

                            <div class="clearfix"></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-sm-9 animated fadeInRight">
            	<div class="control-group" style="float: right;margin-right: 64px;margin-bottom: 10px;">
					<div class="switch" data-on="primary" data-off="info">
				   		<input id = "pcGridShow" type="checkbox" checked2/>
					</div>
				</div>
                <div class="row">
                    <div id="file_wall_view" class="col-sm-12">
                        <input id="file-es" name="file-es[]" type="file" multiple>
                    </div>
                    <div id="file_wall_grid" class="col-sm-12">
                    	<table id="fileList">
                    	</table>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script>
    var obj_id='${param.OBJ_ID}';
    var obj_type = '${param.OBJ_TYPE}';
    $(function() { 
    	$("[id='pcGridShow']").bootstrapSwitch({
    		size : "small",
    		onText:'列表式',
    		offText:'视图式',  
            onSwitchChange : function(event, state) {
            	if(state){
            		switchType="grid";
            	}else{
            		switchType = "view";
            	}
            	loadDataStart();
            }  
    	});
    	supplyHtml();

    	
    })
    </script>
    </body>
</html>