package com.guangyang.dao.impl;

import com.guangyang.bean.AdminUser;
import com.guangyang.bean.Ti;
import com.guangyang.dao.YonghuDao;
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
public class YonghuDaoImpl implements YonghuDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public YonghuDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    @Override
    public List<AdminUser> getAll() {
        try {
            String sql ="select * from adminuser;";
            return queryRunner.query(sql,new BeanListHandler<AdminUser>(AdminUser.class,processor) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<AdminUser> getParents() {
        return null;
    }

    @Override
    public void add(String username, String password) {
        String sql = "INSERT INTO adminuser(`username`,`password`) VALUES (?,?)";
        try {
            queryRunner.update(sql,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM `adminuser` WHERE `id`=?";
        try {
            queryRunner.update(sql,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(int id, String username, String password, String loginip, String ctime, String status) {

    }

    @Override
    public AdminUser getById(int id) {
        AdminUser adminUser = null;
        String sql = "SELECT  * FROM `adminuser` WHERE id=?";
        try {
            adminUser = queryRunner.query(sql,new BeanHandler<AdminUser>(AdminUser.class,processor),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adminUser;
    }
}
