

import java.sql.*;
public class Main1 {
	  public static void main(String [] args)
	  {
	      String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	      String dbURL="jdbc:sqlserver://127.0.0.1:1068;DatabaseName=test";//�o�̪�test�O�A�ۤv����Ʈw�W�١A�W���ڪ��Otest
	      String userName="orz93097";//�o�̪�sa�n�אּ�A����Ʈw�ϥΪ̦W�١A�w�]�Osa
	      String userPwd="orz93098";//�o��123456�n�אּ�A���K�X
	      try
	      {
	        Class.forName(driverName);
	        System.out.println("���J�X�ʦ��\�I");
	      }catch(Exception e)
	      {
	        e.printStackTrace();
	        System.out.println("���J�X�ʥ��ѡI");
	      }
	      try{
	        Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
	        System.out.println("�s�u���\�I");
	      }catch(Exception e)
	      {
	        e.printStackTrace();
	        System.out.print("�s�u���ѡI");
	      }        
	  }

}