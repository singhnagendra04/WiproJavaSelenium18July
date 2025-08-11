package corejava;

class Employee1{
	public void work() {}
	public void getSalary() {}
}

class HRManager extends Employee1{
	@Override
	public void work() {
		System.out.println("HR Manager");
	}
	
	public void addEmployee() {
		System.out.println("New Method");
	}
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HRManager h = new HRManager();
		h.work();
		h.addEmployee();

	}

}
