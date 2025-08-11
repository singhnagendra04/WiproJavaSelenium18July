package corejava;

class Animal{
	public void eat() {
		System.out.println("Animal eat food");
	}
}

class Dog extends Animal{
	public void display() {
		System.out.println("Dog");
	}
}

class Cat extends Animal{
	public void display() {
		System.out.println("Cat");
	}
}

class Tiger extends Animal{
	public void display() {
		System.out.println("Tiger");
	}
}

public class Hirerical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.eat();
		d.display();
		
		Cat c = new Cat();
		c.eat();
		c.display();
		
		Tiger t = new Tiger();
		t.eat();
		t.display();

	}

}
