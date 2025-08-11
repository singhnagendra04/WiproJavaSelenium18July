package corejava;

public class sumnatural {
	
	public void sum(int n) {
		int sum = 0;
		for(int i = 1; i<=n ; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumnatural s = new sumnatural();
		s.sum(5);

	}

}
