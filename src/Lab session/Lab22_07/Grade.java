package Lab22_07;

public class Grade {
public static void main(String[] args) {
	int marks=85;
	 if (marks >= 90 && marks <= 100) {
         System.out.println("Grade: A");
     } else if (marks >= 75 && marks < 89) {
         System.out.println("Grade: B");
     } else if (marks >= 60 && marks < 74) {
         System.out.println("Grade: C");
     } else if (marks >= 40 && marks < 59) {
         System.out.println("Grade: D");
     } else if (marks < 40) {
         System.out.println("Grade: F");
     } else {
    	 System.out.println("invalid MArks Enter");
     }
     }

}
