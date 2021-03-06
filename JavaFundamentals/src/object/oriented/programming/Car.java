package object.oriented.programming;

public class Car {
	int maxSpeed;
	int currentSpeed;
	String color;
	int currentGear;
	String owner;
	double price;
	boolean isSportCar;
	String model;

	Car (){

	}

	Car(String model, boolean isSportCar, String color) {
		this.model = model;
		this.isSportCar = isSportCar;
		this.color = color;
	}

	Car (String model, boolean isSportCar, String color, double price, int maxSpeed){
		this (model, isSportCar, color);
		this.price = price;

		if (!isSportCar && maxSpeed > 200) {
			this.maxSpeed = 200;
		} else {
			this.maxSpeed = maxSpeed;
		}
	}
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

	boolean isMoreExpensive(Car otherCar){
		if (this.price > otherCar.price) {
			return true;
		} else {
			return false;
		}
	}

	double calculateCarpriceForScrap (double metalPrice){
		double coef = 0.2;
		if(this.isSportCar){
			coef+= 0.05;
		}

		if(this.color.equalsIgnoreCase("black") || this.color.equalsIgnoreCase("white")){
			coef+= 0.05;
		}
		return coef * metalPrice;
	}
}
