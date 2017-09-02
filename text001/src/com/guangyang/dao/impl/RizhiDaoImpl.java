package com.guangyang.dao.impl;

import com.guangyang.bean.GuoLv;
import com.guangyang.bean.Rizhi;
import com.guangyang.dao.RizhiDao;
import com.guangyang.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by 马光阳 on 2017/7/13.
 */
public class RizhiDaoImpl implements RizhiDao {
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();


    @Override
    public void add(Rizhi rizhi) {
        String sql = "insert into rizhi(caozuo,user,ctime,url,qtype,canshu,uip,biaoshi,quanxian) values(?,?,?,?,?,?,?,?,?)";
        try {
            queryRunner.update(sql,rizhi.getCaozuo(),rizhi.getUser(),rizhi.getCtime(),rizhi.getUrl(),rizhi.getQtype(),rizhi.getCanshu(),rizhi.getBiaoshi(),rizhi.getUip(),rizhi.getQuanxian());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Rizhi> getAll() {
        String sql = "select * from rizhi";
        try {
            return queryRunner.query(sql,new BeanListHandler<Rizhi>(Rizhi.class));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
