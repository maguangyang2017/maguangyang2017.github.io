package com.guangyang.dao.impl;

import com.guangyang.bean.Permission;
import com.guangyang.dao.PermissionDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/10.
 */
public class PermissionDaoImpl implements PermissionDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    @Override
    public List<Permission> getAll() {
        try {
            String sql ="select * from qmessage";
            return queryRunner.query(sql,new BeanListHandler<Permission>(Permission.class) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
