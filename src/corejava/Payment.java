package corejava;

class Payment1{
	public void pay() {}
}

class Creditcard extends Payment1{
	@Override
	public void pay() {
		System.out.println("CreditCArd");
	}
}

class UPI extends Payment1{
	@Override
	public void pay() {
		System.out.println("UPI");
	}
}
class Netbanking extends Payment1{
	@Override
	public void pay() {
		System.out.println("Netbanking");
	}
}
public class Payment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Creditcard c = new Creditcard();
		c.pay();
		
		UPI u = new UPI();
		u.pay();
		
		Netbanking n = new Netbanking();
		n.pay();

	}

}
