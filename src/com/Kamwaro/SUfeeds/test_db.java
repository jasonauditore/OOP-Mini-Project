package com.Kamwaro.SUfeeds;
import java.sql.*;
import java.util.logging.Logger;
import java.util.logging.Level;

public class test_db {
    static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String USER = "root";
    static final String PASSWORD = "";
    static final String URL = "jdbc:mysql://localhost:3306/db_jason_kamwaro_172995";
    public static void addUser(String username, String password){
        Connection conn = null;
        Statement statement = null;

        try {
            // Load the driver class
            Class.forName(DRIVER);


            // Establish connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            // Create statement for querying the database
            statement = conn.createStatement();
            //Inserts the entered values into the database
            String sql = "Insert into new_user(username,password) values(?, ?)";
            try(PreparedStatement statement1 = conn.prepareStatement(sql)){
                statement1.setString(1, username);
                statement1.setString(2, password);
                statement1.executeUpdate();

            }

    }catch (ClassNotFoundException e){
            Logger.getLogger(test_db.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Class not found");
        }

        catch (SQLException e){
            Logger.getLogger(test_db.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("SQL not found");
        }

        }


    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        ResultSet result = null;
        try {
            // Load the driver class
            Class.forName(DRIVER);


            // Establish connection
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            // Create statement for querying the database
            statement = conn.createStatement();

            result = statement.executeQuery("SELECT * FROM new_user where username like('J%')");
            while(result.next()){
                String username = (String)(result.getObject(1));
                String password = (String)(result.getObject(2));
                System.out.println("Username: "+username);
                System.out.println("Password: "+password);
            }





        }
        catch (ClassNotFoundException e){
            Logger.getLogger(test_db.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("Class not found");
        }

        catch (SQLException e){
            Logger.getLogger(test_db.class.getName()).log(Level.SEVERE, null, e);
            System.out.println("SQL not found");
        }


    }
}