package com.guangyang.service.impl;

import com.guangyang.bean.AdminUser;
import com.guangyang.dao.AdminUserDao;
import com.guangyang.exception.AdminUserPasswordException;
import com.guangyang.exception.AdminUserUsernameException;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.AdminUserService;

/**
 * Created by 马光阳 on 2017/6/29.
 */
public class AdminUserServiceImpl implements AdminUserService{
    AdminUserDao adminUserDao = BeanFactory.getInstance("adminUserDao",AdminUserDao.class);
    @Override
    public AdminUser loginCheck(AdminUser adminUser) throws AdminUserPasswordException, AdminUserUsernameException {
        AdminUser adminUser1 = adminUserDao.getAdminUserByUsername(adminUser.getUsername());
        if(adminUser1 == null){
            //没有查到这个用户，用户名不对
            throw new AdminUserUsernameException("用户名不对");
        }else{
            if(adminUser1.getPassword().equals(adminUser.getPassword())){
                //登录成功
            }else{
                //密码错误
                throw new AdminUserPasswordException("密码不正确");
            }
        }
        return adminUser1;
    }
}
