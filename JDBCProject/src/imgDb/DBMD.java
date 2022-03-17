package imgDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DBMD {
	public static void main(String[] args) {

		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName = "Hoxton";
		String password = "orz93098";
		String sql = "SELECT *\r\n" + "  FROM [Northwind].[dbo].[Customers]";

		try {

			Connection conn = DriverManager.getConnection(url, userName, password);
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			ResultSetMetaData MetaData = rs.getMetaData();
			System.out.println(MetaData.getColumnCount());
			while (rs.next()) {
				for (int i = 1; i < MetaData.getColumnCount(); i++) {
					System.out.println(MetaData.getColumnName(i)+": "+rs.getString(i));
					System.out.println(MetaData.getColumnLabel(i)+": "+MetaData.getColumnTypeName(i));
					System.out.println(MetaData.getColumnDisplaySize(i));
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
