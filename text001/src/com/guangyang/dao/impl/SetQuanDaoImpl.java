package com.guangyang.dao.impl;

import com.guangyang.bean.SetQuan;
import com.guangyang.dao.SetQuanDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public class SetQuanDaoImpl implements SetQuanDao{
    private QueryRunner qr = JdbcUtils.getQuerrRunner();
    @Override
    public List<SetQuan> getUrl(int id) {
        String sql = "select urll from quanxian where id in(select quanid from jq where jueid in(select jueid from uj where userid=?))";
        try {
            return qr.query(sql,new BeanListHandler<SetQuan>(SetQuan.class),id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
