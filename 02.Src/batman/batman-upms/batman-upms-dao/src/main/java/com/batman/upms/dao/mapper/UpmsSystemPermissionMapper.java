package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsSystemPermission;
import com.batman.upms.dao.model.UpmsSystemPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsSystemPermissionMapper {
    long countByExample(UpmsSystemPermissionExample example);

    int deleteByExample(UpmsSystemPermissionExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(UpmsSystemPermission record);

    int insertSelective(UpmsSystemPermission record);

    List<UpmsSystemPermission> selectByExample(UpmsSystemPermissionExample example);

    UpmsSystemPermission selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") UpmsSystemPermission record, @Param("example") UpmsSystemPermissionExample example);

    int updateByExample(@Param("record") UpmsSystemPermission record, @Param("example") UpmsSystemPermissionExample example);

    int updateByPrimaryKeySelective(UpmsSystemPermission record);

    int updateByPrimaryKey(UpmsSystemPermission record);
}