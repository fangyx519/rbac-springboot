package com.rbac.enums;

public enum AccountEnum {
    //停用，正常，禁止登录
    DISABLE_LOGIN(0),
    NORMAL_LOGIN(1),
    FORBID_LOGIN(2);

    private int status;

    AccountEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
