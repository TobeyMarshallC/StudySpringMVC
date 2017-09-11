package com.springmvc.test.blob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.*;
import java.sql.*;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/3.
 */
public class TestBlob {

    public static void main(String[] args) {
        File file = new File("D:\\IMG_3039.jpg");
        InputStream is = null;
        try {
             is = new FileInputStream(file);
            insert(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void insert(InputStream inputStream){
        String driver = "oracle.jdbc.driver.OracleDriver";
        String url = "jdbc:oracle:thin:@//localhost:1521/ydcaib";
        String user = "auth_db";
        String password = "auth_db";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName(driver);

            String sql = "insert into auth_db.test_blob(id,photo) values(1,?)";
            conn = DriverManager.getConnection(url,user,password);
            pstmt = conn.prepareStatement(sql);

            //pstmt.executeUpdate()
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if(conn !=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
