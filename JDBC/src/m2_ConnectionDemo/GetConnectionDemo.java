package m2_ConnectionDemo;

import java.sql.*;

public class GetConnectionDemo {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName = "Hoxton";
		String password = "orz93098";

		try (Connection connection = DriverManager.getConnection(url, userName, password)) {
Statement createStatement = connection.createStatement();
String selectProducts = "SELECT * FROM Products"; //目標陳述句
ResultSet executeQuery = createStatement.executeQuery(selectProducts);

while(executeQuery.next()) {
	for(int i = 1 ; i<=10 ;i++) {
		System.out.print(executeQuery.getString(i));
	}
	System.out.println();
}




			System.out.println("連線成功");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
