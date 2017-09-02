package com.guangyang.dao.impl;

import com.guangyang.bean.AdminUser;
import com.guangyang.dao.AdminUserDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public class AdminUserDaoImpl implements AdminUserDao{
    private QueryRunner qr = JdbcUtils.getQuerrRunner();
    @Override
    public AdminUser getAdminUserByUsername(String username) {
        String sql = "SELECT * FROM `adminuser` WHERE `username`=?";
        AdminUser adminUser = null;
        try {
            adminUser = qr.query(sql,new BeanHandler<AdminUser>(AdminUser.class),username);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return adminUser;
    }
}
