package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysTreeNodeType;
import com.myehr.pojo.formmanage.form.SysTreeNodeTypeExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysTreeNodeTypeMapper {
    int countByExample(SysTreeNodeTypeExample example);

    int deleteByExample(SysTreeNodeTypeExample example);

    int deleteByPrimaryKey(BigDecimal treeNodeTypeId);

    int insert(SysTreeNodeType record);

    int insertSelective(SysTreeNodeType record);

    List<SysTreeNodeType> selectByExample(SysTreeNodeTypeExample example);

    SysTreeNodeType selectByPrimaryKey(BigDecimal treeNodeTypeId);

    int updateByExampleSelective(@Param("record") SysTreeNodeType record, @Param("example") SysTreeNodeTypeExample example);

    int updateByExample(@Param("record") SysTreeNodeType record, @Param("example") SysTreeNodeTypeExample example);

    int updateByPrimaryKeySelective(SysTreeNodeType record);

    int updateByPrimaryKey(SysTreeNodeType record);
}