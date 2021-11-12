/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBConnection;


import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Ketnoicsdl {
    Connection conn=null;
    
    public Connection getConnection() {
        try {
            String dbURL = "jdbc:sqlserver://localhost;databaseName=QLHD;user=sa;password=123456";
            this.conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected");
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
        } 
        catch (SQLException ex) {
            System.err.println("Cannot connect database, " + ex);
        }
        return conn;
    }
        
    public static void main(String[] args){
       Ketnoicsdl test= new Ketnoicsdl();
       test.getConnection();
    }
}
