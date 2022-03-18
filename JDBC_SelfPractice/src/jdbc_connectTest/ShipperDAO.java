package jdbc_connectTest;

import java.util.List;

public interface ShipperDAO {
	
	List<Shipper> selectAllShipper();
	
	Shipper selectShipperByID(int shipperID);
	
	boolean addShipper(Shipper s);

	//修改
	boolean updateShipper(Shipper s);

	//刪除
	boolean deleteShipper(int shipperId);

	boolean deleteShipper(String ShipperID);
	

}
