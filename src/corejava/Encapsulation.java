package corejava;

public class Encapsulation {
	
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e = new Encapsulation();
		e.setName("AMan");
		e.setAge(25);
		
		System.out.println(e.getName());
		System.out.println(e.getAge());
		

	}

}
