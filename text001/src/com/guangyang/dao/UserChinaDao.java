package com.guangyang.dao;

import com.guangyang.bean.UsersChina;

import java.util.List;
import java.util.Map;

/**
 * Created by 马光阳 on 2017/7/14.
 */
public interface UserChinaDao {
    public List<UsersChina> getPid();
    public Map<String,String> selectChina(String id);
}
