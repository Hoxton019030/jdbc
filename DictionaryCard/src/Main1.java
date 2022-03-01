

import java.sql.*;
public class Main1 {
	  public static void main(String [] args)
	  {
	      String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	      String dbURL="jdbc:sqlserver://127.0.0.1:1068;DatabaseName=test";//這裡的test是你自己的資料庫名稱，上面我的是test
	      String userName="orz93097";//這裡的sa要改為你的資料庫使用者名稱，預設是sa
	      String userPwd="orz93098";//這裡123456要改為你的密碼
	      try
	      {
	        Class.forName(driverName);
	        System.out.println("載入驅動成功！");
	      }catch(Exception e)
	      {
	        e.printStackTrace();
	        System.out.println("載入驅動失敗！");
	      }
	      try{
	        Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
	        System.out.println("連線成功！");
	      }catch(Exception e)
	      {
	        e.printStackTrace();
	        System.out.print("連線失敗！");
	      }        
	  }

}