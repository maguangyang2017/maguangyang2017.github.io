package com.guangyang.MyConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.LinkedList;

/**
 * Created by zh201 on 2017/6/22.
 */
public class MyConnection {
    private static LinkedList<Connection> connections = new LinkedList<Connection>();
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            for(int i = 0;i < 20;i++){

                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/zqw", "root", "123");
                if(!connection.isClosed()){
                    System.out.println("正在初始化链接，第"+(i+1)+"条");
                    connections.add(connection);
                }
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public MyConnection(){

    }
    //找链接
    public static Connection getIntance(){
        if(connections.size()>0){
            System.out.println("借出一条链接");
            return connections.removeFirst();
        }else{
            try {
                connections.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return null;
    }
    //还链接
    public static void freeConnection(Connection connection){
        synchronized (connections) {
            System.out.println("还回一条链接");
            connections.add(connection);
            connections.notifyAll();
        }
    }

}
