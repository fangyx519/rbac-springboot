package com.rbac.entity;

/**
 * @author fang.yixin
 * @description 部门
 * @date 2020/6/17
 */
public class Department {
    private Long deptId;

    private String deptName;

    private Integer deptStatus;

    private Integer isLeaf;

    private Integer deptLevel;

    private String deptSEQ;

    private Long parentId;

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
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


}
