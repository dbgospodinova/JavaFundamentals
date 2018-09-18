package primitive.types;

public class Initialization {
	static byte b;
	static short sh;
	static int i;
	static long l;
	static float fl;
	static double d;
	static char ch;	
	static boolean bool;

	public static void main(String[] args) {

		String[] primitiveTypes = {"Byte", "Short", "Integer", "Long", "Float", "Double", "Char", "Boolean"};

		// Initialize common numeric types.
		for (int i = 0; i < primitiveTypes.length; i++) {
			if (i < 6 ) {
				System.out.println("The primitive type " + primitiveTypes[i] + " is numeric.");
			} else {
				System.out.println("The primitive type " + primitiveTypes[i] + " is not numeric.");
			}
		}

		System.out.println();

		// Display common numeric types.
		System.out.println(Byte.TYPE);
		System.out.println(Byte.SIZE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(b);
		System.out.println();

		System.out.println(Short.TYPE);
		System.out.println(Short.SIZE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(sh);
		System.out.println();

		System.out.println(Character.TYPE);
		System.out.println(Character.SIZE);
		System.out.println((int) Character.MIN_VALUE);
		System.out.println((int) Character.MAX_VALUE);
		System.out.println(ch);
		System.out.println();

		System.out.println(Integer.TYPE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(i);
		System.out.println();

		System.out.println(Float.TYPE);
		System.out.println(Float.SIZE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(fl);
		System.out.println();

		System.out.println(Double.TYPE);
		System.out.println(Double.SIZE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(d);
		System.out.println();

		System.out.println(Long.TYPE);
		System.out.println(Long.SIZE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(l);
		System.out.println();

		System.out.println(bool);
		
		// TODO
		// Add example with BigInteger
	}
}