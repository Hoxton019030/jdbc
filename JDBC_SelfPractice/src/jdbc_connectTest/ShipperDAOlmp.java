package jdbc_connectTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShipperDAOlmp implements ShipperDAO{

	@Override
	public List<Shipper> selectAllShipper() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shipper selectShipperByID(int shipperID) {
		MyConnectionUtil myutil = new MyconnectionImp();
		String sql = "SELECT TOP (1000) [ShipperID]\r\n"
				+ "      ,[CompanyName]\r\n"
				+ "      ,[Phone]\r\n"
				+ "  FROM [Northwind].[dbo].[Shippers]";
		List<Shipper> shipperList = new ArrayList<Shipper>();
		
		try {
			Connection conn= myutil.getConnection();
			Statement stmt =conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Shipper s = new Shipper();
				s.setShipperID(rs.getInt("shipperID"));
				s.setCompanyName(rs.getString("companyName"));
				s.setPhone(rs.getString("Phone"));
				
				
			
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

}
