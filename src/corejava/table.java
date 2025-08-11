package corejava;

public class table {

	 public void display(int n) {
		 for(int i=1 ; i<=10; i++) {
			 System.out.println(n + "*" + i + "=" + n*i);
		 }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table t = new table();
		t.display(5);

	}

}
