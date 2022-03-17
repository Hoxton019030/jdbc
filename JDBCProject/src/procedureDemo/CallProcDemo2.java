package procedureDemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallProcDemo2 {
	
	public static void main(String[] args) throws SQLException {
		String url ="jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName ="Hoxton";
		String password ="orz93098";
				
		Connection conn = DriverManager.getConnection(url, userName, password);
		CallableStatement pcall=conn.prepareCall("{call CustOrdersOrders2(?,?)}");//?=>nchar(5)
		pcall.setString(1, "ALFKI");
		pcall.registerOutParameter(2, java.sql.Types.TIMESTAMP);
		pcall.execute();
		System.out.println(pcall.getTimestamp(2));
		}
		
		
		
		
	}


