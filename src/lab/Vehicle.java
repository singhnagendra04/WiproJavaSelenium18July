package lab;

abstract class Vehicle1{
	abstract void move();
}

class Car extends Vehicle1{
	@Override
	void move() {
		System.out.println("Car is Moving on four wheels");
	}
}

class Bike extends Vehicle1{
	@Override
	void move() {
		System.out.println("Bike is Moving on two wheels");
	}
}

class Bus extends Vehicle1{
	@Override
	void move() {
		System.out.println("Bus is Moving on four wheels");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.move();

		Bike b = new Bike();
		b.move();
		
		Bus b1 = new Bus();
		b1.move();
	}

}
