package classes;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    public static Connection getConnection(){
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school?characterEncoding=utf8"
                    , "root", null);
            System.out.println("Connection Stablished");
            return con;
        } catch (Exception e) {
            System.out.println("Failed");
            return null;
        }
        
    }
}
