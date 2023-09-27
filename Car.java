package week3;

public class Car {
	public double efficiency;
	public double fuel = 0;
	
	public Car(double eff) {
		efficiency = eff;
	}
	
	public void addGas(double gallons) {
		fuel += gallons;
	}
	
	public double getGasInTank() {
		return fuel;
	}
	
	public void drive(double miles) {
		fuel -= (miles/efficiency);
	}
	
	public static void main(String[] args) {
		Car ivansCar = new Car(50);
		
		ivansCar.addGas(20);
		ivansCar.drive(100);
		double gasLeft = ivansCar.getGasInTank();
		System.out.println("Gas remaining in tank:" + gasLeft);
		
		
	}

}
