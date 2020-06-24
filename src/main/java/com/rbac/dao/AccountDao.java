package com.rbac.dao;

import com.rbac.entity.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fang.yixin
 * @description 用户的dao层
 * @date 2020/6/17
 */
@Mapper
@Repository
public interface AccountDao {
    /**
     * 新增用户
     * @param account
     * @return
     */
    int addAccount(Account account);

    int addAccountRole(String userId, Long roleId);

    /**
     * 删除用户
     * @param userId
     * @return
     */
    int deleteAccount(String userId);

    /**
     * 修改用户信息
     * @param account
     * @return
     */
    int updateAccount(Account account);

    /**
     * 根据id查找用户，用于登录
     * @param userId
     * @return
     */
    Account selectById(String userId);

    /**
     * 通过用户名查找用户，用于用户管理中的查询
     * @param userName
     * @return
     */
    Account selectByName(String userName);

    /**
     * 查找所有的账户，用于用户管理中的列表展示
     * @return
     */
    List<Account> selectAllAccounts();

}
