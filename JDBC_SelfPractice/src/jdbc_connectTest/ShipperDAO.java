package jdbc_connectTest;

import java.util.List;

public interface ShipperDAO {
	
	List<Shipper> selectAllShipper();
	
	Shipper selectShipperByID(int shipperID);
	
	

}
