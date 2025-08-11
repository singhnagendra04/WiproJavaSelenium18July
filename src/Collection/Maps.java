package Collection;
import java.util.*;
import java.util.Map.Entry;
public class Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m = new HashMap<Integer, String>();
		m.put(1, "Amit");
		m.put(2, "Aman");
		m.put(3, "Naman");
		m.put(4, "Ammy");
		m.put(5, "Poojan");
		m.put(6, "Aman");
	
		
		for (Entry<Integer, String> me :
            m.entrySet()) {

           System.out.print(me.getKey() + ":");
           System.out.println(me.getValue());
       }
		

	}

}
