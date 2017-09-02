package com.guangyang.dao.impl;

import com.guangyang.MyConnection.MyConnection;
import com.guangyang.bean.UsersChina;
import com.guangyang.dao.UserChinaDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 马光阳 on 2017/7/14.
 */
public class UserChinaDaoImpl implements UserChinaDao{
    @Override
    public List<UsersChina> getPid() {
        List<UsersChina> list = new ArrayList<UsersChina>();
        UsersChina usersChina = null;
        MyConnection myConnection = new MyConnection();
        Connection connection = myConnection.getIntance();
        String sql = "SELECT * FROM china where pid = 0 and id !=0";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int pid = rs.getInt(3);
                usersChina = new UsersChina(id,name,pid);
                list.add(usersChina);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        myConnection.freeConnection(connection);
        return list;
    }

    @Override
    public Map<String, String> selectChina(String id) {
        Map<String,String> map = new HashMap<>();
        MyConnection myConnection = new MyConnection();
        Connection connection = myConnection.getIntance();
        String sql = "SELECT * FROM china where pid = " + id;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()){
                String cid = rs.getInt(1)+"";
                String name = rs.getString(2);
                map.put(cid,name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        myConnection.freeConnection(connection);
        return map;
    }
}
