package lab;

public class trianglepattern {
	
	public void display(int n ) {
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         trianglepattern t = new trianglepattern();
         t.display(5);
	}

}
