
import java.sql.*;

public class RsDb1 {
	public static void main(String[] args) {
		try 
		{
			Class.forName
			("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println("JDBC �S���X�ʵ{��" +ce.getMessage());
			return;
		}
		try 
		{
			Connection cn= DriverManager.getConnection
					("jdbc:sqlserver:/localhost;user=orz93097;password=orz93098;database=sample");
		}
		Statement sm = cn.createStatement();
		ResultSet rs = sm.executeQuery("SELECT * FROM ���~");
		ResultSetMetaData rsmd = rs.getMetaData();
		for (int i = 1 ; i<= rsmd.getColumnName(i);i++) {
			System.out.println("\n---------------");
			while (rs.next()) {
				System.out.println(rs.getString(1)+ "\t"+
			rs.getString(2)+"\t"+
						rs.getInt(3)+"\t"+
			rs.getInt(4)+"\n");
			}
			sm.close();
			cn.close();
		}
		catch(SQLExcetion e) {
			System.out.println("��Ʈw�s������ \n" + e.getMessage());
		}
		
	}

}
