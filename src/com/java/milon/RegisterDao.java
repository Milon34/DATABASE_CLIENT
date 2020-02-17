package com.java.milon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Asus on 2/17/2020.
 */
public class RegisterDao {
    public static int register(User u){
        int status=0;

        try {
            Connection con=Connection_Provider.getCon();
            PreparedStatement ps=con.prepareStatement("INSERT INTO registration VALUES (?,?,?,?)");
            ps.setString(1,u.getUsername());
            ps.setString(2,u.getEmail());
            ps.setString(3,u.getGender());
            ps.setString(4,u.getPassword());
            //ps.setString(5,u.getCountry());
            status=ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
