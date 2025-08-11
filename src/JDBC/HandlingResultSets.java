package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HandlingResultSets {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
String dbURL = "jdbc:mysql://localhost:3306/wipro";
        
        String username = "root";
        String password = "Nagendra@04";
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Creating connection
        Connection con = DriverManager.getConnection(dbURL,username,password);
        
        Statement st= con.createStatement();
        
        // execute the queries
        
        String selectquery = "select *from wipro.persons";
        
        // pass the select query to result set
        ResultSet rs = st.executeQuery(selectquery);
        
		while(rs.next()) {
			int id = rs.getInt("PersonId");
			System.out.println(id);
			String Firstname = rs.getString("FirstName");
			
			int id1 = rs.getInt(1);
			System.out.println(id1);
			
			String s = rs.getString(2);
			System.out.println(s);
			
		}
	}

}
