package com.rbac.controller;

import com.rbac.entity.Department;
import com.rbac.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author fang.yixin
 * @description 部门
 * @date 2020/6/23
 */
@Controller
@RequestMapping("/dept")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/getDepts")
    @ResponseBody
    public List<Department> getDepartments(){
        return departmentService.selectAllDepts();
    }

}
