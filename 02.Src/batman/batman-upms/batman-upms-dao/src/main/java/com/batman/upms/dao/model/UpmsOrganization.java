package com.batman.upms.dao.model;

import java.io.Serializable;

public class UpmsOrganization implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization.uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization.id
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization.name
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization.parent_uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private String parentUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization.organization_type
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private Byte organizationType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization.description
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization.isvisible
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private Integer isvisible;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization.isenable
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private Integer isenable;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization.deleteflag
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private Integer deleteflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization.uuid
     *
     * @return the value of upms_organization.uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization.uuid
     *
     * @param uuid the value for upms_organization.uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization.id
     *
     * @return the value of upms_organization.id
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization.id
     *
     * @param id the value for upms_organization.id
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization.name
     *
     * @return the value of upms_organization.name
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization.name
     *
     * @param name the value for upms_organization.name
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization.parent_uuid
     *
     * @return the value of upms_organization.parent_uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public String getParentUuid() {
        return parentUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization.parent_uuid
     *
     * @param parentUuid the value for upms_organization.parent_uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization.organization_type
     *
     * @return the value of upms_organization.organization_type
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public Byte getOrganizationType() {
        return organizationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization.organization_type
     *
     * @param organizationType the value for upms_organization.organization_type
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setOrganizationType(Byte organizationType) {
        this.organizationType = organizationType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization.description
     *
     * @return the value of upms_organization.description
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization.description
     *
     * @param description the value for upms_organization.description
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization.isvisible
     *
     * @return the value of upms_organization.isvisible
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public Integer getIsvisible() {
        return isvisible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization.isvisible
     *
     * @param isvisible the value for upms_organization.isvisible
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setIsvisible(Integer isvisible) {
        this.isvisible = isvisible;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization.isenable
     *
     * @return the value of upms_organization.isenable
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public Integer getIsenable() {
        return isenable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization.isenable
     *
     * @param isenable the value for upms_organization.isenable
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setIsenable(Integer isenable) {
        this.isenable = isenable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization.deleteflag
     *
     * @return the value of upms_organization.deleteflag
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public Integer getDeleteflag() {
        return deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization.deleteflag
     *
     * @param deleteflag the value for upms_organization.deleteflag
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentUuid=").append(parentUuid);
        sb.append(", organizationType=").append(organizationType);
        sb.append(", description=").append(description);
        sb.append(", isvisible=").append(isvisible);
        sb.append(", isenable=").append(isenable);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        UpmsOrganization other = (UpmsOrganization) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentUuid() == null ? other.getParentUuid() == null : this.getParentUuid().equals(other.getParentUuid()))
            && (this.getOrganizationType() == null ? other.getOrganizationType() == null : this.getOrganizationType().equals(other.getOrganizationType()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getIsvisible() == null ? other.getIsvisible() == null : this.getIsvisible().equals(other.getIsvisible()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()))
            && (this.getDeleteflag() == null ? other.getDeleteflag() == null : this.getDeleteflag().equals(other.getDeleteflag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getParentUuid() == null) ? 0 : getParentUuid().hashCode());
        result = prime * result + ((getOrganizationType() == null) ? 0 : getOrganizationType().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getIsvisible() == null) ? 0 : getIsvisible().hashCode());
        result = prime * result + ((getIsenable() == null) ? 0 : getIsenable().hashCode());
        result = prime * result + ((getDeleteflag() == null) ? 0 : getDeleteflag().hashCode());
        return result;
    }
}