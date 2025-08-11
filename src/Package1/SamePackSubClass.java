package Package1;

public class SamePackSubClass extends Package1{

	public void read() {
		System.out.println("Reading ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamePackSubClass s = new SamePackSubClass();
		s.display();
		s.read();

	}

}
