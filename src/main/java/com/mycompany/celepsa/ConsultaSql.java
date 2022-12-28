/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celepsa;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cley
 */
public class ConsultaSql {
       public String select() throws SQLException{
           ConectionClass con=new ConectionClass();
            Statement statement = con.dbsql().createStatement();
            String selectSql = "SELECT top 10 * FROM OPCUAs60.dbo.Items";
            ResultSet rs = statement.executeQuery(selectSql);
            String data = null;
              while (rs.next()){
                data=rs.getString("ID");
                  System.out.println(rs.getString(1));
            }
              return "--"+data;
       }
}
