package connectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface MyConnectionUtil {
	
	Connection getConnection() throws SQLException;//取得連線
	
	void free(Connection conn,Statement stmt,ResultSet rs) throws SQLException;
	

}
