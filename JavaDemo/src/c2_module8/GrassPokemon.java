package c2_module8;

//M8草系pokemon

import c2_module6.Pokemon;

public class GrassPokemon extends Pokemon {
	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public GrassPokemon(double height, double weight, String abilities, String name, String category, String gender,
			String type) {
		super(height, weight, abilities, name, category, gender);
		this.type = type;
	}

	public GrassPokemon() {
		super();
		super.height=100;
		super.setWeight(50);
		
	} 
	
	@Override//告訴IDE此方法為覆寫的方法
	//要求IDE代為檢查
	public void setHeight(double height) {
		if (height<0) {
			System.out.println("身高錯誤");
			super.setHeight(8);
			return;
		}else if(height>20){
			System.out.println("過於巨大");
			super.setHeight(10);
			return;
		}
		super.height = height;
	}

}
