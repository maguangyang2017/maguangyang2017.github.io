package com.guangyang.dao.impl;


import com.guangyang.bean.User;
import com.guangyang.dao.IUserMessageDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.BeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.RowProcessor;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMessageDaoImpl implements IUserMessageDao {
    QueryRunner qr = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public UserMessageDaoImpl(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("web_url","webUrl");
        map.put("user_name","userName");
        map.put("business_Email","businessEmail");
        map.put("security_Email","securityEmail");
        map.put("phone_number","phoneNumber");
        map.put("company_name","companyName");
        map.put("company_address","companyAddress");
        map.put("QQ","qq");
        map.put("MSN","msn");
        map.put("business_model","businessModel");
        map.put("registered_capital","registeredCapital");
        map.put("import_export_power","importExportPower");
        //用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }


    @Override
    public User getUser(Integer id) {
        String sql = "select * from users where id ="+id;
        User user = null;
//        CompanyBean company = null;
        try {
            user = qr.query(sql,new BeanHandler<User>(User.class,processor));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
//        user.setCompany(getCompany(id));
        return user;
    }

//    @Override
//    public CompanyBean getCompany(Integer id) {
//        String sql = "select * from company where id ="+id;
//        try {
//            return qr.query(sql,new BeanHandler<CompanyBean>(CompanyBean.class,processor));
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }

    @Override
    public void update(User users) {
//        String sql = "update users set business_Email=?,security_Email=?,phone_number=? where id=?";
//        try {
//            qr.update(sql,users.getBusinessEmail(),users.getSecurityEmail(),users.getPhoneNumber(),users.getId());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void update(Integer id, String password) {
        String sql = "update users set password=? where id=?";
        try {
            qr.update(sql,password,id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> getAll() {
        String sql = "select * from user";
        try {
            return qr.query(sql,new BeanListHandler<User>(User.class,processor));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //修改管理员账户信息
    public void AUpdate(User users){
//        String sql = "update users set user_name=?,password=?,status=? where id=?";
//        try {
//            qr.update(sql,users.getUserName(),users.getPassword(),users.getStatus(),users.getId());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void delete(Integer id) {
//        String sql = "delete from users where id=?";
//        try {
//            qr.update(sql,id);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
