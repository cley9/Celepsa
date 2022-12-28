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
            ConectionClass con=new ConectionClass();
            Statement statement = con.dbsql().createStatement();
            String selectSql = "SELECT top 10 * FROM OPCUAs60.dbo.Items";
            ResultSet resultSet = statement.executeQuery(selectSql);
              while (resultSet.next()){
                System.out.println(resultSet.getString(1));
            }

            
    }
}
