import java.util.List;

import shippersDAO.ShippersDAO;
import shippersDAO.bean.Shipper;
import shippersDAO.impl.ShippersDAOImpl;

public class Test {

	public static void main(String[] args) {
		Test t=new Test();
//		t.test1();
//		t.test2();
//		t.test3();
		t.test4();
//		t.test5();
		
	} 
	public void test1() {
		ShippersDAO sDAO=new ShippersDAOImpl();
		List<Shipper> selectAllShipper = sDAO.selectAllShipper();
		System.out.println("測試一結果："+selectAllShipper);
		System.out.println("===========================");
	}
	public void test2() {
		ShippersDAO sDAO=new ShippersDAOImpl();
		Shipper s = sDAO.selectShipperById(3);
		System.out.println("測試二結果："+s);
	}
	public void test3() {
		///假資料
		Shipper fakeShipper=new Shipper();
		fakeShipper.setCompanyName("Test1");
		fakeShipper.setPhone("0987654321");
		
		
		ShippersDAO sDAO=new ShippersDAOImpl();
		boolean succeed = sDAO.addShipper(fakeShipper);
		System.out.println(succeed);		
	}
	
	public void test4() {
		Shipper fakeShipper=new Shipper();
		fakeShipper.setShipperID(5);
		fakeShipper.setCompanyName("Tes43");
		fakeShipper.setPhone("0912345678");
		
		ShippersDAO sDAO=new ShippersDAOImpl();
		boolean succeed = sDAO.updateShipper(fakeShipper);
		System.out.println(succeed);
		
		
	}
	public void test5() {
		ShippersDAO sDAO=new ShippersDAOImpl();
		boolean succeed = sDAO.deleteShipper(3);
		System.out.println(succeed);
	}

}
