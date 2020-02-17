package com.java.milon;

import java.sql.*;

/**
 * Created by Asus on 2/17/2020.
 */
public class Connection_Provider implements Provider {
    public static Connection con=null;
    static {
        try {
            Class.forName(DRIVER_NAME);
            con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static Connection getCon(){
        return con;
    }
}
