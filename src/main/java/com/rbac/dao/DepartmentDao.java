package com.rbac.dao;

import com.rbac.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fang.yixin
 * @description 部门管理的增删改查
 * @date 2020/6/17
 */
@Mapper
@Repository
public interface DepartmentDao {

    /**
     * 新增部门
     * @param department
     * @return
     */
    int addDepartment(Department department);

    /**
     * 删除部门
     * @param id
     * @return
     */
    int deleteDepartment(String id);

    /**
     * 修改部门信息
     * @param department
     * @return
     */
    int updateDepartment(Department department);

    /**
     * 根据id查找部门，用于组织管理中的查询
     * @param id
     * @return
     */
    Department selectById(String id);

    /**
     * 通过名称查找部门，用于组织管理中的查询
     * @param deptName
     * @return
     */
    Department selectByName(String deptName);

    /**
     * 查找所有的部门，用于组织管理中的列表展示
     * @return
     */
    List<Department> selectAllDepartments();


}
