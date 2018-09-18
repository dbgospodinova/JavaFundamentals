package object.oriented.programming;

public class Person {
	String name; 
	int age; 
	long personalNumber; 
	boolean isWoman; 
	double weight;

	void eat() {
		System.out.println("Eating...");

	}

	void walk() {
		System.err.println(name + " is walking.");

	}

	void growUp() {
		age++;

	}

	void drinkWater(double liters) {
		if(liters > 1) { 
			System.out.println("This is too much water!!!"); 
		} else { 
			System.out.println(name + " is drinking " + liters + " water.");
		}


	}
}
