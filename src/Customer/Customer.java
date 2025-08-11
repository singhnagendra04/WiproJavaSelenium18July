package Customer;

public class Customer {
	protected String name = "Aman";
	protected int id = 256;
	protected String dept = "Finance";

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("Department : "+ dept);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer c = new Customer();
        c.display();
	}

}
