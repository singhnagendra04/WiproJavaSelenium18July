package lab;

public class factorial {
     
	public void fact(int n) {
		int ans = 1;
		for(int i = 2; i<=n; i++) {
			ans *= i;
		}
		System.out.println("Factorial of "+ n + " : " + ans);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial f = new factorial();
		f.fact(5);

	}

}
