CREATE TABLE `account` (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '�˺ţ����ֻ��Ż���email',
  `password` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '����,md5����',
  `user_name` varchar(64) DEFAULT NULL COMMENT '�û���',
  `user_status` tinyint unsigned DEFAULT '2' COMMENT '�û�״̬��0��ͣ�ã�1��������2:��ֹ��½',
  `dept_id` bigint unsigned NOT NULL DEFAULT '0' COMMENT '����id',
  `error_counts` smallint unsigned DEFAULT '0' COMMENT '����5�ε��ղ����ٴε�½',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�û���';

CREATE TABLE `role` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '��ɫid',
  `role_code` varchar(64) NOT NULL COMMENT '��ɫ����',
  `role_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '��ɫ����',
  `role_desc` varchar(255) DEFAULT NULL COMMENT '��ɫ����',
  `role_status` tinyint unsigned DEFAULT '1' COMMENT '��ɫ״̬,0�����ã�1������',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `role_code` (`role_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��ɫ��';

CREATE TABLE `resource` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '��Դid',
  `res_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '��Դ����',
  `res_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '��Դ����',
  `res_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '��Դ����',
  `res_type` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '��Դ����page:ҳ��;button:��ť;interface:�ӿ�;other:����',
  `res_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '��Դ��ַ',
  PRIMARY KEY (`id`) USING BTREE,
  KEY `res_code` (`res_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Դ��';

CREATE TABLE `department` (
  `id` bigint unsigned NOT NULL COMMENT '����id',
  `dept_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '��������',
  `dept_status` tinyint unsigned DEFAULT '1' COMMENT '����״̬:0:ͣ�ã�1:����',
  `is_leaf` smallint DEFAULT '1' COMMENT '�Ƿ�Ҷ�ӣ�0:���ǣ�1:��',
  `dept_level` smallint NOT NULL COMMENT '���ż���',
  `dept_seq` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '��������',
  `parent_id` bigint NOT NULL COMMENT '������id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='���ű�';

CREATE TABLE `account_role` (
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '�û�id',
  `role_id` bigint NOT NULL COMMENT '��ɫid',
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�û�-��ɫ��ϵ��';

CREATE TABLE `resource_role` (
  `role_id` bigint NOT NULL COMMENT 'role_id',
  `res_id` bigint NOT NULL COMMENT '��Դid',
  PRIMARY KEY (`role_id`,`res_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Դ-��ɫ��ϵ��';

CREATE TABLE `menu` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '�˵�id',
  `menu_name` varchar(64) NOT NULL COMMENT '�˵�����',
  `menu_label` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '�˵�����',
  `menu_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '�˵�����',
  `is_leaf` smallint NOT NULL COMMENT '�Ƿ�Ҷ��:0�����ǣ�1����',
  `menu_level` smallint NOT NULL COMMENT '�˵�����1��һ���˵���2�������˵�',
  `display_order` smallint DEFAULT NULL COMMENT '��ʾ˳��',
  `menu_seq` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '�˵�����',
  `res_code` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '���ܱ���',
  `parent_id` bigint NOT NULL COMMENT '���˵�id',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='�˵���';