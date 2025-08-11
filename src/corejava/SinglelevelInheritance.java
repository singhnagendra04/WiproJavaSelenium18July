package corejava;

public class SinglelevelInheritance extends SingleSuper{
	
	public String name = "Single Level Inheritance";
	
	public void dis() {
		System.out.println("Child class");
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglelevelInheritance s = new SinglelevelInheritance();
		s.display();
		s.dis();
         
	}

}
