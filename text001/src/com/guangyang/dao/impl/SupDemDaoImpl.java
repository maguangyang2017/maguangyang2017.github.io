package com.guangyang.dao.impl;


import com.guangyang.bean.SupDemBean;
import com.guangyang.dao.ISupDemDao;
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

public class SupDemDaoImpl implements ISupDemDao {
    QueryRunner qr = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public SupDemDaoImpl(){
        Map<String,String> map = new HashMap<String,String>();
        map.put("sd_type","sdType");
        //用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }

    @Override
    public List<SupDemBean> getAll(String sdType) {
        String sql = "select id,title,titleImgUrl,description,date,sd_type from sup_dem where sd_type="+sdType;
        try {
            return qr.query(sql,new BeanListHandler<SupDemBean>(SupDemBean.class,processor));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void add(SupDemBean supDemBean) {
        String sql = "insert into sup_dem(uid,title,fTypeId,zTypeId,titleImgUrl,description,price,address,content,sd_type) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            qr.update(sql,supDemBean.getUid(),supDemBean.getTitle(),supDemBean.getfTypeId(),supDemBean.getzTypeId(),supDemBean.getTitleImgUrl(),supDemBean.getDescription(),supDemBean.getPrice(),supDemBean.getAddress(),supDemBean.getContent(),supDemBean.getSdType());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public SupDemBean getSupDem(Integer id) {
        String sql = "select * from sup_dem where id="+id;
        try {
            return qr.query(sql,new BeanHandler<SupDemBean>(SupDemBean.class,processor));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public List<SupDemBean> getSupDemAll(){
        String sql = "select sup_dem.*,sd_type as ssdType,users.user_name as name from sup_dem JOIN users on sup_dem.uid = users.id";
        try {
            return qr.query(sql,new BeanListHandler<SupDemBean>(SupDemBean.class,processor));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(Integer id){
        String sql = "delete from sup_dem where id ="+id;
        try {
            qr.update(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void update(SupDemBean supDem){
        String sql = "update sup_dem set title=?,description=?,price=?,address=?,content=?,sd_type=? where id=?";
        try {
            qr.update(sql,supDem.getTitle(),supDem.getDescription(),supDem.getPrice(),supDem.getAddress(),supDem.getContent(),supDem.getSdType(),supDem.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<SupDemBean> getByCondition(String condition) {
        String sql = "select id,title,titleImgUrl,description,date,sd_type from sup_dem "+condition;
        try {
            return qr.query(sql,new BeanListHandler<SupDemBean>(SupDemBean.class,processor));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
