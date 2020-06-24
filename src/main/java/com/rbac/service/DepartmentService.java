package com.rbac.service;

import com.rbac.dao.DepartmentDao;
import com.rbac.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author fang.yixin
 * @description 部门
 * @date 2020/6/23
 */
@Service
public class DepartmentService {
    @Autowired
    DepartmentDao departmentDao;

    public List<Department> selectAllDepts(){
        List<Department> departments = departmentDao.selectAllDepartments();
        return departments;
    }
}
