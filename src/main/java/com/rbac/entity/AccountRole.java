package com.rbac.entity;

/**
 * @author fang.yixin
 * @description 用户-角色关系
 * @date 2020/6/17
 */
public class AccountRole {
    private String userId;

    private Long roleId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "AccountRole{" +
                "userId='" + userId + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
