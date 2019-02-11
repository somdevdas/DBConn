package com.nt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con;
		PreparedStatement ps;
		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver ok");
		    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");	
		    System.out.println("url ok");
		    ps=con.prepareStatement("select * from som");
		    ResultSet rs=ps.executeQuery();
		    if(rs.next()) {
		    System.out.println("<h1><center>"+rs.getString(1)+"</center></h1>");
		    }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
