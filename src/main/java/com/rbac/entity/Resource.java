package com.rbac.entity;

/**
 * @author fang.yixin
 * @description 资源
 * @date 2020/6/17
 */
public class Resource {
    private Long id;

    private String resCode;

    private String resName;

    private String resDesc;

    private String resType;

    private String resUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResDesc() {
        return resDesc;
    }

    public void setResDesc(String resDesc) {
        this.resDesc = resDesc;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public String getResUrl() {
        return resUrl;
    }

    public void setResUrl(String resUrl) {
        this.resUrl = resUrl;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", resCode='" + resCode + '\'' +
                ", resName='" + resName + '\'' +
                ", resDesc='" + resDesc + '\'' +
                ", resType='" + resType + '\'' +
                ", resUrl='" + resUrl + '\'' +
                '}';
    }
}
