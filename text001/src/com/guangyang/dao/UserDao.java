package com.guangyang.dao;

import com.guangyang.bean.User;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/2.
 */
public interface UserDao {
    public User getAdminUserByUsername(String uname);
}
