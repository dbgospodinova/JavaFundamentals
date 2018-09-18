package object.oriented.programming;

import javax.jws.soap.SOAPBinding;

public class CarDemo {
	public static void main(String[] args) {
		Car redCar = new Car();
		redCar.maxSpeed = 300;
		redCar.currentSpeed = 216;
		redCar.color = "Red";
		redCar.currentGear = 2;
		redCar.owner = "Didi";

		Car blueCar = new Car();
		blueCar.maxSpeed = 250;
		blueCar.currentSpeed = 180;
		blueCar.color = "Blue";
		blueCar.currentGear = 3;
		blueCar.owner = "Gosho";

		redCar.currentSpeed = 278;
		redCar.currentGear = 3;
		System.out.println(redCar.color + " car curent speed is " + redCar.currentSpeed + " and current gear is " + redCar.currentGear + ".");

		System.out.println(redCar.color + " car owner is " + redCar.owner + ".");
		System.out.println(blueCar.color + " car owner is " + blueCar.owner + ".");

		redCar.changeGearUp();
		System.out.println("The current speed of the red car is " + redCar.currentSpeed); 
		redCar.accelerate();
		System.out.println("The current speed of the red car is " + redCar.currentSpeed);

		System.out.println("The current gear is " + redCar.currentGear); 
		for (int i = 0; i < 10; i++) { 
			redCar.changeGearUp(); 
		} 
		System.out.println("The current gear is " + redCar.currentGear);

		redCar.changeColor("Black");
		System.out.println("The red car color is changed to: " + redCar.color);

		Car golf = new Car("Golf",true,"blue");

		Car test = new Car("village",true,"dirtyyellow",1099.99,10);
		
		System.out.println(redCar);
		System.out.println(golf);
		System.out.println(test);

	}
}
