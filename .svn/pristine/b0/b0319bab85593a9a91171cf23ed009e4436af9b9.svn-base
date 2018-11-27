<%@ page language="java" import="java.util.*" import="com.myehr.common.util.LangUtil" pageEncoding="UTF-8"%>
<%@ include file="/common/common.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<body>
<div class="container-fluid" style="height:100%;overflow-y:auto;padding-top:5px;">
<div class="input-group" style="z-index: 5;float:right">
    <div id="grid_emp_newEntry_list_filter">
        <table class="cbs-table" style="width:100%">
             <tr>
				<td style="padding-left:10px;"  width="100"  ><label style="float:left;font-size:12px;width:100px;line-height:25px"><%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>: </label></td>
				<td style="padding-left:10px;"  width="100"  align="left"  >						<select id="FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>" columnId="22256" styleType="select" name="EMPEMPLOYEEREG_JOBID"  class="form-control " emptyText="请选择..."  style="float:left;" textField="text" valueField="id" dataField="data_form_22256"></select><span style='color:red;line-height:35px;font-size:27px'></span>
</td>
			<td style="float:right;padding-top:5px">
				<input id="FILTER_2057" name="FILTER_2057" placeholder="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>" style="padding: 6px 30px 6px 10px;" title="<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>,<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件号码")%>" type="text" class="form-control" oninput="grid_emp_newEntry_list_fun11_2057()" />
				<i class="icon-search" style="position: absolute;right: 12px;top: 2px;cursor: pointer;"></i>
			</td>
                <td style="margin-left:10px;float:left;padding-top:5px" align="left" >
<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
<input class="btn btn-primary" style="width:70px;padding-left:2px;padding-right:25px;" value="查询" onclick="grid_emp_newEntry_list_fun11_2057()">
<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
</i>
<div style="float:left;display:inline-block;margin-right:15px;position:relative;">
<input class="btn btn-primary" style="width:100px;padding-left:2px;padding-right:25px;" value="高级查询" onclick="grid_emp_newEntry_list_HeighQuery_2057()">
<i class="glyphicon glyphicon-search" style="position: absolute;right: 12px;top: 6px;cursor: pointer;color:#fff">
</i>
</div>
</td>
            </tr>
        </table>
    </div>
</div>
		<div class="BTNGROUP BTNGROUP_2057" style="margin:5px auto; display:inline-block;height: 30px;z-index: 6;position: relative">
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="addemp_newEntry_list"  class="btn btn-primary" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职登记")%> onclick="addemp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit1emp_newEntry_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职背景")%> onclick="edit1emp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="edit2emp_newEntry_list"  class="btn btn-warning" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"编辑")%> onclick="edit2emp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQLemp_newEntry_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"删除")%> onclick="executeSQLemp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQL1emp_newEntry_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号分配")%> onclick="executeSQL1emp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="executeSQL2emp_newEntry_list"  class="btn btn-success" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效")%> onclick="executeSQL2emp_newEntry_list_click_2057()"/>
			</div>
			<div style="margin-right:10px;display:inline-block">
			    <input type="button" id="importemp_newEntry_list"  class="btn btn-info" value=<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"导入")%> onclick="importemp_newEntry_list_click_2057()"/>
			</div>
		</div>
<table id="emp_newEntry_list_List">
</table>
<div id="activity_pane" style="position:absolute;left:500px;top:70px"></div>
</div>
<script>
var dictDatas_emp_newEntry_list_22254 = '[{"value":"1","text":"厦门农商行"},{"value":"255","text":"萨达"}]';
var dictDatas_emp_newEntry_list_22255 = '[{"value":"624","text":"总行领导"},{"value":"625","text":"部门"},{"value":"626","text":"零售银行管理部"},{"value":"627","text":"零售资产业务部"},{"value":"628","text":"零售财富管理部"},{"value":"629","text":"小微金融事业部"},{"value":"630","text":"电子银行部"},{"value":"631","text":"公司金融部"},{"value":"632","text":"国际业务部"},{"value":"633","text":"港口物流金融部"},{"value":"634","text":"市政公用金融部"},{"value":"635","text":"城镇开发金融部"},{"value":"636","text":"机构金融部"},{"value":"637","text":"投行与金融市场风控部"},{"value":"638","text":"金融市场部"},{"value":"639","text":"同业业务部"},{"value":"640","text":"理财事业部"},{"value":"641","text":"票据业务部"},{"value":"642","text":"投资银行事业部"},{"value":"643","text":"风险管理部"},{"value":"644","text":"投金评审部"},{"value":"645","text":"公司评审部"},{"value":"646","text":"零售评审部"},{"value":"647","text":"法律合规部"},{"value":"648","text":"公司律师事务部"},{"value":"649","text":"资产监控保全部"},{"value":"650","text":"办公室"},{"value":"651","text":"档案中心"},{"value":"652","text":"人力资源部"},{"value":"653","text":"党群工作部"},{"value":"654","text":"计划财务部"},{"value":"655","text":"企业文化部"},{"value":"656","text":"机构保障部"},{"value":"657","text":"物业中心"},{"value":"658","text":"运行管理部"},{"value":"659","text":"清算中心"},{"value":"660","text":"ATM思明分中心"},{"value":"661","text":"ATM集美分中心"},{"value":"662","text":"ATM同安分中心"},{"value":"663","text":"ATM翔安分中心"},{"value":"664","text":"科技信息部"},{"value":"665","text":"稽核审计部"},{"value":"666","text":"安全保卫部"},{"value":"667","text":"监察部"},{"value":"668","text":"消费者权益保护中心"},{"value":"669","text":"董事会办公室"},{"value":"670","text":"战略规划部"},{"value":"671","text":"纪委"},{"value":"672","text":"团委"},{"value":"673","text":"工会"},{"value":"674","text":"其他"},{"value":"675","text":"河南村镇银行"},{"value":"676","text":"战略业务部"},{"value":"677","text":"战略业务五部"},{"value":"678","text":"闽侯支行"},{"value":"679","text":"战略业务六部"},{"value":"680","text":"战略业务六部业务一部"},{"value":"681","text":"战略业务六部业务二部"},{"value":"682","text":"战略业务六部业务三部"},{"value":"683","text":"战略业务六部业务四部"},{"value":"684","text":"战略业务三部"},{"value":"685","text":"战略业务一部"},{"value":"686","text":"战略业务四部"},{"value":"687","text":"战略业务二部"},{"value":"688","text":"机构"},{"value":"689","text":"自贸区同业业务中心"},{"value":"690","text":"营业部"},{"value":"691","text":"营业部领导"},{"value":"692","text":"营业部综合部"},{"value":"693","text":"营业部业务一部"},{"value":"694","text":"营业部业务二部"},{"value":"695","text":"营业部业务三部"},{"value":"696","text":"思明中心支行"},{"value":"697","text":"思明中心支行领导"},{"value":"698","text":"思明中心支行综合部"},{"value":"699","text":"思明中心支行业务部"},{"value":"700","text":"思明中心支行业务二部"},{"value":"701","text":"思明本部"},{"value":"702","text":"何厝支行"},{"value":"703","text":"莲前支行"},{"value":"704","text":"前埔支行"},{"value":"705","text":"湖里中心支行"},{"value":"706","text":"湖里中心支行领导"},{"value":"707","text":"湖里中心支行综合部"},{"value":"708","text":"湖里本部"},{"value":"709","text":"湖里中心支行业务部"},{"value":"710","text":"枋湖支行"},{"value":"711","text":"五缘支行"},{"value":"712","text":"蔡塘支行"},{"value":"713","text":"集美中心支行"},{"value":"714","text":"集美中心支行领导"},{"value":"715","text":"集美中心支行综合部"},{"value":"716","text":"集美中心支行业务部"},{"value":"717","text":"集美中心支行业务二部"},{"value":"718","text":"集美中心支行业务三部"},{"value":"719","text":"集美本部"},{"value":"720","text":"杏苑支行"},{"value":"721","text":"大社支行"},{"value":"722","text":"北区支行"},{"value":"723","text":"孙厝支行"},{"value":"724","text":"海沧中心支行"},{"value":"725","text":"海沧中心支行领导"},{"value":"726","text":"海沧中心支行综合部"},{"value":"727","text":"海沧中心支行业务一部"},{"value":"728","text":"海沧本部"},{"value":"729","text":"海沧政务中心支行"},{"value":"730","text":"金海支行"},{"value":"731","text":"嵩屿支行"},{"value":"732","text":"新阳支行"},{"value":"733","text":"霞阳支行"},{"value":"734","text":"同安中心支行"},{"value":"735","text":"同安中心支行领导"},{"value":"736","text":"同安中心支行综合部"},{"value":"737","text":"同安中心支行业务部"},{"value":"738","text":"同安中心支行业务一部"},{"value":"739","text":"同安中心支行业务二部"},{"value":"740","text":"同安本部"},{"value":"741","text":"新民支行"},{"value":"742","text":"西柯支行"},{"value":"743","text":"西塘支行"},{"value":"744","text":"梧侣支行"},{"value":"745","text":"潘涂支行"},{"value":"746","text":"翔安中心支行"},{"value":"747","text":"翔安中心支行领导"},{"value":"748","text":"翔安中心支行综合部"},{"value":"749","text":"翔安中心支行业务部"},{"value":"750","text":"翔安中心支行业务二部"},{"value":"751","text":"马巷支行"},{"value":"752","text":"舫山支行"},{"value":"753","text":"新城支行"},{"value":"754","text":"新店支行"},{"value":"755","text":"滨海直属支行"},{"value":"756","text":"滨海直属支行领导"},{"value":"757","text":"滨海直属支行综合部"},{"value":"758","text":"滨海直属支行业务部"},{"value":"759","text":"滨海直属支行业务一部"},{"value":"760","text":"滨海本部"},{"value":"761","text":"滨西支行"},{"value":"762","text":"东渡支行"},{"value":"763","text":"滨海直属支行业务二部"},{"value":"764","text":"嘉禾直属支行"},{"value":"765","text":"嘉禾直属支行领导"},{"value":"766","text":"嘉禾直属支行综合部"},{"value":"767","text":"嘉禾直属支行业务部"},{"value":"768","text":"嘉禾本部"},{"value":"769","text":"仙岳支行"},{"value":"770","text":"宝福支行"},{"value":"771","text":"龙山支行"},{"value":"772","text":"高崎直属支行"},{"value":"773","text":"高崎直属支行领导"},{"value":"774","text":"高崎直属支行综合部"},{"value":"775","text":"高崎直属支行业务部"},{"value":"776","text":"高崎本部"},{"value":"777","text":"高殿支行"},{"value":"778","text":"悦华支行"},{"value":"779","text":"城市广场支行"},{"value":"780","text":"金山直属支行"},{"value":"781","text":"金山直属支行领导"},{"value":"782","text":"金山直属支行综合部"},{"value":"783","text":"金山直属支行业务部"},{"value":"784","text":"金山本部"},{"value":"785","text":"五通支行"},{"value":"786","text":"灌口直属支行"},{"value":"787","text":"灌口直属支行领导"},{"value":"788","text":"灌口直属支行综合部"},{"value":"789","text":"灌口直属支行企贷中心"},{"value":"790","text":"灌口本部"},{"value":"791","text":"街口支行"},{"value":"792","text":"杏林支行"},{"value":"793","text":"上塘支行"},{"value":"794","text":"西亭支行"},{"value":"795","text":"后溪直属支行"},{"value":"796","text":"后溪直属支行领导"},{"value":"797","text":"后溪直属支行综合部"},{"value":"798","text":"后溪直属支行企贷中心"},{"value":"799","text":"后溪直属支行业务一部"},{"value":"800","text":"后溪直属支行业务二部"},{"value":"801","text":"后溪直属支行业务三部"},{"value":"802","text":"后溪本部"},{"value":"803","text":"英村支行"},{"value":"804","text":"珩山支行"},{"value":"805","text":"东孚直属支行"},{"value":"806","text":"东孚直属支行领导"},{"value":"807","text":"东孚直属支行综合部"},{"value":"808","text":"东孚直属支行业务部"},{"value":"809","text":"东孚本部"},{"value":"810","text":"天竺支行"},{"value":"811","text":"鼎美支行"},{"value":"812","text":"汀溪直属支行"},{"value":"813","text":"汀溪直属支行领导"},{"value":"814","text":"汀溪直属支行综合部"},{"value":"815","text":"汀溪直属支行业务部"},{"value":"816","text":"汀溪本部"},{"value":"817","text":"大同支行"},{"value":"818","text":"五显支行"},{"value":"819","text":"洪塘支行"},{"value":"820","text":"莲花支行"},{"value":"821","text":"新圩直属支行"},{"value":"822","text":"新圩直属支行领导"},{"value":"823","text":"新圩直属支行综合部"},{"value":"824","text":"新圩直属支行业务部"},{"value":"825","text":"新圩本部"},{"value":"826","text":"内厝支行"},{"value":"827","text":"大嶝支行"},{"value":"830","text":"数字金融事业部"},{"value":"831","text":"思明中心支行业务部"},{"value":"832","text":"思明中心支行业务二部"},{"value":"833","text":"滨海直属支行业务部"},{"value":"834","text":"滨海直属支行业务二部"},{"value":"835","text":"嘉禾直属支行业务部"},{"value":"836","text":"海沧中心支行业务部"},{"value":"837","text":"东孚直属支行业务部"},{"value":"838","text":"湖里中心支行业务部"},{"value":"839","text":"高崎直属支行业务部"},{"value":"840","text":"灌口企贷中心"},{"value":"841","text":"金山直属支行业务部"},{"value":"842","text":"集美中心支行业务部"},{"value":"843","text":"集美中心支行业务二部"},{"value":"844","text":"集美中心支行业务三部"},{"value":"845","text":"后溪直属支行业务二部"},{"value":"846","text":"后溪直属支行业务三部"},{"value":"847","text":"后溪直属支行业务部"},{"value":"848","text":"同安中心支行业务二部"},{"value":"849","text":"同安中心支行业务部"},{"value":"850","text":"汀溪直属支行业务部"},{"value":"851","text":"翔安中心支行业务部"},{"value":"852","text":"翔安中心支行业务二部"},{"value":"853","text":"新圩直属支行业务部"}]';
var dictDatas_emp_newEntry_list_22256 = '[{"value":"26","text":"董事长"},{"value":"27","text":"总行行长"},{"value":"28","text":"监事长"},{"value":"29","text":"总行副行长"},{"value":"30","text":"纪委书记"},{"value":"31","text":"董事会秘书"},{"value":"32","text":"总监"},{"value":"33","text":"工会主席"},{"value":"34","text":"副总监"},{"value":"35","text":"工会副主席"},{"value":"36","text":"副书记"},{"value":"37","text":"主任"},{"value":"38","text":"总经理"},{"value":"39","text":"总经理"},{"value":"40","text":"总经理"},{"value":"41","text":"总经理"},{"value":"42","text":"总裁"},{"value":"43","text":"总经理"},{"value":"44","text":"总经理"},{"value":"45","text":"总经理"},{"value":"46","text":"总经理"},{"value":"47","text":"总经理"},{"value":"48","text":"总经理"},{"value":"49","text":"总经理"},{"value":"50","text":"总经理"},{"value":"51","text":"总经理"},{"value":"52","text":"总经理"},{"value":"53","text":"总经理"},{"value":"54","text":"总经理"},{"value":"55","text":"总经理"},{"value":"56","text":"总经理"},{"value":"57","text":"总经理"},{"value":"58","text":"总经理"},{"value":"59","text":"总经理"},{"value":"60","text":"总经理"},{"value":"61","text":"总经理"},{"value":"62","text":"总经理"},{"value":"63","text":"主任"},{"value":"64","text":"主任"},{"value":"65","text":"总经理"},{"value":"66","text":"部长"},{"value":"67","text":"总经理"},{"value":"68","text":"总经理"},{"value":"69","text":"总经理"},{"value":"70","text":"总经理"},{"value":"71","text":"总经理"},{"value":"72","text":"总经理"},{"value":"73","text":"总经理"},{"value":"74","text":"总经理"},{"value":"75","text":"副主任(主持)"},{"value":"76","text":"副总经理(主持)"},{"value":"77","text":"副总经理(主持)"},{"value":"78","text":"副总经理(主持)"},{"value":"79","text":"副总经理(主持)"},{"value":"80","text":"副总裁(主持)"},{"value":"81","text":"副总经理(主持)"},{"value":"82","text":"副总经理(主持)"},{"value":"83","text":"副总经理(主持)"},{"value":"84","text":"副总经理(主持)"},{"value":"85","text":"副总经理(主持)"},{"value":"86","text":"副总经理(主持)"},{"value":"87","text":"副总经理(主持)"},{"value":"88","text":"副总经理(主持)"},{"value":"89","text":"副总经理(主持)"},{"value":"90","text":"副总经理(主持)"},{"value":"91","text":"副总经理(主持)"},{"value":"92","text":"副总经理(主持)"},{"value":"93","text":"副总经理(主持)"},{"value":"94","text":"副总经理(主持)"},{"value":"95","text":"副总经理(主持)"},{"value":"96","text":"副总经理(主持)"},{"value":"97","text":"副总经理(主持)"},{"value":"98","text":"副总经理(主持)"},{"value":"99","text":"副总经理(主持)"},{"value":"100","text":"副总经理(主持)"},{"value":"101","text":"副主任(主持)"},{"value":"102","text":"副总经理(主持)"},{"value":"103","text":"副部长(主持)"},{"value":"104","text":"副总经理(主持)"},{"value":"105","text":"副总经理(主持)"},{"value":"106","text":"副总经理(主持)"},{"value":"107","text":"副总经理(主持)"},{"value":"108","text":"副总经理(主持)"},{"value":"109","text":"副总经理(主持)"},{"value":"110","text":"副总经理(主持)"},{"value":"111","text":"副总经理(主持)"},{"value":"112","text":"总经理"},{"value":"113","text":"一级支行行长"},{"value":"114","text":"一级支行行长"},{"value":"115","text":"一级支行行长"},{"value":"116","text":"一级支行行长"},{"value":"117","text":"一级支行行长"},{"value":"118","text":"一级支行行长"},{"value":"119","text":"一级支行行长"},{"value":"120","text":"一级支行行长"},{"value":"121","text":"一级支行行长"},{"value":"122","text":"一级支行行长"},{"value":"123","text":"一级支行行长"},{"value":"124","text":"一级支行行长"},{"value":"125","text":"一级支行行长"},{"value":"126","text":"一级支行行长"},{"value":"127","text":"一级支行行长"},{"value":"128","text":"一级支行行长"},{"value":"129","text":"副总经理(主持)"},{"value":"130","text":"一级支行副行长(主持)"},{"value":"131","text":"一级支行副行长(主持)"},{"value":"132","text":"一级支行副行长(主持)"},{"value":"133","text":"一级支行副行长(主持)"},{"value":"134","text":"一级支行副行长(主持)"},{"value":"135","text":"一级支行副行长(主持)"},{"value":"136","text":"一级支行副行长(主持)"},{"value":"137","text":"一级支行副行长(主持)"},{"value":"138","text":"一级支行副行长(主持)"},{"value":"139","text":"一级支行副行长(主持)"},{"value":"140","text":"一级支行副行长(主持)"},{"value":"141","text":"一级支行副行长(主持)"},{"value":"142","text":"一级支行副行长(主持)"},{"value":"143","text":"一级支行副行长(主持)"},{"value":"144","text":"一级支行副行长(主持)"},{"value":"145","text":"一级支行副行长(主持)"},{"value":"146","text":"总裁"},{"value":"147","text":"总裁"},{"value":"148","text":"总裁"},{"value":"149","text":"总裁"},{"value":"150","text":"总裁"},{"value":"151","text":"总裁"},{"value":"152","text":"副总裁(主持)"},{"value":"153","text":"副总裁(主持)"},{"value":"154","text":"副总裁(主持)"},{"value":"155","text":"副总裁(主持)"},{"value":"156","text":"副总裁(主持)"},{"value":"157","text":"副总裁(主持)"},{"value":"158","text":"副主任"},{"value":"159","text":"副总经理"},{"value":"160","text":"副总经理"},{"value":"161","text":"副总经理"},{"value":"162","text":"副总经理"},{"value":"163","text":"副总裁"},{"value":"164","text":"副总经理"},{"value":"165","text":"副总经理"},{"value":"166","text":"副总经理"},{"value":"167","text":"副总经理"},{"value":"168","text":"副总经理"},{"value":"169","text":"副总经理"},{"value":"170","text":"副总经理"},{"value":"171","text":"副总经理"},{"value":"172","text":"副总经理"},{"value":"173","text":"副总经理"},{"value":"174","text":"副总经理"},{"value":"175","text":"副总经理"},{"value":"176","text":"副总经理"},{"value":"177","text":"副总经理"},{"value":"178","text":"副总经理"},{"value":"179","text":"副总经理"},{"value":"180","text":"副总经理"},{"value":"181","text":"副总经理"},{"value":"182","text":"副总经理"},{"value":"183","text":"副总经理"},{"value":"184","text":"副主任"},{"value":"185","text":"副总经理"},{"value":"186","text":"副总经理"},{"value":"187","text":"副总经理"},{"value":"188","text":"副总经理"},{"value":"189","text":"副总经理"},{"value":"190","text":"物业中心主任"},{"value":"191","text":"副总经理"},{"value":"192","text":"副总经理"},{"value":"193","text":"副总经理"},{"value":"194","text":"副总经理"},{"value":"195","text":"副总经理"},{"value":"196","text":"主任助理"},{"value":"197","text":"总经理助理"},{"value":"198","text":"总经理助理"},{"value":"199","text":"总经理助理"},{"value":"200","text":"总经理助理"},{"value":"201","text":"总裁助理"},{"value":"202","text":"总经理助理"},{"value":"203","text":"总经理助理"},{"value":"204","text":"总经理助理"},{"value":"205","text":"总经理助理"},{"value":"206","text":"总经理助理"},{"value":"207","text":"总经理助理"},{"value":"208","text":"总经理助理"},{"value":"209","text":"总经理助理"},{"value":"210","text":"总经理助理"},{"value":"211","text":"总经理助理"},{"value":"212","text":"总经理助理"},{"value":"213","text":"总经理助理"},{"value":"214","text":"总经理助理"},{"value":"215","text":"总经理助理"},{"value":"216","text":"总经理助理"},{"value":"217","text":"总经理助理"},{"value":"218","text":"总经理助理"},{"value":"219","text":"总经理助理"},{"value":"220","text":"总经理助理"},{"value":"221","text":"总经理助理"},{"value":"222","text":"主任助理"},{"value":"223","text":"总经理助理"},{"value":"224","text":"总经理助理"},{"value":"225","text":"总经理助理"},{"value":"226","text":"总经理助理"},{"value":"227","text":"总经理助理"},{"value":"228","text":"总经理助理"},{"value":"229","text":"总经理助理"},{"value":"230","text":"总经理助理"},{"value":"231","text":"总经理助理"},{"value":"232","text":"总经理助理"},{"value":"233","text":"副总经理"},{"value":"234","text":"一级支行副行长"},{"value":"235","text":"一级支行副行长"},{"value":"236","text":"一级支行副行长"},{"value":"237","text":"一级支行副行长"},{"value":"238","text":"一级支行副行长"},{"value":"239","text":"一级支行副行长"},{"value":"240","text":"一级支行副行长"},{"value":"241","text":"一级支行副行长"},{"value":"242","text":"一级支行副行长"},{"value":"243","text":"一级支行副行长"},{"value":"244","text":"一级支行副行长"},{"value":"245","text":"一级支行副行长"},{"value":"246","text":"一级支行副行长"},{"value":"247","text":"一级支行副行长"},{"value":"248","text":"一级支行副行长"},{"value":"249","text":"一级支行副行长"},{"value":"250","text":"总经理助理"},{"value":"251","text":"一级行长助理"},{"value":"252","text":"一级行长助理"},{"value":"253","text":"一级行长助理"},{"value":"254","text":"一级行长助理"},{"value":"255","text":"一级行长助理"},{"value":"256","text":"一级行长助理"},{"value":"257","text":"一级行长助理"},{"value":"258","text":"一级行长助理"},{"value":"259","text":"一级行长助理"},{"value":"260","text":"一级行长助理"},{"value":"261","text":"一级行长助理"},{"value":"262","text":"一级行长助理"},{"value":"263","text":"一级行长助理"},{"value":"264","text":"一级行长助理"},{"value":"265","text":"一级行长助理"},{"value":"266","text":"一级行长助理"},{"value":"267","text":"副总裁(总经理级)"},{"value":"268","text":"调研员"},{"value":"269","text":"副总裁"},{"value":"270","text":"副总裁"},{"value":"271","text":"副总裁"},{"value":"272","text":"副总裁"},{"value":"273","text":"副总裁"},{"value":"274","text":"副总裁"},{"value":"275","text":"总裁助理"},{"value":"276","text":"总裁助理"},{"value":"277","text":"总裁助理"},{"value":"278","text":"总裁助理"},{"value":"279","text":"总裁助理"},{"value":"280","text":"总裁助理"},{"value":"281","text":"女工委主任"},{"value":"282","text":"二级支行行长"},{"value":"283","text":"二级支行行长"},{"value":"284","text":"二级支行行长"},{"value":"285","text":"二级支行行长"},{"value":"286","text":"二级支行行长"},{"value":"287","text":"二级支行行长"},{"value":"288","text":"二级支行行长"},{"value":"289","text":"二级支行行长"},{"value":"290","text":"二级支行行长"},{"value":"291","text":"二级支行行长"},{"value":"292","text":"二级支行行长"},{"value":"293","text":"二级支行行长"},{"value":"294","text":"二级支行行长"},{"value":"295","text":"二级支行行长"},{"value":"296","text":"二级支行行长"},{"value":"297","text":"二级支行行长"},{"value":"298","text":"二级支行行长"},{"value":"299","text":"二级支行行长"},{"value":"300","text":"二级支行行长"},{"value":"301","text":"二级支行行长"},{"value":"302","text":"二级支行行长"},{"value":"303","text":"二级支行行长"},{"value":"304","text":"二级支行行长"},{"value":"305","text":"二级支行行长"},{"value":"306","text":"二级支行行长"},{"value":"307","text":"二级支行行长"},{"value":"308","text":"二级支行行长"},{"value":"309","text":"二级支行行长"},{"value":"310","text":"二级支行行长"},{"value":"311","text":"二级支行行长"},{"value":"312","text":"二级支行行长"},{"value":"313","text":"二级支行行长"},{"value":"314","text":"二级支行行长"},{"value":"315","text":"二级支行行长"},{"value":"316","text":"二级支行行长"},{"value":"317","text":"二级支行行长"},{"value":"318","text":"二级支行行长"},{"value":"319","text":"二级支行行长"},{"value":"320","text":"二级支行行长"},{"value":"321","text":"二级支行行长"},{"value":"322","text":"二级支行行长"},{"value":"323","text":"二级支行行长"},{"value":"324","text":"二级支行行长"},{"value":"325","text":"二级支行行长"},{"value":"326","text":"二级支行行长"},{"value":"327","text":"二级支行行长"},{"value":"328","text":"二级支行行长"},{"value":"329","text":"二级支行行长"},{"value":"330","text":"二级支行行长"},{"value":"331","text":"二级支行行长"},{"value":"332","text":"二级支行行长"},{"value":"333","text":"二级支行行长"},{"value":"334","text":"二级支行行长"},{"value":"335","text":"二级支行行长"},{"value":"336","text":"二级支行行长"},{"value":"337","text":"二级支行行长"},{"value":"338","text":"二级支行行长"},{"value":"339","text":"二级支行行长"},{"value":"340","text":"二级支行行长"},{"value":"341","text":"二级支行行长"},{"value":"342","text":"二级支行行长"},{"value":"343","text":"二级支行副行长(主持)"},{"value":"344","text":"二级支行副行长(主持)"},{"value":"345","text":"二级支行副行长(主持)"},{"value":"346","text":"二级支行副行长(主持)"},{"value":"347","text":"二级支行副行长(主持)"},{"value":"348","text":"二级支行副行长(主持)"},{"value":"349","text":"二级支行副行长(主持)"},{"value":"350","text":"二级支行副行长(主持)"},{"value":"351","text":"二级支行副行长(主持)"},{"value":"352","text":"二级支行副行长(主持)"},{"value":"353","text":"二级支行副行长(主持)"},{"value":"354","text":"二级支行副行长(主持)"},{"value":"355","text":"二级支行副行长(主持)"},{"value":"356","text":"二级支行副行长(主持)"},{"value":"357","text":"二级支行副行长(主持)"},{"value":"358","text":"二级支行副行长(主持)"},{"value":"359","text":"二级支行副行长(主持)"},{"value":"360","text":"二级支行副行长(主持)"},{"value":"361","text":"二级支行副行长(主持)"},{"value":"362","text":"二级支行副行长(主持)"},{"value":"363","text":"二级支行副行长(主持)"},{"value":"364","text":"二级支行副行长(主持)"},{"value":"365","text":"二级支行副行长(主持)"},{"value":"366","text":"二级支行副行长(主持)"},{"value":"367","text":"二级支行副行长(主持)"},{"value":"368","text":"二级支行副行长(主持)"},{"value":"369","text":"二级支行副行长(主持)"},{"value":"370","text":"二级支行副行长(主持)"},{"value":"371","text":"二级支行副行长(主持)"},{"value":"372","text":"二级支行副行长(主持)"},{"value":"373","text":"二级支行副行长(主持)"},{"value":"374","text":"二级支行副行长(主持)"},{"value":"375","text":"二级支行副行长(主持)"},{"value":"376","text":"二级支行副行长(主持)"},{"value":"377","text":"二级支行副行长(主持)"},{"value":"378","text":"二级支行副行长(主持)"},{"value":"379","text":"二级支行副行长(主持)"},{"value":"380","text":"二级支行副行长(主持)"},{"value":"381","text":"二级支行副行长(主持)"},{"value":"382","text":"二级支行副行长(主持)"},{"value":"383","text":"二级支行副行长(主持)"},{"value":"384","text":"二级支行副行长(主持)"},{"value":"385","text":"二级支行副行长(主持)"},{"value":"386","text":"二级支行副行长(主持)"},{"value":"387","text":"二级支行副行长(主持)"},{"value":"388","text":"二级支行副行长(主持)"},{"value":"389","text":"二级支行副行长(主持)"},{"value":"390","text":"二级支行副行长(主持)"},{"value":"391","text":"二级支行副行长(主持)"},{"value":"392","text":"二级支行副行长(主持)"},{"value":"393","text":"二级支行副行长(主持)"},{"value":"394","text":"二级支行副行长(主持)"},{"value":"395","text":"二级支行副行长(主持)"},{"value":"396","text":"二级支行副行长(主持)"},{"value":"397","text":"二级支行副行长(主持)"},{"value":"398","text":"二级支行副行长(主持)"},{"value":"399","text":"二级支行副行长(主持)"},{"value":"400","text":"二级支行副行长(主持)"},{"value":"401","text":"二级支行副行长(主持)"},{"value":"402","text":"二级支行副行长(主持)"},{"value":"403","text":"二级支行副行长(主持)"},{"value":"404","text":"二级支行副行长"},{"value":"405","text":"二级支行副行长"},{"value":"406","text":"二级支行副行长"},{"value":"407","text":"二级支行副行长"},{"value":"408","text":"二级支行副行长"},{"value":"409","text":"二级支行副行长"},{"value":"410","text":"二级支行副行长"},{"value":"411","text":"二级支行副行长"},{"value":"412","text":"二级支行副行长"},{"value":"413","text":"二级支行副行长"},{"value":"414","text":"二级支行副行长"},{"value":"415","text":"二级支行副行长"},{"value":"416","text":"二级支行副行长"},{"value":"417","text":"二级支行副行长"},{"value":"418","text":"二级支行副行长"},{"value":"419","text":"二级支行副行长"},{"value":"420","text":"二级支行副行长"},{"value":"421","text":"二级支行副行长"},{"value":"422","text":"二级支行副行长"},{"value":"423","text":"二级支行副行长"},{"value":"424","text":"二级支行副行长"},{"value":"425","text":"二级支行副行长"},{"value":"426","text":"二级支行副行长"},{"value":"427","text":"二级支行副行长"},{"value":"428","text":"二级支行副行长"},{"value":"429","text":"二级支行副行长"},{"value":"430","text":"二级支行副行长"},{"value":"431","text":"二级支行副行长"},{"value":"432","text":"二级支行副行长"},{"value":"433","text":"二级支行副行长"},{"value":"434","text":"二级支行副行长"},{"value":"435","text":"二级支行副行长"},{"value":"436","text":"二级支行副行长"},{"value":"437","text":"二级支行副行长"},{"value":"438","text":"二级支行副行长"},{"value":"439","text":"二级支行副行长"},{"value":"440","text":"二级支行副行长"},{"value":"441","text":"二级支行副行长"},{"value":"442","text":"二级支行副行长"},{"value":"443","text":"二级支行副行长"},{"value":"444","text":"二级支行副行长"},{"value":"445","text":"二级支行副行长"},{"value":"446","text":"二级支行副行长"},{"value":"447","text":"二级支行副行长"},{"value":"448","text":"二级支行副行长"},{"value":"449","text":"二级支行副行长"},{"value":"450","text":"二级支行副行长"},{"value":"451","text":"二级支行副行长"},{"value":"452","text":"二级支行副行长"},{"value":"453","text":"二级支行副行长"},{"value":"454","text":"二级支行副行长"},{"value":"455","text":"二级支行副行长"},{"value":"456","text":"二级支行副行长"},{"value":"457","text":"二级支行副行长"},{"value":"458","text":"二级支行副行长"},{"value":"459","text":"二级支行副行长"},{"value":"460","text":"二级支行副行长"},{"value":"461","text":"二级支行副行长"},{"value":"462","text":"二级支行副行长"},{"value":"463","text":"二级支行副行长"},{"value":"464","text":"二级支行副行长"},{"value":"465","text":"综合事务"},{"value":"466","text":"资本管理"},{"value":"467","text":"综合事务"},{"value":"468","text":"统计管理"},{"value":"469","text":"监管统计"},{"value":"470","text":"金融统计"},{"value":"471","text":"股权管理"},{"value":"472","text":"业务推动"},{"value":"473","text":"综合事务"},{"value":"474","text":"风险审查"},{"value":"475","text":"风险审查"},{"value":"476","text":"放款审查"},{"value":"477","text":"额度管理"},{"value":"478","text":"财务管理"},{"value":"479","text":"投资管理"},{"value":"480","text":"产品管理"},{"value":"481","text":"交易员"},{"value":"482","text":"风险管理"},{"value":"483","text":"综合事务"},{"value":"484","text":"综合事务"},{"value":"485","text":"业务推动"},{"value":"486","text":"业务经办"},{"value":"487","text":"档案管理"},{"value":"488","text":"营销推动"},{"value":"489","text":"客户经理"},{"value":"490","text":"客户营销与协同管理"},{"value":"491","text":"综合事务"},{"value":"492","text":"绩效考核"},{"value":"493","text":"资产营销推动"},{"value":"494","text":"负债营销推动"},{"value":"495","text":"贸融推动"},{"value":"496","text":"综合事务"},{"value":"497","text":"同业推动"},{"value":"498","text":"支行管理"},{"value":"499","text":"单证管理"},{"value":"500","text":"客户经理"},{"value":"501","text":"客户经理"},{"value":"502","text":"客户经理"},{"value":"503","text":"业务规划"},{"value":"504","text":"渠道管理"},{"value":"505","text":"业务规划"},{"value":"506","text":"产品策划"},{"value":"507","text":"指标管理"},{"value":"508","text":"综合事务"},{"value":"509","text":"市场推广"},{"value":"510","text":"团队管理"},{"value":"511","text":"业务规划"},{"value":"512","text":"售后服务"},{"value":"513","text":"产品策划"},{"value":"514","text":"营销推动"},{"value":"515","text":"综合事务"},{"value":"516","text":"保管箱专管员"},{"value":"517","text":"业务运营中心主管"},{"value":"518","text":"消费金融中心主管"},{"value":"519","text":"贷后管理中心主管"},{"value":"520","text":"客户经理"},{"value":"521","text":"风险经理"},{"value":"522","text":"贷后管理"},{"value":"523","text":"综合事务"},{"value":"524","text":"营销推动"},{"value":"525","text":"业务规划"},{"value":"526","text":"征信查询"},{"value":"527","text":"业务推动"},{"value":"528","text":"业务拓展"},{"value":"529","text":"客户经理"},{"value":"530","text":"业务推动"},{"value":"531","text":"综合事务"},{"value":"532","text":"业务推动"},{"value":"533","text":"业务评审(派驻福州事业部)"},{"value":"534","text":"风险管理"},{"value":"535","text":"系统管理"},{"value":"536","text":"放款审查"},{"value":"537","text":"放款审查(派驻海沧)"},{"value":"538","text":"放款审查(派驻集美)"},{"value":"539","text":"放款审查(派驻同安)"},{"value":"540","text":"放款审查(派驻翔安)"},{"value":"541","text":"放款审查(派驻小微金融事业部)"},{"value":"542","text":"放款审查(派驻福州事业部)"},{"value":"543","text":"档案管理"},{"value":"544","text":"投金评审"},{"value":"545","text":"综合事务"},{"value":"546","text":"授信评审"},{"value":"547","text":"业务支持"},{"value":"548","text":"零售评审"},{"value":"549","text":"信用卡评审(派驻小微金融事业部)"},{"value":"550","text":"业务推动"},{"value":"551","text":"综合管理"},{"value":"552","text":"律师与合同事务管理"},{"value":"553","text":"法律审査(金融市场业务)"},{"value":"554","text":"法律审査(对公与投行业务)"},{"value":"555","text":"法律审査(零售与保障条线业务)"},{"value":"556","text":"诉讼事务管理"},{"value":"557","text":"合规管理"},{"value":"558","text":"综合管理"},{"value":"559","text":"贷后管理综合"},{"value":"560","text":"贷后管理(表内业务)"},{"value":"561","text":"贷后管理(表外业务)"},{"value":"562","text":"受托资产、诉讼事务管理"},{"value":"563","text":"不良贷款清收管理"},{"value":"564","text":"不良贷款清收"},{"value":"565","text":"资产保全处置"},{"value":"566","text":"风险资产管理"},{"value":"567","text":"贷记卡监控管理"},{"value":"568","text":"综合事务"},{"value":"569","text":"文件收发"},{"value":"570","text":"宣传管理"},{"value":"571","text":"机要秘书"},{"value":"572","text":"综合文秘"},{"value":"573","text":"后勤管理"},{"value":"574","text":"印章管理"},{"value":"575","text":"信息管理"},{"value":"576","text":"档案管理"},{"value":"577","text":"驾驶员"},{"value":"578","text":"薪酬福利"},{"value":"579","text":"招聘与配置"},{"value":"580","text":"培训管理"},{"value":"581","text":"组织架构与绩效管理"},{"value":"582","text":"考勤与外事管理"},{"value":"583","text":"干部管理"},{"value":"584","text":"党务管理"},{"value":"585","text":"核算管理"},{"value":"586","text":"预算考核管理"},{"value":"587","text":"资产核算"},{"value":"588","text":"税费核算"},{"value":"589","text":"业务核算"},{"value":"590","text":"会计管理"},{"value":"591","text":"统计管理"},{"value":"592","text":"流动性管理"},{"value":"593","text":"财务管理综合"},{"value":"594","text":"税费核算"},{"value":"595","text":"文化活动策划"},{"value":"596","text":"企业文化建设"},{"value":"597","text":"综合事务"},{"value":"598","text":"工程管理"},{"value":"599","text":"综合事务"},{"value":"600","text":"资产管理"},{"value":"601","text":"物业管理"},{"value":"602","text":"后勤保障"},{"value":"603","text":"账户中心主管"},{"value":"604","text":"账户管理"},{"value":"605","text":"对账管理"},{"value":"606","text":"法院点对点查控"},{"value":"607","text":"资金清算主管"},{"value":"608","text":"资金清算"},{"value":"609","text":"ATM账务管理"},{"value":"610","text":"ATM账务操作"},{"value":"611","text":"金融市场资金清算主管"},{"value":"612","text":"金融市场资金清算"},{"value":"613","text":"国际业务资金清算"},{"value":"614","text":"检查辅导中心主管"},{"value":"615","text":"柜面管理"},{"value":"616","text":"反洗钱"},{"value":"617","text":"运营支持"},{"value":"618","text":"服务督导"},{"value":"619","text":"金库中心副主任"},{"value":"620","text":"凭证库管员"},{"value":"621","text":"凭证账务处理"},{"value":"622","text":"现金库管员"},{"value":"623","text":"系统管理"},{"value":"624","text":"应用系统维护"},{"value":"625","text":"信息安全"},{"value":"626","text":"运行操作"},{"value":"627","text":"网络管理"},{"value":"628","text":"技术维护"},{"value":"629","text":"技术管理"},{"value":"630","text":"软件开发"},{"value":"631","text":"渠道组开发"},{"value":"632","text":"需求与质量控制"},{"value":"633","text":"安全保卫管理"},{"value":"634","text":"监控中心负责人"},{"value":"635","text":"监控中心值班"},{"value":"636","text":"守库保安"},{"value":"638","text":"监察管理"},{"value":"639","text":"消费者权益保护"},{"value":"652","text":"稽核审计"},{"value":"653","text":"卡业务与ATM管理稽核"},{"value":"654","text":"经济责任认定稽核"},{"value":"655","text":"派驻后督中心稽核"},{"value":"656","text":"非信贷资产与行政管理稽核"},{"value":"657","text":"综合事务"},{"value":"658","text":"客户经理"},{"value":"659","text":"综合事务"},{"value":"660","text":"业务一部负责人"},{"value":"661","text":"业务二部负责人"},{"value":"662","text":"业务三部负责人"},{"value":"663","text":"业务四部负责人"},{"value":"664","text":"客户经理"},{"value":"665","text":"客户经理"},{"value":"666","text":"客户经理"},{"value":"667","text":"客户经理"},{"value":"668","text":"业务推动"},{"value":"669","text":"业务推动"},{"value":"670","text":"业务推动"},{"value":"671","text":"业务推动"},{"value":"672","text":"业务推动"},{"value":"673","text":"同业投资"},{"value":"674","text":"产品推动"},{"value":"675","text":"渠道营销"},{"value":"676","text":"资金交易"},{"value":"677","text":"结构化融资"},{"value":"678","text":"交易主管"},{"value":"679","text":"债券交易"},{"value":"680","text":"ATM思明分中心负责人"},{"value":"681","text":"ATM集美分中心负责人"},{"value":"682","text":"ATM同安分中心负责人"},{"value":"683","text":"ATM翔安分中心负责人"},{"value":"684","text":"ATM管理员"},{"value":"685","text":"ATM管理员"},{"value":"686","text":"ATM管理员"},{"value":"687","text":"ATM管理员"},{"value":"688","text":"综合部负责人"},{"value":"689","text":"放款审查"},{"value":"690","text":"业务一部负责人"},{"value":"691","text":"业务二部负责人"},{"value":"692","text":"业务三部负责人"},{"value":"693","text":"客户经理"},{"value":"694","text":"客户经理"},{"value":"695","text":"客户经理"},{"value":"696","text":"营业经理"},{"value":"697","text":"柜员(现金)"},{"value":"698","text":"柜员(非现金)"},{"value":"699","text":"综合部负责人"},{"value":"700","text":"综合事务"},{"value":"701","text":"监控员"},{"value":"702","text":"抵押登记"},{"value":"703","text":"票据交换"},{"value":"704","text":"放款审核"},{"value":"705","text":"驾驶员"},{"value":"706","text":"综合部负责人"},{"value":"707","text":"综合事务"},{"value":"708","text":"监控员"},{"value":"709","text":"抵押登记"},{"value":"710","text":"票据交换"},{"value":"711","text":"放款审查"},{"value":"712","text":"驾驶员"},{"value":"713","text":"综合部负责人"},{"value":"714","text":"综合事务"},{"value":"715","text":"监控员"},{"value":"716","text":"抵押登记"},{"value":"717","text":"票据交换"},{"value":"718","text":"放款审查"},{"value":"719","text":"驾驶员"},{"value":"720","text":"综合部负责人"},{"value":"721","text":"综合事务"},{"value":"722","text":"监控员"},{"value":"723","text":"抵押登记"},{"value":"724","text":"票据交换"},{"value":"725","text":"放款审查"},{"value":"726","text":"驾驶员"},{"value":"727","text":"综合部负责人"},{"value":"728","text":"综合事务"},{"value":"729","text":"监控员"},{"value":"730","text":"抵押登记"},{"value":"731","text":"票据交换"},{"value":"732","text":"放款审查"},{"value":"733","text":"驾驶员"},{"value":"734","text":"综合部负责人"},{"value":"735","text":"综合事务"},{"value":"736","text":"监控员"},{"value":"737","text":"抵押登记"},{"value":"738","text":"票据交换"},{"value":"739","text":"放款审查"},{"value":"740","text":"驾驶员"},{"value":"741","text":"综合部负责人"},{"value":"742","text":"综合事务"},{"value":"743","text":"监控员"},{"value":"744","text":"抵押登记"},{"value":"745","text":"票据交换"},{"value":"746","text":"放款审查"},{"value":"747","text":"驾驶员"},{"value":"748","text":"综合部负责人"},{"value":"749","text":"综合事务"},{"value":"750","text":"监控员"},{"value":"751","text":"抵押登记"},{"value":"752","text":"票据交换"},{"value":"753","text":"放款审查"},{"value":"754","text":"驾驶员"},{"value":"755","text":"综合部负责人"},{"value":"756","text":"综合事务"},{"value":"757","text":"监控员"},{"value":"758","text":"抵押登记"},{"value":"759","text":"票据交换"},{"value":"760","text":"放款审查"},{"value":"761","text":"驾驶员"},{"value":"762","text":"综合部负责人"},{"value":"763","text":"综合事务"},{"value":"764","text":"监控员"},{"value":"765","text":"抵押登记"},{"value":"766","text":"票据交换"},{"value":"767","text":"放款审查"},{"value":"768","text":"驾驶员"},{"value":"769","text":"综合部负责人"},{"value":"770","text":"综合事务"},{"value":"771","text":"监控员"},{"value":"772","text":"抵押登记"},{"value":"773","text":"票据交换"},{"value":"774","text":"放款审查"},{"value":"775","text":"驾驶员"},{"value":"776","text":"综合部负责人"},{"value":"777","text":"综合事务"},{"value":"778","text":"监控员"},{"value":"779","text":"抵押登记"},{"value":"780","text":"票据交换"},{"value":"781","text":"放款审查"},{"value":"782","text":"驾驶员"},{"value":"783","text":"综合部负责人"},{"value":"784","text":"综合事务"},{"value":"785","text":"监控员"},{"value":"786","text":"抵押登记"},{"value":"787","text":"票据交换"},{"value":"788","text":"放款审查"},{"value":"789","text":"驾驶员"},{"value":"790","text":"综合部负责人"},{"value":"791","text":"综合事务"},{"value":"792","text":"监控员"},{"value":"793","text":"抵押登记"},{"value":"794","text":"票据交换"},{"value":"795","text":"放款审查"},{"value":"796","text":"驾驶员"},{"value":"797","text":"综合部负责人"},{"value":"798","text":"综合事务"},{"value":"799","text":"监控员"},{"value":"800","text":"抵押登记"},{"value":"801","text":"票据交换"},{"value":"802","text":"放款审查"},{"value":"803","text":"驾驶员"},{"value":"804","text":"综合部负责人"},{"value":"805","text":"综合事务"},{"value":"806","text":"监控员"},{"value":"807","text":"抵押登记"},{"value":"808","text":"票据交换"},{"value":"809","text":"放款审查"},{"value":"810","text":"驾驶员"},{"value":"811","text":"营业经理"},{"value":"812","text":"柜员(现金)"},{"value":"813","text":"柜员(非现金)"},{"value":"814","text":"大堂经理"},{"value":"815","text":"客户经理"},{"value":"816","text":"营业经理"},{"value":"817","text":"柜员(现金)"},{"value":"818","text":"柜员(非现金)"},{"value":"819","text":"大堂经理"},{"value":"820","text":"客户经理"},{"value":"821","text":"营业经理"},{"value":"822","text":"柜员(现金)"},{"value":"823","text":"柜员(非现金)"},{"value":"824","text":"大堂经理"},{"value":"825","text":"客户经理"},{"value":"826","text":"营业经理"},{"value":"827","text":"柜员(现金)"},{"value":"828","text":"柜员(非现金)"},{"value":"829","text":"大堂经理"},{"value":"830","text":"客户经理"},{"value":"831","text":"营业经理"},{"value":"832","text":"柜员(现金)"},{"value":"833","text":"柜员(非现金)"},{"value":"834","text":"大堂经理"},{"value":"835","text":"客户经理"},{"value":"836","text":"营业经理"},{"value":"837","text":"柜员(现金)"},{"value":"838","text":"柜员(非现金)"},{"value":"839","text":"大堂经理"},{"value":"840","text":"客户经理"},{"value":"841","text":"营业经理"},{"value":"842","text":"柜员(现金)"},{"value":"843","text":"柜员(非现金)"},{"value":"844","text":"大堂经理"},{"value":"845","text":"客户经理"},{"value":"846","text":"营业经理"},{"value":"847","text":"柜员(现金)"},{"value":"848","text":"柜员(非现金)"},{"value":"849","text":"大堂经理"},{"value":"850","text":"客户经理"},{"value":"851","text":"营业经理"},{"value":"852","text":"柜员(现金)"},{"value":"853","text":"柜员(非现金)"},{"value":"854","text":"大堂经理"},{"value":"855","text":"客户经理"},{"value":"856","text":"营业经理"},{"value":"857","text":"柜员(现金)"},{"value":"858","text":"柜员(非现金)"},{"value":"859","text":"大堂经理"},{"value":"860","text":"客户经理"},{"value":"861","text":"营业经理"},{"value":"862","text":"柜员(现金)"},{"value":"863","text":"柜员(非现金)"},{"value":"864","text":"大堂经理"},{"value":"865","text":"客户经理"},{"value":"866","text":"营业经理"},{"value":"867","text":"柜员(现金)"},{"value":"868","text":"柜员(非现金)"},{"value":"869","text":"大堂经理"},{"value":"870","text":"客户经理"},{"value":"871","text":"营业经理"},{"value":"872","text":"柜员(现金)"},{"value":"873","text":"柜员(非现金)"},{"value":"874","text":"大堂经理"},{"value":"875","text":"客户经理"},{"value":"876","text":"营业经理"},{"value":"877","text":"柜员(现金)"},{"value":"878","text":"柜员(非现金)"},{"value":"879","text":"大堂经理"},{"value":"880","text":"客户经理"},{"value":"881","text":"营业经理"},{"value":"882","text":"柜员(现金)"},{"value":"883","text":"柜员(非现金)"},{"value":"884","text":"大堂经理"},{"value":"885","text":"客户经理"},{"value":"886","text":"营业经理"},{"value":"887","text":"柜员(现金)"},{"value":"888","text":"柜员(非现金)"},{"value":"889","text":"大堂经理"},{"value":"890","text":"客户经理"},{"value":"891","text":"营业经理"},{"value":"892","text":"柜员(现金)"},{"value":"893","text":"柜员(非现金)"},{"value":"894","text":"大堂经理"},{"value":"895","text":"客户经理"},{"value":"896","text":"营业经理"},{"value":"897","text":"柜员(现金)"},{"value":"898","text":"柜员(非现金)"},{"value":"899","text":"大堂经理"},{"value":"900","text":"客户经理"},{"value":"901","text":"营业经理"},{"value":"902","text":"柜员(现金)"},{"value":"903","text":"柜员(非现金)"},{"value":"904","text":"大堂经理"},{"value":"905","text":"客户经理"},{"value":"906","text":"营业经理"},{"value":"907","text":"柜员(现金)"},{"value":"908","text":"柜员(非现金)"},{"value":"909","text":"大堂经理"},{"value":"910","text":"客户经理"},{"value":"911","text":"营业经理"},{"value":"912","text":"柜员(现金)"},{"value":"913","text":"柜员(非现金)"},{"value":"914","text":"大堂经理"},{"value":"915","text":"客户经理"},{"value":"916","text":"营业经理"},{"value":"917","text":"柜员(现金)"},{"value":"918","text":"柜员(非现金)"},{"value":"919","text":"大堂经理"},{"value":"920","text":"客户经理"},{"value":"921","text":"营业经理"},{"value":"922","text":"柜员(现金)"},{"value":"923","text":"柜员(非现金)"},{"value":"924","text":"大堂经理"},{"value":"925","text":"客户经理"},{"value":"926","text":"营业经理"},{"value":"927","text":"柜员(现金)"},{"value":"928","text":"柜员(非现金)"},{"value":"929","text":"大堂经理"},{"value":"930","text":"客户经理"},{"value":"931","text":"营业经理"},{"value":"932","text":"柜员(现金)"},{"value":"933","text":"柜员(非现金)"},{"value":"934","text":"大堂经理"},{"value":"935","text":"客户经理"},{"value":"936","text":"营业经理"},{"value":"937","text":"柜员(现金)"},{"value":"938","text":"柜员(非现金)"},{"value":"939","text":"大堂经理"},{"value":"940","text":"客户经理"},{"value":"941","text":"营业经理"},{"value":"942","text":"柜员(现金)"},{"value":"943","text":"柜员(非现金)"},{"value":"944","text":"大堂经理"},{"value":"945","text":"客户经理"},{"value":"946","text":"营业经理"},{"value":"947","text":"柜员(现金)"},{"value":"948","text":"柜员(非现金)"},{"value":"949","text":"大堂经理"},{"value":"950","text":"客户经理"},{"value":"951","text":"营业经理"},{"value":"952","text":"柜员(现金)"},{"value":"953","text":"柜员(非现金)"},{"value":"954","text":"大堂经理"},{"value":"955","text":"客户经理"},{"value":"956","text":"营业经理"},{"value":"957","text":"柜员(现金)"},{"value":"958","text":"柜员(非现金)"},{"value":"959","text":"大堂经理"},{"value":"960","text":"客户经理"},{"value":"961","text":"营业经理"},{"value":"962","text":"柜员(现金)"},{"value":"963","text":"柜员(非现金)"},{"value":"964","text":"大堂经理"},{"value":"965","text":"客户经理"},{"value":"966","text":"营业经理"},{"value":"967","text":"柜员(现金)"},{"value":"968","text":"柜员(非现金)"},{"value":"969","text":"大堂经理"},{"value":"970","text":"客户经理"},{"value":"971","text":"营业经理"},{"value":"972","text":"柜员(现金)"},{"value":"973","text":"柜员(非现金)"},{"value":"974","text":"大堂经理"},{"value":"975","text":"客户经理"},{"value":"976","text":"营业经理"},{"value":"977","text":"柜员(现金)"},{"value":"978","text":"柜员(非现金)"},{"value":"979","text":"大堂经理"},{"value":"980","text":"客户经理"},{"value":"981","text":"营业经理"},{"value":"982","text":"柜员(现金)"},{"value":"983","text":"柜员(非现金)"},{"value":"984","text":"大堂经理"},{"value":"985","text":"客户经理"},{"value":"986","text":"营业经理"},{"value":"987","text":"柜员(现金)"},{"value":"988","text":"柜员(非现金)"},{"value":"989","text":"大堂经理"},{"value":"990","text":"客户经理"},{"value":"991","text":"营业经理"},{"value":"992","text":"柜员(现金)"},{"value":"993","text":"柜员(非现金)"},{"value":"994","text":"大堂经理"},{"value":"995","text":"客户经理"},{"value":"996","text":"营业经理"},{"value":"997","text":"柜员(现金)"},{"value":"998","text":"柜员(非现金)"},{"value":"999","text":"大堂经理"},{"value":"1000","text":"客户经理"},{"value":"1001","text":"营业经理"},{"value":"1002","text":"柜员(现金)"},{"value":"1003","text":"柜员(非现金)"},{"value":"1004","text":"大堂经理"},{"value":"1005","text":"客户经理"},{"value":"1006","text":"营业经理"},{"value":"1007","text":"柜员(现金)"},{"value":"1008","text":"柜员(非现金)"},{"value":"1009","text":"大堂经理"},{"value":"1010","text":"客户经理"},{"value":"1011","text":"营业经理"},{"value":"1012","text":"柜员(现金)"},{"value":"1013","text":"柜员(非现金)"},{"value":"1014","text":"大堂经理"},{"value":"1015","text":"客户经理"},{"value":"1016","text":"营业经理"},{"value":"1017","text":"柜员(现金)"},{"value":"1018","text":"柜员(非现金)"},{"value":"1019","text":"大堂经理"},{"value":"1020","text":"客户经理"},{"value":"1021","text":"营业经理"},{"value":"1022","text":"柜员(现金)"},{"value":"1023","text":"柜员(非现金)"},{"value":"1024","text":"大堂经理"},{"value":"1025","text":"客户经理"},{"value":"1026","text":"营业经理"},{"value":"1027","text":"柜员(现金)"},{"value":"1028","text":"柜员(非现金)"},{"value":"1029","text":"大堂经理"},{"value":"1030","text":"客户经理"},{"value":"1031","text":"营业经理"},{"value":"1032","text":"柜员(现金)"},{"value":"1033","text":"柜员(非现金)"},{"value":"1034","text":"大堂经理"},{"value":"1035","text":"客户经理"},{"value":"1036","text":"营业经理"},{"value":"1037","text":"柜员(现金)"},{"value":"1038","text":"柜员(非现金)"},{"value":"1039","text":"大堂经理"},{"value":"1040","text":"客户经理"},{"value":"1041","text":"营业经理"},{"value":"1042","text":"柜员(现金)"},{"value":"1043","text":"柜员(非现金)"},{"value":"1044","text":"大堂经理"},{"value":"1045","text":"客户经理"},{"value":"1046","text":"营业经理"},{"value":"1047","text":"柜员(现金)"},{"value":"1048","text":"柜员(非现金)"},{"value":"1049","text":"大堂经理"},{"value":"1050","text":"客户经理"},{"value":"1051","text":"营业经理"},{"value":"1052","text":"柜员(现金)"},{"value":"1053","text":"柜员(非现金)"},{"value":"1054","text":"大堂经理"},{"value":"1055","text":"客户经理"},{"value":"1056","text":"营业经理"},{"value":"1057","text":"柜员(现金)"},{"value":"1058","text":"柜员(非现金)"},{"value":"1059","text":"大堂经理"},{"value":"1060","text":"客户经理"},{"value":"1061","text":"营业经理"},{"value":"1062","text":"柜员(现金)"},{"value":"1063","text":"柜员(非现金)"},{"value":"1064","text":"大堂经理"},{"value":"1065","text":"客户经理"},{"value":"1066","text":"营业经理"},{"value":"1067","text":"柜员(现金)"},{"value":"1068","text":"柜员(非现金)"},{"value":"1069","text":"大堂经理"},{"value":"1070","text":"客户经理"},{"value":"1071","text":"营业经理"},{"value":"1072","text":"柜员(现金)"},{"value":"1073","text":"柜员(非现金)"},{"value":"1074","text":"大堂经理"},{"value":"1075","text":"客户经理"},{"value":"1076","text":"营业经理"},{"value":"1077","text":"柜员(现金)"},{"value":"1078","text":"柜员(非现金)"},{"value":"1079","text":"大堂经理"},{"value":"1080","text":"客户经理"},{"value":"1081","text":"营业经理"},{"value":"1082","text":"柜员(现金)"},{"value":"1083","text":"柜员(非现金)"},{"value":"1084","text":"大堂经理"},{"value":"1085","text":"客户经理"},{"value":"1086","text":"营业经理"},{"value":"1087","text":"柜员(现金)"},{"value":"1088","text":"柜员(非现金)"},{"value":"1089","text":"大堂经理"},{"value":"1090","text":"客户经理"},{"value":"1091","text":"营业经理"},{"value":"1092","text":"柜员(现金)"},{"value":"1093","text":"柜员(非现金)"},{"value":"1094","text":"大堂经理"},{"value":"1095","text":"客户经理"},{"value":"1096","text":"营业经理"},{"value":"1097","text":"柜员(现金)"},{"value":"1098","text":"柜员(非现金)"},{"value":"1099","text":"大堂经理"},{"value":"1100","text":"客户经理"},{"value":"1101","text":"营业经理"},{"value":"1102","text":"柜员(现金)"},{"value":"1103","text":"柜员(非现金)"},{"value":"1104","text":"大堂经理"},{"value":"1105","text":"客户经理"},{"value":"1106","text":"营业经理"},{"value":"1107","text":"柜员(现金)"},{"value":"1108","text":"柜员(非现金)"},{"value":"1109","text":"大堂经理"},{"value":"1110","text":"客户经理"},{"value":"1111","text":"营业经理"},{"value":"1112","text":"柜员(现金)"},{"value":"1113","text":"柜员(非现金)"},{"value":"1114","text":"大堂经理"},{"value":"1115","text":"客户经理"},{"value":"1116","text":"总经理"},{"value":"1117","text":"副总经理"},{"value":"1118","text":"总经理助理"},{"value":"1121","text":"副总经理(主持)"},{"value":"1123","text":"员工"},{"value":"1124","text":"员工"},{"value":"1125","text":"员工"},{"value":"1126","text":"员工"},{"value":"1127","text":"员工"},{"value":"1128","text":"员工"},{"value":"1129","text":"员工"},{"value":"1130","text":"员工"},{"value":"1131","text":"员工"},{"value":"1132","text":"员工"},{"value":"1133","text":"员工"},{"value":"1134","text":"员工"},{"value":"1135","text":"员工"},{"value":"1136","text":"员工"},{"value":"1137","text":"员工"},{"value":"1138","text":"员工"},{"value":"1139","text":"员工"},{"value":"1140","text":"员工"},{"value":"1141","text":"员工"},{"value":"1142","text":"员工"},{"value":"1143","text":"员工"},{"value":"1144","text":"员工"},{"value":"1145","text":"员工"},{"value":"1146","text":"员工"},{"value":"1147","text":"员工"},{"value":"1148","text":"员工"},{"value":"1149","text":"员工"},{"value":"1150","text":"员工"},{"value":"1151","text":"员工"},{"value":"1152","text":"员工"},{"value":"1153","text":"员工"},{"value":"1154","text":"员工"},{"value":"1155","text":"员工"},{"value":"1156","text":"员工"},{"value":"1157","text":"员工"},{"value":"1158","text":"员工"},{"value":"1159","text":"员工"},{"value":"1160","text":"员工"},{"value":"1161","text":"员工"},{"value":"1162","text":"员工"},{"value":"1163","text":"员工"},{"value":"1164","text":"员工"},{"value":"1165","text":"员工"},{"value":"1166","text":"员工"},{"value":"1167","text":"员工"},{"value":"1168","text":"员工"},{"value":"1169","text":"员工"},{"value":"1170","text":"员工"},{"value":"1171","text":"员工"},{"value":"1172","text":"员工"},{"value":"1173","text":"员工"},{"value":"1174","text":"员工"},{"value":"1175","text":"员工"},{"value":"1176","text":"员工"},{"value":"1177","text":"员工"},{"value":"1178","text":"员工"},{"value":"1179","text":"员工"},{"value":"1180","text":"员工"},{"value":"1181","text":"员工"},{"value":"1182","text":"员工"},{"value":"1183","text":"员工"},{"value":"1184","text":"员工"},{"value":"1185","text":"员工"},{"value":"1186","text":"员工"},{"value":"1187","text":"员工"},{"value":"1188","text":"员工"},{"value":"1189","text":"员工"},{"value":"1190","text":"员工"},{"value":"1191","text":"员工"},{"value":"1192","text":"员工"},{"value":"1193","text":"员工"},{"value":"1194","text":"员工"},{"value":"1195","text":"员工"},{"value":"1196","text":"员工"},{"value":"1197","text":"员工"},{"value":"1198","text":"员工"},{"value":"1199","text":"员工"},{"value":"1200","text":"员工"},{"value":"1201","text":"员工"},{"value":"1202","text":"员工"},{"value":"1203","text":"员工"},{"value":"1204","text":"员工"},{"value":"1205","text":"员工"},{"value":"1206","text":"员工"},{"value":"1207","text":"员工"},{"value":"1208","text":"员工"},{"value":"1209","text":"员工"},{"value":"1210","text":"员工"},{"value":"1211","text":"员工"},{"value":"1212","text":"员工"},{"value":"1213","text":"员工"},{"value":"1214","text":"员工"},{"value":"1215","text":"员工"},{"value":"1216","text":"员工"},{"value":"1217","text":"员工"},{"value":"1218","text":"员工"},{"value":"1219","text":"员工"},{"value":"1220","text":"员工"},{"value":"1221","text":"员工"},{"value":"1222","text":"员工"},{"value":"1223","text":"员工"},{"value":"1224","text":"员工"},{"value":"1225","text":"员工"},{"value":"1226","text":"员工"},{"value":"1227","text":"员工"},{"value":"1228","text":"员工"},{"value":"1229","text":"员工"},{"value":"1230","text":"员工"},{"value":"1231","text":"员工"},{"value":"1232","text":"员工"},{"value":"1233","text":"员工"},{"value":"1234","text":"员工"},{"value":"1235","text":"员工"},{"value":"1236","text":"员工"},{"value":"1237","text":"员工"},{"value":"1238","text":"员工"},{"value":"1239","text":"员工"},{"value":"1240","text":"员工"},{"value":"1241","text":"员工"},{"value":"1242","text":"员工"},{"value":"1243","text":"员工"},{"value":"1244","text":"员工"},{"value":"1245","text":"员工"},{"value":"1246","text":"员工"},{"value":"1247","text":"员工"},{"value":"1248","text":"员工"},{"value":"1249","text":"员工"},{"value":"1250","text":"员工"},{"value":"1251","text":"员工"},{"value":"1252","text":"员工"},{"value":"1253","text":"员工"},{"value":"1254","text":"员工"},{"value":"1255","text":"员工"},{"value":"1256","text":"员工"},{"value":"1257","text":"员工"},{"value":"1258","text":"员工"},{"value":"1259","text":"员工"},{"value":"1260","text":"员工"},{"value":"1261","text":"员工"},{"value":"1262","text":"员工"},{"value":"1263","text":"员工"},{"value":"1264","text":"员工"},{"value":"1265","text":"员工"},{"value":"1266","text":"员工"},{"value":"1267","text":"员工"},{"value":"1268","text":"员工"},{"value":"1269","text":"员工"},{"value":"1270","text":"员工"},{"value":"1271","text":"员工"},{"value":"1272","text":"员工"},{"value":"1273","text":"员工"},{"value":"1274","text":"员工"},{"value":"1275","text":"员工"},{"value":"1276","text":"员工"},{"value":"1277","text":"员工"},{"value":"1278","text":"员工"},{"value":"1279","text":"员工"},{"value":"1280","text":"员工"},{"value":"1281","text":"员工"},{"value":"1282","text":"员工"},{"value":"1283","text":"员工"},{"value":"1284","text":"员工"},{"value":"1285","text":"员工"},{"value":"1286","text":"员工"},{"value":"1287","text":"员工"},{"value":"1288","text":"员工"},{"value":"1289","text":"员工"},{"value":"1290","text":"员工"},{"value":"1291","text":"员工"},{"value":"1292","text":"员工"},{"value":"1293","text":"员工"},{"value":"1294","text":"员工"},{"value":"1295","text":"员工"},{"value":"1296","text":"员工"},{"value":"1297","text":"员工"},{"value":"1298","text":"员工"},{"value":"1299","text":"员工"},{"value":"1300","text":"员工"},{"value":"1301","text":"员工"},{"value":"1302","text":"员工"},{"value":"1303","text":"员工"},{"value":"1304","text":"员工"},{"value":"1305","text":"员工"},{"value":"1306","text":"员工"},{"value":"1307","text":"员工"},{"value":"1308","text":"员工"},{"value":"1309","text":"员工"},{"value":"1310","text":"员工"},{"value":"1311","text":"员工"},{"value":"1312","text":"员工"},{"value":"1314","text":"总经理助理"},{"value":"1315","text":"档案管理"},{"value":"1316","text":"企划管理部主管（经理级）"},{"value":"1317","text":"支付业务部主管（总经理助理级）"},{"value":"1318","text":"产品管理部执行总经理（副经理级，主持工作）"},{"value":"1319","text":"副总经理"},{"value":"1320","text":"业务四部负责人"},{"value":"1321","text":"客户经理"},{"value":"1322","text":"总经理"},{"value":"1323","text":"业务一部负责人"},{"value":"1324","text":"业务二部负责人"},{"value":"1325","text":"业务三部负责人"},{"value":"1326","text":"副总经理"},{"value":"1327","text":"客户经理"},{"value":"1328","text":"客户经理"},{"value":"1329","text":"业务副经理(主持)"},{"value":"1330","text":"客户经理"},{"value":"1331","text":"客户经理"},{"value":"1332","text":"客户经理"},{"value":"1333","text":"副经理（主持工作）"},{"value":"1334","text":"客户经理"},{"value":"1335","text":"业务副经理"},{"value":"1336","text":"客户经理"},{"value":"1337","text":"客户经理"},{"value":"1338","text":"客户经理"},{"value":"1339","text":"客户经理"},{"value":"1340","text":"客户经理"},{"value":"1341","text":"客户经理"},{"value":"1342","text":"客户经理"},{"value":"1343","text":"客户经理"},{"value":"1344","text":"客户经理"},{"value":"1345","text":"客户经理"},{"value":"1346","text":"客户经理"},{"value":"1347","text":"客户经理"},{"value":"1348","text":"客户经理"},{"value":"1349","text":"客户经理"},{"value":"1350","text":"客户经理"},{"value":"1351","text":"客户经理"},{"value":"1352","text":"调研督导员"},{"value":"1353","text":"副调研督导员"}]';
var dictDatas_emp_newEntry_list_72631 = 'null';
var dictDatas_emp_newEntry_list_73738 = '[{"value":"1","text":"一级"},{"value":"2","text":"二级"},{"value":"3","text":"三级"},{"value":"4","text":"四级"},{"value":"5","text":"五级"},{"value":"6","text":"六级"},{"value":"7","text":"七级"},{"value":"8","text":"八级"},{"value":"9","text":"九级"},{"value":"10","text":"十级"},{"value":"11","text":"十一级"},{"value":"12","text":"十二级"},{"value":"13","text":"十三级"},{"value":"14","text":"十四级"},{"value":"15","text":"无等级"}]';
var dictDatas_emp_newEntry_list_73753 = '[{"value":"1","text":"1"},{"value":"2","text":"2"},{"value":"3","text":"3"},{"value":"4","text":"4"},{"value":"5","text":"5"},{"value":"6","text":"6"}]';
var dictDatas_emp_newEntry_list_22257 = 'null';
var dictDatas_emp_newEntry_list_22258 = 'null';
var dictDatas_emp_newEntry_list_22259 = '[{"value":"1","text":"正式在职"},{"value":"2","text":"实习在职"},{"value":"3","text":"试用在职"},{"value":"4","text":"内退"},{"value":"5","text":"待岗"},{"value":"6","text":"长期病假"},{"value":"7","text":"停薪留职"},{"value":"8","text":"离岗退养"},{"value":"9","text":"因公外派"},{"value":"10","text":"退休"},{"value":"11","text":"系统内离退休返聘"}]';
var dictDatas_emp_newEntry_list_22260 = '[{"value":"1","text":"合同制用工"},{"value":"2","text":"劳务派遣工"},{"value":"3","text":"外包人员"},{"value":"4","text":"外部理董监事"},{"value":"5","text":"退休返聘"},{"value":"6","text":"临时工"},{"value":"6","text":"其他"}]';
var dictDatas_emp_newEntry_list_51148 = '[{"value":"1","text":"在职"},{"value":"2","text":"离职"},{"value":"3","text":"退休"}]';
var dictDatas_emp_newEntry_list_22264 = '[{"value":"1","text":"白羊"},{"value":"2","text":"金牛"},{"value":"3","text":"双子"},{"value":"4","text":"巨蟹"},{"value":"5","text":"狮子"},{"value":"6","text":"处女"},{"value":"7","text":"天秤"},{"value":"8","text":"天蝎"},{"value":"9","text":"射手"},{"value":"10","text":"摩羯"},{"value":"11","text":"水瓶"},{"value":"12","text":"双鱼"}]';
var dictDatas_emp_newEntry_list_22267 = '[{"value":"1","text":"初级"},{"value":"2","text":"中级"},{"value":"3","text":"高级"}]';
var dictDatas_emp_newEntry_list_22268 = '[{"value":"1","text":"一级"},{"value":"2","text":"二级"},{"value":"3","text":"三级"},{"value":"4","text":"四级"},{"value":"5","text":"五级"}]';
var dictDatas_emp_newEntry_list_22269 = '[{"value":"1","text":"人才引进"},{"value":"2","text":"应届高等学校毕业生"},{"value":"3","text":"往届高等学校毕业生"},{"value":"4","text":"派遣工转正"},{"value":"5","text":"系统内调入"},{"value":"6","text":"系统外调入"},{"value":"7","text":"外包转正"},{"value":"8","text":"外部招聘"},{"value":"9","text":"其他"}]';
var dictDatas_emp_newEntry_list_22270 = '[{"value":"1","text":"厦门"},{"value":"2","text":"福州"},{"value":"3","text":"泉州"},{"value":"4","text":"北京"},{"value":"5","text":"上海"},{"value":"6","text":"深圳"},{"value":"7","text":"成都"}]';
var dictDatas_emp_newEntry_list_22278 = 'null';
var dictDatas_emp_newEntry_list_22280 = '[{"value":"1","text":"劳动合同"}]';
var dictDatas_emp_newEntry_list_22281 = '[{"value":"1","text":"固定期限"},{"value":"2","text":"无固定期限"}]';
var dictDatas_emp_newEntry_list_22285 = '[{"value":"AFG","text":"阿富汗"},{"value":"ALB","text":"阿尔巴尼亚"},{"value":"ATA","text":"南极洲"},{"value":"DZA","text":"阿尔及利亚"},{"value":"ASM","text":"美属萨摩亚"},{"value":"AND","text":"安道尔"},{"value":"AGO","text":"安哥拉"},{"value":"ATG","text":"安提瓜和巴布达"},{"value":"AZE","text":"阿塞拜疆"},{"value":"ARG","text":"阿根廷"},{"value":"AUS","text":"澳大利亚"},{"value":"AUT","text":"奥地利"},{"value":"BHS","text":"巴哈马"},{"value":"BHR","text":"巴林"},{"value":"BGD","text":"孟加拉国"},{"value":"ARM","text":"亚美尼亚"},{"value":"BRB","text":"巴巴多斯"},{"value":"BEL","text":"比利时"},{"value":"BMU","text":"百慕大"},{"value":"BTN","text":"不丹"},{"value":"BOL","text":"玻利维亚"},{"value":"BIH","text":"波黑"},{"value":"BWA","text":"博茨瓦纳"},{"value":"BVT","text":"布维岛"},{"value":"BRA","text":"巴西"},{"value":"BLZ","text":"伯利兹"},{"value":"IOT","text":"英属印度洋领地"},{"value":"SLB","text":"所罗门群岛"},{"value":"VGB","text":"英属维尔京群岛"},{"value":"BRN","text":"文莱"},{"value":"BGR","text":"保加利亚"},{"value":"MMR","text":"缅甸"},{"value":"BDI","text":"布隆迪"},{"value":"BLR","text":"白俄罗斯"},{"value":"KHM","text":"柬埔寨"},{"value":"CMR","text":"喀麦隆"},{"value":"CAN","text":"加拿大"},{"value":"CPV","text":"佛得角"},{"value":"CYM","text":"开曼群岛"},{"value":"CAF","text":"中非"},{"value":"LKA","text":"斯里兰卡"},{"value":"TCD","text":"乍得"},{"value":"CHL","text":"智利"},{"value":"CHN","text":"中国"},{"value":"TWN","text":"台湾"},{"value":"CXR","text":"圣诞岛"},{"value":"CCK","text":"科科斯(基林)群岛"},{"value":"COL","text":"哥伦比亚"},{"value":"COM","text":"科摩罗"},{"value":"MYT","text":"马约特"},{"value":"COG","text":"刚果(布)"},{"value":"COD","text":"刚果(金)"},{"value":"COK","text":"库克群岛"},{"value":"CRI","text":"哥斯达黎加"},{"value":"HRV","text":"克罗地亚"},{"value":"CUB","text":"古巴"},{"value":"CYP","text":"塞浦路斯"},{"value":"CZE","text":"捷克"},{"value":"BEN","text":"贝宁"},{"value":"DNK","text":"丹麦"},{"value":"DMA","text":"多米尼克"},{"value":"DOM","text":"多米尼加"},{"value":"ECU","text":"厄瓜多尔"},{"value":"SLV","text":"萨尔瓦多"},{"value":"GNQ","text":"赤道几内亚"},{"value":"ETH","text":"埃塞俄比亚"},{"value":"ERI","text":"厄立特里亚"},{"value":"EST","text":"爱沙尼亚"},{"value":"FRO","text":"法罗群岛"},{"value":"FLK","text":"福克兰群岛(马尔维纳斯)"},{"value":"SGS","text":"南乔治亚岛和南桑德韦奇岛"},{"value":"FJI","text":"斐济"},{"value":"FIN","text":"芬兰"},{"value":"FRA","text":"法国"},{"value":"GUF","text":"法属圭亚那"},{"value":"PYF","text":"法属波利尼西亚"},{"value":"ATF","text":"法属南部领地"},{"value":"DJI","text":"吉布提"},{"value":"GAB","text":"加蓬"},{"value":"GEO","text":"格鲁吉亚"},{"value":"GMB","text":"冈比亚"},{"value":"PSE","text":"巴勒斯坦"},{"value":"DEU","text":"德国"},{"value":"GHA","text":"加纳"},{"value":"GIB","text":"直布罗陀"},{"value":"KIR","text":"基里巴斯"},{"value":"GRC","text":"希腊"},{"value":"GRL","text":"格陵兰"},{"value":"GRD","text":"格林纳达"},{"value":"GLP","text":"瓜德罗普"},{"value":"GUM","text":"关岛"},{"value":"GTM","text":"危地马拉"},{"value":"GIN","text":"几内亚"},{"value":"GUY","text":"圭亚那"},{"value":"HTI","text":"海地"},{"value":"HMD","text":"赫德岛和麦克唐纳岛"},{"value":"VAT","text":"梵蒂冈"},{"value":"HND","text":"洪都拉斯"},{"value":"HKG","text":"香港"},{"value":"HUN","text":"匈牙利"},{"value":"ISL","text":"冰岛"},{"value":"IND","text":"印度"},{"value":"IDN","text":"印度尼西亚"},{"value":"IRN","text":"伊朗"},{"value":"IRQ","text":"伊拉克"},{"value":"IRL","text":"爱尔兰"},{"value":"ISR","text":"以色列"},{"value":"ITA","text":"意大利"},{"value":"CIV","text":"科特迪瓦"},{"value":"JAM","text":"牙买加"},{"value":"JPN","text":"日本"},{"value":"KAZ","text":"哈萨克斯坦"},{"value":"JOR","text":"约旦"},{"value":"KEN","text":"肯尼亚"},{"value":"PRK","text":"朝鲜"},{"value":"KOR","text":"韩国"},{"value":"KWT","text":"科威特"},{"value":"KGZ","text":"吉尔吉斯斯坦"},{"value":"LAO","text":"老挝"},{"value":"LBN","text":"黎巴嫩"},{"value":"LSO","text":"莱索托"},{"value":"LVA","text":"拉脱维亚"},{"value":"LBR","text":"利比里亚"},{"value":"LBY","text":"利比亚"},{"value":"LIE","text":"列支敦士登"},{"value":"LTU","text":"立陶宛"},{"value":"LUX","text":"卢森堡"},{"value":"MAC","text":"澳门"},{"value":"MDG","text":"马达加斯加"},{"value":"MWI","text":"马拉维"},{"value":"MYS","text":"马来西亚"},{"value":"MDV","text":"马尔代夫"},{"value":"MLI","text":"马里"},{"value":"MLT","text":"马耳他"},{"value":"MTQ","text":"马提尼克"},{"value":"MRT","text":"毛里塔尼亚"},{"value":"MUS","text":"毛里求斯"},{"value":"MEX","text":"墨西哥"},{"value":"MCO","text":"摩纳哥"},{"value":"MNG","text":"蒙古"},{"value":"MDA","text":"摩尔多瓦"},{"value":"MSR","text":"蒙特塞拉特"},{"value":"MAR","text":"摩洛哥"},{"value":"MOZ","text":"莫桑比克"},{"value":"OMN","text":"阿曼"},{"value":"NAM","text":"纳米比亚"},{"value":"NRU","text":"瑙鲁"},{"value":"NPL","text":"尼泊尔"},{"value":"NLD","text":"荷兰"},{"value":"ANT","text":"荷属安的列斯"},{"value":"ABW","text":"阿鲁巴"},{"value":"NCL","text":"新喀里多尼亚"},{"value":"VUT","text":"瓦努阿图"},{"value":"NZL","text":"新西兰"},{"value":"NIC","text":"尼加拉瓜"},{"value":"NER","text":"尼日尔"},{"value":"NGA","text":"尼日利亚"},{"value":"NIU","text":"纽埃"},{"value":"NFK","text":"诺福克岛"},{"value":"NOR","text":"挪威"},{"value":"MNP","text":"北马里亚纳"},{"value":"UMI","text":"美国本土外小岛屿"},{"value":"FSM","text":"密克罗尼西亚联邦"},{"value":"MHL","text":"马绍尔群岛"},{"value":"PLW","text":"帕劳"},{"value":"PAK","text":"巴基斯坦"},{"value":"PAN","text":"巴拿马"},{"value":"PNG","text":"巴布亚新几内亚"},{"value":"PRY","text":"巴拉圭"},{"value":"PER","text":"秘鲁"},{"value":"PHL","text":"菲律宾"},{"value":"PCN","text":"皮特凯恩"},{"value":"POL","text":"波兰"},{"value":"PRT","text":"葡萄牙"},{"value":"GNB","text":"几内亚比绍"},{"value":"TMP","text":"东帝汶"},{"value":"PRI","text":"波多黎各"},{"value":"QAT","text":"卡塔尔"},{"value":"REU","text":"留尼汪"},{"value":"ROM","text":"罗马尼亚"},{"value":"RUS","text":"俄罗斯联邦"},{"value":"RWA","text":"卢旺达"},{"value":"SHN","text":"圣赫勒拿"},{"value":"KNA","text":"圣基茨和尼维斯"},{"value":"AIA","text":"安圭拉"},{"value":"LCA","text":"圣卢西亚"},{"value":"SPM","text":"圣皮埃尔和密克隆"},{"value":"VCT","text":"圣文森特和格林纳丁斯"},{"value":"SMR","text":"圣马力诺"},{"value":"STP","text":"圣多美和普林西比"},{"value":"SAU","text":"沙特阿拉伯"},{"value":"SEN","text":"塞内加尔"},{"value":"SYC","text":"塞舌尔"},{"value":"SLE","text":"塞拉利昂"},{"value":"SGP","text":"新加坡"},{"value":"SVK","text":"斯洛伐克"},{"value":"VNM","text":"越南"},{"value":"SVN","text":"斯洛文尼亚"},{"value":"SOM","text":"索马里"},{"value":"ZAF","text":"南非"},{"value":"ZWE","text":"津巴布韦"},{"value":"ESP","text":"西班牙"},{"value":"ESH","text":"西撒哈拉"},{"value":"SDN","text":"苏丹"},{"value":"SUR","text":"苏里南"},{"value":"SJM","text":"斯瓦尔巴岛和扬马延岛"},{"value":"SWZ","text":"斯威士兰"},{"value":"SWE","text":"瑞典"},{"value":"CHE","text":"瑞士"},{"value":"SYR","text":"叙利亚"},{"value":"TJK","text":"塔吉克斯坦"},{"value":"THA","text":"泰国"},{"value":"TGO","text":"多哥"},{"value":"TKL","text":"托克劳"},{"value":"TON","text":"汤加"},{"value":"TTO","text":"特立尼达和多巴哥"},{"value":"ARE","text":"阿联酋"},{"value":"TUN","text":"突尼斯"},{"value":"TUR","text":"土耳其"},{"value":"TKM","text":"土库曼斯坦"},{"value":"TCA","text":"特克斯和凯科斯群岛"},{"value":"TUV","text":"图瓦卢"},{"value":"UGA","text":"乌干达"},{"value":"UKR","text":"乌克兰"},{"value":"MKD","text":"前南马其顿"},{"value":"EGY","text":"埃及"},{"value":"GBR","text":"英国"},{"value":"TZA","text":"坦桑尼亚"},{"value":"USA","text":"美国"},{"value":"VIR","text":"美属维尔京群岛"},{"value":"BFA","text":"布基纳法索"},{"value":"URY","text":"乌拉圭"},{"value":"UZB","text":"乌兹别克斯坦"},{"value":"VEN","text":"委内瑞拉"},{"value":"WLF","text":"瓦利斯和富图纳"},{"value":"WSM","text":"萨摩亚"},{"value":"YEM","text":"也门"},{"value":"YUG","text":"南斯拉夫"},{"value":"ZMB","text":"赞比亚"}]';
var dictDatas_emp_newEntry_list_22286 = '[{"value":"1","text":"汉族"},{"value":"2","text":"蒙古族"},{"value":"3","text":"回族"},{"value":"4","text":"藏族"},{"value":"5","text":"维吾尔族"},{"value":"6","text":"苗族"},{"value":"7","text":"彝族"},{"value":"8","text":"壮族"},{"value":"9","text":"布依族"},{"value":"10","text":"朝鲜族"},{"value":"11","text":"满族"},{"value":"12","text":"侗族"},{"value":"13","text":"瑶族"},{"value":"14","text":"白族"},{"value":"15","text":"土家族"},{"value":"16","text":"哈尼族"},{"value":"17","text":"哈萨克族"},{"value":"18","text":"傣族"},{"value":"19","text":"黎族"},{"value":"20","text":"傈僳族"},{"value":"21","text":"佤族"},{"value":"22","text":"畲族"},{"value":"23","text":"高山族"},{"value":"24","text":"拉祜族"},{"value":"25","text":"水族"},{"value":"26","text":"东乡族"},{"value":"27","text":"纳西族"},{"value":"28","text":"景颇族"},{"value":"29","text":"柯尔克孜族"},{"value":"30","text":"土族"},{"value":"31","text":"达斡尔族"},{"value":"32","text":"仫佬族"},{"value":"33","text":"羌族"},{"value":"34","text":"布朗族"},{"value":"35","text":"撒拉族"},{"value":"36","text":"毛南族"},{"value":"37","text":"仡佬族"},{"value":"38","text":"锡伯族"},{"value":"39","text":"阿昌族"},{"value":"40","text":"普米族"},{"value":"41","text":"塔吉克族"},{"value":"42","text":"怒族"},{"value":"43","text":"乌孜别克族"},{"value":"44","text":"俄罗斯族"},{"value":"45","text":"鄂温克族"},{"value":"46","text":"德昂族"},{"value":"47","text":"保安族"},{"value":"48","text":"裕固族"},{"value":"49","text":"京族"},{"value":"50","text":"塔塔尔族"},{"value":"51","text":"独龙族"},{"value":"52","text":"鄂伦春族"},{"value":"53","text":"赫哲族"},{"value":"54","text":"门巴族"},{"value":"55","text":"珞巴族"},{"value":"56","text":"基诺族"},{"value":"97","text":"其他"},{"value":"98","text":"外国血统中国籍人士"}]';
var dictDatas_emp_newEntry_list_22287 = 'null';
var dictDatas_emp_newEntry_list_22288 = '[{"value":"1","text":"身份证"},{"value":"2","text":"护照"},{"value":"3","text":"外国人就业证"},{"value":"4","text":"台胞证"},{"value":"5","text":"港澳台通行证"}]';
var dictDatas_emp_newEntry_list_22290 = '[{"value":"1","text":"男"},{"value":"2","text":"女"}]';
var dictDatas_emp_newEntry_list_22294 = '[{"value":"1","text":"农业户口"},{"value":"2","text":"非农业户口"}]';
var dictDatas_emp_newEntry_list_22301 = '[{"value":"1","text":"未婚"},{"value":"2","text":"已婚"},{"value":"3","text":"离异"},{"value":"4","text":"再婚"},{"value":"5","text":"丧偶"}]';
var dictDatas_emp_newEntry_list_22302 = '[{"value":"1","text":"优异"},{"value":"2","text":"良好"},{"value":"3","text":"一般"},{"value":"4","text":"残疾"}]';
var dictDatas_emp_newEntry_list_22303 = '[{"value":"1","text":"A"},{"value":"2","text":"B"},{"value":"3","text":"AB"},{"value":"4","text":"O"},{"value":"5","text":"熊猫血"}]';
var dictDatas_emp_newEntry_list_22304 = '[{"value":"1","text":"已育"},{"value":"2","text":"未育"}]';
var dictDatas_emp_newEntry_list_22308 = '[{"value":"1","text":"系统管理员"},{"value":"17223","text":"王博琨"},{"value":"17272","text":"李四"},{"value":"17274","text":"王昕昕"},{"value":"17275","text":"王子骏"},{"value":"17276","text":"王诗议"},{"value":"17278","text":"王靖雯"},{"value":"17285","text":"陈平安"},{"value":"17290","text":"郑惠娟"},{"value":"17292","text":"王建发"},{"value":"17293","text":"林美静"},{"value":"17294","text":"洪洵"},{"value":"17295","text":"郑燕芬"},{"value":"17296","text":"高志军"},{"value":"17297","text":"李澜"},{"value":"17298","text":"杨艳红"},{"value":"17299","text":"王若莹"},{"value":"17300","text":"叶菁菁"},{"value":"17317","text":"叶巧云"},{"value":"17318","text":"叶巧云"},{"value":"17319","text":"叶巧云"},{"value":"17320","text":"叶巧云"},{"value":"17321","text":"叶巧云"},{"value":"17322","text":"王飞鸿"},{"value":"17323","text":"彭意"},{"value":"17324","text":"陈A安"},{"value":"17326","text":"王峥"},{"value":"17327","text":"曹兰敏"},{"value":"17328","text":"胡君蓉"},{"value":"17329","text":"曹旸"},{"value":"17330","text":"周珂"},{"value":"17331","text":"徐海峰"},{"value":"17332","text":"刘金环"},{"value":"17333","text":"张婷"},{"value":"17334","text":"李黎"},{"value":"17335","text":"张海红"},{"value":"17336","text":"宋红军"},{"value":"17337","text":"张三A"},{"value":"17338","text":"张三B"},{"value":"17339","text":"张三C"},{"value":"17340","text":"李四A"},{"value":"17341","text":"李四B"},{"value":"17342","text":"王一"},{"value":"17343","text":"王二"},{"value":"17344","text":"王三"},{"value":"17345","text":"王四"},{"value":"17346","text":"王A君"},{"value":"17347","text":"沈茹"},{"value":"17348","text":"陈永锋"},{"value":"17349","text":"周雅玲"},{"value":"17350","text":"周雅玲"},{"value":"17351","text":"刘小萍"},{"value":"17352","text":"黄蛟龙"},{"value":"17353","text":"吴国"},{"value":"17354","text":"王A杰"},{"value":"17355","text":"李毅斌"},{"value":"17356","text":"陈永锋"},{"value":"17357","text":"陈永锋"},{"value":"17358","text":"陈永锋"},{"value":"17359","text":"王A昕"},{"value":"17360","text":"王A昕"},{"value":"17361","text":"王A琨"},{"value":"17362","text":"王A琨"},{"value":"17363","text":"陈永锋"},{"value":"17364","text":"陈永锋"},{"value":"17365","text":"涨ATM"}]';
var dictDatas_emp_newEntry_list_74130 = '[{"value":"1","text":"一级"},{"value":"2","text":"二级"},{"value":"3","text":"三级"},{"value":"4","text":"四级"},{"value":"5","text":"五级"}]';
var dictDatas_emp_newEntry_list_74131 = '[{"value":"1","text":"初级"},{"value":"2","text":"中级"},{"value":"3","text":"高级"}]';
var dictDatas_emp_newEntry_list_74132 = '[{"value":"1","text":"白羊"},{"value":"2","text":"金牛"},{"value":"3","text":"双子"},{"value":"4","text":"巨蟹"},{"value":"5","text":"狮子"},{"value":"6","text":"处女"},{"value":"7","text":"天秤"},{"value":"8","text":"天蝎"},{"value":"9","text":"射手"},{"value":"10","text":"摩羯"},{"value":"11","text":"水瓶"},{"value":"12","text":"双鱼"}]';
var heightGadedata_2057 =[];
var containerParam_2057 ={};
containerParam_2057 ={};
function changeHeightGadedata_2057(data){
	heightGadedata_2057 = data;
}
$(function() {
gridPatterns1();

    cardSelectInitFunction('${param.formType}');
    cardDateWidInitFunction();
    //showMoreBtn($(".BTNGROUP_2057"));
    querys_2057();
});
var ORGCOMPANY_orgcode='';
function initFilterParam_2057(data){
}
	var _formId_2057='2057';
var realFormId='${param.formId}';
var columnvisible={};
function initRoleColumn(columnFormId){
    var url = '${pageContext.request.contextPath }/form/queryCardFormColumnsWithUserId.action?formId='+columnFormId;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            for(var i=0;i<datas.length;i++){
                if(datas[i].formColumnUsName==1||datas[i].formColumnUsName==2){
                    if(datas[i].formColumnType==1){
                        var entityTablename = datas[i].formEntityTablename;
                        var fieldTablename = datas[i].formFieldTablename;
                        var columnName=entityTablename.replace(/_/g,'')+'_'+fieldTablename;
                        columnvisible[columnName]=true;
                    }else{
                        columnvisible[fieldTablename]=true;
                    }
                }else{
                    if(datas[i].formColumnType==1){
                        var entityTablename = datas[i].formEntityTablename;
                        var fieldTablename = datas[i].formFieldTablename;
                        var columnName=entityTablename.replace(/_/g,'')+'_'+fieldTablename;
                        columnvisible[columnName]=false;
                    }else{
                        columnvisible[fieldTablename]=true;
                    }
                }
            }
        }
    });
}
var showButtonNum = 0;
function initRoleButtons(buttonFormId,buttonFormCode){
    var url = '${pageContext.request.contextPath }/form/queryCardFormButtonsWithUserId.action?formId='+buttonFormId;
    $.ajax({
        url:url,
        type:'post',
        cache: false,
        async: false,
        contentType:'application/json',
        success:function(datas){
            if(datas.length==0){
                showMoreBtn($(".BTNGROUP_"+buttonFormId+""));
            }else{
                for(var i=0;i<datas.length;i++){
                    if(datas[i].powerType==4){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==3){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else if(datas[i].powerType==2){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].disabled=true;
                        showButtonNum++;
                    }else if(datas[i].powerType==0){
                        var obj = $("#"+datas[i].formButtonCode+buttonFormCode+"");
                        obj[0].parentNode.style.display="none";
                    }else{
                        showButtonNum++;
                    }
                }
                showMoreBtn1($(".BTNGROUP_"+buttonFormId+""),showButtonNum);
            }
        }
    });
}
    function querys_2057() {
        initRoleColumn('2057');
        initRoleButtons('2057','emp_newEntry_list');
        $("#emp_newEntry_list_List").bootstrapTable({
            url :'${pageContext.request.contextPath }/form/cardformInitData.action',
            contentType: 'application/json;charset=utf-8',
            dataType:'json',
            method:'post',
            height : 500,
            undefinedText : '-',
            pagination : true,
            striped : true,
            fixedColumns: false,
            fixedNumber:0,
            showHeader : true,
            queryParams : grid_emp_newEntry_list_fun,
            cache : false,
            pageSize : 20, 
            pageList : [10,20,50,100], 
            toolbar : "#toolbar",
            showColumns : true,
            showExport : true,
            clickToSelect: true,
            showRefresh : true,
            sidePagination : "server",
            columns : [
            {
                field : 'state',
                checkbox : true,
                align : 'center',
                visible : true,
                valign : 'middle'
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"序号")%>',
                field : 'defaultXH',
                align : 'center',
                visible : true,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value=index+1;
                    }
                    return "<a style=\"font-size:12px;text-decoration:none;color:black;width:50px;\" name=\"defaultXH\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"序号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"主键")%>',
                field : 'EMPEMPLOYEEREG_ID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_ID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"主键\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门码")%>',
                field : 'ORGDEPARTMENT_orgcode',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGDEPARTMENT_orgcode\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"部门码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"上级部门")%>',
                field : 'ORGDEPARTMENT_parentid',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGDEPARTMENT_parentid\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"上级部门\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职类型")%>',
                field : 'EMPEMPLOYEEREG_XTYPE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_XTYPE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"入职类型\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"原员工ID")%>',
                field : 'EMPEMPLOYEEREG_OLDEMPID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_OLDEMPID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"原员工ID\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"原工号")%>',
                field : 'EMPEMPLOYEEREG_OLDEMPCODE',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_OLDEMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"原工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工号")%>',
                field : 'EMPEMPLOYEEREG_EMPCODE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPCODE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPCODE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工号\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"姓名")%>',
                field : 'EMPEMPLOYEEREG_CNAME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CNAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CNAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"姓名\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"英文名")%>',
                field : 'EMPEMPLOYEEREG_ENAME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_ENAME,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_ENAME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"英文名\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"公司")%>',
                field : 'EMPEMPLOYEEREG_COMPID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COMPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COMPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"公司\" data-source="+dictDatas_emp_newEntry_list_22254+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"部门")%>',
                field : 'EMPEMPLOYEEREG_DEPID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_DEPID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_DEPID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"部门\" data-source="+dictDatas_emp_newEntry_list_22255+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"岗位")%>',
                field : 'EMPEMPLOYEEREG_JOBID',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_JOBID,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_JOBID\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"岗位\" data-source="+dictDatas_emp_newEntry_list_22256+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职务名称")%>',
                field : 'EMPEMPLOYEEREG_POSTNAME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_POSTNAME\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"职务名称\" data-source="+dictDatas_emp_newEntry_list_72631+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"承诺等级")%>',
                field : 'EMPEMPLOYEEREG_COMMGRADE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COMMGRADE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COMMGRADE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"承诺等级\" data-source="+dictDatas_emp_newEntry_list_73738+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"承诺薪档")%>',
                field : 'EMPEMPLOYEEREG_COMMSALARY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COMMSALARY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COMMSALARY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"承诺薪档\" data-source="+dictDatas_emp_newEntry_list_73753+"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"承诺存款")%>',
                field : 'EMPEMPLOYEEREG_COMMDEPOSIT',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COMMDEPOSIT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COMMDEPOSIT\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"承诺存款\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"承诺创利")%>',
                field : 'EMPEMPLOYEEREG_COMMPROFIT',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COMMPROFIT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COMMPROFIT\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"承诺创利\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"直接主管")%>',
                field : 'EMPEMPLOYEEREG_SUPVISOR',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_SUPVISOR\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"直接主管\" data-source="+dictDatas_emp_newEntry_list_22257+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"职能主管")%>',
                field : 'EMPEMPLOYEEREG_FUNSUPVISOR',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_FUNSUPVISOR\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"职能主管\" data-source="+dictDatas_emp_newEntry_list_22258+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"在岗状态")%>',
                field : 'EMPEMPLOYEEREG_JOBSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_JOBSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_JOBSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"在岗状态\" data-source="+dictDatas_emp_newEntry_list_22259+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工类型")%>',
                field : 'EMPEMPLOYEEREG_EMPTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工类型\" data-source="+dictDatas_emp_newEntry_list_22260+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工状态")%>',
                field : 'EMPEMPLOYEEREG_EMPSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"员工状态\" data-source="+dictDatas_emp_newEntry_list_51148+"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留1")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP1',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP1\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留1\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预留2")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP2',
                align : 'center',
                visible : false,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP2\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"预留2\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"星座")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP3',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGROUP3,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP3\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"星座\" data-source="+dictDatas_emp_newEntry_list_22264+"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微博")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP4',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGROUP4,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP4\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微博\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"邮编")%>',
                field : 'EMPEMPLOYEEREG_EMPGROUP5',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGROUP5,
                valign : '',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGROUP5\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"邮编\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"客户经理级别")%>',
                field : 'EMPEMPLOYEEREG_EMPGRADE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPGRADE,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPGRADE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"客户经理级别\" data-source="+dictDatas_emp_newEntry_list_22267+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"柜员级别")%>',
                field : 'EMPEMPLOYEEREG_EMPLEVEL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_EMPLEVEL,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPLEVEL\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"柜员级别\" data-source="+dictDatas_emp_newEntry_list_22268+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"招聘来源")%>',
                field : 'EMPEMPLOYEEREG_RECTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_RECTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_RECTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"招聘来源\" data-source="+dictDatas_emp_newEntry_list_22269+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工作城市")%>',
                field : 'EMPEMPLOYEEREG_WORKCITY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKCITY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKCITY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"工作城市\" data-source="+dictDatas_emp_newEntry_list_22270+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职日期")%>',
                field : 'EMPEMPLOYEEREG_JOINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_JOINDATE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_JOINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"入职日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"行龄调整")%>',
                field : 'EMPEMPLOYEEREG_WORKYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKYEARADJUST,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"行龄调整\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"参加工作日期")%>',
                field : 'EMPEMPLOYEEREG_BEGINWORKDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BEGINWORKDATE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_BEGINWORKDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"参加工作日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"工龄调整(年)")%>',
                field : 'EMPEMPLOYEEREG_COMPYEARADJUST',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COMPYEARADJUST,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COMPYEARADJUST\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"工龄调整(年)\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期开始日期")%>',
                field : 'EMPEMPLOYEEREG_PROBBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PROBBEGINDATE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_PROBBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期（月）")%>',
                field : 'EMPEMPLOYEEREG_PROBTERM',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PROBTERM,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_PROBTERM\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"试用期（月）\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"试用期结束日期")%>',
                field : 'EMPEMPLOYEEREG_PROBENDDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PROBENDDATE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_PROBENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"试用期结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同签约单位")%>',
                field : 'EMPEMPLOYEEREG_CONUNIT',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONUNIT,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONUNIT\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同签约单位\" data-source="+dictDatas_emp_newEntry_list_22278+"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同编号")%>',
                field : 'EMPEMPLOYEEREG_CONNUMBER',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONNUMBER,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONNUMBER\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同编号\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同类型")%>',
                field : 'EMPEMPLOYEEREG_CONTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同类型\" data-source="+dictDatas_emp_newEntry_list_22280+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同属性")%>',
                field : 'EMPEMPLOYEEREG_CONKIND',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONKIND,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONKIND\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"合同属性\" data-source="+dictDatas_emp_newEntry_list_22281+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同开始日期")%>',
                field : 'EMPEMPLOYEEREG_CONBEGINDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONBEGINDATE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_CONBEGINDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同开始日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同期（年）")%>',
                field : 'EMPEMPLOYEEREG_CONMONTHS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONMONTHS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONMONTHS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"合同期（年）\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"合同结束日期")%>',
                field : 'EMPEMPLOYEEREG_CONENDDATE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONENDDATE,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_CONENDDATE\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"合同结束日期\">"+date+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"国籍")%>',
                field : 'EMPEMPLOYEEREG_COUNTRY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_COUNTRY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_COUNTRY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"国籍\" data-source="+dictDatas_emp_newEntry_list_22285+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"民族")%>',
                field : 'EMPEMPLOYEEREG_NATION',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_NATION,
                valign : '',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_NATION\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"民族\" data-source="+dictDatas_emp_newEntry_list_22286+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"籍贯")%>',
                field : 'EMPEMPLOYEEREG_ORIGIN',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_ORIGIN,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_ORIGIN\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"籍贯\" data-source="+dictDatas_emp_newEntry_list_22287+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件类型")%>',
                field : 'EMPEMPLOYEEREG_CERTTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CERTTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CERTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"证件类型\" data-source="+dictDatas_emp_newEntry_list_22288+"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"证件编码")%>',
                field : 'EMPEMPLOYEEREG_CERTNO',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CERTNO,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CERTNO\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"证件编码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"性别")%>',
                field : 'EMPEMPLOYEEREG_GENDER',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_GENDER,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_GENDER\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"性别\" data-source="+dictDatas_emp_newEntry_list_22290+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生日期")%>',
                field : 'EMPEMPLOYEEREG_BIRTHDAY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BIRTHDAY,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_BIRTHDAY\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"出生日期\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"出生地")%>',
                field : 'EMPEMPLOYEEREG_BIRTHDAYPLACE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BIRTHDAYPLACE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_BIRTHDAYPLACE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"出生地\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"家庭住址")%>',
                field : 'EMPEMPLOYEEREG_HOMEADDRESS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_HOMEADDRESS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_HOMEADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"家庭住址\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口性质")%>',
                field : 'EMPEMPLOYEEREG_RESIDENTTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_RESIDENTTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_RESIDENTTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"户口性质\" data-source="+dictDatas_emp_newEntry_list_22294+"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"户口所在地")%>',
                field : 'EMPEMPLOYEEREG_RESIDENTADDRESS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_RESIDENTADDRESS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_RESIDENTADDRESS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"户口所在地\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"机构邮箱")%>',
                field : 'EMPEMPLOYEEREG_WORKEMAIL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKEMAIL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"机构邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"办公电话")%>',
                field : 'EMPEMPLOYEEREG_WORKPHONE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WORKPHONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WORKPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"办公电话\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"私人邮箱")%>',
                field : 'EMPEMPLOYEEREG_PESEMAIL',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PESEMAIL,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_PESEMAIL\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"私人邮箱\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"联系电话")%>',
                field : 'EMPEMPLOYEEREG_PESPHONE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_PESPHONE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_PESPHONE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"联系电话\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"手机号码")%>',
                field : 'EMPEMPLOYEEREG_MOBILE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_MOBILE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_MOBILE\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"手机号码\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"婚姻状况")%>',
                field : 'EMPEMPLOYEEREG_MARRIAGESTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_MARRIAGESTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_MARRIAGESTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"婚姻状况\" data-source="+dictDatas_emp_newEntry_list_22301+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"健康状况")%>',
                field : 'EMPEMPLOYEEREG_HEALTHSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_HEALTHSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_HEALTHSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"健康状况\" data-source="+dictDatas_emp_newEntry_list_22302+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"血型")%>',
                field : 'EMPEMPLOYEEREG_BLOODTYPE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_BLOODTYPE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_BLOODTYPE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"血型\" data-source="+dictDatas_emp_newEntry_list_22303+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生育状况")%>',
                field : 'EMPEMPLOYEEREG_CHILDSTATUS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CHILDSTATUS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CHILDSTATUS\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"生育状况\" data-source="+dictDatas_emp_newEntry_list_22304+"></a>";
                }
            },

  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"子女情况(个数)")%>',
                field : 'EMPEMPLOYEEREG_CHILDS',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CHILDS,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CHILDS\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"子女情况(个数)\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"qq号码")%>',
                field : 'EMPEMPLOYEEREG_QQ',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_QQ,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_QQ\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"qq号码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"微信")%>',
                field : 'EMPEMPLOYEEREG_WECHART',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_WECHART,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_WECHART\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"微信\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"现居住地址")%>',
                field : 'EMPEMPLOYEEREG_LOCATION',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_LOCATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_LOCATION\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"现居住地址\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"备注")%>',
                field : 'EMPEMPLOYEEREG_REMARK',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_REMARK,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_REMARK\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"备注\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记人")%>',
                field : 'EMPEMPLOYEEREG_REGBY',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_REGBY,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_REGBY\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"登记人\" data-source="+dictDatas_emp_newEntry_list_22308+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"登记时间")%>',
                field : 'EMPEMPLOYEEREG_REGTIME',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_REGTIME,
                valign : 'left',
                formatter: function (value, row, index) {
                    var date = "-";
                    if(value!=null){
                    var val = value+"";
                    	if((("yyyy-MM-dd"=="hh:mm")&&val.indexOf(":")>1)||("yyyy-MM-dd"=="yyyyMM")){
                    		date = value ;
                    	}else{
                        date = new Date(value).Format("yyyy-MM-dd");
                    	}
                    }
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px\" name=\"EMPEMPLOYEEREG_REGTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" data-title=\"登记时间\">"+date+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效")%>',
                field : 'EMPEMPLOYEEREG_VALID',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_VALID\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效人")%>',
                field : 'EMPEMPLOYEEREG_VALIDBY',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_VALIDBY\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效人\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"生效时间")%>',
                field : 'EMPEMPLOYEEREG_VALIDTIME',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_VALIDTIME\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"生效时间\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"组织码")%>',
                field : 'ORGCOMPANY_orgcode',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"ORGCOMPANY_orgcode\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"组织码\">"+value+"</a>";
                }
            },
  {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"员工性质")%>',
                field : 'EMPEMPLOYEEREG_EMPKIND',
                align : 'center',
                visible : false,
                valign : 'left',
                formatter: function (value, row, index) {
                    if(value==undefined){
                        value='-';
                    }
                   return "<a  class=\"eli w\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_EMPKIND\" data-type=\"text\" data-pk=\""+row.Id+"\" title=\""+value+"\" data-title=\"员工性质\">"+value+"</a>";
                }
            },
            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"柜员级别")%>',
                field : 'EMPEMPLOYEEREG_TELLERGRADE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_TELLERGRADE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_TELLERGRADE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"柜员级别\" data-source="+dictDatas_emp_newEntry_list_74130+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"客户经理级别")%>',
                field : 'EMPEMPLOYEEREG_MANAGERGRADE',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_MANAGERGRADE,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_MANAGERGRADE\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"客户经理级别\" data-source="+dictDatas_emp_newEntry_list_74131+"></a>";
                }
            },

            {
                title : '<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"星座")%>',
                field : 'EMPEMPLOYEEREG_CONSTELLATION',
                align : 'center',
                visible : columnvisible.EMPEMPLOYEEREG_CONSTELLATION,
                valign : 'left',
                formatter: function (value, row, index) {
                    if((value==undefined || value=="")&&value!=0){
                        value='-';
                    }
                    value = (value+'').replace(/ /g,'');
                    return "<a class=\"eli wpx\" style=\"font-size:12px;text-decoration:none;color:black;width:200px;\" name=\"EMPEMPLOYEEREG_CONSTELLATION\" data-type=\"select\" data-pk=\""+row.Id+"\" data-value=\""+value+"\" data-title=\"星座\" data-source="+dictDatas_emp_newEntry_list_74132+"></a>";
                }
            },

            ],
            onClickRow: function (row, $element) {
                curRow = row;
            },
		onPostBody: function (res) {
		    hiddenBorder();
		},
		onLoadSuccess: function (aa, bb, cc) {
                $("#emp_newEntry_list_List a").editable({
                    disabled: true,
                    emptytext: "-",
                    url: function (params) {
                        var sName = $(this).attr("name");
                        curRow[sName] = params.value;
                    },
                    type: 'text'
                });
            },
		onDblClickCell: function (field, value,row,td) {
        	editemp_newEntry_list_click_2057('isView',row);  
         } ,
            responseHandler : function(res) {  
                                return {  
                    total : res.total,  
                    rows : res.rows  
                };
            }
        });
        window.operateEvents = {  
    };
}
	
function executeSQLemp_newEntry_list_click_2057(){

	var buttonId = 2319;
	var checkselecdata = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	var empemployeereg_id_2057Datas;
	var tempempemployeereg_id_2057Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempempemployeereg_id_2057Datas.push("'"+columnDataRows[i].EMPEMPLOYEEREG_ID+"'");
	}
	empemployeereg_id_2057Datas = tempempemployeereg_id_2057Datas.join(',');
	var paramsMap = {		'c_22247' : empemployeereg_id_2057Datas};
	var data = {
		'formId' : _formId_2057,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
jQuery('#activity_pane').showLoading({'addClass': 'loading-indicator'});
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
					if (text[0] == '000000') {
							alert(text[1]);
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
					} else {
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


	
function executeSQL1emp_newEntry_list_click_2057(){

	var buttonId = 2322;
	var checkselecdata = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	var empemployeereg_id_2057Datas;
	var tempempemployeereg_id_2057Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempempemployeereg_id_2057Datas.push("'"+columnDataRows[i].EMPEMPLOYEEREG_ID+"'");
	}
	empemployeereg_id_2057Datas = tempempemployeereg_id_2057Datas.join(',');
	var paramsMap = {		'c_22247' : empemployeereg_id_2057Datas,
		's_userId' : '1'};
	var data = {
		'formId' : _formId_2057,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
jQuery('#activity_pane').showLoading({'addClass': 'loading-indicator'});
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
					if (text[0] == '000000') {
							alert(text[1]);
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
					} else {
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


	
function executeSQL2emp_newEntry_list_click_2057(){

	var buttonId = 2308;
	var checkselecdata = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	if(checkselecdata==null||checkselecdata==''||checkselecdata.lenght<=0){
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择数据！")%>');
		return;
	}
	var columnDataRows = $("#emp_newEntry_list_List").bootstrapTable('getSelections');
	var empemployeereg_id_2057Datas;
	var tempempemployeereg_id_2057Datas = [];
	for(var i=0; i<columnDataRows.length; i++){
		tempempemployeereg_id_2057Datas.push("'"+columnDataRows[i].EMPEMPLOYEEREG_ID+"'");
	}
	empemployeereg_id_2057Datas = tempempemployeereg_id_2057Datas.join(',');
	var paramsMap = {		'c_22247' : empemployeereg_id_2057Datas,
		's_userId' : '1'};
	var data = {
		'formId' : _formId_2057,
		'buttonId' : buttonId,
		'params' : paramsMap,
		'containerParam' : containerParam
	};
jQuery('#activity_pane').showLoading({'addClass': 'loading-indicator'});
	$.ajax({
			url:'${pageContext.request.contextPath }/form/execButtonExecSql.action',
			type : 'POST',
			data: JSON.stringify(data),
			cache : false,
			contentType: 'application/json;charset=utf-8',
			success : function (text) {
					if (text[0] == '000000') {
							alert(text[1]);
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
					} else {
						$("#emp_newEntry_list_List").bootstrapTable('refresh');
							alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"执行结果")%>：' + text[1]);
					}
				       jQuery('#activity_pane').hideLoading();
			var index = parent.layer.getFrameIndex(window.name);
				parent.layer.close(index);//执行关闭

			},
			error : function (jqXHR, textStatus, errorThrown) {
			}
		});

	}


/** 刷新页面 */ 
function refresh_emp_newEntry_list() { 
    $('#emp_newEntry_list_List').bootstrapTable('refresh'); 
}

/** 隐藏边框 */ 
function hiddenBorder(type) { 
    if(type == 0){
        $("#emp_newEntry_list_List td").css("border","none");
    }else if(type == 1){
        $("#emp_newEntry_list_List td").css("border-left","none");
    }else if(type == 2){
        $("#emp_newEntry_list_List td").css("border-top","none");
    }
}
function addemp_newEntry_list_click_2057(isView,data){
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新员工入职新增")%>';
	if('${param.ORGVORGANIZATION_ORGID}'!='' ){
		var url='/myehr/form/toForm.action?formId=2060&ORGVORGANIZATION_ORGID=${param.ORGVORGANIZATION_ORGID}&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=2060&ORGVORGANIZATION_ORGID='+ORGVORGANIZATION_ORGID+'&isView='+isView+'';
	}
	layer.open({
		type: 2,
		title:title,
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			    refresh_emp_newEntry_list();
		}
	});
}
function edit1emp_newEntry_list_click_2057(isView,data){
	var selects = $("#emp_newEntry_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"入职背景")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=3207&isInit=true&EMPEMPLOYEEREG_ID='+select.EMPEMPLOYEEREG_ID+'&&EMPEMPLOYEEREG_EMPCODE='+select.EMPEMPLOYEEREG_EMPCODE+'&&EMPEMPLOYEEREG_CNAME='+select.EMPEMPLOYEEREG_CNAME+'&&EMPEMPLOYEEREG_ENAME='+select.EMPEMPLOYEEREG_ENAME+'&&EMPEMPLOYEEREG_COMPID='+select.EMPEMPLOYEEREG_COMPID+'&&EMPEMPLOYEEREG_DEPID='+select.EMPEMPLOYEEREG_DEPID+'&&EMPEMPLOYEEREG_JOBID='+select.EMPEMPLOYEEREG_JOBID+'&&EMPEMPLOYEEREG_EMPSTATUS='+select.EMPEMPLOYEEREG_EMPSTATUS+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=3207&isInit=true&EMPEMPLOYEEREG_ID='+EMPEMPLOYEEREG_ID+'&EMPEMPLOYEEREG_EMPCODE='+EMPEMPLOYEEREG_EMPCODE+'&EMPEMPLOYEEREG_CNAME='+EMPEMPLOYEEREG_CNAME+'&EMPEMPLOYEEREG_ENAME='+EMPEMPLOYEEREG_ENAME+'&EMPEMPLOYEEREG_COMPID='+EMPEMPLOYEEREG_COMPID+'&EMPEMPLOYEEREG_DEPID='+EMPEMPLOYEEREG_DEPID+'&EMPEMPLOYEEREG_JOBID='+EMPEMPLOYEEREG_JOBID+'&EMPEMPLOYEEREG_EMPSTATUS='+EMPEMPLOYEEREG_EMPSTATUS+'&isView='+isView+'';
	}
	layer.open({
		type: 2,
		title:title,
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			    refresh_emp_newEntry_list();
		}
	});
}
function edit2emp_newEntry_list_click_2057(isView,data){
	var selects = $("#emp_newEntry_list_List").bootstrapTable('getSelections');;
	if(selects!=null && selects.length>0){
		select = selects[0];;
		title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"新员工入职编辑")%>';
	}else if(data!=null&&isView!=null){
	select = data;
	title='<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"预览")%>';
	}else {
		alert('<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"请选择一行数据")%>');return ;
	}
	if(1==1){
		var url='/myehr/form/toForm.action?formId=2061&isInit=true&EMPEMPLOYEEREG_ID='+select.EMPEMPLOYEEREG_ID+'&&&isView='+isView+'';
	}else{
		var url='/myehr/form/toForm.action?formId=2061&isInit=true&EMPEMPLOYEEREG_ID='+EMPEMPLOYEEREG_ID+'&isView='+isView+'';
	}
	layer.open({
		type: 2,
		title:title,
		shadeClose: true,
		shade: 0.8,
		maxmin:true,
		zIndex:9999,
		area: ['950px', '500px'],
		content: url,
		success:function(layero,index){
		},
		end:function(){
			    refresh_emp_newEntry_list();
		}
	});
}
	function importemp_newEntry_list_click_2057() {
		var url = "/myehr/jsp/form/button/importButton.jsp?formId=2057&templateFileid=1022&templateFilename=新员工入职登记导入模板(红色字段为必填字段).xls&buttonId=2954";
		layer.open({
			type: 2,
			title: "<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"选择导入的Excel")%>",
			area: ['600', '500'],
			shadeClose: true,
			shade: 0.8,
			offset: ['0px', '0px'],
			content: url,
			onload: function () {},
			ondestroy: function (action) {
				if(action=="ok") {
					grid_emp_newEntry_list.reload();
				}
			}
		});
	}

var filterParam = {};
var queryParams;
function grid_emp_newEntry_list_fun(pageReqeust){
	var _filterdata={};
	if(document.getElementById('grid_emp_newEntry_list_filter')){
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2057']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2057']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_EMPCODE=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2057']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2057']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_EMPCODE=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_EMPCODE_2057']").val();
		}else{
				var EMPEMPLOYEEREG_EMPCODE=$("[id='FILTER_2057']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2057']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2057']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_CNAME=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2057']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2057']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_CNAME=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CNAME_2057']").val();
		}else{
				var EMPEMPLOYEEREG_CNAME=$("[id='FILTER_2057']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_JOBID=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_JOBID=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_JOBID_2057']").val();
		}else{
				var EMPEMPLOYEEREG_JOBID=$("[id='FILTER_2057']").val();
		}
	if($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2057']").attr('multiSelect')){
		var val = "";
		var arr = $("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2057']").val();
		if(arr==null){
		}else{
			for(var i=0;i<arr.length;i++){
				val+=arr[i]+',';
			}
			val = val.substring(0,val.length-1);
		}
		var EMPEMPLOYEEREG_CERTNO=val;
	}else if(($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2057']").attr('styleType')=="select")||($("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2057']").attr('styleType')=="dateTime")){
			var EMPEMPLOYEEREG_CERTNO=$("[id='FILTER_EMP_EMPLOYEE_REG.EMPEMPLOYEEREG_CERTNO_2057']").val();
		}else{
				var EMPEMPLOYEEREG_CERTNO=$("[id='FILTER_2057']").val();
		}
		_filterdata={EMPEMPLOYEEREG_EMPCODE:EMPEMPLOYEEREG_EMPCODE,EMPEMPLOYEEREG_CNAME:EMPEMPLOYEEREG_CNAME,EMPEMPLOYEEREG_JOBID:EMPEMPLOYEEREG_JOBID,EMPEMPLOYEEREG_CERTNO:EMPEMPLOYEEREG_CERTNO};
	}
	var paramsMap = {};
	var requestParam={};
	if('${param.ORGCOMPANY_orgcode}'==''&&'parameter'=='parameter'){
		if(ORGCOMPANY_orgcode==undefined){
			requestParam = {ORGCOMPANY_orgcode:'${param.ORGCOMPANY_orgcode}'};
		}else{
			requestParam = {ORGCOMPANY_orgcode:ORGCOMPANY_orgcode+""};
		}
	}else{
		requestParam = {ORGCOMPANY_orgcode:'${param.ORGCOMPANY_orgcode}'};
	}
	pageReqeust.containerParam=containerParam_2057;
	pageReqeust.paramsMap=paramsMap;
	pageReqeust.requestParam=requestParam;
	pageReqeust.filter=_filterdata;
	pageReqeust.userIds=getQueryString('empIds');
	pageReqeust.formId=_formId_2057;
	pageReqeust.isView=null;
	if(heightGadedata_2057!=null&&heightGadedata_2057!=undefined){
		pageReqeust.heightGrade = heightGadedata_2057;
	}
	queryParams = JSON.stringify(pageReqeust);
	return queryParams;
}
function grid_emp_newEntry_list_fun11_2057(){
	$('#emp_newEntry_list_List').bootstrapTable('refresh');
}
function exportData(fieldArray,formId){
    exportData_2057(fieldArray);
}
	function grid_emp_newEntry_list_HeighQuery_2057() {
		layer.open({
			type: 2,
			showMaxButton: true,
			title:"<%=LangUtil.getLangByCode((String)session.getAttribute("langType"),"高级查询设置")%>" ,
			area: ['855', '500'],
			maxmin: true,
			content:'/myehr/jsp/form/button/heightGrade.jsp?formFunction=grid_emp_newEntry_list_fun11_2057&formDefId=2057&formDefLayout=2',
			success:function(layero,index){
				},
				end:function(){
			}
			});
	}
</script>
</body>
</html>
