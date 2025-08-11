package lab.thirty;
import java.util.*;
public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int []arr = {5,4,6,9,8};
     
     System.out.println("Before Sorting -----");
     for(int i=0;i<arr.length;i++) {
    	 System.out.print("  " + arr[i]);
    }
     System.out.println();
     Set<Integer> s = new TreeSet<Integer>();
    for(int i=0;i<arr.length;i++) {
    	 s.add(arr[i]);
    }
     System.out.println("After Sorting ----------" + s);
	}

}
