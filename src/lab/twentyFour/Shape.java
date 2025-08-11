package lab.twentyFour;

abstract class Shape1{
	int r;
	int a,b;
	abstract void calculateArea();

}

class Circle extends Shape1{
	Circle(int r){
		this.r =r;
	}
	@Override
	void calculateArea() {
		double area = 3.14*r*r;
		System.out.println("Area of Circle : " + area);
	}
}

class Rectangle extends Shape1{
	
	Rectangle(int a, int b){
		this.a = a;
		this.b = b;
	}
	@Override
	void calculateArea(){
		int area = a*b;
		System.out.println("Area of Rectangle : " + area);
	}
}

public class Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(2);
		c.calculateArea();
		
		Rectangle r = new Rectangle(2,2);
		r.calculateArea();

	}

	

}
