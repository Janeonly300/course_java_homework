package com.atjianyi.jdbc.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MysqlConnectUtils {

    public static Connection getConnection() throws Exception {
        //加载流
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");


        String url = "jdbc:mysql://localhost:3306/student_db?useSSL=false";
        String user = "root";
        String password = "root";
        String driverClass = "com.mysql.jdbc.Driver";

        //加载驱动
        Class.forName(driverClass);

        //获取连接
        return DriverManager.getConnection(url,user,password);
    }
}
