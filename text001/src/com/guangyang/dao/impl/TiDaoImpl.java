package com.guangyang.dao.impl;


import com.guangyang.bean.Gong;
import com.guangyang.bean.Ti;
import com.guangyang.dao.ITiDao;
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
 * Created by Lenovo on 2017/7/2.
 */
public class TiDaoImpl implements ITiDao {
    private QueryRunner qr = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public TiDaoImpl(){
        Map<String,String> map = new HashMap<>();
        map.put("create_time","createTime");
        //用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }

    public int addti(String name, String password, String shangwu, String anquan, String shouji){
        System.out.println(name+password+shangwu+anquan+shouji);
        String sql = "insert into table1(`name`,`password`,`shangwu`,`anquan`,`shouji`) values(?,?,?,?,?)";
        try {
            qr.update(sql,name,password,shangwu,anquan,shouji);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }

    @Override
    public Ti getById(int id) {
        Ti ti = null;
        String sql = "SELECT  * FROM table1 WHERE id=?";
        try {
            ti = qr.query(sql,new BeanHandler<Ti>(Ti.class,processor),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ti;
    }

    @Override
    public List<Ti> getAll() {
        try {
            String sql ="select * from table1";
            return qr.query(sql,new BeanListHandler<Ti>(Ti.class,processor) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
