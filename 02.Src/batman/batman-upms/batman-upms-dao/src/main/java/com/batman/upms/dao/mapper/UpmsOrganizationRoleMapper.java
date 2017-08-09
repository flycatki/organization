package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsOrganizationRole;
import com.batman.upms.dao.model.UpmsOrganizationRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsOrganizationRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    long countByExample(UpmsOrganizationRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    int deleteByExample(UpmsOrganizationRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    int insert(UpmsOrganizationRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    int insertSelective(UpmsOrganizationRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    List<UpmsOrganizationRole> selectByExample(UpmsOrganizationRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    UpmsOrganizationRole selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    int updateByExampleSelective(@Param("record") UpmsOrganizationRole record, @Param("example") UpmsOrganizationRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    int updateByExample(@Param("record") UpmsOrganizationRole record, @Param("example") UpmsOrganizationRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    int updateByPrimaryKeySelective(UpmsOrganizationRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    int updateByPrimaryKey(UpmsOrganizationRole record);
}