package com.atjianyi.jdbc;

import com.atjianyi.jdbc.bean.Student;
import com.atjianyi.jdbc.utils.MysqlConnectUtils;
import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.ResultSet;

public class DemoTest {
    public static void main(String[] args) {
        try {
            selectInfo();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    static void delete() throws Exception{
        Connection connection = MysqlConnectUtils.getConnection();
        String sql = "delete from t_student where id = ?";
        java.sql.PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1,"1");
        boolean execute = statement.execute();
        if(execute){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
    }

    static void update() throws Exception {
        Connection con = MysqlConnectUtils.getConnection();
        String sql = "update t_student set name = ? where id = ?";
        java.sql.PreparedStatement statement = con.prepareStatement(sql);
        statement.setString(1,"王五");
        statement.setString(2,"1");
        int execute = statement.executeUpdate();
        if(execute>0){
            System.out.println("成功修改");
        }
    }

    static void selectInfo() throws Exception {
        Connection connection = MysqlConnectUtils.getConnection();
        //获取数据库操作对象
        String sql = "select * from t_student";
        PreparedStatement ps =null;
        ps = (PreparedStatement) connection.prepareStatement(sql);
        ResultSet res = ps.executeQuery();
        if(res.next()) {
            //获取这条数据个字段值
            String name  = res.getString(2);
            int id  = res.getInt(1);
            String sex  = res.getString(3);
            Student student = new Student(id, name, sex);
            System.out.println(student);
        }
    }

    static void insertInto() throws Exception {
        Connection connection = MysqlConnectUtils.getConnection();
        //获取数据库操作对象

        String sql = "insert into t_student(id,name,sex) values(?,?,?)";
        PreparedStatement ps =null;
        ps = (PreparedStatement) connection.prepareStatement(sql);
        //填充占位符
        ps.setString(1,"2");
        ps.setString(2, "iKun1@qq.com");
        ps.setString(3, "男");
        //执行
        ps.execute();
    }
}
