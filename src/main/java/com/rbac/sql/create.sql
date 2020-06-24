CREATE TABLE `account` (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号，存手机号或者email',
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码,md5加密',
  `user_name` varchar(64) DEFAULT NULL COMMENT '用户名',
  `user_status` tinyint unsigned DEFAULT '2' COMMENT '用户状态，0：停用；1：正常；2:禁止登陆',
  `dept_id` bigint unsigned NOT NULL DEFAULT '0' COMMENT '部门id',
  `error_counts` smallint unsigned DEFAULT '0' COMMENT '超过5次当日不可再次登陆',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

CREATE TABLE `role` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_code` varchar(64) NOT NULL COMMENT '角色编码',
  `role_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `role_desc` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `role_status` tinyint unsigned DEFAULT '1' COMMENT '角色状态,0：禁用；1：启用',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `role_code` (`role_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';

CREATE TABLE `resource` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '资源id',
  `res_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源编码',
  `res_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源名称',
  `res_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '资源描述',
  `res_type` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源类型page:页面;button:按钮;interface:接口;other:其他',
  `res_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源地址',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `res_code` (`res_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源表';

CREATE TABLE `department` (
  `id` bigint unsigned NOT NULL COMMENT '部门id',
  `dept_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门名称',
  `dept_status` tinyint unsigned DEFAULT '1' COMMENT '部门状态:0:停用；1:正常',
  `is_leaf` smallint DEFAULT '1' COMMENT '是否叶子：0:不是；1:是',
  `dept_level` smallint NOT NULL COMMENT '部门级别',
  `dept_seq` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '部门序列',
  `parent_id` bigint NOT NULL COMMENT '父部门id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='部门表';

CREATE TABLE `account_role` (
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户id',
  `role_id` bigint NOT NULL COMMENT '角色id',
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户-角色关系表';

CREATE TABLE `resource_role` (
  `role_id` bigint NOT NULL COMMENT 'role_id',
  `res_id` bigint NOT NULL COMMENT '资源id',
  PRIMARY KEY (`role_id`,`res_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='资源-角色关系表';

CREATE TABLE `menu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '菜单id',
  `menu_name` varchar(64) NOT NULL COMMENT '菜单名称',
  `menu_label` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '菜单标题',
  `menu_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '菜单编码',
  `is_leaf` smallint NOT NULL COMMENT '是否叶子:0：不是；1：是',
  `menu_level` smallint NOT NULL COMMENT '菜单级别：1：一级菜单；2：二级菜单',
  `display_order` smallint DEFAULT NULL COMMENT '显示顺序',
  `menu_seq` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '菜单序列',
  `res_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '功能编码',
  `parent_id` bigint NOT NULL COMMENT '父菜单id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单表';