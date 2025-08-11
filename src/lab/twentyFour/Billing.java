package lab.twentyFour;

abstract class Bill{
	int unit;
	abstract void generateBill();
}

class ElectricityBill extends Bill{
	ElectricityBill(int unit){
		this.unit = unit;
	}
	void generateBill() {
		double total = unit*8;
		System.out.println("Electricity Bill Generated : "+ total);
	}
}

class WaterBill extends Bill{
	WaterBill(int unit){
		this.unit = unit;
	}
	void generateBill() {
		double total = unit*5;
		System.out.println("Water Bill Generated : "+ total);
	}
}

public class Billing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricityBill e= new ElectricityBill(50);
		e.generateBill();
		
		WaterBill w = new WaterBill(250);
		w.generateBill();

	}

}
