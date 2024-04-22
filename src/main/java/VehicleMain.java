//Java Program to illustrate the use of Java Method Overriding  
//Creating a parent class.  

class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
}

//Creating a child class  
class Bike2 extends Vehicle {
	// defining the same method as in the parent class
	void run() {
		System.out.println("Bike is being ridden");
	}
}

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bike2 obj = new Bike2();
		obj.run();

	}

}
