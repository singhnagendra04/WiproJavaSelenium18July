package MulltiThreading;

class Hello1 extends Thread{
	String str;
	
	Hello1(String str){
		this.str = str;
	}
	
	public void run() {
		System.out.println(str + " " + Thread.currentThread().getName());
	}
}

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello1 t1 = new Hello1("Hello");
		Hello1 t2 = new Hello1("World");
		Hello1 t3 = new Hello1("Hello world");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
