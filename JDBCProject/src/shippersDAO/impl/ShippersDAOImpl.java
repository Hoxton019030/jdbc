package shippersDAO.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectionUtil.MyConnectionUtil;
import connectionUtil.connectionUtilImpl.MyConnectionUtilImpl;
import shippersDAO.ShippersDAO;
import shippersDAO.bean.Shipper;

public class ShippersDAOImpl implements ShippersDAO {

	@Override
	public List<Shipper> selectAllShipper() {
		
		MyConnectionUtil mcUtil = new MyConnectionUtilImpl();
		String sql = "SELECT [ShipperID],[CompanyName],[Phone]" + "  FROM Shippers";
		List<Shipper> shipperList = new ArrayList<Shipper>();
		
		try {
			Connection conn = mcUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Shipper s = new Shipper();
				s.setShipperID(rs.getInt("ShipperID"));
				s.setCompanyName(rs.getString("CompanyName"));
				s.setPhone(rs.getString("Phone"));
				shipperList.add(s);
			}

			mcUtil.free(conn, stmt, rs);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return shipperList;
	}

	@Override
	public Shipper selectShipperById(int shipperId) {
		MyConnectionUtil myConnUtil = new MyConnectionUtilImpl();
		String sql = "SELECT [ShipperID],[CompanyName],[Phone]" 
		+ "  FROM Shippers" + "  where ShipperID=?";
		try {
			Connection conn = myConnUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, shipperId);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				Shipper s = new Shipper();
				s.setShipperID(shipperId);
				s.setCompanyName(rs.getString("CompanyName"));
				//getString的參數放
				s.setPhone(rs.getString("Phone"));
				myConnUtil.free(conn, pstmt, rs);
				return s;
			}

			myConnUtil.free(conn, pstmt, rs);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public boolean addShipper(Shipper s) {
		MyConnectionUtil myConnUtil = new MyConnectionUtilImpl();
		String sql = "INSERT INTO [dbo].[Shippers]" + "           ([CompanyName],[Phone])" + "     VALUES"
				+ "           (?,?)";
		boolean succeed = false;
		try {
			Connection conn = myConnUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getCompanyName());
			pstmt.setString(2, s.getPhone());
			int count = pstmt.executeUpdate();
			if (count >= 1)
				succeed = true;

			myConnUtil.free(conn, pstmt, null);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return succeed;
	}

	@Override
	public boolean updateShipper(Shipper s) {
		String sql = "UPDATE [dbo].[Shippers]" 
	+	"   SET [CompanyName] 	=?" 
	+	"      ,[Phone] 		=?" 
	+ 	" WHERE ShipperID		=?";
		boolean succeed = false;
		MyConnectionUtil mcutil = new MyConnectionUtilImpl();
		try {
			Connection conn = mcutil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getCompanyName());
			pstmt.setString(2, s.getPhone());
			pstmt.setInt(3, s.getShipperID());
			int count = pstmt.executeUpdate();
			if (count >= 1)  succeed = true;
			mcutil.free(conn, pstmt, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return succeed;
	}

	
	public boolean deleteShipper(String shipperId) {
		String sql="DELETE FROM [dbo].[Shippers]\r\n"
				+ "      WHERE CompanyName=?";
		boolean succeed = false;
		MyConnectionUtil mcUtil=new MyConnectionUtilImpl();
		try {
			Connection conn = mcUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, shipperId);
			int count = pstmt.executeUpdate();
			mcUtil.free(conn, pstmt, null);
			if(count>=1)succeed=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return succeed;
	}

	@Override
	public boolean deleteShipper(int shipperId) {
		String sql="DELETE FROM [dbo].[Shippers]\r\n"
				+ "      where ShipperID=?";
		boolean succeed = false;
		MyConnectionUtil mcUtil=new MyConnectionUtilImpl();
		try {
			Connection conn = mcUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, shipperId);
			int count = pstmt.executeUpdate();
			mcUtil.free(conn, pstmt, null);
			if(count>=1)succeed=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return succeed;
	}

}
