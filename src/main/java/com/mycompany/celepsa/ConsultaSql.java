/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.celepsa;
//import com.mycompany.celepsa.Function;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cley
 */
public class ConsultaSql implements Function {
    
    @Override
    public String tableSql() throws SQLException {
        ConectionClass con = new ConectionClass();
        Statement statement = con.dbsql().createStatement();
        String selectSql = "SELECT top 10 * FROM OPCUAs60.dbo.Items";
        ResultSet rs = statement.executeQuery(selectSql);
        String data = null;
        while (rs.next()) {
            data = rs.getString("ID");
            System.out.println(rs.getString("ID"));
        }
        // return "--"+data;
        return data;
    }
    
    @Override
    public String joinSql() throws SQLException {
        ConectionClass con = new ConectionClass();
        Statement st = null;        
        st = con.dbsql().createStatement();
        String selectSql = "SELECT top 100 h.ID , h.Value, i.ID, i.Name, i.Path ,DATEadd(HOUR,-5, h.TimeStamp) as data_new from dbo.HistoricalData h\n"
                + "inner join dbo.Items i on h.ID=i.ID where h.Quality = 192";
        ResultSet rs = st.executeQuery(selectSql);
        String data = null;
        while (rs.next()) {
            data = rs.getString("ID");
            System.out.println(rs.getString("ID"));
            System.out.println(rs.getString("Value"));
        }
        // return "--"+data;
        return data;
        
    }
    
}
