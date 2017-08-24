package com.batman.upms.rpc.api;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsOrganizationMapper;
import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExample;
import com.batman.upms.dao.model.UpmsOrganizationExtForTree;

import java.util.List;

public class UpmsOrganizationExtServiceMock extends BaseServiceMock<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationExtService {
    @Override
    public List<UpmsOrganizationExtForTree> selectOrganizationInfoForTree() {
        return null;
    }
}
