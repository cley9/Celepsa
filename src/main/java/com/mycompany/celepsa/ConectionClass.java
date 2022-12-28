/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celepsa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author cley
 */
public class ConectionClass {

    public Connection dbsql() throws SQLException {
        Connection conn = null;
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("C:\\laragon\\www\\MS-SPRINT-BOOT\\MS-JAVA\\Celepsa\\src\\main\\java\\com\\mycompany\\celepsa\\dba.properties");
            prop.load(input);

            String url = prop.getProperty("database.url");
            String username = prop.getProperty("database.username");
            String password = prop.getProperty("database.password");

            conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return conn;
    }
}
