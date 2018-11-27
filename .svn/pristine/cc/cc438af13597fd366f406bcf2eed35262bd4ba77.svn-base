package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.SysFormButtonEditor;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorExample;
import com.myehr.pojo.formmanage.button.SysFormButtonEditorWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFormButtonEditorMapper {
    int countByExample(SysFormButtonEditorExample example);

    int deleteByExample(SysFormButtonEditorExample example);

    int deleteByPrimaryKey(Long buttonEditorModelId);

    int insert(SysFormButtonEditorWithBLOBs record);

    int insertSelective(SysFormButtonEditorWithBLOBs record);

    List<SysFormButtonEditorWithBLOBs> selectByExampleWithBLOBs(SysFormButtonEditorExample example);

    List<SysFormButtonEditor> selectByExample(SysFormButtonEditorExample example);

    SysFormButtonEditorWithBLOBs selectByPrimaryKey(Long buttonEditorModelId);

    int updateByExampleSelective(@Param("record") SysFormButtonEditorWithBLOBs record, @Param("example") SysFormButtonEditorExample example);

    int updateByExampleWithBLOBs(@Param("record") SysFormButtonEditorWithBLOBs record, @Param("example") SysFormButtonEditorExample example);

    int updateByExample(@Param("record") SysFormButtonEditor record, @Param("example") SysFormButtonEditorExample example);

    int updateByPrimaryKeySelective(SysFormButtonEditorWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysFormButtonEditorWithBLOBs record);

    int updateByPrimaryKey(SysFormButtonEditor record);
}