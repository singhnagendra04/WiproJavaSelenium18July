package Package1;

public class NonSubClass {
	
	public void write() {
		System.out.println("Writing");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Package1 p = new Package1();
		p.display();
		
		NonSubClass n = new NonSubClass();
		n.write();

	}

}
