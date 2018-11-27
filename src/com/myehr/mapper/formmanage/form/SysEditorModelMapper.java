package com.myehr.mapper.formmanage.form;

import com.myehr.pojo.formmanage.form.SysEditorModel;
import com.myehr.pojo.formmanage.form.SysEditorModelExample;
import com.myehr.pojo.formmanage.form.SysEditorModelWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEditorModelMapper {
    int countByExample(SysEditorModelExample example);

    int deleteByExample(SysEditorModelExample example);

    int deleteByPrimaryKey(Long editorModelId);

    int insert(SysEditorModelWithBLOBs record);

    int insertSelective(SysEditorModelWithBLOBs record);

    List<SysEditorModelWithBLOBs> selectByExampleWithBLOBs(SysEditorModelExample example);

    List<SysEditorModel> selectByExample(SysEditorModelExample example);

    SysEditorModelWithBLOBs selectByPrimaryKey(Long editorModelId);

    int updateByExampleSelective(@Param("record") SysEditorModelWithBLOBs record, @Param("example") SysEditorModelExample example);

    int updateByExampleWithBLOBs(@Param("record") SysEditorModelWithBLOBs record, @Param("example") SysEditorModelExample example);

    int updateByExample(@Param("record") SysEditorModel record, @Param("example") SysEditorModelExample example);

    int updateByPrimaryKeySelective(SysEditorModelWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysEditorModelWithBLOBs record);

    int updateByPrimaryKey(SysEditorModel record);
}