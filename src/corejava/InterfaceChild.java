package corejava;

public class InterfaceChild implements Interface1{
	
	@Override
	public void display() {
		System.out.println("Child class");
	}
	@Override
	public void read() {
		System.out.println("REading");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceChild i = new InterfaceChild();
		i.display();
		i.read();
		
		System.out.println(emp);
		System.out.println(empId);
	}

}
