/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemssoftwarecoursework;

import java.io.IOException;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author Tanak
 */
public class HomepageCode {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "Wtl9";

    public static void main(String[] args) throws IOException {
                        String user = null;
                String pass = null;
        //get user creditials
        Scanner reader = new Scanner(System.in);
        String username = null;
        String password = null;


        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String dbName = "informartion";
            String tableName = "regdetails";
      String sql = "SELECT username, password FROM " + dbName + "." + tableName;
rs = stmt.executeQuery(sql);
            boolean test = false;

                        while (test==false) {
        System.out.println("Enter a username: ");
        username = reader.next();

        System.out.println("Enter a password: ");
        password = reader.next();

            while (rs.next()) {
                user = rs.getString("username");
                pass = rs.getString("password");
            if(user.equals(username)&&pass.equals(password))
                {
                test = true;
        System.out.println("Correct credentials");
                }
             
            }
                        if(!username.equals(user)||!password.equals(pass))
                {
        System.out.println("incorrect credentials");
                }
                        rs.beforeFirst();
                        }
                                reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
