package com.shiwu;

import java.sql.Connection;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Shuwu2 implements Runnable{
	Connection connection;
	public Shuwu2(Connection connection){
		this.connection = connection;
	}
	@Override
	public void run() {
		String sql = "insert into sw('wz') values ('asdf')";
		PreparedStatement preparedStatement = null;
		try {
			connection.setAutoCommit(false);
			preparedStatement = (PreparedStatement) connection.prepareStatement(sql);
			preparedStatement.execute();
			connection.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
	
}
