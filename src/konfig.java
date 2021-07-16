
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS TUF GAMING
 */
public class konfig {
     private static Connection MYSQLConfig;
    public static Connection configDB() throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/projectuas_apotek";
            String user="root";
            String pass="";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MYSQLConfig=DriverManager.getConnection(url, user, pass);
            
        } catch (SQLException e) {
            System.out.println("koneksi gagal "+e.getMessage());
        }
        return MYSQLConfig;
    }
}
