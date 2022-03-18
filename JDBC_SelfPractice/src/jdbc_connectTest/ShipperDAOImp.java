package jdbc_connectTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ShipperDAOImp implements ShipperDAO {

	@Override
	public List<Shipper> selectAllShipper() {
		List<Shipper> shipperlist = new ArrayList<Shipper>();
		String sql = "SELECT TOP (1000) [ShipperID]\r\n" + "      ,[CompanyName]\r\n" + "      ,[Phone]\r\n"
				+ "  FROM [Northwind].[dbo].[Shippers]";

		MyConnectionUtil mcUtil = new MyconnectionImp();
		try {
			Connection conn = mcUtil.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
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
		String sql = "SELECT [ShipperID]\r\n" + "      ,[CompanyName]\r\n" + "      ,[Phone]\r\n"
				+ "  FROM [dbo].[Shippers]\r\n" + "  WHERE ShipperID=?";

		MyConnectionUtil mcUtil = new MyconnectionImp();
		try {
			Connection conn = mcUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 1);
//			pstmt.setInt(1, shipperID);
			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				Shipper s = new Shipper();
				s.setShipperID(rs.getInt(1));
				s.setCompanyName(rs.getString(2));
				s.setPhone(rs.getString(3));
				mcUtil.free(conn, pstmt, rs);
				return s;

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addShipper(Shipper s) {
		MyConnectionUtil myUtil = new MyconnectionImp();
		String sql = "INSERT INTO [dbo].[Shippers]" + "           ([CompanyName],[Phone])" + "     VALUES"
				+ "           (?,?)";
		boolean succeed = false;

		try {
			Connection conn = myUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getCompanyName());
			pstmt.setString(2, s.getPhone());
			int count = pstmt.executeUpdate();
			if (count > 1) {
				succeed = true;
			}

			myUtil.free(conn, pstmt, null);
			return succeed;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return succeed;
	}

	@Override
	public boolean updateShipper(Shipper s) {
		String sql = "UPDATE [dbo].[Shippers]" + " " + "  SET [CompanyName] = ?" + "    " + "           ,[Phone] = ? "
				+ "    WHERE ShipperID = ?";
		boolean succeed = false;
		MyConnectionUtil myUtil = new MyconnectionImp();
		try {
			Connection conn = myUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, s.getCompanyName());
			pstmt.setString(2, s.getPhone());
			pstmt.setInt(3, s.getShipperID());
			int count = pstmt.executeUpdate();
			if (count >= 1) {
				succeed = true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return succeed;
	}

	@Override
	public boolean deleteShipper(int ShipperID) {
		String sql = "DELETE FROM [dbo].[Shippers]"
				+ "      where ShipperID=?";
		boolean succeed = false;
		MyConnectionUtil myUtil = new MyconnectionImp();
		try {
			Connection conn = myUtil.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, ShipperID);
			int count = pstmt.executeUpdate();
			myUtil.free(conn, pstmt, null);
			if (count >= 1)
				succeed = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return succeed;
	}

	@Override
	public boolean deleteShipper(String shipperId) {
		// TODO Auto-generated method stub
		return false;
	}

}
