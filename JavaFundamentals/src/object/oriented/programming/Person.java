package object.oriented.programming;

public class Person {
	String name; 
	int age; 
	long personalNumber; 
	boolean isWoman; 
	double weight;
	Person friend;
	double money;
	Car car;
	
	Person () {
		age = 0;
		weight = 4;
	}
	
	Person (String name, long personalNumber, boolean isWoman){
		this ();
		this.name = name;
		this.personalNumber = personalNumber;
		this.isWoman = isWoman;
		this.friend = new Person();
	}

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
	
	void buyCar(Car car) {
		if (this.money > car.price) {
			System.out.println("You buy a car.");
		} else {
			System.out.println("You don't have enought money :(");
		}
	}
}
