package Tutorial;

public class Score {
	public static void main(String[] args) {
		var array=0 ;
		
		for (int i = 0 ; i <args.length; i++) {
			System.out.printf("座號 :%d 同學成績:%d", i+1,args[i]);
		}
	}

}
