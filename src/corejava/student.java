package corejava;

public class student {
     public void display(int a) {
    	 if(a >=90 && a <= 100) {
    		 System.out.println("A");
    	 }
    	 else if(a >=75 && a <= 89) {
    		 System.out.println("B");
    	 }
    	 else if(a >=60 && a <= 74) {
    		 System.out.println("C");
    	 }
    	 else if(a >=40 && a <= 59) {
    		 System.out.println("D");
    	 }
    	 else {
               System.out.println("Fail");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          student s = new student();
          s.display(55);
	}

}
