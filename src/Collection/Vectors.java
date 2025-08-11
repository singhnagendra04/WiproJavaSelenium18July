package Collection;
import java.util.*;
public class Vectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Vector<Integer> v = new Vector<Integer>();
       
       v.add(1);
       v.add(2);
       v.add(3);
       v.add(4);
       v.add(5);
       v.add(5);
       v.add(null);
       
       v.add(2, 6);
       System.out.println(v);
       System.out.println(v.size());
       
       
	}

}
