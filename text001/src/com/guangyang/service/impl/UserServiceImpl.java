package com.guangyang.service.impl;

import com.guangyang.bean.User;
import com.guangyang.dao.UserDao;
import com.guangyang.exception.AdminUserPasswordException;
import com.guangyang.exception.AdminUserUsernameException;
import com.guangyang.exception.UserException;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.UserService;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/2.
 */
public class UserServiceImpl implements UserService{
    UserDao userDao = BeanFactory.getInstance("userDao",UserDao.class);
    @Override
    public User loginCheck(User user) throws AdminUserPasswordException, AdminUserUsernameException {
        User user1 = userDao.getAdminUserByUsername(user.getUname());
        if(user1 == null){
            //没有查到这个用户，用户名不对
            throw new AdminUserUsernameException("用户名不对");
        }else{
            if(user1.getUpassword().equals(user.getUpassword())){
                //登录成功
            }else{
                //密码错误
                throw new AdminUserPasswordException("密码不正确");
            }
        }
        return user1;
    }
}
