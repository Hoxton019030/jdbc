package 上課的地方;

public class Polymophrism {
	public static void main(String[] args) {
		鴨子 duck = new 鴨子();
		duck.name="duck";
		史丹利 stanly = new 史丹利();
		stanly.name="stanly";
		鴨子[] dk = {duck,stanly};
		
		for (鴨子 鴨子:dk ) {
			鴨子.呱呱叫();
		}
		
				
	}

}
