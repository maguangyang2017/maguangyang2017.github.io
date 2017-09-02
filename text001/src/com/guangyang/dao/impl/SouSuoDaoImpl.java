package com.guangyang.dao.impl;

import com.guangyang.bean.New;
;
import com.guangyang.bean.SupDemBean;
import com.guangyang.dao.ISouSuoDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class SouSuoDaoImpl implements ISouSuoDao {
    QueryRunner qr = JdbcUtils.getQuerrRunner();
    @Override
    public List<New> getNews(String like) {
        String sql = "SELECT * FROM news WHERE title LIKE '%"+like+"%'";
        try {
            return qr.query(sql,new BeanListHandler<New>(New.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<SupDemBean> getSupDems(String like) {
        String sql = "SELECT * FROM sup_dem WHERE sup_dem.title LIKE '%"+like+"%'";
        try {
            return qr.query(sql,new BeanListHandler<SupDemBean>(SupDemBean.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
