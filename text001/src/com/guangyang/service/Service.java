package com.guangyang.service;

import java.util.List;

public interface Service<T> {
    void save(T model);//持久化
    void save(List<T> models);//批量持久化
    void deleteById(Integer id);//通过主键删除
    void deleteByIds(String ids);//批量删除 eg: ids -> "1,2,3,4"
    void update(T model);//更新
    T findById(Integer id);//通过ID查找
    T findBy(String property, Object value);//通过某个成员属性查找，value需符合unique约束
    List<T> findByIds(String ids);//通过多个ID查找//eg: ids -> "1,2,3,4"
    List<T> findByCondition(String condition);//根据条件查找
    List<T> findAll();//获取所有
}
