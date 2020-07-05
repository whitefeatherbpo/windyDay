package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPrac {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
		
		Statement stm=con.createStatement();
		
		ResultSet rst=stm.executeQuery("Select * from employees");
		System.out.println("FirstName\tSalary");
		
		while (rst.next()) {
		
			System.out.println(rst.getString(2)+"   "+ rst.getInt(8));
		}
		
	}

}
