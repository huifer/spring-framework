package com.huifer.source.spring.dao;

import java.util.Date;

public class HsLog {
    private Integer id;

    private String source;

    private String target;

    private Integer companyId;

    private Integer groupId;

    private Integer version;

    private Integer deleted;

    private Integer createUser;

    private Date createTime;

    private Integer updateUser;

    private Date updateTime;

    private String mapperClass;

    private String changeOperation;

    public String getChangeOperation() {
        return changeOperation;
    }

    public void setChangeOperation(String changeOperation) {
        this.changeOperation = changeOperation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getMapperClass() {
        return mapperClass;
    }

    public void setMapperClass(String mapperClass) {
        this.mapperClass = mapperClass;
    }

    @Override
    public String toString() {
        return "{\"HsLog\":{"
                + "\"id\":"
                + id
                + ",\"source\":\""
                + source + '\"'
                + ",\"target\":\""
                + target + '\"'
                + ",\"companyId\":"
                + companyId
                + ",\"groupId\":"
                + groupId
                + ",\"version\":"
                + version
                + ",\"deleted\":"
                + deleted
                + ",\"createUser\":"
                + createUser
                + ",\"createTime\":\""
                + createTime + '\"'
                + ",\"updateUser\":"
                + updateUser
                + ",\"updateTime\":\""
                + updateTime + '\"'
                + ",\"mapperClass\":\""
                + mapperClass + '\"'
                + ",\"changeOperation\":\""
                + changeOperation + '\"'
                + "}}";

    }
}
