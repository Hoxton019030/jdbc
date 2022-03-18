package jdbc_connectTest;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
//		t.test1();
//		t.test2();
//		t.test3();
//		t.test4();
		t.test5();

	}

	public void test1() {
		ShipperDAO sDAO = new ShipperDAOImp();
		List<Shipper> selectALLshipper = sDAO.selectAllShipper();
		System.out.println("測試一結果:" + selectALLshipper);
		System.out.println("================================");

	}

	public void test2() {
		ShipperDAO sDAO = new ShipperDAOImp();

		Shipper shipper = sDAO.selectShipperByID(2);

		System.out.println("測試二結果:" + shipper);
	}

	public void test3() {
		Shipper fakeShipper = new Shipper();
		fakeShipper.setCompanyName("Test1");
		fakeShipper.setPhone("0987654321");
		ShipperDAO sDAO = new ShipperDAOImp();
		sDAO.addShipper(fakeShipper);

	}

	public void test4() {
			
		Shipper fakeShipper = new Shipper();
		fakeShipper.setCompanyName("PwC");
		fakeShipper.setPhone("0989796734");
		fakeShipper.setShipperID(1);
		System.out.println("已成功修改");

		ShipperDAO sDAO = new ShipperDAOImp();
		boolean succeed = sDAO.updateShipper(fakeShipper);
		System.out.println(succeed);

	}

	public void test5() {
		ShipperDAO sDAO = new ShipperDAOImp();
		boolean isSucceed = sDAO.deleteShipper(9);
		System.out.println(isSucceed);
		
		

	}

}
