package com.guangyang.service.impl;



import com.guangyang.bean.User;
import com.guangyang.dao.IUserMessageDao;
import com.guangyang.dao.impl.UserMessageDaoImpl;
import com.guangyang.factory.BeanFactory;
import com.guangyang.service.Service;

import java.util.List;

public class UserMessageServiceImpl implements Service<User> {
    IUserMessageDao iUserDao = BeanFactory.getInstance("userMessageDao",UserMessageDaoImpl.class);
    @Override
    public void save(User model) {

    }

    @Override
    public void save(List<User> models) {

    }

    @Override
    public void deleteById(Integer id) {
        iUserDao.delete(id);
    }

    @Override
    public void deleteByIds(String ids) {

    }

    @Override
    public void update(User model) {
        iUserDao.update(model);
    }
    //修改密码
    public void update(Integer id,String password){
        iUserDao.update(id,password);
    }

    public void AUpdate(User users){
        iUserDao.AUpdate(users);
    }
    @Override
    public User findById(Integer id) {
        User user = iUserDao.getUser(id);
//        CompanyBean company = iUserDao.getCompany(id);
//        user.setCompany(company);
        return user;
    }

    @Override
    public User findBy(String property, Object value) {
        return null;
    }

    @Override
    public List<User> findByIds(String ids) {
        return null;
    }

    @Override
    public List<User> findByCondition(String condition) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return iUserDao.getAll();
    }
}
