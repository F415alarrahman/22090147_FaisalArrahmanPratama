/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.arr;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author f415a
 */
public class ConDB {
    public static Connection getConnectionToDB(){
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setDatabaseName("22090147_faisal_arrahman_pratama");
            m.setUser("root"); 
            m.setPassword(""); 
            m.setServerName("localhost"); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            Connection k = m.getConnection();
            
            System.out.println("Successfully Connect");
            return k;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return null;
    }
}
