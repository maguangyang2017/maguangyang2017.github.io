package com.guangyang.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import org.apache.commons.dbutils.QueryRunner;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public class JdbcUtils {
    // 初始化连接池
    private static DataSource dataSource;
    static {
        dataSource = new ComboPooledDataSource();
    }
    public static DataSource getDataSource() {
        return dataSource;
    }
    public static Connection getConnection(){
        try {
            return (Connection) dataSource.getConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    /**
     * 创建DbUtils常用工具类对象
     */
    public static QueryRunner getQuerrRunner() {
        return new QueryRunner(dataSource);
    }
}
