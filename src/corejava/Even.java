package corejava;

public class Even {
     public void display(int n ) {
    	 if(n%2 == 0) {
    		 System.out.println("No. is even");
    	 }
    	 else {
    		 System.out.println("No. is odd");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Even e = new Even();
        e.display(5);
	}

}
