package com.myehr.mapper.sysuser;

import com.myehr.pojo.sysuser.EmpVEmp1basic;
import com.myehr.pojo.sysuser.EmpVEmp1basicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpVEmp1basicMapper {
    int countByExample(EmpVEmp1basicExample example);

    int deleteByExample(EmpVEmp1basicExample example);

    int insert(EmpVEmp1basic record);

    int insertSelective(EmpVEmp1basic record);

    List<EmpVEmp1basic> selectByExample(EmpVEmp1basicExample example);

    int updateByExampleSelective(@Param("record") EmpVEmp1basic record, @Param("example") EmpVEmp1basicExample example);

    int updateByExample(@Param("record") EmpVEmp1basic record, @Param("example") EmpVEmp1basicExample example);
}