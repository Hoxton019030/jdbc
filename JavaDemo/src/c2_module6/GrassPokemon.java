package c2_module6;

//M6草系pokemon

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
		super.weight=50;
	} 

}
