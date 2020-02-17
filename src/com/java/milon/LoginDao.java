package com.java.milon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Asus on 2/17/2020.
 */
public class LoginDao {
    public static boolean validate(LoginBean bean){
        boolean status=false;

        try {
            Connection con=Connection_Provider.getCon();
            PreparedStatement ps=con.prepareStatement("SELECT * FROM registration WHERE username=? AND password=?");
            ps.setString(1,bean.getUsername());
            ps.setString(2,bean.getPassword());
            ResultSet rs=ps.executeQuery();
            status=rs.next();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
