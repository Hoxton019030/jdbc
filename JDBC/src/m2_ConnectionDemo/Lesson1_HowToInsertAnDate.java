package m2_ConnectionDemo;

import java.sql.*;

import javax.swing.JOptionPane;

public class Lesson1_HowToInsertAnDate {

	public static void main(String[] args) {
		
		String customerTypeID =JOptionPane.showInputDialog("CustomerTypeID");
		String customerDes =JOptionPane.showInputDialog("CustomerDesc");
		
		
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName = "Hoxton";
		String password = "orz93098";
		String insercCC = "INSERT INTO [dbo].[CustomerDemographics]\r\n"
				+ "           ([CustomerTypeID]\r\n"
				+ "           ,[CustomerDesc])\r\n"
				+ "     VALUES\r\n"
				+ "           ('A', 'B')";
		
		try (Connection connection = DriverManager.getConnection(url, userName, password)) {
			
			Statement createStatement = connection.createStatement();
			
			
			int count = createStatement.executeUpdate(insercCC);
			//count 單一語句。
			System.out.println("新增了"+count+"筆");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
