package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsPermission;
import com.batman.upms.dao.model.UpmsPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    long countByExample(UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int deleteByExample(UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int deleteByPrimaryKey(Integer permissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int insert(UpmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int insertSelective(UpmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    List<UpmsPermission> selectByExample(UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    UpmsPermission selectByPrimaryKey(Integer permissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByExampleSelective(@Param("record") UpmsPermission record, @Param("example") UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByExample(@Param("record") UpmsPermission record, @Param("example") UpmsPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByPrimaryKeySelective(UpmsPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByPrimaryKey(UpmsPermission record);
}