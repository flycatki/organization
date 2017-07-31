package com.batman.upms.rpc.api;

import com.batman.common.base.BaseServiceMock;
import com.batman.upms.dao.mapper.UpmsSystemMapper;
import com.batman.upms.dao.model.UpmsSystem;
import com.batman.upms.dao.model.UpmsSystemExample;

/**
* 降级实现UpmsSystemService接口
* Created by jiang on 2017/37/31.
*/
public class UpmsSystemServiceMock extends BaseServiceMock<UpmsSystemMapper, UpmsSystem, UpmsSystemExample> implements UpmsSystemService {

}
