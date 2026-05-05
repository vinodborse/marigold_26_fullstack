package com.skillio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        String url = "jdbc:mysql://127.0.0.1:3306/skillio_db";
        String username = "root";
        String password = "root";
        
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM student");
        
        while(rs.next()) {
          System.out.println("Student Name:- " + rs.getString("name") + "| Student Address:- " + rs.getString("address"));
        }

        connection.close();
    }
}


/*
mobile --- 
number
call
speak
response
cut
*/


/*
rollno name 	address
1		Vinod	Pune
2		Don		Pune
.
.
.
.
.
.
*/