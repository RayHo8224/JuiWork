package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestH2JDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
            getConnection("jdbc:h2:~/test", "sa", "");
        
        PreparedStatement pst = conn.prepareStatement("select * from user");
        ResultSet rs = pst.executeQuery();
        while(rs.next()){
        	System.out.println(rs.getString(1));
        	
        	System.out.println(rs.getString(2));
        	System.out.println(rs.getString(3));
        }
        // add application code here
        rs.close();
        conn.close();
        
	}

}
