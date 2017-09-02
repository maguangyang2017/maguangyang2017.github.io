package com.guangyang.service;

import com.guangyang.bean.Rizhi;

import java.util.List;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public interface RizhiService {
    public void add(Rizhi rizhi);
    //返回所有
    public List<Rizhi> getALL();
}
