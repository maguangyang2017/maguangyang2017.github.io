package com.guangyang.service;


import com.guangyang.bean.Log;
import com.guangyang.exception.AdminUserPasswordException;
import com.guangyang.exception.AdminUserUsernameException;

/**
 * Created by 马光阳 on 2017/7/3.
 */
public interface LogService {
    public Log loginCheck(Log log) throws AdminUserPasswordException,AdminUserUsernameException;
}
