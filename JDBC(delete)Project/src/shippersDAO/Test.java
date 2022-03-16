package shippersDAO;

import java.util.List;

import shippersDAO.bean.Shipper;

public class Test {
	public static void main(String[] args) {
		ShippersDAO sDAO = new ShippersDAOImp();
		List<Shipper> selectalShippers = sDAO.selectAllShipper();
		System.out.println(selectalShippers);
	}

}
