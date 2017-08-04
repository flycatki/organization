package com.batman.upms.common.constant;

import com.batman.common.base.BaseResult;

public class UpmsResult extends BaseResult {

    public UpmsResult(UpmsResultConstant upmsResultConstant, Object data ) {
        super(upmsResultConstant.getCode(), upmsResultConstant.getMessage(), data);
    }
}
