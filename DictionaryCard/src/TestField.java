import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestField {
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException ce) {
			System.out.println("JDBC沒有驅動" + ce.getMessage());
			return;
		}
		try {
			Connection cn = DriverManager
					.getConnection("jdbc:sqlserver://localhost;user=orz93097;password=orz93098;database=sample");
			System.out.println("資料庫連接成功");
			cn.close();
			System.out.println("釋放與資料庫的連線");
		} catch (SQLException e) {
			System.out.println("資料庫連接失敗\n" + e.getMessage());
		}
	}

}
