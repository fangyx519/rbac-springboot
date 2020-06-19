package com.rbac.dao;


import com.rbac.entity.ResourceRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author fang.yixin
 * @description 资源-角色
 * @date 2020/6/17
 */
@Mapper
@Repository
public interface ResourceRoleDao {

    int addResourceRole(ResourceRole resourceRole);

}
