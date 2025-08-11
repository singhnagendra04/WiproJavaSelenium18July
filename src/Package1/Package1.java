package Package1;

public class Package1 {
	private static String sal = "587459";
	
	private void sal() {
		System.out.println(sal);
	}
	public void display() {
		System.out.println("Package 1");
	}
	
	int empId = 55;
	
	void details() {
		System.out.println("Employee id : " + empId);
	}
	
	protected int age = 25;
	public void age() {
		System.out.println("Age : "+ age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Package1  p = new Package1();
         p.display();
         p.sal();
         p.details();
         p.age();
	}

}
