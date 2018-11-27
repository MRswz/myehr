package com.myehr.mapper.act.checked;

import com.myehr.pojo.act.checked.ModelNodeSeq;
import com.myehr.pojo.act.checked.ModelNodeSeqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelNodeSeqMapper {
    int countByExample(ModelNodeSeqExample example);

    int deleteByExample(ModelNodeSeqExample example);

    int deleteByPrimaryKey(Long modelNodeSeqId);

    int insert(ModelNodeSeq record);

    int insertSelective(ModelNodeSeq record);

    List<ModelNodeSeq> selectByExample(ModelNodeSeqExample example);

    ModelNodeSeq selectByPrimaryKey(Long modelNodeSeqId);

    int updateByExampleSelective(@Param("record") ModelNodeSeq record, @Param("example") ModelNodeSeqExample example);

    int updateByExample(@Param("record") ModelNodeSeq record, @Param("example") ModelNodeSeqExample example);

    int updateByPrimaryKeySelective(ModelNodeSeq record);

    int updateByPrimaryKey(ModelNodeSeq record);
}