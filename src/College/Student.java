package College;

public class Student {
	private String name = "Aman";
	private int id = 25;
	private String dept = "CS";
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("ID : " + id);
		System.out.println("Department : "+ dept);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.display();

	}

}
