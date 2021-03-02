package com.lwp.ydfsdata.pojo;

public class UserInfo {
    private String userId;

    private String password;

    private String username;

    private String deptId;

    private String userType;

    private String sex;

    private String createTime;

    private String phoneNumber;

    private String salt;

    private String loginDate;

    private String createBy;

    private String remark;

    public UserInfo(String userId, String password, String username, String deptId, String userType, String sex, String createTime, String phoneNumber, String salt, String loginDate, String createBy, String remark) {
        this.userId = userId;
        this.password = password;
        this.username = username;
        this.deptId = deptId;
        this.userType = userType;
        this.sex = sex;
        this.createTime = createTime;
        this.phoneNumber = phoneNumber;
        this.salt = salt;
        this.loginDate = loginDate;
        this.createBy = createBy;
        this.remark = remark;
    }

    public UserInfo() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(String loginDate) {
        this.loginDate = loginDate == null ? null : loginDate.trim();
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}