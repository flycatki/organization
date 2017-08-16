package com.batman.common.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public abstract class BaseServiceMock<Mapper, Record, Example> implements BaseService<Record, Example> {

    @Override
    public int countByExample(Example example) { return -1; }

    @Override
    public int deleteByExample(Example example) {
        return -1;
    };

    @Override
    public int deleteByPrimaryKey(String uuid) {
        return -1;
    };

    @Override
    public int insert(Record record) {
        return -1;
    };

    @Override
    public int insertSelective(Record record) {
        return -1;
    };

    @Override
    public List<Record> selectByExampleWithBLOBs(Example example) {
        return null;
    };

    @Override
    public List<Record> selectByExample(Example example) {
        return null;
    };

    @Override
    public List<Record> SelectByExampleWithBLOBsForStartPage(Example example, Integer pageNum, Integer pageSize) {
        return null;
    };

    @Override
    public Record selectFirstByExample(Example example) {
        return null;
    };

    @Override
    public Record selectFirstByExampleWithBLOBs(Example example) {
        return null;
    };

    @Override
    public Record selectByPrimaryKey(String uuid) {
        return null;
    };

    @Override
    public int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example) {
        return -1;
    };

    @Override
    public int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") Example example) {
        return -1;
    };

    @Override
    public int updateByExample(@Param("record") Record record, @Param("example") Example example) {
        return -1;
    };

    @Override
    public int updateByPrimaryKeySelective(Record record) {
        return -1;
    };

    @Override
    public int updateByPrimaryKeyWithBLOBs(Record record) {
        return -1;
    };

    @Override
    public int updateByPrimaryKey(Record record) {
        return -1;
    };

    @Override
    public int deleteByPrimaryKeys(String ids) {
        return -1;
    };

    @Override
    public void initMapper() {}
}
