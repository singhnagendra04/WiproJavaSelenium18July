package lab.twentyFour;

abstract class BankAccount{
	int accNo;
	double balance;
	
	abstract void calculateInterest();
}

class SavingAccount extends BankAccount{
	void calculateInterest() {
		balance = 12548*0.04 + 12548;
		System.out.println("Account No : 9878995577 and Bank Balance : "+ balance);
	}
}

class FixedDepositAccount extends BankAccount{
	void calculateInterest() {
		balance = 100000*0.065 + 100000;
		System.out.println("Account No : 895774588 and Bank Balance : "+ balance);
	}
}
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount s = new SavingAccount();
		s.calculateInterest();
		
		FixedDepositAccount f = new FixedDepositAccount();
		f.calculateInterest();

	}

}
