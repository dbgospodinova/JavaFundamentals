package primitive.types;

import java.util.Scanner;

public class ReadFromConsole {
	public static void main(String[] args) {
		int temp;
		boolean isPrime=true;

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = sc.nextInt();
		sc.close();  

		for(int i = 2; i <= number/2; i++)
		{
			temp = number % i;
			if (temp == 0)
			{
				isPrime = false;
				break;
			}
		}

		if (isPrime) {
			System.out.println("The number " + number + " is a prime number.");
		} else {
			System.out.println("The number " + number + " is not a prime number.");
		}

	}
}