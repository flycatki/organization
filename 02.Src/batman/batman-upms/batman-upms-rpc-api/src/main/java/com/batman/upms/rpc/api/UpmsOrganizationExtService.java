package com.batman.upms.rpc.api;

import java.util.List;

import com.batman.common.base.BaseService;
import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExample;
import com.batman.upms.dao.model.UpmsOrganizationExtForTree;

public interface UpmsOrganizationExtService extends BaseService<UpmsOrganization, UpmsOrganizationExample> {
	
	public List<UpmsOrganizationExtForTree> selectOrganizationInfoForTree();
}
