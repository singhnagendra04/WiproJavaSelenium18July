package corejava;


class Vechicle{
	public void drive() {
		System.out.println("Parent class");
	}
}
class Car extends Vechicle{
	@Override
	public void drive(){
		System.out.println("Reparing");
	}
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.drive();

	}

}
