package loops;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 13 and 19:");
		int number = sc.nextInt();
		sc.close();  
		
		switch (number) {
		case 13:
			System.out.println("You are 13.");
			break;
		case 14:
			System.out.println("You are 14.");
			break;
		case 15:
			System.out.println("You are 15.");
			break;
		case 16:
			System.out.println("You are 16.");
			break;
		case 17:
			System.out.println("You are 17.");
			break;
		case 18:
			System.out.println("You are 18.");
			break;
		case 19:
			System.out.println("You are 19.");
			break;

		default:
			System.out.println("You are not a teenager.");
			break;
		}
	}
}
