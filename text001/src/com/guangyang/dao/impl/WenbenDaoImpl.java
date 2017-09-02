package com.guangyang.dao.impl;

import com.guangyang.bean.Wenben;
import com.guangyang.dao.WenbenDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/11.
 */
public class WenbenDaoImpl implements WenbenDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    @Override
    public List<Wenben> getAll() {
        try {
            String sql ="SELECT * from Wenben ;";
            return queryRunner.query(sql,new BeanListHandler<Wenben>(Wenben.class) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Wenben> getParents() {
        return null;
    }

    @Override
    public void add(String wen) {
        String sql = "INSERT INTO wenben(`wen`) VALUES (?)";
        try {
            queryRunner.update(sql,wen);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM wenben WHERE `id`=?";
        try {
            queryRunner.update(sql,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(int id, String wen) {
        String sql = "UPDATE wenben set wen=? WHERE id=?";
        try {
            queryRunner.update(sql,wen,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Wenben getById(int id) {
        Wenben wenben = null;
        String sql = "SELECT  * FROM best_type WHERE id=?";
        try {
            wenben = queryRunner.query(sql,new BeanHandler<Wenben>(Wenben.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return wenben;
    }
}
