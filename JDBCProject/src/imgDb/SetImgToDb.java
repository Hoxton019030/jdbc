package imgDb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetImgToDb {
	
	public static void main(String[] args) throws SQLException, FileNotFoundException {
		String url = "jdbc:sqlserver://localhost:1433;databasename=Northwind";
		String userName = "Hoxton";
		String password = "orz93098";
		String sql = "INSERT INTO [dbo].[imgtable]\r\n"
				+ "           ([imageName]\r\n"
				+ "           ,[imgFile])\r\n"
				+ "     VALUES(?,?)";

		Connection conn = DriverManager.getConnection(url, userName, password);
		String imgname = "C:\\Users\\iii\\Dropbox\\PC\\Documents\\ClanBanner_raven.png";
		FileInputStream fis=new FileInputStream(imgname);
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, imgname);
		pstmt.setBinaryStream(2, fis);
		int count = pstmt.executeUpdate();
		System.out.println(count);
		

	}
}
