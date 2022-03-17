package imgDb;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbToFile {
	
	public static void main(String[] args) {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName = "Hoxton";
		String password = "orz93098";
		String sql ="SELECT [imageName]\r\n"
				+ "      ,[imgFile]\r\n"
				+ "  FROM [dbo].[imgtable] where imageName =?";
		
		try(Connection conn = DriverManager.getConnection(url, userName, password)) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "C:\\Users\\iii\\Dropbox\\PC\\Documents\\ClanBanner_raven.png");
			ResultSet rs = pstmt.executeQuery();
			FileOutputStream fos = new FileOutputStream("C:\\Users\\iii\\Dropbox\\PC\\Documents\\ClanBanner_raven121232133123.jpg");
			while(rs.next()) {
				InputStream binaryStream = rs.getBinaryStream(2);
				int data =0;
				while((data=binaryStream.read())!=-1) {
					fos.write(data);
				}
			}
			fos.close();
			System.out.println("ok");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
