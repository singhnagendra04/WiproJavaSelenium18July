package lab.twentyFour;

abstract class student{
	String name;
	int roll;
	int marks;
	
	abstract void getGrade();
}

class EngineeringStudent extends student{
	EngineeringStudent(String name, int roll, int marks){
		this.name=name;
		this.roll = roll;
		this.marks=marks;
	}
	void getGrade() {
		System.out.println("EngineeringStudent-----");
		if(marks>=50 && marks <= 70) {
			System.out.println("Name :" + name +" Roll No. : " + roll + " Grade---> "+ "C");
		}
		else if(marks>=71 && marks <= 90) {
			System.out.println("Name :" + name +" Roll No. : " + roll + " Grade---> "+ "C");
		}
		else if(marks>=91) {
			System.out.println("Name :" + name +" Roll No. : " + roll + " Grade---> "+ "C");
		}
	}
	
}


class MedicalStudent extends student{
	MedicalStudent(String name, int roll, int marks){
		this.name=name;
		this.roll = roll;
		this.marks=marks;
	}
	void getGrade() {
		System.out.println("MedicalStudent------");
		if(marks>=50 && marks <= 70) {
			System.out.println("Name :" + name +" Roll No. : " + roll + " Grade---> "+ "C");
		}
		else if(marks>=71 && marks <= 90) {
			System.out.println("Name :" + name +" Roll No. : "+ roll + " Grade---> "+ "B");
		}
		else if(marks>=91) {
			System.out.println("Name :" + name +" Roll No. : " + roll + " Grade---> "+ "A");
		}
	}
	
}
public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedicalStudent s = new MedicalStudent("Aman",55,88);
		s.getGrade();
		
		EngineeringStudent e= new EngineeringStudent("Naman",20,91);
		e.getGrade();

	}

}
