/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.celepsa;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author cley
 */
public class Celepsa {

    public static void main(String[] args) throws SQLException {
         
           ConsultaSql col=new ConsultaSql();
         
            System.out.println(col.tableSql());
            
    }
}
