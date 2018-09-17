package loops;

public class ForLoop {
	public static void main(String[] args) {

		// Print numbers from 1 to 100
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}

		// Fibonacci numbers
		int a = 1;
		int b = 1;
		int temp = 0;		

		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 10; i++) {
			temp = a + b;
			a = b;
			b = temp;
			System.out.println(temp);
		}
		System.out.println();
		
		// Factorial
		int temp2 = 1;
		int factorial = 0;
		for (int i = 1; i <= 5; i++) {
			factorial = temp2 * i;
			temp2 = factorial;
		}
		System.out.println(factorial);
	}
}
