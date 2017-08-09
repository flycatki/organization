package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsLog;
import com.batman.upms.dao.model.UpmsLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsLogMapper {
    long countByExample(UpmsLogExample example);

    int deleteByExample(UpmsLogExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(UpmsLog record);

    int insertSelective(UpmsLog record);

    List<UpmsLog> selectByExample(UpmsLogExample example);

    UpmsLog selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") UpmsLog record, @Param("example") UpmsLogExample example);

    int updateByExample(@Param("record") UpmsLog record, @Param("example") UpmsLogExample example);

    int updateByPrimaryKeySelective(UpmsLog record);

    int updateByPrimaryKey(UpmsLog record);
}