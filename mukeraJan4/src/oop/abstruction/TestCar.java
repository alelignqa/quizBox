package oop.abstruction;

public class TestCar {

	public static void main(String[] args) {

 //		Car make = new Car(); 	- Cannot instantiate the type Car cus it is an interface 
		
		Car car = new Toyota(); // now this is valid - we can instantiate a car through toyota
		car.start();
		car.stop();
		// let us create another method in the Toyota and see if we can access with a car object
		// trying to access an engine method from toyota class using car object failed need another object 
		System.out.println("\n**************After this point we can all the method of toyota *****************");
		Toyota brand = new Toyota(); // after this point we can access all the methods of toyota
		brand.engine();
		brand.start();
		brand.stop();
		// trying to access the HybridCars class methods - we have one none and one abstract methods 
	//	HybridCars hyCar = new HybridCars();  // Cannot instantiate the type HybridCars
		// so to access the HybridCars class methods will extends the toyota class 
		
		System.out.println("\n*********the following is using the hybridcars class *************");
		HybridCars hyCar = new Toyota();
		hyCar.hybridEngine(); // this is found only in the hybridcars class 
		hyCar.electricEngine(); // - this is extended from hybridcars class using toyota
		

	}
}
