package lab.twentyFour;

abstract class Employee1{
	public String name;
	public int id;
	
	abstract void calculateSalary();
}

class PermanentEmployee extends Employee1{
	public int sal = 2500;
	void calculateSalary() {
		int salary = sal*30;
		System.out.println("Salary : "+ salary);
	}
}

class ContractEmployee extends Employee1{
	public int sal = 250;
	void calculateSalary() {
		int salary = sal*24;
		System.out.println("Salary : "+ salary);
	}
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee p = new PermanentEmployee();
		p.calculateSalary();
		
		ContractEmployee c = new ContractEmployee();
		c.calculateSalary();
		
		

	}

}
