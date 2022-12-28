/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.celepsa;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cley
 */
public interface Function {
    
    //public abstract Connection tableSql();
    public abstract String tableSql() throws SQLException;
    public abstract String joinSql()throws SQLException;
}
