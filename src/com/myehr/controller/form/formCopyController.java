package com.myehr.controller.form;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.CycleDetectionStrategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myehr.common.util.GetRequestJsonUtils;
import com.myehr.mapper.formmanage.form.SysCardtocardConfigMapper;
import com.myehr.mapper.formmanage.form.SysFormconfigMstTabDetailMapper;
import com.myehr.pojo.cache.SysCacheConfig;
import com.myehr.pojo.entity.SysEntity;
import com.myehr.pojo.field.SysField;
import com.myehr.pojo.formmanage.button.SysFormButtonSave;
import com.myehr.pojo.formmanage.cache.SysDatepickerCache;
import com.myehr.pojo.formmanage.cache.SysFormButtonCache;
import com.myehr.pojo.formmanage.cache.SysFormButtonSaveCache;
import com.myehr.pojo.formmanage.cache.SysFormColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormComboboxCache;
import com.myehr.pojo.formmanage.cache.SysFormFileuploadCache;
import com.myehr.pojo.formmanage.cache.SysFormGeneralExecSql;
import com.myehr.pojo.formmanage.cache.SysFormGeneralExecSqlCache;
import com.myehr.pojo.formmanage.cache.SysFormGeneralParamCache;
import com.myehr.pojo.formmanage.cache.SysFormGroupCache;
import com.myehr.pojo.formmanage.cache.SysFormLookupCache;
import com.myehr.pojo.formmanage.cache.SysFormRadiobuttonlistCache;
import com.myehr.pojo.formmanage.cache.SysFormRichtextCache;
import com.myehr.pojo.formmanage.cache.SysFormTextareaCache;
import com.myehr.pojo.formmanage.cache.SysFormTreeSolutionCache;
import com.myehr.pojo.formmanage.cache.SysFormTreeSolutionColumnCache;
import com.myehr.pojo.formmanage.cache.SysFormWhereCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigMstTabDetailCache;
import com.myehr.pojo.formmanage.cache.SysFormconfigTreeCache;
import com.myehr.pojo.formmanage.cache.SysTextBoxCache;
import com.myehr.pojo.formmanage.cache.SysTreeNodeTypeCache;
import com.myehr.pojo.formmanage.form.SysCardtocardConfig;
import com.myehr.pojo.formmanage.form.SysCardtocardConfigExample;
import com.myehr.pojo.formmanage.form.SysExecSql;
import com.myehr.pojo.formmanage.form.SysFormButton;
import com.myehr.pojo.formmanage.form.SysFormColumn;
import com.myehr.pojo.formmanage.form.SysFormGeneralParam;
import com.myehr.pojo.formmanage.form.SysFormGroup;
import com.myehr.pojo.formmanage.form.SysFormWhere;
import com.myehr.pojo.formmanage.form.SysFormconfig;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetail;
import com.myehr.pojo.formmanage.form.SysFormconfigMstTabDetailExample;
import com.myehr.pojo.formmanage.form.SysFormconfigTree;
import com.myehr.pojo.formmanage.form.SysFormconfigWithBLOBs;
import com.myehr.pojo.formmanage.form.SysTreeNodeType;
import com.myehr.pojo.formmanage.form.SysTreeSolution;
import com.myehr.pojo.formmanage.formCopy.SysFormCopyCache;
import com.myehr.pojo.formmanage.widget.SysFormCombobox;
import com.myehr.pojo.formmanage.widget.SysFormDatepicker;
import com.myehr.pojo.formmanage.widget.SysFormTextbox;
import com.myehr.service.formmanage.form.IFormCopy;
import com.myehr.service.formmanage.form.ISysformconfigService;



@Controller
@RequestMapping("/FormCopy")
public class formCopyController {
	private static Logger logger = LoggerFactory.getLogger(formCopyController.class);
	@Autowired IFormCopy formCopy;
	@Autowired SysFormconfigMstTabDetailMapper sDetailMapper;
	@Autowired SysCardtocardConfigMapper configMapper;
	@Autowired ISysformconfigService sysformconfigService;
	//卡片表单复制
	@RequestMapping("/cardFormCopy")
	 public @ResponseBody Object cardFormCopy(HttpServletRequest request, @RequestBody SysFormconfigWithBLOBs form) throws Exception {
		String reCode = "false";
		String userId = (String) (request.getSession().getAttribute("userid")+"");
		try {
			reCode = formCopy.cardFormCopy(form.getFormDefId()+"",userId);
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
	}
	
	//列表表单复制
	@RequestMapping("/gridFormCopy")
	 public @ResponseBody Object gridFormCopy(HttpServletRequest request, @RequestBody SysFormconfigWithBLOBs form) throws Exception {
		String reCode = "false";
		String userId = (String) (request.getSession().getAttribute("userid")+"");
		try {
			reCode = formCopy.gridFormCopy(form.getFormDefId()+"",userId);
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
	}
	
	//树表单复制
	@RequestMapping("/treeFormCopy")
	 public @ResponseBody Object treeFormCopy(HttpServletRequest request, @RequestBody SysFormconfigWithBLOBs form) throws Exception {
		String reCode = "false";
		String userId = (String) (request.getSession().getAttribute("userid")+"");
		try {
			reCode = formCopy.treeFormCopy(form.getFormDefId()+"",userId);
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
	}
	
	//主从表单复制
	@RequestMapping("/mstFormCopy")
	 public @ResponseBody Object mstFormCopy(HttpServletRequest request, @RequestBody SysFormconfigWithBLOBs form) throws Exception {
		String reCode = "false";
		String userId = (String) (request.getSession().getAttribute("userid")+"");
		try {
			reCode = formCopy.mstFormCopy(form.getFormDefId()+"",userId);
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
	}
	
	//多Tab表单复制
	@RequestMapping("/tabsFormCopy")
	 public @ResponseBody Object tabsFormCopy(HttpServletRequest request, @RequestBody SysFormconfigWithBLOBs form) throws Exception {
		String reCode = "false";
		String userId = (String) (request.getSession().getAttribute("userid")+"");
		try {
			reCode = formCopy.tabsFormCopy(form.getFormDefId()+"",userId);
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
	}
	
	//表单提交
	@RequestMapping("/referUrl")
	 public @ResponseBody Object referUrl(HttpServletRequest request, @RequestBody List<SysFormconfigWithBLOBs> forms) throws Exception {
		String reCode = "false";
		String userId = (String) (request.getSession().getAttribute("userid")+"");
		try {
			for (SysFormconfigWithBLOBs sysFormconfigWithBLOBs : forms) {
				reCode = formCopy.referUrl(sysFormconfigWithBLOBs,userId);
				sysformconfigService.setForm(sysFormconfigWithBLOBs.getFormDefId()+"");
			}
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
	}
	
	//表单提交
	@RequestMapping("/removeRefer")
	 public @ResponseBody Object removeRefer(HttpServletRequest request, @RequestBody List<SysFormconfigWithBLOBs> forms) throws Exception {
		String reCode = "false";
		String userId = (String) (request.getSession().getAttribute("userid")+"");
		try {
			for (SysFormconfigWithBLOBs sysFormconfigWithBLOBs : forms) {
				reCode = formCopy.removeRefer(sysFormconfigWithBLOBs,userId);
				sysformconfigService.setForm(sysFormconfigWithBLOBs.getFormDefId()+"");
			}
			return reCode;
		} catch (Exception e) {
			// TODO: handle exception
			return reCode;
		}
	}
	
	//从表信息修改
	@RequestMapping("/updateTabDetail")
	 public @ResponseBody Object updateTabDetail(HttpServletRequest request, @RequestBody List<SysFormconfigMstTabDetail> sDetails) throws Exception {
		String reCode = "false";
		String userId = (String) (request.getSession().getAttribute("userid")+"");
		try {
			for (SysFormconfigMstTabDetail sDetail : sDetails) {
				SysFormconfigMstTabDetail detail = sDetailMapper.selectByPrimaryKey(sDetail.getTabDetailId());
				detail.setTabDetailFormTitle(sDetail.getTabDetailFormTitle());
				detail.setTabDetailSort(sDetail.getTabDetailSort());
				detail.setOperatorName(userId);
				detail.setOperatorTime(new Date());
				sDetailMapper.updateByPrimaryKey(detail);
			}
			return "true";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();logger.error(e.getMessage(),e);
			return reCode;
		}
	}
	
	@RequestMapping("/getConfigByFormId")
	public @ResponseBody SysCardtocardConfig getConfigByFormId(HttpServletRequest request) throws Exception{
		String formId = request.getParameter("formId")+"";
		SysCardtocardConfigExample example = new SysCardtocardConfigExample();
		example.or().andFormIdEqualTo(Long.valueOf(formId));
		List<SysCardtocardConfig> configs = configMapper.selectByExample(example);
		if (configs.size()>0) {
			return configs.get(0);
		} else {
			return null;
		}
	}	
	@RequestMapping("/saveCCconfig")
	public @ResponseBody String saveCCconfig(HttpServletRequest request, @RequestBody SysCardtocardConfig config) throws Exception{
		try {
			if (config.getId()!=null&&config.getId()!=0) {
				configMapper.updateByPrimaryKey(config);
			} else {
				configMapper.insert(config);
			}
			return "1";
		} catch (Exception e) {
			// TODO: handle exception
			return "0";
		}
	}
	
	protected String createStr(String tableType,String formType,String json) {
		String str = json.toString();//将json对象转换为字符串
		return str;
	}
	
	protected String createJson(Object obj) {
		JsonConfig jsonConfig = new JsonConfig();
		jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
		JSONObject json = JSONObject.fromObject(obj,jsonConfig);//将java对象转换为json对象
		return json.toString();
	}
	
	//卡片表单复制
	@RequestMapping("/cardFormCopyToOther")
	 public @ResponseBody Object copyDatas(HttpServletRequest request) throws Exception {
		String formId = request.getParameter("formId")+"";
		SysFormconfigCache formCache = sysformconfigService.getForm(formId);
		try {

			String copyDatas = "";
			String jsonString = "";
			if(formCache.getPojoform().getFormDefLayoutType().equals("3")){
				//表单
				jsonString = createJson(formCache.getPojoform());
				copyDatas += "<startCopyDatas>|tree|form\n";
				copyDatas += createStr("formconfig","tree",jsonString)+"\n";
				copyDatas += "<endCopyDatas>\n";
				//缺树
				jsonString = createJson(formCache.getTree().getTree());
				copyDatas += "<startCopyDatas>|tree|tree\n";
				copyDatas += createStr("formconfig","tree",jsonString)+"\n";
				copyDatas += "<endCopyDatas>\n";
				//缺树方案
				jsonString = createJson(formCache.getTree().getSolution().getTreeSolution());
				copyDatas += "<startCopyDatas>|tree|solution\n";
				copyDatas += createStr("formconfig","tree",jsonString)+"\n";
				copyDatas += "<endCopyDatas>\n";
				//树方案字段
				copyDatas += "<startCopyDatas>|tree|solutionColumns\n";
				for (int i = 0; i < formCache.getTree().getSolution().getColumns().size(); i++) {
					jsonString = createJson(formCache.getTree().getSolution().getColumns().get(i));
					copyDatas += createStr("formconfig","tree",jsonString)+"\n";
				}
				copyDatas += "<endCopyDatas>\n";
				//树节点配置
				copyDatas += "<startCopyDatas>|tree|nodeType\n";
				for (int i = 0; i < formCache.getNodeCaches().size(); i++) {
					jsonString = createJson(formCache.getNodeCaches().get(i).getNode());
					copyDatas += createStr("formconfig","tree",jsonString)+"\n";
				}
				copyDatas += "<endCopyDatas>\n";
				copyDatas += "<startCopyDatas>|tree|nodeType\n";
				for (int i = 0; i < formCache.getNodeCaches().size(); i++) {
					jsonString = createJson(formCache.getNodeCaches().get(i).getForm());
					copyDatas += createStr("formconfig","tree",jsonString)+"\n";
					List<SysFormColumnCache> columnCaches = formCache.getNodeCaches().get(i).getForm().getColumns();
					for (SysFormColumnCache sysFormColumnCache : columnCaches) {
						jsonString = createJson(sysFormColumnCache);
						copyDatas += createStr("formconfig","tree",jsonString)+"<column>";
					}
					jsonString = createJson(formCache.getNodeCaches().get(i).getForm().getMstTab().getDetails().get(0).getForm());
					copyDatas += createStr("formconfig","tree",jsonString)+"\n";
				}
				copyDatas += "<endCopyDatas>\n";
				//总表单
//				SysFormconfigCache formCache2 = formCache;
				formCache.setNodeCaches(null);
				String copyDatas1 = "";
				copyDatas1 += "<startCopyDatas>|tree|nodeType\n";
				jsonString = createJson(formCache);
				copyDatas1 += createStr("formconfig","tree",jsonString)+"\n";
				copyDatas1 += "<endCopyDatas>\n";
				copyDatas = copyDatas1 + copyDatas;
				
				
				
				/*//树表单基本信息
				SysFormconfigWithBLOBs form = formCache.getPojoform();
				jsonString = createJson(form);
				copyDatas += createStr("formconfig","tree",jsonString);
				SysFormconfigTreeCache treeCache = formCache.getTree();
				jsonString = createJson(treeCache);
				copyDatas += createStr("formconfigTree","X",jsonString);*/
				/*//表单树信息
				SysFormconfigTreeCache treeCache = formCache.getTree();
				SysFormconfigTree tree = treeCache.getTree();
				jsonString = createJson(tree);
				copyDatas += createStr("formconfigTree","X",jsonString);
				//树方案信息
				SysFormTreeSolutionCache solutionCache = treeCache.getSolution();
				SysTreeSolution treeSolution = solutionCache.getTreeSolution();
				jsonString = createJson(treeSolution);
				copyDatas += createStr("treeSolution","X",jsonString);
				//树方案映射字段信息
				List<SysFormTreeSolutionColumnCache> solutionColumnCache = solutionCache.getColumns();*/
				
			}else if(formCache.getPojoform().getFormDefLayoutType().equals("1")){
				//表单
				SysFormconfigWithBLOBs formconfig = formCache.getPojoform();
				jsonString = createJson(formCache.getPojoform());
				copyDatas += "<startCopyDatas>|card|form\n";
				copyDatas += createStr("formconfig","card",jsonString)+"\n";
				copyDatas += "<endCopyDatas>\n";
				List<SysFormColumnCache> columns = formCache.getFree();
				List<SysFormGroupCache> groups = formCache.getGroups();
				for (SysFormGroupCache sysFormGroupCache : groups) {
					copyDatas += "<startCopyDatas>|card|group\n";
					jsonString = createJson(sysFormGroupCache.getPojo());
					copyDatas += createStr("formconfig","card",jsonString)+"\n";
					List<SysFormColumnCache> columnCaches = sysFormGroupCache.getColumns();
					for (SysFormColumnCache sysformcolumn : columnCaches) {
						jsonString = createJson(sysformcolumn.getPojo());
						copyDatas += createStr("formconfig","card",jsonString)+"\n";
						if (sysformcolumn.getFormColumnGuiType().equals("1")||sysformcolumn.getFormColumnGuiType().equals("8")) {
							//文本框
							SysTextBoxCache textCache = (SysTextBoxCache)sysformcolumn.getFormColumGui();
							jsonString = createJson(textCache.getPojo());//控件基本信息
							copyDatas += createStr("formconfig","card",jsonString)+"\n";
						}else if(sysformcolumn.getFormColumnGuiType().equals("2")){
							//下拉列表选择
							SysFormComboboxCache comboboxCache = (SysFormComboboxCache)sysformcolumn.getFormColumGui();
							jsonString = createJson(comboboxCache.getPojo());//控件基本信息
							copyDatas += createStr("formconfig","card",jsonString)+"\n";
						}else if(sysformcolumn.getFormColumnGuiType().equals("3")){
							//单选框组
						}else if(sysformcolumn.getFormColumnGuiType().equals("4")){
							//复选框组
						}else if(sysformcolumn.getFormColumnGuiType().equals("5")){
							//复选框
						}else if(sysformcolumn.getFormColumnGuiType().equals("6")){
							//日期选择框
							jsonString = createJson(((SysDatepickerCache)sysformcolumn.getFormColumGui()).getPojo());//控件参数信息
							copyDatas += createStr("formconfig","card",jsonString)+"\n";
						}else if(sysformcolumn.getFormColumnGuiType().equals("7")){
							//lookup弹出窗
						}else if(sysformcolumn.getFormColumnGuiType().equals("8")){
							//多行文本域
						}else if(sysformcolumn.getFormColumnGuiType().equals("10")){
							//富文本
						}
						jsonString = createJson(sysformcolumn.getField());
						copyDatas += createStr("formconfig","card",jsonString)+"\n";
						jsonString = createJson(sysformcolumn.getEntity());
						copyDatas += createStr("formconfig","card",jsonString)+"\n";
					}
					copyDatas += "<endCopyDatas>\n";
				}	
				copyDatas += "<startCopyDatas>|card|free\n";
				for (SysFormColumnCache sysformcolumn : columns) {
					jsonString = createJson(sysformcolumn.getPojo());
					copyDatas += createStr("formconfig","card",jsonString)+"\n";
					if (sysformcolumn.getFormColumnGuiType().equals("1")) {
						//文本框
						SysTextBoxCache textCache = (SysTextBoxCache)sysformcolumn.getFormColumGui();
						jsonString = createJson(textCache.getPojo());//控件基本信息
						copyDatas += createStr("formconfig","card",jsonString)+"\n";
					}else if(sysformcolumn.getFormColumnGuiType().equals("2")){
						//下拉列表选择
						SysFormComboboxCache comboboxCache = (SysFormComboboxCache)sysformcolumn.getFormColumGui();
						jsonString = createJson(comboboxCache.getPojo());//控件基本信息
						copyDatas += createStr("formconfig","card",jsonString)+"\n";
					}else if(sysformcolumn.getFormColumnGuiType().equals("3")){
						//单选框组
					}else if(sysformcolumn.getFormColumnGuiType().equals("4")){
						//复选框组
					}else if(sysformcolumn.getFormColumnGuiType().equals("5")){
						//复选框
					}else if(sysformcolumn.getFormColumnGuiType().equals("6")){
						//日期选择框
						jsonString = createJson((SysDatepickerCache)sysformcolumn.getFormColumGui());//控件参数信息
						copyDatas += createStr("formconfig","card",jsonString)+"\n";
					}else if(sysformcolumn.getFormColumnGuiType().equals("7")){
						//lookup弹出窗
					}else if(sysformcolumn.getFormColumnGuiType().equals("8")){
						//多行文本域
					}else if(sysformcolumn.getFormColumnGuiType().equals("10")){
						//富文本
					}
//					jsonString = createJson(sysformcolumn.getFormColumGui());
//					copyDatas += createStr("formconfig","card",jsonString)+"\n";
					jsonString = createJson(sysformcolumn.getField());
					copyDatas += createStr("formconfig","card",jsonString)+"\n";
					jsonString = createJson(sysformcolumn.getEntity());
					copyDatas += createStr("formconfig","card",jsonString)+"\n";
				}
				copyDatas += "<endCopyDatas>\n";
				copyDatas += "<startCopyDatas>|card|where\n";
				List<SysFormWhereCache> wheresCaches = formCache.getWheres();
				for (SysFormWhereCache sysFormWhereCache : wheresCaches) {
					jsonString = createJson(sysFormWhereCache.getPojo());
					copyDatas += createStr("formconfig","card",jsonString)+"\n";
				}
				copyDatas += "<endCopyDatas>\n";
				copyDatas += "<startCopyDatas>|card|button\n";
				List<SysFormButtonCache> buttonCaches = formCache.getButtons();
				for (SysFormButtonCache sysFormButtonCache : buttonCaches) {
					//pojo
					jsonString = createJson(sysFormButtonCache.getPojo());
					copyDatas += createStr("formconfig","card",jsonString)+"\n";
					//list<CacheConfig>
					List<SysCacheConfig> cacheConfigs = sysFormButtonCache.getCacheConfig();
					if (cacheConfigs==null||cacheConfigs.size()==0) {
						copyDatas += "kong\n";
					}else {
						for (SysCacheConfig sysCacheConfig : cacheConfigs) {
							jsonString = createJson(sysCacheConfig);
							copyDatas += createStr("formconfig","card",jsonString)+"|&cacheConfig&|";
						}
						copyDatas += "\n";
					}
					//hzsql
					jsonString = createJson(sysFormButtonCache.getHzSql().getPojo());
					copyDatas += createStr("formconfig","card",jsonString)+"\n";
					//qzsql
					jsonString = createJson(sysFormButtonCache.getQzSql().getPojo());
					copyDatas += createStr("formconfig","card",jsonString)+"\n";
					//button
					if("save_form".equals(sysFormButtonCache.getFormButtonType())||"free_submit".equals(sysFormButtonCache.getFormButtonType())||"save".equals(sysFormButtonCache.getFormButtonType())||"select".equals(sysFormButtonCache.getFormButtonType())||"other".equals(sysFormButtonCache.getFormButtonType())){
						jsonString = createJson(((SysFormButtonSaveCache)sysFormButtonCache.getButtonExt()).getPojo());
						copyDatas += createStr("formconfig","card",jsonString)+"\n";
					} else if ("executeSQL".equals(sysFormButtonCache.getFormButtonType())) {
						jsonString = createJson(((SysFormGeneralExecSqlCache)sysFormButtonCache.getButtonExt()).getPojo());
						copyDatas += createStr("formconfig","card",jsonString)+"\n";
					}
				}
				copyDatas += "<endCopyDatas>\n";
			}else if(formCache.getPojoform().getFormDefLayoutType().equals("2")){
				
			}
			
			File f = new File("C:/test.json");
			if (f.exists()) {  
				System.out.print("文件存在");  
			} else {  
				System.out.print("文件不存在");  
				f.createNewFile();// 不存在则创建
			}
			OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(f),"utf-8");
			BufferedWriter output=new BufferedWriter(write);
			output.write(copyDatas);
			output.close(); 
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	//卡片表单复制
	@RequestMapping("/readDatas")
	public @ResponseBody Object readDatas(HttpServletRequest request) throws Exception {
		File file = new File("C:/test.json");
        BufferedReader bufReader = null;
        BufferedWriter bufWriter = null;
        SysFormconfigCache formCache = new SysFormconfigCache();
        try {
            // FileReader:用来读取字符文件的便捷类。
        	FileInputStream fis = new FileInputStream(file);
        	InputStreamReader isr = new InputStreamReader(fis,"UTF-8"); //指定以UTF-8编码读入
            bufReader = new BufferedReader(isr);
            // buf = new BufferedReader(new InputStreamReader(new
            // FileInputStream(file)));
            String temp = null;
            String data = "";
            String[] datas = new String[10];
            int i = 0;
			int j = 0;
			int x = 0;
			int buttonNum = 0;
			int nodeNum = 0;
			int solumnColumnN = 0;
			SysTreeNodeTypeCache nodeCache = new SysTreeNodeTypeCache();
			SysFormTreeSolutionColumnCache solutionColumn = new SysFormTreeSolutionColumnCache();
            String flag = "";

			List<SysTreeNodeTypeCache> nodeTypeCaches = new ArrayList<SysTreeNodeTypeCache>();//树节点
			List<SysFormTreeSolutionColumnCache> solutionColumns = new ArrayList<SysFormTreeSolutionColumnCache>();//树方案关联字段

			List<SysFormColumnCache> columnCaches = new ArrayList<SysFormColumnCache>();//卡片表单字段集合

//			SysFormColumnCache columnCache = new SysFormColumnCache();
			SysFormGroupCache groupCache = new SysFormGroupCache();
//			SysFormColumnCache groupColumnCache = new SysFormColumnCache();
			Map groupMap = new HashMap();
			Map freeColumnMap = new HashMap();
			Map buttonMap = new HashMap();
//			SysFormButtonCache buttonCache = new SysFormButtonCache();
			String[] textData = new String[2];
			boolean tbFlag = false;
			
			String[] flags = new String[3];
			boolean groupStatu = true;
			int groupNum = 0;
            while ((temp = bufReader.readLine()) != null) {
            	
                if (temp.indexOf("<startCopyDatas>")>-1) {
                	data = "";
                	flags = temp.split("\\|");
                	groupStatu = true;
                	if(flags[2].equals("group")){
                		groupCache = new SysFormGroupCache();
                		groupNum++;
                	}
				} else if(temp.indexOf("<endCopyDatas>")>-1){
					datas[i] = data;
					i++;
					if(flags[2].equals("group")){
                		formCache.groups.add(groupCache);
                		i--;
                	}
				}else {
					JSONObject jsonobject = new JSONObject();
					try {
						jsonobject = JSONObject.fromObject(temp);
					} catch (Exception e) {
						// TODO: handle exception
					}
					//卡片表单
					if (i==0) {
						SysFormconfigWithBLOBs form = (SysFormconfigWithBLOBs)JSONObject.toBean(jsonobject,SysFormconfigWithBLOBs.class);
						formCache.setPojoform(form);
					}else if (i==1) {
						if (flags[2].equals("group")) {
							if(groupStatu){
								SysFormGroup group = (SysFormGroup)JSONObject.toBean(jsonobject,SysFormGroup.class);
								groupCache.setPojo(group);
								groupStatu = false;
							}else{
								if (j==0) {
			                		SysFormColumnCache groupColumnCache = new SysFormColumnCache();
									SysFormColumn column = new SysFormColumn();
									column = (SysFormColumn)JSONObject.toBean(jsonobject,SysFormColumn.class);
									groupColumnCache.setPojo(column);
			                		groupMap.put("group_"+groupNum,groupColumnCache);
									j = 1;
								} else if (j==1) {
									SysFormColumnCache groupColumnCache = (SysFormColumnCache) groupMap.get("group_"+groupNum);
									SysFormColumn column = groupColumnCache.getPojo();
									if("1".equals(column.getFormColumnGuiType())||"8".equals(column.getFormColumnGuiType())){ //textbox控件
										SysTextBoxCache tCache = new SysTextBoxCache();
										groupColumnCache.setFormColumGui(tCache);
										((SysTextBoxCache)groupColumnCache.getFormColumGui()).setPojo((SysFormTextbox)JSONObject.toBean(jsonobject,SysFormTextbox.class));
										j = 2;
									}else if("2".equals(column.getFormColumnGuiType())){ //单选下拉控件
										SysFormComboboxCache comboboxCache = new SysFormComboboxCache();
										groupColumnCache.setFormColumGui(comboboxCache);
										((SysFormComboboxCache)groupColumnCache.getFormColumGui()).setPojo((SysFormCombobox)JSONObject.toBean(jsonobject,SysFormCombobox.class));
										j = 2;
									}else if("3".equals(column.getFormColumnGuiType())){ //单选框组
										groupColumnCache.setFormColumGui((SysFormRadiobuttonlistCache)JSONObject.toBean(jsonobject,SysFormRadiobuttonlistCache.class));
									}else if("4".equals(column.getFormColumnGuiType())){ //复选框组
										groupColumnCache.setFormColumGui((SysFormRadiobuttonlistCache)JSONObject.toBean(jsonobject,SysFormRadiobuttonlistCache.class));
									}/*else if("5".equals(this.getFormColumnGuiType())){
										this.formColumGui = new SysFormCheckboxCache(this.formColumnId+"");
									}*/else if("6".equals(column.getFormColumnGuiType())){
										SysDatepickerCache datepickerCache = new SysDatepickerCache();
										SysFormDatepicker datepicker = (SysFormDatepicker)JSONObject.toBean(jsonobject,SysFormDatepicker.class);
										groupColumnCache.setFormColumGui(datepickerCache);
										((SysDatepickerCache)groupColumnCache.getFormColumGui()).setPojo(datepicker);
										j = 2;
									}else if("7".equals(column.getFormColumnGuiType())){
										groupColumnCache.setFormColumGui((SysFormLookupCache)JSONObject.toBean(jsonobject,SysFormLookupCache.class));
									}/*else if("8".equals(column.getFormColumnGuiType())){
										groupColumnCache.setField((SysField)JSONObject.toBean(jsonobject,SysField.class));
										j = 3;
									}*/else if("10".equals(column.getFormColumnGuiType())){ //富文本
										groupColumnCache.setFormColumGui((SysFormRichtextCache)JSONObject.toBean(jsonobject,SysFormRichtextCache.class));
									}else if("9".equals(column.getFormColumnGuiType())){
										groupColumnCache.setFormColumGui((SysFormFileuploadCache)JSONObject.toBean(jsonobject,SysFormFileuploadCache.class));
									}
									groupMap.put("group_"+groupNum,groupColumnCache);
								}else if (j==2) {
									SysFormColumnCache groupColumnCache = (SysFormColumnCache) groupMap.get("group_"+groupNum);
									groupColumnCache.setField((SysField)JSONObject.toBean(jsonobject,SysField.class));
									j = 3;
									groupMap.put("group_"+groupNum,groupColumnCache);
								}else if (j==3) {
									SysFormColumnCache groupColumnCache = (SysFormColumnCache) groupMap.get("group_"+groupNum);
									groupColumnCache.setEntity((SysEntity)JSONObject.toBean(jsonobject,SysEntity.class));
									groupCache.getColumns().add(groupColumnCache);
									j = 0;
								}
							}
						} else if(flags[2].equals("free")){
							if (j==0) {
								SysFormColumnCache columnCache = new SysFormColumnCache();
								SysFormColumn column = new SysFormColumn();
								column = (SysFormColumn)JSONObject.toBean(jsonobject,SysFormColumn.class);
								columnCache.setPojo(column);
								j = 1;
								freeColumnMap.put("Free", columnCache);
							} else if (j==1) {
								SysFormColumnCache columnCache = (SysFormColumnCache) freeColumnMap.get("Free");
								SysFormColumn column = columnCache.getPojo();
								if("1".equals(column.getFormColumnGuiType())||"8".equals(column.getFormColumnGuiType())){ //textbox控件

									SysTextBoxCache tCache = new SysTextBoxCache();
									columnCache.setFormColumGui(tCache);
									((SysTextBoxCache)columnCache.getFormColumGui()).setPojo((SysFormTextbox)JSONObject.toBean(jsonobject,SysFormTextbox.class));
									j = 2;
								}else if("2".equals(column.getFormColumnGuiType())){ //单选下拉控件
									SysFormComboboxCache comboboxCache = new SysFormComboboxCache();
									columnCache.setFormColumGui(comboboxCache);
									((SysFormComboboxCache)columnCache.getFormColumGui()).setPojo((SysFormCombobox)JSONObject.toBean(jsonobject,SysFormCombobox.class));
									j = 2;
								}else if("3".equals(column.getFormColumnGuiType())){ //单选框组
									columnCache.setFormColumGui((SysFormRadiobuttonlistCache)JSONObject.toBean(jsonobject,SysFormRadiobuttonlistCache.class));
								}else if("4".equals(column.getFormColumnGuiType())){ //复选框组
									columnCache.setFormColumGui((SysFormRadiobuttonlistCache)JSONObject.toBean(jsonobject,SysFormRadiobuttonlistCache.class));
								}/*else if("5".equals(this.getFormColumnGuiType())){
									this.formColumGui = new SysFormCheckboxCache(this.formColumnId+"");
								}*/else if("6".equals(column.getFormColumnGuiType())){
									SysDatepickerCache datepickerCache = new SysDatepickerCache();
									columnCache.setFormColumGui(datepickerCache);
									((SysDatepickerCache)columnCache.getFormColumGui()).setPojo((SysFormDatepicker)JSONObject.toBean(jsonobject,SysFormDatepicker.class));
									j = 2;
								}else if("7".equals(column.getFormColumnGuiType())){
									columnCache.setFormColumGui((SysFormLookupCache)JSONObject.toBean(jsonobject,SysFormLookupCache.class));
								}else if("10".equals(column.getFormColumnGuiType())){ //富文本
									columnCache.setFormColumGui((SysFormRichtextCache)JSONObject.toBean(jsonobject,SysFormRichtextCache.class));
								}else if("9".equals(column.getFormColumnGuiType())){
									columnCache.setFormColumGui((SysFormFileuploadCache)JSONObject.toBean(jsonobject,SysFormFileuploadCache.class));
								}
								freeColumnMap.put("Free", columnCache);
							}else if (j==2) {
								SysFormColumnCache columnCache = (SysFormColumnCache) freeColumnMap.get("Free");
								columnCache.setField((SysField)JSONObject.toBean(jsonobject,SysField.class));
								j = 3;
								freeColumnMap.put("Free", columnCache);
							}else if (j==3) {
								SysFormColumnCache columnCache = (SysFormColumnCache) freeColumnMap.get("Free");
								columnCache.setEntity((SysEntity)JSONObject.toBean(jsonobject,SysEntity.class));
								formCache.getFree().add(columnCache);
								j = 0;
							}
						}
					}else if (i==2) {
						SysFormWhereCache whereCache = new SysFormWhereCache();
						whereCache.setPojo((SysFormWhere)JSONObject.toBean(jsonobject,SysFormWhere.class));
						formCache.getWheres().add(whereCache);
					}else if (i==3) {
						if (buttonNum==0) {
							SysFormButtonCache buttonCache = new SysFormButtonCache();
							buttonCache.setPojo((SysFormButton)JSONObject.toBean(jsonobject,SysFormButton.class));
							buttonNum = 1;
							buttonMap.put("BUTTON", buttonCache);
						}else if (buttonNum==1) {
							buttonNum = 2;
						}else if (buttonNum==2) {
							SysFormButtonCache buttonCache = (SysFormButtonCache) buttonMap.get("BUTTON");
							SysFormGeneralExecSqlCache gCache = new SysFormGeneralExecSqlCache();
							gCache.setPojo((SysExecSql)JSONObject.toBean(jsonobject,SysExecSql.class));
							buttonCache.setHzql(gCache);
							buttonNum = 3;
							buttonMap.put("BUTTON", buttonCache);
						}else if (buttonNum==3) {
							SysFormButtonCache buttonCache = (SysFormButtonCache) buttonMap.get("BUTTON");
							SysFormGeneralExecSqlCache gCache = new SysFormGeneralExecSqlCache();
							gCache.setPojo((SysExecSql)JSONObject.toBean(jsonobject,SysExecSql.class));
							buttonCache.setQzql(gCache);
							buttonNum = 4;
							if ("close".equals(buttonCache.getPojo().getFormButtonType())) {
								formCache.getButtons().add(buttonCache);
								buttonNum = 0;
							}
							buttonMap.put("BUTTON", buttonCache);
						}else if (buttonNum == 4) {
							SysFormButtonCache buttonCache = (SysFormButtonCache) buttonMap.get("BUTTON");
							if("save_form".equals(buttonCache.getPojo().getFormButtonType())||"free_submit".equals(buttonCache.getPojo().getFormButtonType())||"save".equals(buttonCache.getPojo().getFormButtonType())||"select".equals(buttonCache.getPojo().getFormButtonType())||"other".equals(buttonCache.getPojo().getFormButtonType())){
								SysFormButtonSaveCache saveCache = new SysFormButtonSaveCache();
								saveCache.setThisByDataObject((SysFormButtonSave)JSONObject.toBean(jsonobject,SysFormButtonSave.class));
								buttonCache.setButtonExt(saveCache);
							} else if ("executeSQL".equals(buttonCache.getPojo().getFormButtonType())) {
								SysFormGeneralExecSqlCache gCache = new SysFormGeneralExecSqlCache();
								gCache.setPojo((SysExecSql)JSONObject.toBean(jsonobject,SysExecSql.class));
								buttonCache.setButtonExt(gCache);
							} 
							formCache.getButtons().add(buttonCache);
							buttonNum = 0;
						}
					}
				}
            }
            Map map = new HashMap();
            formCopy.importantCardDatas(formCache,map);
        } catch (Exception e) {
        	e.getMessage();
            logger.info(e.getMessage());
        }
        return null;
	}
	
	
	
}
