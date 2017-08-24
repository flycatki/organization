package com.batman.upms.rpc.mapper;

import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExtForTree;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UpmsOrganizationExtMapper {

    List<UpmsOrganization> selectUpmsWorkByUserid(@Param("userId")String userId,@Param("system_uuid")String system_uuid);
    
    //查询结果用于前端生成jstree
    List<UpmsOrganizationExtForTree> selectOrganizationInfoForTree();
}
