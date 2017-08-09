package com.batman.upms.dao.model;

import java.io.Serializable;

public class UpmsLog implements Serializable {
    /**
     * 系统日志uuid
     *
     * @mbg.generated
     */
    private String uuid;

    /**
     * 系统基础URL
     *
     * @mbg.generated
     */
    private String basepath;

    /**
     * 操作ip
     *
     * @mbg.generated
     */
    private String ip;

    /**
     * 调用方法或函数
     *
     * @mbg.generated
     */
    private String function;

    /**
     * 消耗时间
     *
     * @mbg.generated
     */
    private String spendtime;

    /**
     * 开始时间
     *
     * @mbg.generated
     */
    private String starttime;

    /**
     * url
     *
     * @mbg.generated
     */
    private String url;

    /**
     * uri
     *
     * @mbg.generated
     */
    private String uri;

    /**
     * 操作者姓名
     *
     * @mbg.generated
     */
    private String username;

    /**
     * 操作结果
     *
     * @mbg.generated
     */
    private String result;

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

    public String getBasepath() {
        return basepath;
    }

    public void setBasepath(String basepath) {
        this.basepath = basepath;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getSpendtime() {
        return spendtime;
    }

    public void setSpendtime(String spendtime) {
        this.spendtime = spendtime;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
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
        sb.append(", basepath=").append(basepath);
        sb.append(", ip=").append(ip);
        sb.append(", function=").append(function);
        sb.append(", spendtime=").append(spendtime);
        sb.append(", starttime=").append(starttime);
        sb.append(", url=").append(url);
        sb.append(", uri=").append(uri);
        sb.append(", username=").append(username);
        sb.append(", result=").append(result);
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
        UpmsLog other = (UpmsLog) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getBasepath() == null ? other.getBasepath() == null : this.getBasepath().equals(other.getBasepath()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getFunction() == null ? other.getFunction() == null : this.getFunction().equals(other.getFunction()))
            && (this.getSpendtime() == null ? other.getSpendtime() == null : this.getSpendtime().equals(other.getSpendtime()))
            && (this.getStarttime() == null ? other.getStarttime() == null : this.getStarttime().equals(other.getStarttime()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getUri() == null ? other.getUri() == null : this.getUri().equals(other.getUri()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
            && (this.getDeleteflag() == null ? other.getDeleteflag() == null : this.getDeleteflag().equals(other.getDeleteflag()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getBasepath() == null) ? 0 : getBasepath().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getFunction() == null) ? 0 : getFunction().hashCode());
        result = prime * result + ((getSpendtime() == null) ? 0 : getSpendtime().hashCode());
        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getUri() == null) ? 0 : getUri().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getDeleteflag() == null) ? 0 : getDeleteflag().hashCode());
        return result;
    }
}