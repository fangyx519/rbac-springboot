package com.rbac.dao;

import com.rbac.entity.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fang.yixin
 * @description 菜单管理
 * @date 2020/6/17
 */
@Mapper
@Repository
public interface MenuDao {
    /**
     * 新增菜单
     * @param menu
     * @return
     */
    int addMenu(Menu menu);

    /**
     * 删除菜单
     * @param id
     * @return
     */
    int deleteMenu(String id);

    /**
     * 修改菜单信息
     * @param menu
     * @return
     */
    int updateMenu(Menu menu);

    /**
     * 根据id查找菜单，用于菜单管理中的查询
     * @param id
     * @return
     */
    Menu selectById(String id);

    /**
     * 通过名称查找菜单，用于菜单管理中的查询
     * @param menuName
     * @return
     */
    Menu selectByName(String menuName);

    /**
     * 查找所有的菜单，用于菜单管理中的列表展示
     * @return
     */
    List<Menu> selectAllMenus();
}
