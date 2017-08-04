package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsOrganizationPermission;
import com.batman.upms.dao.model.UpmsOrganizationPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsOrganizationPermissionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    long countByExample(UpmsOrganizationPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    int deleteByExample(UpmsOrganizationPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    int insert(UpmsOrganizationPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    int insertSelective(UpmsOrganizationPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    List<UpmsOrganizationPermission> selectByExample(UpmsOrganizationPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    UpmsOrganizationPermission selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    int updateByExampleSelective(@Param("record") UpmsOrganizationPermission record, @Param("example") UpmsOrganizationPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    int updateByExample(@Param("record") UpmsOrganizationPermission record, @Param("example") UpmsOrganizationPermissionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    int updateByPrimaryKeySelective(UpmsOrganizationPermission record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_permission
     *
     * @mbg.generated Fri Aug 04 16:20:04 CST 2017
     */
    int updateByPrimaryKey(UpmsOrganizationPermission record);
}