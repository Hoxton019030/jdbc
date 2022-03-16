package shippersDAO.bean;


public class Shipper {//資料載體，容器[JAVAbean]
						//VO(Value Object)值物件
		private int ShipperID;
		private String CompanyName;
		private String Phone;
		
		public int getShipperID() {
			return ShipperID;
		}
		public void setShipperID(int shipperID) {
			ShipperID = shipperID;
		}
		public String getCompanyName() {
			return CompanyName;
		}
		public void setCompanyName(String companyName) {
			CompanyName = companyName;
		}
		public String getPhone() {
			return Phone;
		}
		public void setPhone(String phone) {
			Phone = phone;
		}
		@Override
		public String toString() {
			return "Shipper [ShipperID=" + ShipperID + ", CompanyName=" + CompanyName + ", Phone=" + Phone + "]";
		}

}
