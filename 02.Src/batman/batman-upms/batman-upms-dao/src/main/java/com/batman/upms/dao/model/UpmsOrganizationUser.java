package com.batman.upms.dao.model;

public class UpmsOrganizationUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization_user.uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization_user.upms_organization_uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    private String upmsOrganizationUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization_user.upms_user_uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    private String upmsUserUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_organization_user.deleteflag
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    private Integer deleteflag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization_user.uuid
     *
     * @return the value of upms_organization_user.uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization_user.uuid
     *
     * @param uuid the value for upms_organization_user.uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization_user.upms_organization_uuid
     *
     * @return the value of upms_organization_user.upms_organization_uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public String getUpmsOrganizationUuid() {
        return upmsOrganizationUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization_user.upms_organization_uuid
     *
     * @param upmsOrganizationUuid the value for upms_organization_user.upms_organization_uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public void setUpmsOrganizationUuid(String upmsOrganizationUuid) {
        this.upmsOrganizationUuid = upmsOrganizationUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization_user.upms_user_uuid
     *
     * @return the value of upms_organization_user.upms_user_uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public String getUpmsUserUuid() {
        return upmsUserUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization_user.upms_user_uuid
     *
     * @param upmsUserUuid the value for upms_organization_user.upms_user_uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public void setUpmsUserUuid(String upmsUserUuid) {
        this.upmsUserUuid = upmsUserUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_organization_user.deleteflag
     *
     * @return the value of upms_organization_user.deleteflag
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public Integer getDeleteflag() {
        return deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_organization_user.deleteflag
     *
     * @param deleteflag the value for upms_organization_user.deleteflag
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append(", upmsOrganizationUuid=").append(upmsOrganizationUuid);
        sb.append(", upmsUserUuid=").append(upmsUserUuid);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
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
        UpmsOrganizationUser other = (UpmsOrganizationUser) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getUpmsOrganizationUuid() == null ? other.getUpmsOrganizationUuid() == null : this.getUpmsOrganizationUuid().equals(other.getUpmsOrganizationUuid()))
            && (this.getUpmsUserUuid() == null ? other.getUpmsUserUuid() == null : this.getUpmsUserUuid().equals(other.getUpmsUserUuid()))
            && (this.getDeleteflag() == null ? other.getDeleteflag() == null : this.getDeleteflag().equals(other.getDeleteflag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_organization_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getUpmsOrganizationUuid() == null) ? 0 : getUpmsOrganizationUuid().hashCode());
        result = prime * result + ((getUpmsUserUuid() == null) ? 0 : getUpmsUserUuid().hashCode());
        result = prime * result + ((getDeleteflag() == null) ? 0 : getDeleteflag().hashCode());
        return result;
    }
}