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
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    long countByExample(UpmsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    int deleteByExample(UpmsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    int insert(UpmsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    int insertSelective(UpmsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    List<UpmsUser> selectByExample(UpmsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    UpmsUser selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    int updateByExampleSelective(@Param("record") UpmsUser record, @Param("example") UpmsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    int updateByExample(@Param("record") UpmsUser record, @Param("example") UpmsUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    int updateByPrimaryKeySelective(UpmsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    int updateByPrimaryKey(UpmsUser record);
}