package com.batman.upms.rpc.api;

import java.util.List;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsOrganizationMapper;
import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExample;
import com.batman.upms.dao.model.UpmsOrganizationExtForTree;

/**
* 降级实现UpmsOrganizationService接口
* Created by jiang on 2017/8/3.
*/
public class UpmsOrganizationServiceMock extends BaseServiceMock<UpmsOrganizationMapper, UpmsOrganization, UpmsOrganizationExample> implements UpmsOrganizationService {

}
