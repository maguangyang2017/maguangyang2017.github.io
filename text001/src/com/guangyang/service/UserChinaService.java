package com.guangyang.service;

import com.guangyang.bean.UsersChina;

import java.util.List;
import java.util.Map;

/**
 * Created by 马光阳 on 2017/7/14.
 */
public interface UserChinaService {
    public List<UsersChina> getPId();
    public Map<String,String> sCDao(String id);
}
