package com.shiwu;

import java.sql.Connection;


public class Main {
	public static void main(String[] args) {
		for(int i=0;i<100;i++){
			Connection connection = MysqlUtil.getInstance();
			Connection connection2 = MysqlUtil.getInstance();
			new Thread(new Shiwu1(connection)).start();
			new Thread(new Shuwu2(connection2)).start();
		}
	}
}
