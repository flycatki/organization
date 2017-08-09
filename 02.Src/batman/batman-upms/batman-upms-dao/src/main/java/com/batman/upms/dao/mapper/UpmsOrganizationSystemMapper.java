package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsOrganizationSystem;
import com.batman.upms.dao.model.UpmsOrganizationSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsOrganizationSystemMapper {
    long countByExample(UpmsOrganizationSystemExample example);

    int deleteByExample(UpmsOrganizationSystemExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(UpmsOrganizationSystem record);

    int insertSelective(UpmsOrganizationSystem record);

    List<UpmsOrganizationSystem> selectByExample(UpmsOrganizationSystemExample example);

    UpmsOrganizationSystem selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") UpmsOrganizationSystem record, @Param("example") UpmsOrganizationSystemExample example);

    int updateByExample(@Param("record") UpmsOrganizationSystem record, @Param("example") UpmsOrganizationSystemExample example);

    int updateByPrimaryKeySelective(UpmsOrganizationSystem record);

    int updateByPrimaryKey(UpmsOrganizationSystem record);
}