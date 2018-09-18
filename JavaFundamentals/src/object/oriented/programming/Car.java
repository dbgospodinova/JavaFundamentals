package object.oriented.programming;

public class Car {
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;
	String owner;
	
	void accelerate() {
		currentSpeed++;
	}
	
	void changeGearUp () {
		if (currentGear >= 1 && currentGear < 5) {
			currentGear++;
		} else {
			System.out.println("You can't change the gear!!!");
		}
		
	}

	void changeGearDown () {
		if (currentGear > 1 && currentGear <= 5) {
			currentGear--;
		} else {
			System.out.println("You can't change the gear!!!");
		}
	}
	
	void changeColor(String newColor){
		color = newColor;
	}
	
}
