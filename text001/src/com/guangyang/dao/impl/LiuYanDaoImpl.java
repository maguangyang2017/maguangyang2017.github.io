package com.guangyang.dao.impl;

import com.guangyang.bean.Liuyan;
import com.guangyang.bean.New;
import com.guangyang.dao.LiuYanDao;
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
 * Created by Administrator on 2017/7/16.
 */
public class LiuYanDaoImpl implements LiuYanDao {
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public LiuYanDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    //添加
    @Override
    public void add(int type, int xid, String name, String dian, String shou, String you, String content) {
        String sql = "INSERT INTO liuyan(`type`,`xid`, `name`,`dian`, `shou`,`you`, `content`) VALUES (?,?,?,?,?,?,?)";
        try {
            queryRunner.update(sql,type,xid,name,dian,shou,you,content);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Liuyan> getAll() {

        try {
            String sql = "select * from liuyan";
            return queryRunner.query(sql,new BeanListHandler<Liuyan>(Liuyan.class) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
