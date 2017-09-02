package com.guangyang.dao.impl;

import com.guangyang.bean.Gong;
import com.guangyang.dao.GongDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.*;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 马光阳 on 2017/7/5.
 */
public class GongDaoImpl implements GongDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public GongDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    @Override
    public List<Gong> getAll() {

        try {
            String sql ="select * from gmessage";
            return queryRunner.query(sql,new BeanListHandler<Gong>(Gong.class,processor) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Gong addGong(String tijiao) {
        Gong gong1 = null;
        String sql = "INSERT INTO gmessage(`gtitle`) VALUES (?)";
        try {
//            news1 = queryRunner.query(sql,new BeanHandler<New>(New.class,processor),id);
            queryRunner.update(sql,tijiao);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return gong1;
    }


    @Override
    public Gong getById(int id) {
        Gong gong = null;
        String sql = "SELECT  * FROM gmessage WHERE id=?";
        try {
            gong = queryRunner.query(sql,new BeanHandler<Gong>(Gong.class,processor),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return gong;
    }

    @Override
    public List<Gong> getAllInfo(int page) {
        int count = getCount();//总条数
        int pageCount = (int)(Math.ceil(((double)count)/5));//页数
        try {
            String sql ="SELECT id,gtitle from gmessage limit "+(page-1)*7+","+7;
            return queryRunner.query(sql,new BeanListHandler<Gong>(Gong.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //获取总条数
    public int getCount(){
        String sql = "select count(*) from gmessage";
        try {
            return queryRunner.query(sql, new ResultSetHandler<Integer>() {
                @Override
                public Integer handle(ResultSet resultSet) throws SQLException {
                    Integer i = 0;
                    while(resultSet.next()){
                        i=resultSet.getInt(1);
                    }
                    return i;
                }
            });


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
