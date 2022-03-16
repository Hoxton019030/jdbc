package jdbc_connectTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyconnectionImp implements MyConnectionUtil {
	String url ="jdbc:sqlserver://localhost:1433;databasename=Northwind";
	String userName ="Hoxton";
	String password ="orz93098";

	@Override
	public Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, userName, password);
		return conn;
		// TODO Auto-generated method stub
	}

	@Override
	public void free(Connection conn, Statement stmt, ResultSet rs) throws SQLException {
		conn.close();
		// TODO Auto-generated method stub
		
	}

}
