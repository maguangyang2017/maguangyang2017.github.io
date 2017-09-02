package com.guangyang.dao.impl;

import com.guangyang.bean.Type;
import com.guangyang.dao.ShouyeTypeDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.BeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.RowProcessor;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 马光阳 on 2017/7/16.
 */
public class ShouyeTypeDaoImpl implements ShouyeTypeDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor rowProcessor = null;
    public ShouyeTypeDaoImpl() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        //用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        rowProcessor = new BasicRowProcessor(bean);
    }

    @Override
    public List<Type> getParents(int pid) {
        String sql = "SELECT * FROM best_type WHERE pid=0";
            try {
                return queryRunner.query(sql,new BeanListHandler<Type>(Type.class,rowProcessor));
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
    }

    @Override
    public List<Type> getById(int pid) {
        String sql = "SELECT * FROM best_type WHERE pid=?";
        try {
            return queryRunner.query(sql,new BeanListHandler<Type>(Type.class,rowProcessor),pid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
