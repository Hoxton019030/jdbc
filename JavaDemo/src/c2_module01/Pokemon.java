package c2_module01;

public class Pokemon{//類別
	//屬性
	public String name;
	public double height;
	public double weight;
	public String abilities;
	public String category;
	public String gender; 
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("物件已回收"+this.name);
		super.finalize();
	}
	
}
