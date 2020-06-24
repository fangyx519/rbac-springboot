package com.rbac.service;

import com.rbac.dao.RoleDao;
import com.rbac.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fang.yixin
 * @description 角色
 * @date 2020/6/23
 */
@Service
public class RoleService {

    @Autowired
    RoleDao roleDao;

    public List<Role> selectRoles(){
        return roleDao.selectAllRoles();
    }
}
