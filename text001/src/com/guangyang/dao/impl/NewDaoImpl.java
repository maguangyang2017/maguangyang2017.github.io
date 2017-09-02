package com.guangyang.dao.impl;

import com.guangyang.bean.New;
import com.guangyang.bean.Type;
import com.guangyang.dao.NewDao;
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
 * Created by 马光阳 on 2017/7/2.
 */
public class NewDaoImpl implements NewDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public NewDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    //查询
    @Override
    public List<New> getAll() {
        try {
            String sql ="select * from news";
            return queryRunner.query(sql,new BeanListHandler<New>(New.class,processor) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<New> getParents() {
        return null;
    }

    @Override
    public void addNew(String title, String content) {
        String sql = "INSERT INTO news(`title`,`content`) VALUES (?,?)";
        try {
            queryRunner.update(sql,title,content);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //删除
    @Override
    public void deleteNew(int id) {
        String sql = "DELETE FROM news WHERE `id`=?";
        try {
            queryRunner.update(sql,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    //修改
    @Override
    public void update(int id, String title, String content) {
        String sql = "UPDATE news set title=?,content=? WHERE id=?";
        try {
            queryRunner.update(sql,title,content,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public New getNewById(int id) {
        New news1 = null;
        String sql = "SELECT  * FROM news WHERE id=?";
        try {
            news1 = queryRunner.query(sql,new BeanHandler<New>(New.class,processor),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return news1;
    }
}
