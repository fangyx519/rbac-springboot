package com.rbac.service;

import com.rbac.dao.AccountDao;
import com.rbac.entity.Account;
import com.rbac.entity.Role;
import com.rbac.util.MD5Util;
import com.rbac.util.PinYinUtil;
import net.sourceforge.pinyin4j.PinyinHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
            logger.info("用户 {} 账户信息修改成功！",account.getUserId());
            return;
        }
        logger.error("用户 {} 账户信息修改失败！",account.getUserId());
    }

    @Transactional(propagation= Propagation.REQUIRED, rollbackFor=RuntimeException.class)
    public int addAccount(Account account){
        String password = "111111";
        String md5String = MD5Util.getMD5String(password);
        account.setPassword(md5String);

        String userName = PinYinUtil.getPinyin(account.getUserName());

        String id = userName + "@company.com";
        account.setUserId(id);

        int i = accountDao.addAccount(account);

        int k = 1;
        String userId = account.getUserId();
        List<Role> roleList = account.getRole();
        for (Role role : roleList){
            int j = accountDao.addAccountRole(userId, role.getRoleId());
            if (j != 1){
                k = 0;
            }
        }
        if (i == 1 && k == 1){
            return 1;
        }
        return 0;
    }

    public int deleteAccount(String id){
        return accountDao.deleteAccount(id);
    }

    public int updatePassword(Account account){
        account.setUserId(MD5Util.getMD5String("000000"));
        int updateAccount = accountDao.updateAccount(account);
        return updateAccount;
    }
}
