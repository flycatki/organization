package com.batman.upms.dao.model;

public class UpmsUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    private String uuid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.id
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.login_name
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.name
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.password
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column upms_user.deleteflag
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    private Integer deleteflag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.uuid
     *
     * @return the value of upms_user.uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.uuid
     *
     * @param uuid the value for upms_user.uuid
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.id
     *
     * @return the value of upms_user.id
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.id
     *
     * @param id the value for upms_user.id
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.login_name
     *
     * @return the value of upms_user.login_name
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.login_name
     *
     * @param loginName the value for upms_user.login_name
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.name
     *
     * @return the value of upms_user.name
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.name
     *
     * @param name the value for upms_user.name
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.password
     *
     * @return the value of upms_user.password
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.password
     *
     * @param password the value for upms_user.password
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column upms_user.deleteflag
     *
     * @return the value of upms_user.deleteflag
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public Integer getDeleteflag() {
        return deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column upms_user.deleteflag
     *
     * @param deleteflag the value for upms_user.deleteflag
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
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
        sb.append(", id=").append(id);
        sb.append(", loginName=").append(loginName);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", deleteflag=").append(deleteflag);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
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
        UpmsUser other = (UpmsUser) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getDeleteflag() == null ? other.getDeleteflag() == null : this.getDeleteflag().equals(other.getDeleteflag()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upms_user
     *
     * @mbg.generated Thu Aug 03 17:08:37 CST 2017
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getDeleteflag() == null) ? 0 : getDeleteflag().hashCode());
        return result;
    }
}