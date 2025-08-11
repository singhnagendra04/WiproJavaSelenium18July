package Package2;

import Package1.Package1;

public class Package2 {
	public void display() {
		System.out.println("Package 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Package1  p = new Package1();
         p.display();
         
         Package2  p1 = new Package2();
         p1.display();
	}


}
