package corejava;

class Animal1{
	public void makeSound() {
		System.out.println("Parent class");
	}
}
class Cat1 extends Animal1{
	@Override
	public void makeSound(){
		System.out.println("Bark");
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Cat1 c = new Cat1();
		c.makeSound();
	}

}
