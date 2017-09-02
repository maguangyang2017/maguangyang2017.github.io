package com.guangyang.dao.impl;
import com.guangyang.bean.Qiu;
import com.guangyang.dao.QiuDao;
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

/**
 * Created by 马光阳 on 2017/7/6.
 */
public class QiuDaoImpl implements QiuDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public QiuDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    @Override
    public List<Qiu> getAll() {

        try {
            String sql ="select * from qmessage";
            return queryRunner.query(sql,new BeanListHandler<Qiu>(Qiu.class,processor) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Qiu addGong(String qtitle) {
        Qiu qiu1 = null;
        String sql = "INSERT INTO qmesssage(`qtitle`) VALUES (?)";
        try {
//            news1 = queryRunner.query(sql,new BeanHandler<New>(New.class,processor),id);
            qiu1 =  queryRunner.query(sql,new BeanHandler<Qiu>(Qiu.class,processor),qtitle);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return qiu1;
    }

    @Override
    public Qiu getById(int id) {
        Qiu qiu = null;
        String sql = "SELECT  * FROM qmessage WHERE id=?";
        try {
            qiu = queryRunner.query(sql,new BeanHandler<Qiu>(Qiu.class,processor),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return qiu;
    }
}

