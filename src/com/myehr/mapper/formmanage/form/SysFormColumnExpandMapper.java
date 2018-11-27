package com.myehr.mapper.formmanage.form;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.myehr.pojo.formmanage.form.SysFormColumn;

public interface SysFormColumnExpandMapper {
   

    SysFormColumn selectPkColumn(BigDecimal formId);
    
    List<SysFormColumn> operation(Map<String,Object> map);
    
   
    /**
     * 通过表单ID获取所有字段对象
     * @param formId
     * @return
     */
    List<SysFormColumn> queryColumnsByFormId(@Param(value = "formId") String formId);
    
    /**
     * 通过表单ID获取所有字段对象
     * @param formId
     * @return
     */
    List<SysFormColumn> queryColumnsByFormIdAndUserId(@Param(value = "formId") String formId,@Param(value = "userId") String userId);
    
    /**
     * 通过表单ID获取所有字段对象
     * @param formId
     * @return
     */
    List<SysFormColumn> queryColumnsByFormIdAndUserIdAll(@Param(value = "formId") String formId,@Param(value = "userId") String userId);
    
    /**
     * 通过表单ID获取所有字段对象
     * @param formId
     * @return
     */
    List<SysFormColumn> queryColumnsByFormIdAndUserId1(@Param(value = "formId") String formId,@Param(value = "userId") String userId);
    
    
    @SuppressWarnings("unchecked")
	Map queryEntityColumnByColumnId(Map map);
    
    /**
     * 判断是否是主键
     * @param params
     * @return
     */
    @SuppressWarnings("unchecked")
	List<Map> isPkColumn(Map<String,String> params);
    
    
    /**
     * 判断是否是业务主键
     * @param params
     * @return
     */
    @SuppressWarnings("unchecked")
	List<Map> isBusPkColumn(Map<String,String> params);

	List<SysFormColumn> queryImportColumnsByFormIdAndUserId(@Param(value = "formId") String formId,@Param(value = "userId") String userId);
    
}