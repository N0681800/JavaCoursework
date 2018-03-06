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
public class RegisterCode {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "Wtl9";

    public static void main(String[] args) throws IOException {
        //get user creditials
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a username: ");
        String username = reader.next();

        System.out.println("Enter a password: ");
        String password = reader.next();

        System.out.println("Enter your age: ");
        int age = reader.nextInt();
        reader.close();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
            String dbName = "informartion";
            String tableName = "regdetails";
            String test = null;
            rs = conn.getMetaData().getCatalogs();
            System.out.println("check if a database exists using java");
            while (rs.next()) {

                String databaseName = rs.getString(1);
                if (databaseName.equals(dbName)) {
                    test = dbName;
                }
            }

            if (test == dbName) {
                System.out.println("Proccesing request");

            } else {
                System.out.println("Sorry for the incovince, it will take a while to proccess request");
                //create database
                String ndb = "CREATE DATABASE " + dbName;
                stmt.executeUpdate(ndb);

                //Create table
                String nt = "CREATE TABLE " + dbName + "." + tableName + " "
                        + "(id INTEGER not NULL AUTO_INCREMENT, "
                        + " username VARCHAR(255), "
                        + " password VARCHAR(255), "
                        + " age INTEGER, "
                        + " PRIMARY KEY ( id ))";
                stmt.executeUpdate(nt);

            }

            String save = "INSERT INTO " + dbName + "." + tableName + "(username,password,age)" + "VALUES ('" + username + "','" + password + "'," + age + ")";
            stmt.executeUpdate(save);
            stmt.close();
            
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
