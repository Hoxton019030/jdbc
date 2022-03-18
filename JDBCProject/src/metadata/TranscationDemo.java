package metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TranscationDemo {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName = "Hoxton";
		String password = "orz93098";
		Connection conn = null;
		String sql = "INSERT INTO [dbo].[Shippers]\r\n" + "           ([CompanyName]\r\n" + "           ,[Phone])\r\n"
				+ "     VALUES (?,?)";

		try {
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			conn.setAutoCommit(true);
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println(e.getErrorCode());
		} finally {
			try {
				conn.setAutoCommit(true);
				conn.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
