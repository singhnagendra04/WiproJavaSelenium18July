package corejava;

interface  InterfaceA{
	void display();
}

interface InterfaceB{
	void display(int age);
}

public class MultipleInterface implements InterfaceA, InterfaceB {
	
	public void display() {
		System.out.println("Interface");
	}
	
	
	public void display(int age) {
		System.out.println("Age :"+ age);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterface mu = new MultipleInterface();
       mu.display();
       mu.display(25);
       
	}

}
