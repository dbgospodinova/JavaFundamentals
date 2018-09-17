package primitive.types;

public class ArithmeticOperations {
	public static void main(String[] args) {
		byte b = 126;
		short sh = 32000;
		int i = 2147483640;
		long l = 1;
		float fl = 1;
		double d = 1.1;
		char ch = 65000;
		
		//Addition	
		System.out.println("The addition of two bytes is: " + (byte) (b + b) +".");
		System.out.println("The addition of two shorts is: " + (short) (sh + sh) +".");
		System.out.println("The addition of two integers is: " + (i + i) +".");
		System.out.println("The addition of two longs is: " + (long) (l + l) +".");
		System.out.println("The addition of two floats is: " + (float) (fl + fl) +".");
		System.out.println("The addition of two doubles is: " + (double) (d + d) +".");
		System.out.println("The addition of two chars is: " + (char) (ch + ch) +"."); //I am asking WHY? 
		System.out.println();
		
		//Subtraction
		System.out.println("The subtraction of two bytes is: " + (byte) (b - b) +".");
		System.out.println("The subtraction of two shorts is: " + (short) (sh - sh) +".");
		System.out.println("The subtraction of two integers is: " + (i - i) +".");
		System.out.println("The subtraction of two longs is: " + (long) (l - l) +".");
		System.out.println("The subtraction of two floats is: " + (float) (fl - fl) +".");
		System.out.println("The subtraction of two doubles is: " + (double) (d - d) +".");
		System.out.println("The subtraction of two chars is: " + (char) (ch - ch) +".");  
		System.out.println();
		
		//Multiplication
		System.out.println("The multiplication of two bytes is: " + (byte) (b * b) +".");
		System.out.println("The multiplication of two shorts is: " + (short) (sh * sh) +".");
		System.out.println("The multiplication of two integers is: " + (i * i) +"."); //I am asking WHY?
		System.out.println("The multiplication of two longs is: " + (long) (l * l) +".");
		System.out.println("The multiplication of two floats is: " + (float) (fl * fl) +".");
		System.out.println("The multiplication of two doubles is: " + (double) (d * d) +".");
		System.out.println("The multiplication of two chars is: " + (char) (ch * ch) +"."); //I am asking WHY? 
		System.out.println();
		
		//Division
		System.out.println("The division of two bytes is: " + (byte) (b / 2) +".");
		System.out.println("The division of two shorts is: " + (short) (sh / 2) +".");
		System.out.println("The division of two integers is: " + (i / 2) +"."); 
		System.out.println("The division of two longs is: " + (long) (l / 2) +".");
		System.out.println("The division of two floats is: " + (float) (fl / 2) +".");
		System.out.println("The division of two doubles is: " + (double) (d / 2) +".");
		System.out.println("The division of two chars is: " + (char) (ch / 2) +"."); //I am asking WHY? 
		System.out.println();
		
		//Remainder
		System.out.println("The remainder of two bytes is: " + (byte) (b % 3) +".");
		System.out.println("The remainder of two shorts is: " + (short) (sh % 3) +".");
		System.out.println("The remainder of two integers is: " + (i % 3) +"."); 
		System.out.println("The remainder of two longs is: " + (long) (l % 3) +".");
		System.out.println("The remainder of two floats is: " + (float) (fl % 3) +".");
		System.out.println("The remainder of two doubles is: " + (double) (d % 3) +".");
		System.out.println("The remainder of two chars is: " + (char) (ch % 3) +"."); //I am asking WHY? 
		System.out.println();
	}
}
