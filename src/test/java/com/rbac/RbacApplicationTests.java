package com.rbac;

import com.rbac.dao.*;
import com.rbac.entity.*;
import com.rbac.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RbacApplicationTests {
    @Autowired
    private AccountService accountService;

    @Autowired
    private AccountRoleDao accountRoleDao;

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private MenuDao menuDao;

    @Autowired
    private ResourceDao resourceDao;

    @Autowired
    private ResourceRoleDao resourceRoleDao;

    @Autowired
    private RoleDao roleDao;


    @Test
    void contextLoads() {
        System.out.println("进入测试");
        account();
    }

    void account(){
        /*List<Account> accounts = accountDao.selectAllAccounts();
        for (Account account: accounts){
            System.out.println(account);
        }*/

        for (int i = 0; i < 11; i++) {
            Account account = new Account();
            account.setUserId(""+i);
            account.setPassword("000000");
            account.setUserName("fang.yixin"+i);
            accountService.addAccount(account);
        }

    }

    void accountRole(){
        AccountRole accountRole = new AccountRole();
        int i = accountRoleDao.addAccountRole(accountRole);
        System.out.println(i);
    }

    void department(){
        List<Department> departments = departmentDao.selectAllDepartments();
        for (Department department : departments){
            System.out.println(department);
        }
    }

    void  menu(){
        List<Menu> menus = menuDao.selectAllMenus();
        for (Menu menu : menus){
            System.out.println(menu);
        }
    }

    void resource(){
        List<Resource> resources = resourceDao.selectAllResources();
        for (Resource resource : resources){
            System.out.println(resource);
        }
    }

    void resourceRole(){
        ResourceRole resourceRole = new ResourceRole();
        int i = resourceRoleDao.addResourceRole(resourceRole);
        System.out.println(i);
    }

    void role(){
        List<Role> roles = roleDao.selectAllRoles();
        for (Role role : roles){
            System.out.println(role);
        }
    }

}
