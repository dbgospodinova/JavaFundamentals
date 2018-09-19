package object.oriented.programming;

public class PersonTest {
	public static void main(String[] args) {
		Person pesho = new Person();
		pesho.name = "Pesho";
		pesho.age = 100;
		pesho.isWoman = false;
		pesho.personalNumber = 1809181234;
		pesho.weight = 78.9;

		Person gosho = new Person();
		gosho.name = "Gosho";
		gosho.age = 30;
		gosho.isWoman = false;
		gosho.personalNumber = 1234567890;
		gosho.weight = 89; 

		Person didi = new Person();
		didi.name = "Didi";
		didi.age = 18;
		didi.isWoman = true;
		didi.personalNumber = 1987654321;
		didi.weight = 55.5;

		System.out.println("\"" + pesho.name + " is " + pesho.age + " years old and weights " + pesho.weight + ".\"");
		System.out.println("\"" + gosho.name + " is " + gosho.age + " years old and weights " + gosho.weight + ".\"");
		System.out.println("\"" + didi.name + " is " + didi.age + " years old and her PN is " + didi.personalNumber + ".\"");

		// Methods
		gosho.walk();
		double liters = 3.8;
		didi.drinkWater(liters);

		// Constructors
		Person mikelandjelo = new Person("Mikelandjelo",321,true);
		Person leonardo = new Person("Leonardo",123,true);
		Person donatello = new Person();
		donatello.name = "Donatello";
		leonardo.friend = mikelandjelo;

		System.out.println(mikelandjelo);
		System.out.println(leonardo);
		System.out.println(donatello);
	}
}
