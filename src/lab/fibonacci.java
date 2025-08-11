package lab;

public class fibonacci {

	public void fib(int n) {
		  int first = 0, second = 1;
	        System.out.print("Fibonacci Series: " + first + " " + second);

	        for (int i = 2; i < n; i++) {
	            int next = first + second;
	            System.out.print(" " + next);
	            first = second;
	            second = next;
	        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method 

		fibonacci f = new fibonacci();
		f.fib(7);

	}

}
