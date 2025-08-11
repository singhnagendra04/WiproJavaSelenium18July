package Collection;
import java.util.*;
public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
		System.out.println(s);
		
		System.out.println(s.peek());
		
		System.out.println(s.empty());
		
		System.out.println(s.search(4));
		
		System.out.println(s.pop());
		
		System.out.println(s.peek());
		
		

	}

}
