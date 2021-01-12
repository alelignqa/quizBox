package oop.abstruction;

public class Toyota extends HybridCars implements Car{
	/* 
	 * 	- The type Toyota must implement the inherited abstract method 
	 Car.stop()	 Car.start()
	 */
	// these methods are from car interface
	public void stop() {
		System.out.println("This car will stop when you apply pressure on the break");
		}

	public void start() {
		System.out.println("This car will start and run");
		}
	
	// this is built inside toyota class
	public void engine() {
		System.out.println("Toyota added a new engin that is very fast");
	}

	// this method is from HybridCars class 
	public void electricEngine() {
		// this is from hybridcars 
		System.out.println("This car is running on full electric engin");
		
	}

}
