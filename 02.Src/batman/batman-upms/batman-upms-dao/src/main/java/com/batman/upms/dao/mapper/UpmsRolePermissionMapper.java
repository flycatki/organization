package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsRolePermission;
import com.batman.upms.dao.model.UpmsRolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsRolePermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    long countByExample(UpmsRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int deleteByExample(UpmsRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int deleteByPrimaryKey(Integer rolePermissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int insert(UpmsRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int insertSelective(UpmsRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    List<UpmsRolePermission> selectByExample(UpmsRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    UpmsRolePermission selectByPrimaryKey(Integer rolePermissionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByExampleSelective(@Param("record") UpmsRolePermission record, @Param("example") UpmsRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByExample(@Param("record") UpmsRolePermission record, @Param("example") UpmsRolePermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByPrimaryKeySelective(UpmsRolePermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Mon Jul 31 14:29:20 CST 2017
     */
    int updateByPrimaryKey(UpmsRolePermission record);
}