package com.batman.common.base;

import com.batman.common.util.SpringContextUtil;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class BaseServiceImpl<Mapper, Record, Example> implements BaseService<Record, Example> {

    public Mapper mapper;

    @Override
    public int countByExample(Example example) {
        try {
            Method countByExample = mapper.getClass().getDeclaredMethod("countByExample", example.getClass());
            Object result = countByExample.invoke(mapper, example);
            return Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return 0;
    }

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
        try {
            Method insert = mapper.getClass().getDeclaredMethod("insert", record.getClass());
            Object result = insert.invoke(mapper, record);
            return Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return 0;
    };

    @Override
    public int insertSelective(Record record) {
        try {
            Method insert = mapper.getClass().getDeclaredMethod("insertSelective", record.getClass());
            Object result = insert.invoke(mapper, record);
            return Integer.parseInt(String.valueOf(result));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return 0;
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
    public void initMapper() {
        this.mapper = SpringContextUtil.getBean(getMapperClass());
    }

    /**
     * 获取类泛型class
     * @return
     */
    public Class<Mapper> getMapperClass() {
        return (Class<Mapper>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
