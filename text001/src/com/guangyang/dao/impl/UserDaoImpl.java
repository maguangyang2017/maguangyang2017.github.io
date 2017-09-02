package com.guangyang.dao.impl;

import com.guangyang.bean.User;
import com.guangyang.dao.UserDao;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.UserService;
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
 * Created by 马光阳 on 2017/7/2.
 */
public class UserDaoImpl implements UserDao{
    private QueryRunner qr = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public UserDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    @Override
    public User getAdminUserByUsername(String uname) {
        String sql = "SELECT * FROM `tlog` WHERE `uname`=?";
        User user = null;
        try {
            user = qr.query(sql,new BeanHandler<User>(User.class),uname);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
