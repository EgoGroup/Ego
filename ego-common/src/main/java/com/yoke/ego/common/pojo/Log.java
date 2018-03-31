package com.yoke.ego.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
    private Long logId;

    private String logName;

    private String logType;

    private String logUrl;

    private String logRequestParam;

    private Long logUserId;

    private String logUserIp;

    private Date logCreated;

    private String logRequestType;

    private static final long serialVersionUID = 1L;

    public Log(Long logId, String logName, String logType, String logUrl, String logRequestParam, Long logUserId, String logUserIp, Date logCreated, String logRequestType) {
        this.logId = logId;
        this.logName = logName;
        this.logType = logType;
        this.logUrl = logUrl;
        this.logRequestParam = logRequestParam;
        this.logUserId = logUserId;
        this.logUserIp = logUserIp;
        this.logCreated = logCreated;
        this.logRequestType = logRequestType;
    }

    public Log() {
        super();
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getLogName() {
        return logName;
    }

    public void setLogName(String logName) {
        this.logName = logName == null ? null : logName.trim();
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType == null ? null : logType.trim();
    }

    public String getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(String logUrl) {
        this.logUrl = logUrl == null ? null : logUrl.trim();
    }

    public String getLogRequestParam() {
        return logRequestParam;
    }

    public void setLogRequestParam(String logRequestParam) {
        this.logRequestParam = logRequestParam == null ? null : logRequestParam.trim();
    }

    public Long getLogUserId() {
        return logUserId;
    }

    public void setLogUserId(Long logUserId) {
        this.logUserId = logUserId;
    }

    public String getLogUserIp() {
        return logUserIp;
    }

    public void setLogUserIp(String logUserIp) {
        this.logUserIp = logUserIp == null ? null : logUserIp.trim();
    }

    public Date getLogCreated() {
        return logCreated;
    }

    public void setLogCreated(Date logCreated) {
        this.logCreated = logCreated;
    }

    public String getLogRequestType() {
        return logRequestType;
    }

    public void setLogRequestType(String logRequestType) {
        this.logRequestType = logRequestType == null ? null : logRequestType.trim();
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
        Log other = (Log) that;
        return (this.getLogId() == null ? other.getLogId() == null : this.getLogId().equals(other.getLogId()))
            && (this.getLogName() == null ? other.getLogName() == null : this.getLogName().equals(other.getLogName()))
            && (this.getLogType() == null ? other.getLogType() == null : this.getLogType().equals(other.getLogType()))
            && (this.getLogUrl() == null ? other.getLogUrl() == null : this.getLogUrl().equals(other.getLogUrl()))
            && (this.getLogRequestParam() == null ? other.getLogRequestParam() == null : this.getLogRequestParam().equals(other.getLogRequestParam()))
            && (this.getLogUserId() == null ? other.getLogUserId() == null : this.getLogUserId().equals(other.getLogUserId()))
            && (this.getLogUserIp() == null ? other.getLogUserIp() == null : this.getLogUserIp().equals(other.getLogUserIp()))
            && (this.getLogCreated() == null ? other.getLogCreated() == null : this.getLogCreated().equals(other.getLogCreated()))
            && (this.getLogRequestType() == null ? other.getLogRequestType() == null : this.getLogRequestType().equals(other.getLogRequestType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLogId() == null) ? 0 : getLogId().hashCode());
        result = prime * result + ((getLogName() == null) ? 0 : getLogName().hashCode());
        result = prime * result + ((getLogType() == null) ? 0 : getLogType().hashCode());
        result = prime * result + ((getLogUrl() == null) ? 0 : getLogUrl().hashCode());
        result = prime * result + ((getLogRequestParam() == null) ? 0 : getLogRequestParam().hashCode());
        result = prime * result + ((getLogUserId() == null) ? 0 : getLogUserId().hashCode());
        result = prime * result + ((getLogUserIp() == null) ? 0 : getLogUserIp().hashCode());
        result = prime * result + ((getLogCreated() == null) ? 0 : getLogCreated().hashCode());
        result = prime * result + ((getLogRequestType() == null) ? 0 : getLogRequestType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logId=").append(logId);
        sb.append(", logName=").append(logName);
        sb.append(", logType=").append(logType);
        sb.append(", logUrl=").append(logUrl);
        sb.append(", logRequestParam=").append(logRequestParam);
        sb.append(", logUserId=").append(logUserId);
        sb.append(", logUserIp=").append(logUserIp);
        sb.append(", logCreated=").append(logCreated);
        sb.append(", logRequestType=").append(logRequestType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}