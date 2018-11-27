package com.myehr.mapper.datafield;

import com.myehr.pojo.datafield.Datafield;
import com.myehr.pojo.datafield.DatafieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DatafieldMapper {
    int countByExample(DatafieldExample example);

    int deleteByExample(DatafieldExample example);

    int deleteByPrimaryKey(Long dtId);

    int insert(Datafield record);

    int insertSelective(Datafield record);

    List<Datafield> selectByExample(DatafieldExample example);

    Datafield selectByPrimaryKey(Long dtId);

    int updateByExampleSelective(@Param("record") Datafield record, @Param("example") DatafieldExample example);

    int updateByExample(@Param("record") Datafield record, @Param("example") DatafieldExample example);

    int updateByPrimaryKeySelective(Datafield record);

    int updateByPrimaryKey(Datafield record);
}