package jdbc_connectTest;
import java.sql.*;

public class ConnectToServer {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName = "Hoxton";
		String password = "orz93098";

		try {
			Connection conn = DriverManager.getConnection(url, userName, password);
			Statement stmt = conn.createStatement();
			String sql = "SELECT * FROM Products";
			ResultSet executeQuery = stmt.executeQuery(sql);
			while (executeQuery.next()) {
				for (int i = 1; i <= 10; i++) {
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
