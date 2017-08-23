package com.batman.upms.rpc.api;

import java.util.List;

import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExtForTree;

public interface UpmsOrganizationExtService {
	
	public List<UpmsOrganizationExtForTree> selectOrganizationInfoForTree(UpmsOrganization upmsOrganization);
}
