package shippersDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectionUtil.MyConnectionUtil;
import connectionUtil.connectionUtilImpl.MyConnectionUtilImpl;
import shippersDAO.bean.Shipper;

public class ShippersDAOImp implements ShippersDAO {
	

	@Override
	public List<Shipper> selectAllShipper() {
		MyConnectionUtil mcUtil =new MyConnectionUtilImpl();
		String sql = "SELECT [ShipperID]\r\n"
				+ "      ,[CompanyName]\r\n"
				+ "      ,[Phone]\r\n"
				+ "  FROM Shippers";
		List<Shipper>shipperList=new ArrayList<Shipper>();
		
		try {
			Connection conn = mcUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Shipper s = new Shipper();
				s.setShipperID(rs.getInt("ShipperID"));
				s.setCompanyName(rs.getString("CompanyName"));
				s.setPhone(rs.getString("Phone"));
				shipperList.add(s);
			}
			
			mcUtil.free(conn, stmt, rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return shipperList;
	}

	@Override
	public Shipper selectShipperById(int shipperId) {
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
