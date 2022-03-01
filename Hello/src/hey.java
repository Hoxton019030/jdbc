import java.util.Scanner;

public class hey
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		String string = scanner.nextLine();
		
		if (string.equals("scissors"))
		{
			System.out.println("stone");
			
		}
		else if (string.equals("stone"))
		{
			System.out.println("paper");
		}
		else if (string.equals("paper")) 
		{
			System.out.println("scissors");
		}
		else
		{
			System.out.println("·|¤£·|ª±°Ú?");
			
		}
	}
}