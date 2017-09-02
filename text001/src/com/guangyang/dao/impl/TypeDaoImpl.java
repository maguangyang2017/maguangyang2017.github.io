package com.guangyang.dao.impl;

import com.guangyang.bean.Type;
import com.guangyang.dao.TypeDao;
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
 * CreaterRunnd by 马光阳 on 2017/6/29.
 */
public class TypeDaoImpl implements TypeDao{
    private QueryRunner queryRunner = JdbcUtils.getQuerrRunner();
    RowProcessor processor = null;
    public TypeDaoImpl(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("create_time", "createTime");
        // 用构建好的HashMap建立一个BeanProcessor对象
        BeanProcessor bean = new BeanProcessor(map);
        processor = new BasicRowProcessor(bean);
    }
    @Override
    public List<Type> getAll() {
        try {
//              String sql = "select * from best_type where pid = ?";
            String sql ="SELECT b1.*,b2.title as ptitle FROM best_type as b1 JOIN best_type as b2 ON (b1.pid=b2.id) UNION select * ,title as ptitle FROM  best_type where pid=0 ORDER BY ctime DESC ;";
            return queryRunner.query(sql,new BeanListHandler<Type>(Type.class,processor) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Type> getParents() {
        try {
//              String sql = "select * from best_type where pid = ?";
            String sql ="SELECT * from best_type where pid = ?;";
            return queryRunner.query(sql,new BeanListHandler<Type>(Type.class,processor) );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addType(String title, String descriptipon, int pid) {
        String sql = "INSERT INTO best_type(`title`,`description`, `pid`) VALUES (?,?,?)";
        try {
            queryRunner.update(sql,title,descriptipon,pid);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteType(int id) {
        String sql = "DELETE FROM best_type WHERE `id`=?";
        try {
            queryRunner.update(sql,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(int id, String title, String desc, int pid) {
        String sql = "UPDATE best_type set title=?,description=?,pid=? WHERE id=?";
        try {
            queryRunner.update(sql,title,desc,pid,id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Type getTypeById(int id) {
        Type type = null;
        String sql = "SELECT  * FROM best_type WHERE id=?";
        try {
            type = queryRunner.query(sql,new BeanHandler<Type>(Type.class,processor),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return type;
    }

    @Override
    public Type selectType(int id) {
        String sql = "select * from best_type where id=?";
        try {
            return queryRunner.query(sql,new BeanHandler<Type>(Type.class),id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Type> getSupplyType(int id) {
        String sql = "select * from best_type where pid=?";
        try {
            return queryRunner.query(sql,new BeanListHandler<Type>(Type.class,processor),id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
