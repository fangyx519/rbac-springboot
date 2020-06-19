package com.rbac.dao;

import com.rbac.entity.AccountRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author fang.yixin
 * @description 用户-角色
 * @date 2020/6/17
 */
@Mapper
@Repository
public interface AccountRoleDao {

    int addAccountRole(AccountRole accountRole);

}
