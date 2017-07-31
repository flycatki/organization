package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsUserPermission;
import com.batman.upms.dao.model.UpmsUserPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsUserPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    long countByExample(UpmsUserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int deleteByExample(UpmsUserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int deleteByPrimaryKey(Integer userPermissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int insert(UpmsUserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int insertSelective(UpmsUserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    List<UpmsUserPermission> selectByExample(UpmsUserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    UpmsUserPermission selectByPrimaryKey(Integer userPermissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByExampleSelective(@Param("record") UpmsUserPermission record, @Param("example") UpmsUserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByExample(@Param("record") UpmsUserPermission record, @Param("example") UpmsUserPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByPrimaryKeySelective(UpmsUserPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByPrimaryKey(UpmsUserPermission record);
}