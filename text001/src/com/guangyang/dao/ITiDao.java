package com.guangyang.dao;

import com.guangyang.bean.Ti;

import java.util.List;

/**
 * Created by Lenovo on 2017/7/2.
 */
public interface ITiDao {
    public int addti(String name, String password, String shangwu, String anquan, String shouji);
    public Ti getById(int id);
    public List<Ti> getAll();
}
