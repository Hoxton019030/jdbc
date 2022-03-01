package 上課的地方;

public class Clazz {
	public String publicInt="I am public";
	protected String protectedInt = "I am pertected";
	String defaultInt = "I am default";
	private String privateInt ="I am private";
	public static void main(String[] args) {
		Clazz clazz = new Clazz();
		System.out.println(clazz.publicInt);
		System.out.println(clazz.protectedInt);
		System.out.println(clazz.defaultInt);
		System.out.println(clazz.privateInt);
		
	}
	

}
