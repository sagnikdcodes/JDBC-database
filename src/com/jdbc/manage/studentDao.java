package com.jdbc.manage;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.mysql.cj.xdevapi.Result;

public class studentDao {
	public static boolean insertStudentToDB(student st) {
		
	    boolean f= false;
	try {
		
		
		Connection con = cp.createC();
		String q= "insert into Student(sname, sphone, scity) values(?,?,?)";
		
		PreparedStatement pstmt = con.prepareStatement(q);
		
		
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		
		
		pstmt.executeUpdate();
		f= true;
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	return f;
}

	public static boolean deleteStudent(int userId) {
		// TODO Auto-generated method stub
		

	    boolean f= false;
	try {
		
		
		Connection con = cp.createC();
		String q= "delete from student where sid =? ";
		
		PreparedStatement pstmt = con.prepareStatement(q);
		
		
		pstmt.setInt(1,userId);
		
		
		pstmt.executeUpdate();
		f= true;
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	return f;
}

	public static void showAllStudent() {
		// TODO Auto-generated method stub
		

	 boolean f= false;
	try {
		
		
		Connection con = cp.createC();
		String q= "select * from student";
		Statement stmt = con.createStatement();
		
		ResultSet set = stmt.executeQuery(q);
		
		while (set.next()) {
			
			int id = set.getInt(1);
			String name= set.getString(2);
			String phone= set.getString(3);
			String city= set.getString(4);
			
			System.out.println("ID: "+id);
			System.out.println("Name: "+ name);
			System.out.println("Phone: "+phone);
			System.out.println("City: "+ city);
			System.out.println("+++++++++++++++++++++++++++++++");
			
		}
		
		
		f= true;
		
	} catch (Exception e) {
		e.printStackTrace();
		
	}
	
}
		
	
	
}



