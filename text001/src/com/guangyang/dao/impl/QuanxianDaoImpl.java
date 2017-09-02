package com.guangyang.dao.impl;

import com.guangyang.bean.Permission;
import com.guangyang.bean.Quanxian;
import com.guangyang.dao.QuanxianDao;
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
public class QuanxianDaoImpl implements QuanxianDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public QuanxianDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    @Override
    public List<Permission> getAll() {
        try {
            String sql ="select * from permission";
            return queryRunner.query(sql,new BeanListHandler<Permission>(Permission.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Permission> getParents() {
        return null;
    }


    @Override
    public void add(String name,String url,int type,int pId) {
        String sql = "INSERT INTO Permission(`name`,`urll`,`type`,`pId`) VALUES (?,?,?,?,?)";
        try {
            queryRunner.update(sql,name,url,type,pId);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM Permission WHERE `id`=?";
        try {
            queryRunner.update(sql,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(int id, String name,String url,int type,int pId,int status) {
        String sql = "UPDATE Permission set name=?,url=?,type=?,pId=?,status=? WHERE id=?";
        try {
            queryRunner.update(sql,name,url,type,pId,status,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Permission getById(int id) {
        Permission permission = null;
        String sql = "SELECT  * FROM Permission WHERE id=?";
        try {
            permission = queryRunner.query(sql,new BeanHandler<Permission>(Permission.class,processor),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return permission;
    }

}
