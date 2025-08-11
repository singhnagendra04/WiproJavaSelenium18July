package corejava;

public class loops {
	
	public void display(int n ){
		System.out.println("For loop--------");
		for(int i =1; i<n; i++) {
			System.out.println(i);
		}
		
		System.out.println("While loop--------");
		while(n<20) {
			System.out.println(n);
		n++;
		}
		
		
		System.out.println("Do While loop--------");
		do {
			System.out.println(n);
			n++;
		}while(n<30);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   loops l = new loops();
		   l.display(10);

	}

}
