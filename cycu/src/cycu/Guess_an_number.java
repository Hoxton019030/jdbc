package cycu;

import java.util.Scanner;

public class Guess_an_number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	}

	int answer = (int) (Math.random() * 100);

	while(true)
	{

		int input_number = input.nextInt();
		if (input_number > answer) {
			System.out.println("太大了!");

		} else if (input_number < answer) {
			System.out.println("太小了");

		} else if (input_number == answer) {
			System.out.println("真棒！答對了");
			break;
		}

	}

}}
