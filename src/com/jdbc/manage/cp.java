package com.jdbc.manage;

import java.sql.Connection; 
import java.sql.DriverManager;


public class cp {
	
   static Connection con;
	
	public static Connection createC() {
		
		
		try {
			
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			String user = "root";
			String password = "Das@1998" ;
			String url ="jdbc:mysql://localhost:3306/address_student";
				
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}


}
