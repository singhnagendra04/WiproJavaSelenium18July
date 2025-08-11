package lab;
import java.util.*;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two floating no. : ");
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		int a = (int)(n1 *100);
		int b = (int)(n2*100);
		if(a == b) {
			System.out.println("Number are same");
		}
		else {
			System.out.println("Number are not same");

		}

	}

}
