package m2_ConnectionDemo.connectUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface MyConnectionutil {
	
	
	Connection getConnection() throws SQLException ;//功能是取得連線
	
	
	void free(Connection conn,Statement stmt,ResultSet rs) throws SQLException;
	

}
