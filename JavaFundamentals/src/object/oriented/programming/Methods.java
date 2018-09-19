package object.oriented.programming;

public class Methods {
	int width = 6;
	int height = 12;

	int sum(int a, int b){
		int sum = a + b;
		return sum;
	}

	int sumBP(int a, int b){
		return a + b;
	}

	int getArea() {
		return width * height;
	}

	int passMethod(int p) {
		return p;
	}

}
