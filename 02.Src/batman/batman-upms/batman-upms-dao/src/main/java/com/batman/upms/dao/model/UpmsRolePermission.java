package com.batman.upms.dao.model;

public class UpmsRolePermission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role_permission.uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role_permission.upms_role_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    private String upmsRoleUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role_permission.upms_permission_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    private String upmsPermissionUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role_permission.deleteflag
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    private String deleteflag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role_permission.uuid
     *
     * @return the value of upms_role_permission.uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role_permission.uuid
     *
     * @param uuid the value for upms_role_permission.uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role_permission.upms_role_uuid
     *
     * @return the value of upms_role_permission.upms_role_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public String getUpmsRoleUuid() {
        return upmsRoleUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role_permission.upms_role_uuid
     *
     * @param upmsRoleUuid the value for upms_role_permission.upms_role_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public void setUpmsRoleUuid(String upmsRoleUuid) {
        this.upmsRoleUuid = upmsRoleUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role_permission.upms_permission_uuid
     *
     * @return the value of upms_role_permission.upms_permission_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public String getUpmsPermissionUuid() {
        return upmsPermissionUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role_permission.upms_permission_uuid
     *
     * @param upmsPermissionUuid the value for upms_role_permission.upms_permission_uuid
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public void setUpmsPermissionUuid(String upmsPermissionUuid) {
        this.upmsPermissionUuid = upmsPermissionUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role_permission.deleteflag
     *
     * @return the value of upms_role_permission.deleteflag
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public String getDeleteflag() {
        return deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role_permission.deleteflag
     *
     * @param deleteflag the value for upms_role_permission.deleteflag
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
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
        sb.append(", upmsRoleUuid=").append(upmsRoleUuid);
        sb.append(", upmsPermissionUuid=").append(upmsPermissionUuid);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
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
        UpmsRolePermission other = (UpmsRolePermission) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getUpmsRoleUuid() == null ? other.getUpmsRoleUuid() == null : this.getUpmsRoleUuid().equals(other.getUpmsRoleUuid()))
            && (this.getUpmsPermissionUuid() == null ? other.getUpmsPermissionUuid() == null : this.getUpmsPermissionUuid().equals(other.getUpmsPermissionUuid()))
            && (this.getDeleteflag() == null ? other.getDeleteflag() == null : this.getDeleteflag().equals(other.getDeleteflag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role_permission
     *
     * @mbg.generated Wed Aug 09 13:12:47 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getUpmsRoleUuid() == null) ? 0 : getUpmsRoleUuid().hashCode());
        result = prime * result + ((getUpmsPermissionUuid() == null) ? 0 : getUpmsPermissionUuid().hashCode());
        result = prime * result + ((getDeleteflag() == null) ? 0 : getDeleteflag().hashCode());
        return result;
    }
}