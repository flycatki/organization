package com.batman.upms.rpc.api;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsLogMapper;
import com.batman.upms.dao.model.UpmsLog;
import com.batman.upms.dao.model.UpmsLogExample;

/**
* 降级实现UpmsLogService接口
* Created by jiang on 2017/12/9.
*/
public class UpmsLogServiceMock extends BaseServiceMock<UpmsLogMapper, UpmsLog, UpmsLogExample> implements UpmsLogService {

}
