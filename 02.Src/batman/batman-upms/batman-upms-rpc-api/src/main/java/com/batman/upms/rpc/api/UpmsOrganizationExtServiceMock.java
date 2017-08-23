package com.batman.upms.rpc.api;

import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExtForTree;

import java.util.List;

public class UpmsOrganizationExtServiceMock implements UpmsOrganizationExtService {
    @Override
    public List<UpmsOrganizationExtForTree> selectOrganizationInfoForTree(UpmsOrganization upmsOrganization) {
        return null;
    }
}
