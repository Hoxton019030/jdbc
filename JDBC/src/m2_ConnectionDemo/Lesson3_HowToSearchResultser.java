package m2_ConnectionDemo;

import java.sql.*;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JOptionPane;

public class Lesson3_HowToSearchResultser {

	public static void main(String[] args) {
		
		String customerTypeID =JOptionPane.showInputDialog("CustomerTypeID");
		String customerDes =JOptionPane.showInputDialog("CustomerDesc");
		
		
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName = "Hoxton";
		String password = "orz93098";
		String selectProducts = "/****** SSMS 中 SelectTopNRows 命令的指令碼  ******/\r\n"
				+ "SELECT TOP (9) [EmployeeID]\r\n"
				+ "      ,[LastName]\r\n"
				+ "      ,[FirstName]\r\n"
				+ "      ,[Title]\r\n"
				+ "      ,[BirthDate]\r\n"
				+ "      ,[Address]\r\n"
				+ "      ,[City]\r\n"
				+ "      ,[Country]\r\n"
				+ "      ,[HomePhone]\r\n"
				+ "  FROM [Northwind].[dbo].[Employees]";
		
		try (Connection connection = DriverManager.getConnection(url, userName, password)) {
			
			Statement stmt = connection.createStatement();
			
			boolean count = stmt.execute(selectProducts);
			ResultSet rs = stmt.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getString("EmployeeID"));
				System.out.println(rs.getString("LastName"));
				System.out.println(rs.getString("FirstName"));
				System.out.println(rs.getString("Title"));
				System.out.println(rs.getString("BirthDate"));
				System.out.println(rs.getString("Address"));
				System.out.println(rs.getString("City"));
				System.out.println(rs.getString("Country"));
				System.out.println(rs.getString("HomePhone"));
			}
					
			
			
			//count 單一語句。
			System.out.println("新增了"+count+"筆");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
