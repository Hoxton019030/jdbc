package metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {
	
public static void main(String[] args) {
	String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
	String userName = "Hoxton";
	String password = "orz93098";
	String sql="INSERT INTO [dbo].[Shippers]\r\n"
			+ "           ([CompanyName]\r\n"
			+ "           ,[Phone])\r\n"
			+ "     VALUES (,)";
	
	
	try {
		Connection conn = DriverManager.getConnection(url, userName, password);
		Statement stmt = conn.createStatement();
		stmt.addBatch("INSERT INTO [dbo].[Shippers]\r\n"
				+ "           ([CompanyName]\r\n"
				+ "           ,[Phone])\r\n"
				+ "     VALUES('ABC','0987654321')");
		stmt.addBatch("INSERT INTO [dbo].[Shippers]\r\n"
				+ "           ([CompanyName]\r\n"
				+ "           ,[Phone])\r\n"
				+ "     VALUES('DEF','0987654322')");
		stmt.addBatch("INSERT INTO [dbo].[Shippers]\r\n"
				+ "           ([CompanyName]\r\n"
				+ "           ,[Phone])\r\n"
				+ "     VALUES('GHI','0987654323')");
		int[] executeBatch = stmt.executeBatch();
		for (int i = 0 ; i< executeBatch.length;i++) {
			System.out.println(executeBatch[i]);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		System.out.println(e.getErrorCode());
	}
	
}

}
