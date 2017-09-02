package com.guangyang.service;

import com.guangyang.bean.Liuyan;


import java.util.List;

public interface LiuYanservice {
    //添加
    public void add(Liuyan liuyan);
    public List<Liuyan> getAll();
}
