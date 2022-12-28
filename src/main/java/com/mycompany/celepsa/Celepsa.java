/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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
public class Celepsa {

    public static void main(String[] args) throws SQLException {
                          Properties prop = new Properties();
        InputStream input = null;

try {
    // Carga las propiedades del archivo
    input = new FileInputStream("C:\\laragon\\www\\MS-SPRINT-BOOT\\MS-JAVA\\Celepsa\\src\\main\\java\\com\\mycompany\\celepsa\\dba.properties");
    prop.load(input);

    // Obtiene los valores de las propiedades
    String url = prop.getProperty("database.url");
    String username = prop.getProperty("database.username");
    String password = prop.getProperty("database.password");

    // Usa los valores para conectarte a la base de datos
    Connection conn = DriverManager.getConnection(url, username, password);
    System.out.println("conex");
    
    
    //return conn;
    // ...
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
    }
}
