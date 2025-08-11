package corejava;

public class MethodOverloading {
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
	
	public void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("MethodOverloading  : " + sum);
	}
	
	public void add(int a, int b, int c, int d) {
		int sum = a+b+c+d;
		System.out.println("MethodOverloading  : " + sum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading r = new MethodOverloading();
		r.add(5, 20);
		r.add(5, 5, 5);
		r.add(5, 5, 5, 5);
	}

}
