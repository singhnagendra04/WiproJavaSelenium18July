package Company;

public class Company {
	
	public String name = "Aman";
	public int id = 256;
    public String dept = "CS";
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("Department : "+ dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Company c = new Company();
       c.display();
	}

}
