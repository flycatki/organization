package com.batman.upms.dao.model;

import java.io.Serializable;
import java.util.Date;

public class UpmsOrganization implements Serializable {
    /**
     * 组织机构Uid
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     * 组织机构编号（机构代码）
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 组织机构名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 组织机构父节点uuid
     *
     * @mbg.generated
     */
    private String parentUuid;

    /**
     * 组织机构类别： 0 组织机构 ， 1 部门 ， 2 岗位 。
     *
     * @mbg.generated
     */
    private Byte organizationType;

    /**
     * 组织机构描述
     *
     * @mbg.generated
     */
    private String description;

    /**
     * 组织机构是否可见flag ： 0 不可见 ， 1 可见 ；
     *
     * @mbg.generated
     */
    private Integer isvisible;

    /**
     * 组织机构是否可用flag ： 0 不可用 ， 1 可用 。
     *
     * @mbg.generated
     */
    private Integer isenable;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private Date createtime;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentUuid() {
        return parentUuid;
    }

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    public Byte getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(Byte organizationType) {
        this.organizationType = organizationType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getIsvisible() {
        return isvisible;
    }

    public void setIsvisible(Integer isvisible) {
        this.isvisible = isvisible;
    }

    public Integer getIsenable() {
        return isenable;
    }

    public void setIsenable(Integer isenable) {
        this.isenable = isenable;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
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
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", parentUuid=").append(parentUuid);
        sb.append(", organizationType=").append(organizationType);
        sb.append(", description=").append(description);
        sb.append(", isvisible=").append(isvisible);
        sb.append(", isenable=").append(isenable);
        sb.append(", createtime=").append(createtime);
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
        UpmsOrganization other = (UpmsOrganization) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentUuid() == null ? other.getParentUuid() == null : this.getParentUuid().equals(other.getParentUuid()))
            && (this.getOrganizationType() == null ? other.getOrganizationType() == null : this.getOrganizationType().equals(other.getOrganizationType()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getIsvisible() == null ? other.getIsvisible() == null : this.getIsvisible().equals(other.getIsvisible()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getDeleteflag() == null ? other.getDeleteflag() == null : this.getDeleteflag().equals(other.getDeleteflag()));
    }

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
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getDeleteflag() == null) ? 0 : getDeleteflag().hashCode());
        return result;
    }
}