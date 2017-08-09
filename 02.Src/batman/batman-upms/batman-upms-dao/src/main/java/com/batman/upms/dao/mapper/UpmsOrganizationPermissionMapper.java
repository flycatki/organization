package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsOrganizationPermission;
import com.batman.upms.dao.model.UpmsOrganizationPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsOrganizationPermissionMapper {
    long countByExample(UpmsOrganizationPermissionExample example);

    int deleteByExample(UpmsOrganizationPermissionExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(UpmsOrganizationPermission record);

    int insertSelective(UpmsOrganizationPermission record);

    List<UpmsOrganizationPermission> selectByExample(UpmsOrganizationPermissionExample example);

    UpmsOrganizationPermission selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") UpmsOrganizationPermission record, @Param("example") UpmsOrganizationPermissionExample example);

    int updateByExample(@Param("record") UpmsOrganizationPermission record, @Param("example") UpmsOrganizationPermissionExample example);

    int updateByPrimaryKeySelective(UpmsOrganizationPermission record);

    int updateByPrimaryKey(UpmsOrganizationPermission record);
}