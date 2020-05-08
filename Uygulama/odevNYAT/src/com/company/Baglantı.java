package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Baglantı {

    public Connection baglantı(){

        Connection conn=null;

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5434/Login",
                    "postgres", "123456");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

}
