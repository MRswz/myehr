package com.myehr.pojo.formmanage.cache;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.myehr.common.util.SpringContextUtils;
import com.myehr.pojo.formmanage.form.SysTreeSolution;
import com.myehr.pojo.formmanage.form.SysTreeSolutionColumn;
import com.myehr.service.formmanage.form.ISysFormTreeService;

public class SysFormTreeSolutionCache implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		//主键
		private SysTreeSolution treeSolution ;
		
		public SysTreeSolution getTreeSolution() {
			return treeSolution;
		}
		private List<SysFormTreeSolutionColumnCache> columns = new ArrayList<SysFormTreeSolutionColumnCache>();
		
//		 参数集合
		private List<String[]> params = new ArrayList<String[]>(); ;
		
		public String getOperatorName() {
			return treeSolution.getOperatorName();
		}

		public Date getOperatorTime() {
			return treeSolution.getOperatorTime();
		}

		public String getTreeSolutionCode() {
			return treeSolution.getTreeSolutionCode();
		}
		
		public String getTreeSolutionEntitySql() {
			return treeSolution.getTreeSolutionEntitySql();
		}

		public String getTreeSolutionExcSql() {
			return treeSolution.getTreeSolutionExcSql();
		}

		public BigDecimal getTreeSolutionId() {
			return treeSolution.getTreeSolutionId();
		}

		public String getTreeSolutionName() {
			return treeSolution.getTreeSolutionName();
		}

		public List<String[]> getParams() {
			return params;
		}

		public void setParams(List<String[]> params) {
			this.params = params;
		}

		public List<SysFormTreeSolutionColumnCache> getColumns() {
			return columns;
		}

		public void setColumns(List<SysFormTreeSolutionColumnCache> columns) {
			this.columns = columns;
		}

		/**
		 * 空的构造函数
		 *
		 */
		public SysFormTreeSolutionCache(){};
		
		/**
		 * 构造函数 
		 * @throws Exception 
		 */
		public SysFormTreeSolutionCache(String treeSolutionId) throws Exception{
			ISysFormTreeService service = (ISysFormTreeService)SpringContextUtils.getBeanById("ISysFormTreeService");			
			SysTreeSolution obj = service.queryFormTreeSolutionById(new BigDecimal(treeSolutionId));
			if(obj==null){
				return ;
			}
			this.setSysTreeSolution(obj);
			SqlUtil.dealTreeSolutionParam(params, this.getTreeSolutionEntitySql());
			//查询字表字段数据
			List<SysTreeSolutionColumn> objs = service.queryTreeSolutionColumnBySolutionId(new BigDecimal(treeSolutionId));
			if(objs!=null){
				for(SysTreeSolutionColumn temp:objs){
					SysFormTreeSolutionColumnCache c = new SysFormTreeSolutionColumnCache(temp); 
					columns.add(c);
				}
			}
		}
		
		/**
		 * 
		 * @return
		 */
		public String getTreeRealType(String type){
			if("nodeId".equals(type)){
				for(int i=0; i<this.columns.size(); i++){
					if("nodeId".equals(columns.get(i).getPojo().getTreeColumnType())){
						return columns.get(i).getPojo().getTreeFieldTablename();
					}
				}
			}
			if("nodeName".equals(type)){
				for(int i=0; i<this.columns.size(); i++){
					if("nodeName".equals(columns.get(i).getPojo().getTreeColumnType())){
						return columns.get(i).getPojo().getTreeFieldTablename();
					}
				}
			}
			if("nodeParent".equals(type)){
				for(int i=0; i<this.columns.size(); i++){
					if("nodeParent".equals(columns.get(i).getPojo().getTreeColumnType())){
						return columns.get(i).getPojo().getTreeFieldTablename();
					}
				}
			}
			if("nodeType".equals(type)){
				for(int i=0; i<this.columns.size(); i++){
					if("nodeType".equals(columns.get(i).getPojo().getTreeColumnType())){
						return columns.get(i).getPojo().getTreeFieldTablename();
					}
				}
			}
			return "";
		}
		
		
		
		
		
		/**
		 * DataObject填充对象
		 * 
		 * @param obj
		 */
		public void setSysTreeSolution(SysTreeSolution obj) {
			this.treeSolution = obj;
		
		}
}