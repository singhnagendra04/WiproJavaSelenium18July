package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
public class InsetValues {



	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		// TODO Auto-generated method stub
        String dbURL = "jdbc:mysql://localhost:3306/wipro";
        
        String username = "root";
        String password = "Nagendra@04";
        
    
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Creating connection
        Connection con = DriverManager.getConnection(dbURL,username,password);
        Statement st= con.createStatement();
        
//        String sql = "INSERT INTO employees VALUES (101, 'Zara', 'CS', 1800)";
//        st.executeUpdate(sql);
        
        String sql1 = "INSERT INTO employees VALUES (102, 'Alice', 'HR', 50000)";
        st.executeUpdate(sql1);
        
        String sql11 = "INSERT INTO employees VALUES (103, 'Bob', 'IT', 65000)";
        st.executeUpdate(sql11);
        
        String sql111 = "INSERT INTO employees VALUES (104, 'Charlie', 'Sales', 60000)";
        st.executeUpdate(sql111);
        
        final String query = "name, department FROM employees";
        
        String sql = "UPDATE employees " +
                "SET department = 'Finance' WHERE name = 'Alice'";
             st.executeUpdate(sql);
             ResultSet rs = st.executeQuery(query);
             while(rs.next()){
                //Display values
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Age: " + rs.getInt("age"));
                System.out.print(", First: " + rs.getString("first"));
                System.out.println(", Last: " + rs.getString("last"));
        
        
        
       
	}

}
}
