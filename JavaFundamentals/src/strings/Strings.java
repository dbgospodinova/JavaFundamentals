package strings;

import java.lang.Character.Subset;

public class Strings {
	public static void main(String[] args) {
		// Initialization
		String firstName = "Didi";
		String lastName;
		lastName = "Gospodinova";
		// Keep in mind that the next initialization is deprecated in Java 9
		String occupation = new String("QA");
		
		// Concatenate strings
		String fullName = firstName + " " + lastName;
		System.out.println("My name is " + fullName + " and I am a " + occupation + ".");
		
		// Compare strings
		System.out.println(fullName == "Didi Gospodinova");
		System.out.println(fullName.equals("Didi Gospodinova"));
		
		// Escaping
		String mySeason = "My favotire season is \"Summer\".";
		System.out.println(mySeason);
		
		// String length
		System.out.println("The string length is: " + mySeason.length());
		
		// Convert number to string	
		int number = 1;
		String result = "" + number;
		System.out.println(result);
		String result2 = String.valueOf(number);
		System.out.println(result2);
		
		// Get chars and substrings by index
		String season = mySeason.substring(23, 29);
		System.out.println(season);
		
		String season2 = mySeason.substring(22);
		System.out.println(season2);
		
		// String manipulations
		String unfomatted = "     test     ";
		String formatted = unfomatted.trim();
		System.out.println(unfomatted);
		System.out.println(formatted);
		System.out.println(formatted.toLowerCase());
		System.out.println(formatted.toUpperCase());
		System.out.println(unfomatted.startsWith("t"));
		System.out.println(formatted.endsWith("t"));
		System.out.println(formatted.startsWith("es", 1));
		String formatted2 = formatted.toUpperCase();
		System.out.println(formatted.compareTo(formatted2));
		System.out.println(formatted.compareToIgnoreCase(formatted2));
		System.out.println(formatted.equals(formatted2));
		System.out.println(formatted.equalsIgnoreCase(formatted2));
		
		
		
		
		
		
		
	}
}
