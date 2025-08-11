package Package2;

import Package1.Package1;

public class DiffPackSubClass extends Package1 {

	public void create() {
		System.out.println("Creating");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiffPackSubClass d = new DiffPackSubClass();
		d.create();
		d.display();
		d.age();
	}

}
