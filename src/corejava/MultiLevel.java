package corejava;

public class MultiLevel extends SinglelevelInheritance {
	
	public void display() {
		System.out.println("MultilevelInheritance");
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiLevel mi = new MultiLevel();
		mi.display();

	}

}
