package com.batman.common.base;

public abstract class BaseServiceMock<Mapper, Record, Example> implements BaseService<Record, Example> {

    public int countByExample(Example example) { return -1; }

    @Override
    public void initMapper() {}
}
