package corejava;

class Shape{

	public void getArea(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}

class Rectangle extends Shape{
	@Override
	public void getArea(int a , int b) {
		System.out.println("Area of Rectangle : " + a*b);
	}
	
}
public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rectangle r = new Rectangle();
       r.getArea(2, 2);
	}

}
