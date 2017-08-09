package com.batman.upms.dao.model;

import java.io.Serializable;

public class UpmsRole implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role.uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role.id
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role.name
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role.parent_uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private String parentUuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role.status
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role.orders
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private Integer orders;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_role.deleteflag
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private Integer deleteflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table upms_role
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role.uuid
     *
     * @return the value of upms_role.uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role.uuid
     *
     * @param uuid the value for upms_role.uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role.id
     *
     * @return the value of upms_role.id
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role.id
     *
     * @param id the value for upms_role.id
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role.name
     *
     * @return the value of upms_role.name
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role.name
     *
     * @param name the value for upms_role.name
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role.parent_uuid
     *
     * @return the value of upms_role.parent_uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public String getParentUuid() {
        return parentUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role.parent_uuid
     *
     * @param parentUuid the value for upms_role.parent_uuid
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role.status
     *
     * @return the value of upms_role.status
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role.status
     *
     * @param status the value for upms_role.status
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role.orders
     *
     * @return the value of upms_role.orders
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role.orders
     *
     * @param orders the value for upms_role.orders
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_role.deleteflag
     *
     * @return the value of upms_role.deleteflag
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public Integer getDeleteflag() {
        return deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_role.deleteflag
     *
     * @param deleteflag the value for upms_role.deleteflag
     *
     * @mbg.generated Wed Aug 09 15:48:31 CST 2017
     */
    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
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
        sb.append(", status=").append(status);
        sb.append(", orders=").append(orders);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
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
        UpmsRole other = (UpmsRole) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getParentUuid() == null ? other.getParentUuid() == null : this.getParentUuid().equals(other.getParentUuid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOrders() == null ? other.getOrders() == null : this.getOrders().equals(other.getOrders()))
            && (this.getDeleteflag() == null ? other.getDeleteflag() == null : this.getDeleteflag().equals(other.getDeleteflag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_role
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
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOrders() == null) ? 0 : getOrders().hashCode());
        result = prime * result + ((getDeleteflag() == null) ? 0 : getDeleteflag().hashCode());
        return result;
    }
}