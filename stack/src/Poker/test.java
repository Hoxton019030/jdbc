package Poker;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		

		Random random = new Random();
		Set <Integer> randomSet = new HashSet<>();
		
		while(randomSet.size()<52) {
			randomSet.add((int)(random.nextInt(52)));
			System.out.println(randomSet);
		}
		
	
	}

}
