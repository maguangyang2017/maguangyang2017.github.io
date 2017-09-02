package com.guangyang.dao.impl;

import com.guangyang.bean.Juese;
import com.guangyang.dao.JueseDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.BeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.RowProcessor;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 马光阳 on 2017/7/7.
 */
public class JueseDaoImpl implements JueseDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public JueseDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    @Override
    public List<Juese> getAll() {
        try {
            String sql ="select * from juese";
            return queryRunner.query(sql,new BeanListHandler<Juese>(Juese.class,processor) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Juese> getParents() {
        return null;
    }

    @Override
    public void add(String name) {
        String sql = "INSERT INTO juese(`name`) VALUES (?)";
        System.out.print(name);
        try {
            queryRunner.update(sql,name);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM juese WHERE `id`=?";
        try {
            queryRunner.update(sql,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(int id, String name) {
        String sql = "UPDATE juese set name=? WHERE id=?";
        try {
            queryRunner.update(sql,name,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Juese getById(int id) {
        Juese juese = null;
        String sql = "SELECT  * FROM juese WHERE id=?";
        try {
            juese = queryRunner.query(sql,new BeanHandler<Juese>(Juese.class,processor),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return juese;
    }

    @Override
    public void setPower(int roleid,String[] powerids) {
        try {
            String sql = "INSERT INTO uj(`userid`,`jueid`) VALUES (?,?)";
            for(int i=0;i<powerids.length;i++){
                queryRunner.update(sql, roleid, powerids[i]);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
