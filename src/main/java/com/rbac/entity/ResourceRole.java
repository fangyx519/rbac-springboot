package com.rbac.entity;

/**
 * @author fang.yixin
 * @description 资源-角色关系
 * @date 2020/6/17
 */
public class ResourceRole {
    private Long roleId;

    private Long resId;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getResId() {
        return resId;
    }

    public void setResId(Long resId) {
        this.resId = resId;
    }

    @Override
    public String toString() {
        return "ResourceRole{" +
                "roleId=" + roleId +
                ", resId=" + resId +
                '}';
    }
}
