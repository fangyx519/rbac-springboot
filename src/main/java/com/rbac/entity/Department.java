package com.rbac.entity;

/**
 * @author fang.yixin
 * @description 部门
 * @date 2020/6/17
 */
public class Department {
    private Long id;

    private String deptName;

    private Integer deptStatus;

    private Integer isLeaf;

    private Integer deptLevel;

    private String deptSEQ;

    private Long parentId;

    public Department() {
    }

    public Department(Long id, String deptName, Integer deptStatus, Integer isLeaf, Integer deptLevel, String deptSEQ, Long parentId) {
        this.id = id;
        this.deptName = deptName;
        this.deptStatus = deptStatus;
        this.isLeaf = isLeaf;
        this.deptLevel = deptLevel;
        this.deptSEQ = deptSEQ;
        this.parentId = parentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getDeptStatus() {
        return deptStatus;
    }

    public void setDeptStatus(Integer deptStatus) {
        this.deptStatus = deptStatus;
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Integer getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(Integer deptLevel) {
        this.deptLevel = deptLevel;
    }

    public String getDeptSEQ() {
        return deptSEQ;
    }

    public void setDeptSEQ(String deptSEQ) {
        this.deptSEQ = deptSEQ;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", deptName='" + deptName + '\'' +
                ", deptStatus=" + deptStatus +
                ", isLeaf=" + isLeaf +
                ", deptLevel=" + deptLevel +
                ", deptSEQ='" + deptSEQ + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
