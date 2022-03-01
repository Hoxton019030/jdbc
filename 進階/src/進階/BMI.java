package 進階;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) {
		BMI2 bmi = new BMI2();

		while (true) {
			bmi.input_user_date();

			System.out.println(bmi.Calculate_Bmi(bmi.user_cm, bmi.user_kg));
		}

	}

}

class BMI2 {
	Scanner scn = new Scanner(System.in);
	float user_cm;
	float user_kg;

	public float Calculate_Bmi(float height, float weight) {
		float bmi = (float) (weight / Math.pow((height / 100), 2));
		return bmi;
	}

	public void input_user_date() {
		System.out.println("請輸入身高(cm)");
		user_cm = scn.nextFloat();
		System.out.println("請輸入體重(kg)");
		user_kg = scn.nextFloat();

	}
}
