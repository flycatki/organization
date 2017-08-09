package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsOrganizationMapper {
    long countByExample(UpmsOrganizationExample example);

    int deleteByExample(UpmsOrganizationExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(UpmsOrganization record);

    int insertSelective(UpmsOrganization record);

    List<UpmsOrganization> selectByExample(UpmsOrganizationExample example);

    UpmsOrganization selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") UpmsOrganization record, @Param("example") UpmsOrganizationExample example);

    int updateByExample(@Param("record") UpmsOrganization record, @Param("example") UpmsOrganizationExample example);

    int updateByPrimaryKeySelective(UpmsOrganization record);

    int updateByPrimaryKey(UpmsOrganization record);
}