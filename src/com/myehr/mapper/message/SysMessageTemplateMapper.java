package com.myehr.mapper.message;

import com.myehr.pojo.message.SysMessageTemplate;
import com.myehr.pojo.message.SysMessageTemplateExample;
import com.myehr.pojo.message.SysMessageTemplateWithBLOBs;
import java.util.List;

import javax.mail.MailSessionDefinition;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
@Service
public interface SysMessageTemplateMapper {
    int countByExample(SysMessageTemplateExample example);

    int deleteByExample(SysMessageTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysMessageTemplateWithBLOBs record);

    int insertSelective(SysMessageTemplateWithBLOBs record);

    List<SysMessageTemplateWithBLOBs> selectByExampleWithBLOBs(SysMessageTemplateExample example);

    List<SysMessageTemplate> selectByExample(SysMessageTemplateExample example);

    SysMessageTemplateWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysMessageTemplateWithBLOBs record, @Param("example") SysMessageTemplateExample example);

    int updateByExampleWithBLOBs(@Param("record") SysMessageTemplateWithBLOBs record, @Param("example") SysMessageTemplateExample example);

    int updateByExample(@Param("record") SysMessageTemplate record, @Param("example") SysMessageTemplateExample example);

    int updateByPrimaryKeySelective(SysMessageTemplateWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysMessageTemplateWithBLOBs record);

    int updateByPrimaryKey(SysMessageTemplate record);
}