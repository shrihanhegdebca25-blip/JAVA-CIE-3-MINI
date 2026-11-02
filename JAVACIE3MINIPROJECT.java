/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.shrihan.regevents;

/**
 *
 * @author lenovo
 */
import java.sql.*;

public class JAVACIE3MINIPROJECT {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/Reg_Events?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String pwd = "Shrihan@567";
        Connection con = DriverManager.getConnection(url, user, pwd);
        Statement st = con.createStatement();
        
        System.out.println("Events");
        ResultSet rs = st.executeQuery("SELECT * FROM Events");
        while (rs.next()) {
            System.out.println(rs.getInt("event_id") + " " + rs.getString("event_name")+" "+rs.getString("event_date"));
        }
        System.out.println("Registrations");
        ResultSet sr = st.executeQuery("SELECT * FROM Registrations");

        while (sr.next()) {
            System.out.println(sr.getInt("registration_id") + " " + sr.getString("registor_name")+" "+sr.getString("phone"));
        }
        con.close();
        st.close();
        rs.close();

    }

}
