package m2_ConnectionDemo;

import java.sql.*;

import javax.swing.JOptionPane;

public class Lesson2_Resultset_true_false {

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
			
			boolean count = createStatement.execute(insercCC);
			//true表示有結果集
			//false表示沒有結果集
			
			
			//count 單一語句。
			System.out.println("新增了"+count+"筆");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
