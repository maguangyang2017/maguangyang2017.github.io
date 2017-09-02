package com.guangyang.dao;

import com.guangyang.bean.User;


import java.util.List;

public interface IUserMessageDao {
    //返回用户基本信息
    public User getUser(Integer id);
    //返回用户公司信息
//    public Company getCompany(Integer id);
    //修改基本信息
    public void update(User users);
    //修改密码
    public void update(Integer id, String password);
    //返回全部用户信息
    public List<User> getAll();
    //管理员修改
    public void AUpdate(User users);
    //删除用户
    public void delete(Integer id);
}
