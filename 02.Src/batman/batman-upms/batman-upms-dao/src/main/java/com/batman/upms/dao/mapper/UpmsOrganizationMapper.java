package com.batman.upms.dao.mapper;

import com.batman.upms.dao.model.UpmsOrganization;
import com.batman.upms.dao.model.UpmsOrganizationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpmsOrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    long countByExample(UpmsOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int deleteByExample(UpmsOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int insert(UpmsOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int insertSelective(UpmsOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    List<UpmsOrganization> selectByExample(UpmsOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    UpmsOrganization selectByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int updateByExampleSelective(@Param("record") UpmsOrganization record, @Param("example") UpmsOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int updateByExample(@Param("record") UpmsOrganization record, @Param("example") UpmsOrganizationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int updateByPrimaryKeySelective(UpmsOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    int updateByPrimaryKey(UpmsOrganization record);
}