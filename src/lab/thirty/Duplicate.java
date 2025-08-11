package lab.thirty;
import java.util.*;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,1,2,6,5,8};
		
		Set<Integer> s = new HashSet<>();
		Set<Integer> s1 = new HashSet<>();
		
        for(int i=0;i<arr.length;i++) {
        	if(!s.add(arr[i])) {
        		s1.add(arr[i]);
        	}
        }
        
        for(int i:s1) {
        	System.out.println(i);
        }
	}

}
