package m2_ConnectionDemo;

import java.sql.*;

public class GetConnectionDemo {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName = "Hoxton";
		String password = "orz93098";
		try {
			Connection connection = DriverManager.getConnection(url, userName, password);
			System.out.println("連線成功");
			
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
