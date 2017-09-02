package com.guangyang.dao.impl;

import com.guangyang.bean.New;
import com.guangyang.bean.SupDemBean;
import com.guangyang.dao.FabuDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.BeanProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.RowProcessor;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 马光阳 on 2017/7/17.
 */
public class FabuDaoImpl implements FabuDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public FabuDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    @Override
    public List<SupDemBean> getAll() {
        try {
            String sql ="select * from sup_dem";
            return queryRunner.query(sql,new BeanListHandler<SupDemBean>(SupDemBean.class,processor) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<SupDemBean> getParents() {
        return null;
    }

    @Override
    public void add(String title, String description, int price, String address, String content) {
        String sql = "INSERT INTO sup_dem (`title`,`description`, `price`, `address`, `content`) VALUES (?,?,?,?,?)";
        try {
            queryRunner.update(sql,title,description,price,address,content);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id, String title, String description, int price, String address, String content) {

    }

    @Override
    public SupDemBean getById(int id) {
        return null;
    }
}
