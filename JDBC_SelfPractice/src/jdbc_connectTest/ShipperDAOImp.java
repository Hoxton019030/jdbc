package jdbc_connectTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShipperDAOImp implements ShipperDAO {

	@Override
	public List<Shipper> selectAllShipper() {
		List<Shipper>shipperlist = new ArrayList<Shipper>();
		String sql ="SELECT TOP (1000) [ShipperID]\r\n"
				+ "      ,[CompanyName]\r\n"
				+ "      ,[Phone]\r\n"
				+ "  FROM [Northwind].[dbo].[Shippers]"; 
				
		MyConnectionUtil mcUtil = new MyconnectionImp();
		try {
			Connection conn = mcUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs =stmt.executeQuery(sql);
			
			while(rs.next()) {
				Shipper s = new Shipper();
				s.setShipperID(rs.getInt("ShipperId"));
				s.setCompanyName(rs.getString("CompanyName"));
				s.setPhone(rs.getString("Phone"));
				shipperlist.add(s);
			}
			mcUtil.free(conn, stmt, rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return shipperlist;
	}

	@Override
	public Shipper selectShipperByID(int shipperID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addShipper(Shipper s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateShipper(Shipper s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteShipper(int shipperId) {
		// TODO Auto-generated method stub
		return false;
	}

}
