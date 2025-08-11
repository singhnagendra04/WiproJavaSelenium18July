package lab.thirty;
import java.util.*;
public class CompareLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        
        if (list1.equals(list2)) {
            System.out.println("Both linked lists are equal.");
        } else {
            System.out.println("Linked lists are not equal.");
        }
	}

}
