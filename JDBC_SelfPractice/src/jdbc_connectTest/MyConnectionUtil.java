package jdbc_connectTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface MyConnectionUtil {
	
	Connection getConnection() throws SQLException;
	
	void free(Connection conn,Statement stmt,ResultSet rs) throws SQLException;

}
