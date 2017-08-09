package com.batman.upms.dao.model;

public class UpmsOrganizationRole {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization_role.uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization_role.upms_organization_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    private String upmsOrganizationUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization_role.upms_role_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    private String upmsRoleUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization_role.deleteflag
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    private Integer deleteflag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization_role.uuid
     *
     * @return the value of upms_organization_role.uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization_role.uuid
     *
     * @param uuid the value for upms_organization_role.uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization_role.upms_organization_uuid
     *
     * @return the value of upms_organization_role.upms_organization_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public String getUpmsOrganizationUuid() {
        return upmsOrganizationUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization_role.upms_organization_uuid
     *
     * @param upmsOrganizationUuid the value for upms_organization_role.upms_organization_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public void setUpmsOrganizationUuid(String upmsOrganizationUuid) {
        this.upmsOrganizationUuid = upmsOrganizationUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization_role.upms_role_uuid
     *
     * @return the value of upms_organization_role.upms_role_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public String getUpmsRoleUuid() {
        return upmsRoleUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization_role.upms_role_uuid
     *
     * @param upmsRoleUuid the value for upms_organization_role.upms_role_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public void setUpmsRoleUuid(String upmsRoleUuid) {
        this.upmsRoleUuid = upmsRoleUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization_role.deleteflag
     *
     * @return the value of upms_organization_role.deleteflag
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public Integer getDeleteflag() {
        return deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization_role.deleteflag
     *
     * @param deleteflag the value for upms_organization_role.deleteflag
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", upmsOrganizationUuid=").append(upmsOrganizationUuid);
        sb.append(", upmsRoleUuid=").append(upmsRoleUuid);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
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
        UpmsOrganizationRole other = (UpmsOrganizationRole) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getUpmsOrganizationUuid() == null ? other.getUpmsOrganizationUuid() == null : this.getUpmsOrganizationUuid().equals(other.getUpmsOrganizationUuid()))
            && (this.getUpmsRoleUuid() == null ? other.getUpmsRoleUuid() == null : this.getUpmsRoleUuid().equals(other.getUpmsRoleUuid()))
            && (this.getDeleteflag() == null ? other.getDeleteflag() == null : this.getDeleteflag().equals(other.getDeleteflag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_role
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getUpmsOrganizationUuid() == null) ? 0 : getUpmsOrganizationUuid().hashCode());
        result = prime * result + ((getUpmsRoleUuid() == null) ? 0 : getUpmsRoleUuid().hashCode());
        result = prime * result + ((getDeleteflag() == null) ? 0 : getDeleteflag().hashCode());
        return result;
    }
}