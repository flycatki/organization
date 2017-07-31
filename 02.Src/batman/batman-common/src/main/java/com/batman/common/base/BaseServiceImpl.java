package com.batman.common.base;

public abstract class BaseServiceImpl<Mapper, Record, Example> implements BaseService<Record, Example> {

    @Override
    public int countByExample(Example example) { return -1; }
}
