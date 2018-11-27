package com.myehr.mapper.field;

import com.myehr.pojo.field.SysField;
import com.myehr.pojo.field.SysFieldExpand;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFieldExpandMapper {

    /**
     * 通过实体ID获取所有字段对象
     * @param entityId
     * @return
     */
    List<SysField> queryFieldByEntityId(@Param(value = "entityId") String entityId);
    
    /**
     * 通过实体ID获取所有字段对象及实体编码
     * @param entityId
     * @return
     */
    List<SysFieldExpand> queryExportFieldByEntityId(@Param(value = "entityId") String entityId);
    
    /**
     * 获取所有字段对象及实体编码
     * @return
     */
    List<SysFieldExpand> queryAllExportField(@Param(value = "entityCodes") String entityCodes);
}