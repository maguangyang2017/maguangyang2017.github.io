package com.guangyang.service.impl;

import com.guangyang.bean.Log;
import com.guangyang.dao.LogDao;
import com.guangyang.exception.AdminUserPasswordException;
import com.guangyang.exception.AdminUserUsernameException;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.LogService;

/**
 * Created by 马光阳 on 2017/6/30.
 */
public class LogServiceImpl implements LogService{
    LogDao logDao = BeanFactory.getInstance("logDao",LogDao.class);


    @Override
    public Log loginCheck(Log log) throws AdminUserPasswordException, AdminUserUsernameException {
        Log log1 = logDao.getLogByName(log.getName());
        System.out.print(log1);
        if(log1 == null){
            //没有查到这个用户，用户名不对
            throw new AdminUserUsernameException("用户名不对");
        }else{
            if(log1.getPassword().equals(log.getPassword())){
                //登录成功
            }else{
                //密码错误
                throw new AdminUserPasswordException("密码不正确");
            }
        }
        return log1;
    }
}
