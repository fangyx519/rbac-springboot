package com.rbac.dao;

import com.rbac.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fang.yixin
 * @description 角色管理的增删改查
 * @date 2020/6/17
 */
@Mapper
@Repository
public interface RoleDao {

    /**
     * 新增角色
     * @param role
     * @return
     */
    int addRole(Role role);

    /**
     * 删除角色
     * @param id
     * @return
     */
    int deleteRole(Long id);

    /**
     * 修改角色信息
     * @param role
     * @return
     */
    int updateRole(Role role);

    /**
     * 根据id查找角色，用于角色管理中的查询
     * @param id
     * @return
     */
    Role selectById(Long id);

    /**
     * 通过名称查找角色，用于角色管理中的查询
     * @param roleName
     * @return
     */
    Role selectByName(String roleName);

    /**
     * 查找所有的角色，用于角色管理中的列表展示
     * @return
     */
    List<Role> selectAllRoles();
}
