package com.guangyang.dao.impl;

import com.guangyang.bean.Log;
import com.guangyang.dao.LogDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;


/**
 * Created by 马光阳 on 2017/6/30.
 */
public class LogDaoImpl implements LogDao{
    private QueryRunner qr = JdbcUtils.getQuerrRunner();
    @Override
    public Log getLogByName(String name) {
        String sql = "SELECT * FROM `tlog` WHERE `name`=?";
        Log log = null;
        try {
            log = qr.query(sql,new BeanHandler<Log>(Log.class),name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return log;
    }
}
