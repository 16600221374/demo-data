package com.example.demodata.connect;

import com.example.demodata.utils.ChineseNameGenerator;
import com.example.demodata.utils.IdCardGenerator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @ClassName: ConnectMysql
 * @Author: liuzuncai
 * @Description: 链接mysql
 * @Date: 2021/6/8 15:22
 * @Version: 1.0
 */
public class ConnectMysql {
    private static final String url = "jdbc:mysql://10.19.151.143:3306/test_for_data?rewriteBatchedStatements=true";
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static Connection connection;

    public static Connection getMysqlConnect(){
        Connection connection = null;
        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(url,"root","Bocom_123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void insertDataToMysql(String sql) {
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = connection.prepareStatement(sql);
            Boolean b = ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        connection = getMysqlConnect();
        ChineseNameGenerator chineseNameGenerator = ChineseNameGenerator.getInstance();
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0;i<100000;i++) {
            executorService.submit(() -> {
               String name = chineseNameGenerator.generate();
               String id1 = IdCardGenerator.generate();
               String id2 = IdCardGenerator.generate();
               String relation = "邻居";
               String sql = "INSERT INTO person_relation(zjhm1,zjhm2,name,relation) VALUES(\""+id1+"\",\""+id2+"\",\""+name+"\",\""+relation+"\");";
               insertDataToMysql(sql);
            });
        }
    }
}
