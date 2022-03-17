package procedureDemo;

import java.security.spec.RSAKeyGenParameterSpec;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CallProcDemo {
	
	public static void main(String[] args) throws SQLException {
		String url ="jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName ="Hoxton";
		String password ="orz93098";
		String sql;
				
		Connection conn = DriverManager.getConnection(url, userName, password);
		CallableStatement pcall=conn.prepareCall("{call CustOrdersOrders(?)}");//?=>nchar(5)
		pcall.setString(1, "ALFKI");
		boolean havaRs =pcall.execute();//不用再分Query或是Update
		ResultSet rs =pcall.getResultSet();
		
		while(rs.next()) {
			System.out.print("OrderID:"+rs.getString(1)+"\t");
			System.out.print("OrderDate:"+rs.getDate(2)+"\t");
			System.out.print("RequiredDate:"+rs.getDate(3)+"\t");
			System.out.println("ShippedDates:"+rs.getDate(4));
		}
		
		
		
		
	}


}
