package Collection;
import java.util.LinkedList;
public class LinkedListclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkedList<String> a = new LinkedList<String>();
      a.add("Ravi");
    	a.add("Aman");
    	a.add("Naman");
    	a.add("Peter");
    
    	// Printing ArrayList
    	System.out.println(a);
    	
    	System.out.println(a.get(2));
    	
    	System.out.println(a.isEmpty());
    	
    	System.out.println(a.remove(2));
  	System.out.println(a);
  	
  	System.out.println(a.set(2, "king"));
      
  	System.out.println(a);
  	System.out.println(a.size());
	}

}
