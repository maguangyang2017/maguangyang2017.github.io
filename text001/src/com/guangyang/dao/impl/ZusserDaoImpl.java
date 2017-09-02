package com.guangyang.dao.impl;

import com.guangyang.bean.Zusser;
import com.guangyang.dao.ZusserDao;
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
 * Created by 马光阳 on 2017/7/7.
 */
public class ZusserDaoImpl implements ZusserDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public ZusserDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    @Override
    public List<Zusser> getAll() {
        try {
            String sql ="select * from zusser";
            return queryRunner.query(sql,new BeanListHandler<Zusser>(Zusser.class,processor) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Zusser> getParents() {
        return null;
    }

    @Override
    public void add(String name, String password) {
        String sql = "INSERT INTO zusser(`name`,`password`) VALUES (?,?)";
        try {
            queryRunner.update(sql,name,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM zusser WHERE `id`=?";
        try {
            queryRunner.update(sql,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(String name, String password) {
        String sql = "UPDATE zusser set title=?,content=? WHERE id=?";
        try {
            queryRunner.update(sql,name,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Zusser getById(int id) {
        return null;
    }
}
