package com.guangyang.service;

import com.guangyang.bean.User;
import com.guangyang.exception.AdminUserPasswordException;
import com.guangyang.exception.AdminUserUsernameException;
import com.guangyang.exception.UserException;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/2.
 */
public interface UserService {
    public User loginCheck(User user) throws AdminUserPasswordException,AdminUserUsernameException;
}
