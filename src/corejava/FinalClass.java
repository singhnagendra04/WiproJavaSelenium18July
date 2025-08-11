package corejava;

final class Sample{
	
	final void display() {
		System.out.println("Final");
	}
	
}
public class FinalClass extends Sample{
    final int age = 25;
    @Override
    public void display() {
    	System.out.println("hello final");
    }
  
public static void main(String[] args) {
		// TODO Auto-generated method stub
        FinalClass c = new FinalClass();
        c.age=20;
	}

}
