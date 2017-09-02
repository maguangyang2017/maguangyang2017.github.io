package com.guangyang.service;

import com.guangyang.bean.AdminUser;
import com.guangyang.exception.AdminUserPasswordException;
import com.guangyang.exception.AdminUserUsernameException;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public interface AdminUserService {
    public AdminUser loginCheck(AdminUser adminUser) throws AdminUserPasswordException,AdminUserUsernameException;
}
