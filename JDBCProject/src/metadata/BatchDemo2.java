package metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchDemo2 {
	
public static void main(String[] args) {
	String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
	String userName = "Hoxton";
	String password = "orz93098";
	String sql="INSERT INTO [dbo].[Shippers]\r\n"
			+ "           ([CompanyName]\r\n"
			+ "           ,[Phone])\r\n"
			+ "     VALUES (?,)";
	
	
	try {
		Connection conn = DriverManager.getConnection(url, userName, password);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,"banana");
		pstmt.setString(2,"0989123123");
		pstmt.addBatch();
		pstmt.setString(1,"apple");
		pstmt.setString(2,"089989796744");
		pstmt.addBatch();
		pstmt.setString(1,"orange");
		pstmt.setString(2,"09766454456");
		pstmt.addBatch();
		
		int[] executeBatch = pstmt.executeBatch();
		for (int i = 0 ; i< executeBatch.length;i++) {
			int j = executeBatch[i];
			System.out.println(j);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		System.out.println(e.getErrorCode());
	}
	
}

}
