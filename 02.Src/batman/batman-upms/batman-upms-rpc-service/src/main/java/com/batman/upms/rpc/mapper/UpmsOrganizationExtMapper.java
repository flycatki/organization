package com.batman.upms.rpc.mapper;

import com.batman.upms.dao.model.UpmsOrganization;

import java.util.List;

public interface UpmsOrganizationExtMapper {

    List<UpmsOrganization> selectUpmsWorkByUserid(String userId);
}
