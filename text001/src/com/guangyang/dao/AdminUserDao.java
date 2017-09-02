package com.guangyang.dao;

import com.guangyang.bean.AdminUser;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public interface AdminUserDao {
    public AdminUser getAdminUserByUsername(String username);
}
