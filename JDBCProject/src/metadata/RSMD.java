package metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class RSMD {
	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName = "Hoxton";
		String password = "orz93098";
		String sql = "";

		try {
			Connection conn = DriverManager.getConnection(url, userName, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			System.out.println(metaData.getColumnCount());
			while(rs.next()) {
				for(int i=1;i<=metaData.getColumnCount();i++) {
					System.out.println(metaData.getColumnCount());
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		}

	}

}
