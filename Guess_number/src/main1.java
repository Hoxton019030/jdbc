import java.util.Scanner;

public class main1 {
	public static void main(String[] args) {
		int max = 100;
		int min = 0;
		int answer = (int) (Math.random() * 100);
		int reply;
		System.out.println("½Ð¿é¤J§Aªº¦W¦r¡I");
		Scanner scn = new Scanner(System.in);
		String username = scn.nextLine();
		System.out.println("Åwªï" + username);
		System.out.println(answer);
		while (true) {

			System.out.println("½Ð¿é¤J¤@­Ó" + max + "¨ìˆ°" + min + "ªº¼Æ¦r");
			reply = scn.nextInt();
			if (reply > answer) {
				max = reply;
			} else if (answer > reply) {
				min = reply;
			} else if (answer == reply) {
				System.out.println("µª¹ï¤F!¦n´Î³á!");

			}
			
		}

	}

}
