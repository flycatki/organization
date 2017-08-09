package com.batman.upms.dao.model;

import java.io.Serializable;

public class UpmsOrganizationUser implements Serializable {
    /**
     * 组织机构表、人员表  关联表uuid
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     * 组织机构表uuid
     *
     * @mbg.generated
     */
    private String upmsOrganizationUuid;

    /**
     * 人员表uuid
     *
     * @mbg.generated
     */
    private String upmsUserUuid;

    /**
     * 逻辑删除状态： 0 正常 ， 1 删除 。 
     *
     * @mbg.generated
     */
    private Integer deleteflag;

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUpmsOrganizationUuid() {
        return upmsOrganizationUuid;
    }

    public void setUpmsOrganizationUuid(String upmsOrganizationUuid) {
        this.upmsOrganizationUuid = upmsOrganizationUuid;
    }

    public String getUpmsUserUuid() {
        return upmsUserUuid;
    }

    public void setUpmsUserUuid(String upmsUserUuid) {
        this.upmsUserUuid = upmsUserUuid;
    }

    public Integer getDeleteflag() {
        return deleteflag;
    }

    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

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