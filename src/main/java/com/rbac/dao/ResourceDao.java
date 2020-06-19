package com.rbac.dao;

import com.rbac.entity.Resource;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author fang.yixin
 * @description 资源管理
 * @date 2020/6/17
 */
@Mapper
@Repository
public interface ResourceDao {
    /**
     * 新增菜单
     * @param resource
     * @return
     */
    int addResource(Resource resource);

    /**
     * 删除菜单
     * @param id
     * @return
     */
    int deleteResource(Long id);

    /**
     * 修改菜单信息
     * @param resource
     * @return
     */
    int updateResource(Resource resource);

    /**
     * 根据id查找菜单，用于菜单管理中的查询
     * @param id
     * @return
     */
    Resource selectById(Long id);

    /**
     * 通过名称查找菜单，用于菜单管理中的查询
     * @param resourceName
     * @return
     */
    Resource selectByName(String resourceName);

    /**
     * 查找所有的菜单，用于菜单管理中的列表展示
     * @return
     */
    List<Resource> selectAllResources();

}
