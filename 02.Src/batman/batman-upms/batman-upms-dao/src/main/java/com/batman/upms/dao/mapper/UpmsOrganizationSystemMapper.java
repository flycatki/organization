package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsOrganizationSystem;
import com.batman.upms.dao.model.UpmsOrganizationSystemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsOrganizationSystemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    long countByExample(UpmsOrganizationSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int deleteByExample(UpmsOrganizationSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int insert(UpmsOrganizationSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int insertSelective(UpmsOrganizationSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    List<UpmsOrganizationSystem> selectByExample(UpmsOrganizationSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    UpmsOrganizationSystem selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") UpmsOrganizationSystem record, @Param("example") UpmsOrganizationSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int updateByExample(@Param("record") UpmsOrganizationSystem record, @Param("example") UpmsOrganizationSystemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int updateByPrimaryKeySelective(UpmsOrganizationSystem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_system
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int updateByPrimaryKey(UpmsOrganizationSystem record);
}