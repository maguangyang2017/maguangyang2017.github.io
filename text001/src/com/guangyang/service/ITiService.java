package com.guangyang.service;

import com.guangyang.bean.Ti;

import java.util.List;

/**
 * Created by Lenovo on 2017/7/2.
 */
public interface ITiService {
    public void addTi(String name, String password, String shangwu, String anquan, String shouji);
    public Ti getById(int id);
    public List<Ti> getAll();
}
