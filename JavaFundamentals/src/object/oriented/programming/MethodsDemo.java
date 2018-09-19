package object.oriented.programming;

public class MethodsDemo {
	public static void main(String[] args) {
		
		Methods demo = new Methods();
		System.out.println(demo.sum(5, 6));
		System.out.println(demo.sumBP(13, 6));
		System.out.println(demo.getArea());
		
		int x = 3;
		demo.passMethod(x);
		System.out.println("After invoking passMethod, x = " + x);
		
		
	}
}
