package m2_ConnectionDemo.shipDAO.bean;

public interface shipperDAO {
	//新增//根據Engineer的需求而決定回傳值是什麼
	boolean addShipper(shipper s);
	//修改
	boolean updateShipper(shipper s);
	//刪除
	boolean deleteShipper(int shipperId);
	//查詢
	boolean selectShipper

}
