package com.myehr.pojo.formmanage.formCopy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.QSysformCalculateSolution;
import com.myehr.pojo.formmanage.button.SysFormButtonCalculate;
import com.myehr.service.formmanage.form.IButtonService;

public class SysFormButtonCalculateCacheCopy implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysFormButtonCalculate pojo;

    public BigDecimal getCalculateId() {
        return pojo.getCalculateId();
    }

    public BigDecimal getCalculateButtonId() {
        return pojo.getCalculateButtonId();
    }

    public BigDecimal getCalculateRowCount() {
        return  pojo.getCalculateRowCount();
    }


    public String getCalculateWinTitle() {
        return  pojo.getCalculateWinTitle();
    }

    
    public String getCalculateWinHeight() {
        return  pojo.getCalculateWinHeight();
    }

  

    public String getCalculateWinWidth() {
        return  pojo.getCalculateWinWidth();
    }

    

    public String getOperatorName() {
        return  pojo.getOperatorName();
    }

    public Date getOperatorTime() {
        return pojo.getOperatorTime();
    }
	
	private List<SysSolutionCacheCopy> solutions = new ArrayList<SysSolutionCacheCopy>();
	
	private boolean isSelectionCheck = false;
	
	private List<String[]> params = new ArrayList<String[]>();
	
	public boolean isSelectionCheck() {
		return isSelectionCheck;
	}

	public void setSelectionCheck(boolean isSelectionCheck) {
		this.isSelectionCheck = isSelectionCheck;
	}

	public List<String[]> getParams() {
		return params;
	}

	public void setParams(List<String[]> params) {
		this.params = params;
	}

	public List<SysSolutionCacheCopy> getSolutions() {
		return solutions;
	}

	public void setSolutions(List<SysSolutionCacheCopy> solutions) {
		this.solutions = solutions;
	}
    
    public SysFormButtonCalculateCacheCopy(){};
    
    public SysFormButtonCalculateCacheCopy(SysFormButtonCalculate obj,SysFormButtonCacheCopy button){
		//填充对象
		this.pojo  = obj;
		//solutions
		IButtonService service = (IButtonService)SpringContextUtils.getBeanById("IButtonService");
		List<QSysformCalculateSolution>  objs = service.queryCalculateSoluton(this.getCalculateId()+""); 
		for( int i=0; i<objs.size(); i++){
			this.solutions.add(new SysSolutionCacheCopy(objs.get(i)));
		}
		
		initParams();
    }
    
	private void initParams(){
		for(SysSolutionCacheCopy solution:solutions){
			List<SysRuleCacheCopy> rules = solution.getRules();
			for(SysRuleCacheCopy rule:rules){
				List<String[]> params = rule.getParams();
				for(String[] param:params){
					if(!exists(this.params, param)){
						this.params.add(param);
					}
				}
			}
		}
		
		for(String[] param:this.params){
			if(param[0].equals("c")){
				isSelectionCheck = true;
				break;
			}
		}
	}
	
	private boolean exists(List<String[]> list, String[] a){
		for(String[] temp:list){
			if(a[0].equals(temp[0]) && a[1].equals(temp[1])){
				return true;
			}
		}
		return false;
	}
	

	/**
	 * 计算页面接收计算按钮传递过来的参数
	 * @return
	 */
	public String getRecvRequestParamsStr(HttpServletRequest request,String resType){
		List<String[]> params = this.getParams();
		String temp = "";
		if("get".equals(resType)){
			for(String[] param:params){
				if("c".equals(param[0])){
					String value = request.getParameter("c_" + param[1].substring(param[1].indexOf("_")+1));
					value = value==null?"":value;
					temp += "&c_" + param[1].substring(param[1].indexOf("_")+1)+"="+value;
				} else if("s".equals(param[0])){
					String value = request.getParameter("s_" + param[1]);
					value = value==""?null:value;
					temp += "&s_" + param[1]+"="+value;
				} else if("r".equals(param[0])){
					
					String value = request.getParameter("r_" + param[1]);
					value = value==""?null:value;
					temp += "&r_" + param[1]+"="+value;
				}
			}
		}
		if("json".equals(resType)){
			temp += "{";
			for(String[] param:params){
				if("c".equals(param[0])){
					String value = request.getParameter("c_" + param[1].substring(param[1].indexOf("_")+1));
					value = value==null?null:"\""+value+"\"";
					temp += "c_" + param[1].substring(param[1].indexOf("_")+1)+":"+value;
				} else if("s".equals(param[0])){
					String value = request.getParameter("s_" + param[1]);
					value = value==null?null:"\""+value;
					temp += "s_" + param[1]+":"+value+"\",";
				} else if("r".equals(param[0])){
					
					String value = request.getParameter("r_" + param[1]);
					value = value==null?null:"\""+value+"\",";
					temp += "r_" + param[1]+":"+value;
				}
			}
			if(temp.length()>1){
				temp = temp.substring(0,temp.length());
			}
			temp += "}";
		}
		
		return temp;
	}
    
    
}