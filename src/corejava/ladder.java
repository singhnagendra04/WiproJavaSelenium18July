package corejava;

public class ladder {
	
   public void display(int a ) {
	   if(a < 0 ) {
		   System.out.println("No. is negative");
	   }
	   else if (a == 0) {
		   System.out.println("No. is Zero");
	   }
	   else {
		   System.out.println("No. is postive");
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ladder l = new ladder();
		int a = 10;
		l.display(a);
        
	}

}
