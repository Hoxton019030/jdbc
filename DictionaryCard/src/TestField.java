import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestField {
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException ce) {
			System.out.println("JDBC�S���X��" + ce.getMessage());
			return;
		}
		try {
			Connection cn = DriverManager
					.getConnection("jdbc:sqlserver://localhost;user=orz93097;password=orz93098;database=sample");
			System.out.println("��Ʈw�s�����\");
			cn.close();
			System.out.println("����P��Ʈw���s�u");
		} catch (SQLException e) {
			System.out.println("��Ʈw�s������\n" + e.getMessage());
		}
	}

}
