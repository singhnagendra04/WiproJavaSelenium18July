package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

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
        
        // Result set in JDBC
        while(rs.next()) {
        	System.out.println(rs.getString("PersonId"));
        	System.out.println(rs.getString("FirstName"));
        	System.out.println(rs.getString("LastName"));
        	
        }
	}

}
