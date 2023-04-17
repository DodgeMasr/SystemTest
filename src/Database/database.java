/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author WINDOWS 10
 */
public class database {
    
    public static String url = "";
    public static String dbName = "cafe";
    public static String dbUser = "root";
    public static String dbPass = "Dodge1252000";//root
    public static Connection Con;

    public static Connection connectDB() {

        try {

            url = "jdbc:mysql://localhost:3306/"
                    + dbName + "?useUnicode=true&characterEncoding="
                    + "UTF-8";
//                    + "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            Con = DriverManager.getConnection(url, dbUser, dbPass);

//            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:4040/cafe", "root", ""); // LINK YOUR DATABASE
            return Con;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
