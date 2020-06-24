package com.rbac.entity;

import java.util.List;

/**
 * @author fang.yixin
 * @description 用户信息
 * @date 2020/6/17
 */
public class Account {
    private String userId;

    private String password;

    private String userName;

    private Integer userStatus;

    private Department department;

    private List<Role> role;

    private Integer errorCounts;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

}
