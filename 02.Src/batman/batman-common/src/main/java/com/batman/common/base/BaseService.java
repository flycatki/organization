package com.batman.common.base;

public interface BaseService<Record, Example> {
    int countByExample(Example example);
}
