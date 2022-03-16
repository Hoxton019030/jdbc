package shippersDAO;

import java.util.List;

import shippersDAO.bean.Shipper;

public interface ShippersDAO {
	//查詢
	List<Shipper> selectAllShipper();

	Shipper selectShipperById(int shipperId);
	
	//新增//根據你的設計需求決定回傳
	boolean addShipper(Shipper s);

	//修改
	boolean updateShipper(Shipper s);

	//刪除
	boolean deleteShipper(int shipperId);
	

}
