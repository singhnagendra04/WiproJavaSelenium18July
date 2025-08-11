package lab.twentyfive;

interface Shape1{
	public void getArea();
}
 
class Rectangle implements Shape1{
	int l =5;
	int b = 10;
	public void getArea() {
		int area = l*b;
		System.out.println("Area : "+ area);
	}
}

class Circle implements Shape1{
	int r = 2;
	public void getArea() {
		double area = 3.14*r*r;
		System.out.println("Area : "+ area);
	}
}

class Triangle implements Shape1{
	int h =5;
	int b = 10;
	public void getArea() {
		double area = 0.5*h*b;
		System.out.println("Area : "+ area);
	}
}
public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r = new Rectangle();
		r.getArea();
		
		Circle c = new Circle();
		c.getArea();
		
		Triangle t = new Triangle();
		t.getArea();

	}

}
