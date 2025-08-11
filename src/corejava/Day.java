package corejava;

public class Day {
	public void display(int n) {
		switch(n) {
		  
		case 1: if(n == 1)
			System.out.println("Monday");
		    break;
		    
		case 2: if(n == 2)
			System.out.println("Tuesday");
		    break;
		    
		case 3: if(n == 3)
			System.out.println("wednesday");
		    break;
		    
		case 4: if(n == 4)
			System.out.println("Thursday");
		    break;
		    
		case 5: if(n == 5)
			System.out.println("Friday");
		    break;
		    
		case 6: if(n == 6)
			System.out.println("Saturday");
		    break;
		    
		case 7: if(n == 7)
			System.out.println("Sunday");
		    break;
		    
		case 8: if(n >7)
			System.out.println("Please Enter correct day");
		    break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day d = new Day();
		d.display(5);

	}

}
