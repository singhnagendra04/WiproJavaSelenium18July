package lab.twentyfive;

interface Animal1{
	void bark();
}

class Dog implements Animal1{
	

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog is barking ");
		
	}
}
public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Dog d = new Dog();
      d.bark();
	}

}
