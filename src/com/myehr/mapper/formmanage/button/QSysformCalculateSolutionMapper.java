package com.myehr.mapper.formmanage.button;

import com.myehr.pojo.formmanage.button.QSysformCalculateSolution;
import com.myehr.pojo.formmanage.button.QSysformCalculateSolutionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QSysformCalculateSolutionMapper {
    int countByExample(QSysformCalculateSolutionExample example);

    int deleteByExample(QSysformCalculateSolutionExample example);

    int insert(QSysformCalculateSolution record);

    int insertSelective(QSysformCalculateSolution record);

    List<QSysformCalculateSolution> selectByExample(QSysformCalculateSolutionExample example);

    int updateByExampleSelective(@Param("record") QSysformCalculateSolution record, @Param("example") QSysformCalculateSolutionExample example);

    int updateByExample(@Param("record") QSysformCalculateSolution record, @Param("example") QSysformCalculateSolutionExample example);
}