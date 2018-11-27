package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.button.QSysformCalculateSolution;
import com.myehr.pojo.formmanage.form.SysRuleWithBLOBs;
import com.myehr.pojo.formmanage.form.SysSolution;
import com.myehr.service.scheme.ISchemeService;

/**
 * 公式类
 * @author Administrator
 *
 */
public class SysSolutionCache implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private SysSolution pojo;
	/*//方案ID
	private long solutionId;
	
	//方案编码
	private String solutionCode;
	
	//方案名称
	private String solutionName;
	
	//排序 
	private long sort;*/
	
	//关联方案对象
	private List<SysRuleCache> rules = new ArrayList<SysRuleCache>();

	public List<SysRuleCache> getRules() {
		return rules;
	}

	public void setRules(List<SysRuleCache> rules) {
		this.rules = rules;
	}

	public String getSolutionCode() {
		return pojo.getSolutionCode();
	}

	public long getSolutionId() {
		return pojo.getSolutionId();
	}

	public String getSolutionName() {
		return pojo.getSolutionName();
	}

	public long getSort() {
		return Long.parseLong(pojo.getSolutionSort());
	}
	
	/**
	 * 空的构造函数
	 *
	 */
	public SysSolutionCache(){};
	
	/**
	 * 造函数通过方案ID
	 *
	 */
	public SysSolutionCache(long solutionId) throws Exception{
		/*ISchemeService service = (ISchemeService)ApplicationContextFactory.getContext().getBean("SchemeServiceBean");
		Map obj = service.querySolutionBySolutionId(solutionId);
		setThisByDataObject(obj);
		//加载对应的公式
		List<Map> ruless = service.queryRuleBySolutionId(solutionId+"", null, null, null, null);
		for(int i=0; i<ruless.size(); i++){
			rules.add(new SysRuleCache(ruless.get(i),this));
		}*/
	}
	
	/**
	 * 造函数通过方案ID
	 *
	 */
	public SysSolutionCache(QSysformCalculateSolution sobj) {
		setThisByDataObject(sobj);
		ISchemeService service = (ISchemeService)SpringContextUtils.getBeanById("ISchemeService");
		//ISchemeService service = (ISchemeService)ApplicationContextFactory.getContext().getBean("SchemeServiceBean");
		//加载对应的公式
		List<SysRuleWithBLOBs> ruless = service.queryRuleBySolutionId(this.getSolutionId()+"", null, null, null, null);
		for(int i=0; i<ruless.size(); i++){
			rules.add(new SysRuleCache(ruless.get(i),this));
		}
	}
	

	/**
	 * DataObject 填充对象
	 * @param obj
	 */
	private void setThisByDataObject(QSysformCalculateSolution obj){
		if(this.pojo == null){
			this.pojo = new SysSolution();
		}
		this.pojo.setSolutionCode(obj.getSolutionCode());
		this.pojo.setSolutionName(obj.getSolutionName());
		this.pojo.setSolutionId(obj.getSolutionId().longValue());
		this.pojo.setSolutionSort(obj.getSort().toBigInteger()+"");
	}
}
