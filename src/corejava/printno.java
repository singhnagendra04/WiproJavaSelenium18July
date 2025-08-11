package corejava;

public class printno {
	
	public void display(int n ) {
		do {
			System.out.println(n);
			n--;
		} while(n>0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          printno p = new printno();
          p.display(10);
	}

}
