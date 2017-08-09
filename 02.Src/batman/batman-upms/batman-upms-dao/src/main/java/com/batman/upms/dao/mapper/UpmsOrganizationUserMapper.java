package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsOrganizationUser;
import com.batman.upms.dao.model.UpmsOrganizationUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsOrganizationUserMapper {
    long countByExample(UpmsOrganizationUserExample example);

    int deleteByExample(UpmsOrganizationUserExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(UpmsOrganizationUser record);

    int insertSelective(UpmsOrganizationUser record);

    List<UpmsOrganizationUser> selectByExample(UpmsOrganizationUserExample example);

    UpmsOrganizationUser selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") UpmsOrganizationUser record, @Param("example") UpmsOrganizationUserExample example);

    int updateByExample(@Param("record") UpmsOrganizationUser record, @Param("example") UpmsOrganizationUserExample example);

    int updateByPrimaryKeySelective(UpmsOrganizationUser record);

    int updateByPrimaryKey(UpmsOrganizationUser record);
}