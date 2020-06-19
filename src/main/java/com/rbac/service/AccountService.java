package com.rbac.service;

import com.rbac.dao.AccountDao;
import com.rbac.entity.Account;
import com.rbac.util.MD5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fang.yixin
 * @description 注册、登录、忘记密码、查询
 * @date 2020/6/18
 */
@Service
public class AccountService {
    private Logger logger = LoggerFactory.getLogger(AccountService.class);

    @Autowired
    AccountDao accountDao;

    public Account selectAccountById(String id){
        return accountDao.selectById(id);
    }

    public List<Account> selectAllAccounts(){
        List<Account> accounts = accountDao.selectAllAccounts();
        return accounts;
    }

    public void updateAccount(Account account){
        int i = accountDao.updateAccount(account);
        if (i == 1){
            logger.info("用户 {} 账户信息修改成功！",account.getId());
            return;
        }
        logger.error("用户 {} 账户信息修改失败！",account.getId());
    }

    public int addAccount(Account account){
        String password = account.getPassword();
        String md5String = MD5Util.getMD5String(password);
        account.setPassword(md5String);
        return accountDao.addAccount(account);
    }

    public int deleteAccount(String id){
        return accountDao.deleteAccount(id);
    }

    public int updatePassword(Account account){
        account.setId(MD5Util.getMD5String("000000"));
        int updateAccount = accountDao.updateAccount(account);
        return updateAccount;
    }
}
