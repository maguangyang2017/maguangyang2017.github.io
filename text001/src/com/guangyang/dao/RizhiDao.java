package com.guangyang.dao;

import com.guangyang.bean.GuoLv;
import com.guangyang.bean.Rizhi;

import java.util.List;

/**
 * Created by dell on 2017/7/11.
 */
public interface RizhiDao {
    public void add(Rizhi rizhi);
    public List<Rizhi> getAll();
}
