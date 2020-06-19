package com.rbac.entity;

/**
 * @author fang.yixin
 * @description 用户信息
 * @date 2020/6/17
 */
public class Account {
    private String id;

    private String password;

    private String userName;

    private Integer userStatus;

    private Department department;

    private Integer errorCounts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getErrorCounts() {
        return errorCounts;
    }

    public void setErrorCounts(Integer errorCounts) {
        this.errorCounts = errorCounts;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", userStatus=" + userStatus +
                ", department=" + department +
                ", errorCounts=" + errorCounts +
                '}';
    }
}
