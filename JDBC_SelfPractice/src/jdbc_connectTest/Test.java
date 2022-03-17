package jdbc_connectTest;

import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		Test t =new Test();
		t.test1();
		
		
	}
	public void test1() {
		ShipperDAO sDAO = new ShipperDAOImp();
		List<Shipper> selectALLshipper =sDAO.selectAllShipper();
		System.out.println("測試一結果:"+selectALLshipper);
		System.out.println("================================");
		
	}
	

}
