package m2_ConnectionDemo.connectUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyConnectionutilImp implements MyConnectionutil {
	private String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
	private String userName = "Hoxton";
	private String password = "orz93098";

	@Override
	public Connection getConnection() throws SQLException {
		Connection conn=DriverManager.getConnection(url,userName,password);
		// TODO Auto-generated method stub		
		return null;
	}

	@Override
	public void free(Connection conn, Statement stmt, ResultSet rs) throws SQLException{
		if(rs!=null) {
			if(!rs.isClosed()) {
				rs.close();
			}
		}
		if(stmt!=null) {
			if(!stmt.isClosed()) {
				stmt.close();
			}
		}
		// TODO Auto-generated method stub
		if(conn!=null) {
			if(!conn.isClosed()) {
				conn.close();
			}
		}
		
	}

}
