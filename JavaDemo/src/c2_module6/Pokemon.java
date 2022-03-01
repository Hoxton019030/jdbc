package c2_module6;

public class Pokemon{//類別
	//建立屬性
	protected double height;//同package or 子類別可以存取
	double weight; //同 package
	private String abilities;//完全私有
	private String name;
	private String category;
	private String gender;
	

	public Pokemon() {
		super();
	}

	public Pokemon(double height, double weight, String abilities, String name, String category, String gender) {
		setHeight(height);
		setWeight(weight);
		setAbilities(abilities);
		setGender(gender);
		setName(name);
		setCategory(category);
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if (height<0||height>9) {
			System.out.println("身高錯誤");
			this.height=0.77;
			return;
		}
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;//輸入錯誤後設置成6.9
	}
	public String getAbilities() {
		return abilities;
	}
	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	} 
	
	//getter setter
	
}
