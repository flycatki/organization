package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsUser;
import com.batman.upms.dao.model.UpmsUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Mon Jul 31 17:06:11 CST 2017
     */
    long countByExample(UpmsUserExample example);

}